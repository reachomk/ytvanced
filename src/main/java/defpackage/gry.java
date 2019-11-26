package defpackage;

import android.net.Uri;

/* renamed from: gry */
public final class gry implements akmz, exv {
    private final akmx a;
    private final bcaa b;

    public gry(akmx akmx, bcaa bcaa) {
        this.a = akmx;
        this.b = bcaa;
    }

    public final void a() {
        this.a.a(grw.k, (akmz) this);
    }

    public final void b() {
        this.a.a((akmz) this);
    }

    public final void a(Uri uri, Uri uri2) {
        if (amqq.a(uri, grw.k)) {
            grw grw = (grw) this.a.a(uri2);
            if (grw != null && grw.e()) {
                ((bqa) this.b.get()).b();
            }
        }
    }
}
