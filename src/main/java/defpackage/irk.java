package defpackage;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: irk */
final class irk implements Runnable {
    public final /* synthetic */ iqu a;
    private final abnv b;

    public irk(iqu iqu, abnv abnv) {
        this.a = iqu;
        this.b = abnv;
    }

    public final void run() {
        try {
            abol a = this.a.al.a();
            Object obj = this.b;
            amqw.a(obj);
            if (obj.a()) {
                Object abod = new abod();
                abod.e = obj.e;
                abod.a(a.b(), a.c());
                aboe aboe = a.b;
                amqw.a(abod);
                if (abod.b()) {
                    bqr a2 = bqr.a();
                    abod.o = a2;
                    abod.p = a2;
                    abop c = abod.c();
                    c.a = true;
                    aboe.a.b(c);
                    try {
                        if (((abnq) a2.get()) != null) {
                            aboo aboo = aboe.b;
                            if (aboo != null) {
                                aboo.b();
                            }
                            return;
                        }
                    } catch (InterruptedException unused) {
                    } catch (ExecutionException e) {
                        String str = "Suggest deletion task threw an exception: ";
                        String valueOf = String.valueOf(e.getMessage());
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            str.concat(valueOf);
                        }
                    }
                }
            }
            a();
        } catch (IOException e2) {
            xtl.b("Error deleting search suggestions", e2);
            a();
        }
    }

    private final void a() {
        this.a.a.runOnUiThread(new irn(this));
    }
}
