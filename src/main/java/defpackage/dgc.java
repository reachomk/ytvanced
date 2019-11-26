package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: dgc */
public final class dgc implements Runnable {
    private long a = 0;
    private final /* synthetic */ dgb b;

    public dgc(dgb dgb) {
        this.b = dgb;
    }

    public final void run() {
        try {
            this.b.e = true;
            while (true) {
                dfy dfy;
                synchronized (this.b.a) {
                    dgb dgb;
                    while (this.b.b.isEmpty()) {
                        dgb = this.b;
                        dgb.d = false;
                        dgb.a.wait();
                    }
                    dgb = this.b;
                    dgb.d = true;
                    dfy = (dfy) dgb.b.remove(0);
                }
                if (dfy != null) {
                    Context context = this.b.c;
                    String str = dfy.e;
                    String str2 = dfy.f;
                    if (!dfy.b) {
                        boolean z = context.getSharedPreferences(str, 0).getBoolean(str2, false);
                        if (z) {
                            str = "Already sent ping for conversion ";
                            str2 = String.valueOf(str2);
                            if (str2.length() == 0) {
                                str2 = new String(str);
                            } else {
                                str.concat(str2);
                            }
                        }
                        if ((z ^ 1) == 0) {
                            this.b.f.a(dfy);
                        }
                    }
                    int a = this.b.a(dfy);
                    if (a == 2) {
                        this.b.f.a(dfy);
                        this.a = 0;
                    } else if (a == 0) {
                        this.b.f.b(dfy);
                        long j = this.a;
                        long j2 = 1000;
                        if (j != 0) {
                            j2 = Math.min(j + j, 60000);
                            this.a = j2;
                        } else {
                            this.a = 1000;
                        }
                        Thread.sleep(j2);
                    } else {
                        this.b.f.b(dfy);
                        this.a = 0;
                    }
                }
            }
        } catch (InterruptedException unused) {
            Log.w("GoogleConversionReporter", "Dispatch thread is interrupted.");
            this.b.e = false;
        }
    }
}
