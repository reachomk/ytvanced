package defpackage;

import android.os.Handler;

/* renamed from: cwu */
public final class cwu extends crl {
    private final Handler b;
    private boolean c;
    private int d = -1;
    private final /* synthetic */ cwo e;

    public cwu(cwo cwo, Handler handler) {
        this.e = cwo;
        this.b = handler;
    }

    public final synchronized void a() {
        if (!this.c) {
            this.c = true;
            this.a.fillInStackTrace();
            this.b.post(this);
            this.d = 1;
        }
    }

    public final void a(Throwable th) {
        synchronized (this) {
            if (this.c) {
                int i = this.d;
                this.d = -1;
                this.c = false;
                try {
                    this.e.a(i, th);
                    return;
                } catch (IndexOutOfBoundsException e) {
                    String valueOf = String.valueOf(cwo.a(this.e));
                    String valueOf2 = String.valueOf(e.getMessage());
                    throw new RuntimeException(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), e);
                }
            }
        }
    }
}
