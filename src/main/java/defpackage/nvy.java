package defpackage;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* renamed from: nvy */
public final class nvy {
    public nwa a;
    public boolean b;
    private final ExecutorService c;

    public nvy(String str) {
        this.c = nxf.a(str);
    }

    public final void a(nvz nvz, nvx nvx) {
        Looper myLooper = Looper.myLooper();
        nwf.b(myLooper != null);
        a(myLooper, nvz, nvx);
    }

    public final void a(Looper looper, nvz nvz, nvx nvx) {
        nwf.b(this.b ^ 1);
        this.b = true;
        this.a = new nwa(this, looper, nvz, nvx);
        this.c.submit(this.a);
    }

    public final void a() {
        nwf.b(this.b);
        nwa nwa = this.a;
        nwa.a.d();
        if (nwa.b != null) {
            nwa.b.interrupt();
        }
    }

    public final void b() {
        a(null);
    }

    public final void a(Runnable runnable) {
        if (this.b) {
            a();
        }
        if (runnable != null) {
            this.c.submit(runnable);
        }
        this.c.shutdown();
    }
}
