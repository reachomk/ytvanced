package defpackage;

import android.net.Uri;

/* renamed from: xid */
final class xid implements Runnable {
    private final /* synthetic */ bciz a;
    private final /* synthetic */ Uri b;
    private final /* synthetic */ xie c;

    xid(xie xie, bciz bciz, Uri uri) {
        this.c = xie;
        this.a = bciz;
        this.b = uri;
    }

    public final void run() {
        xig xig = new xig();
        xig.a.incrementAndGet();
        try {
            xig = this.a.a(this.b.toString(), xig, this.c.b).b("HEAD").b(2).f().d();
            xig.a();
        } catch (Throwable unused) {
            xig.a();
        }
    }
}
