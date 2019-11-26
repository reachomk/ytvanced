package defpackage;

import android.net.Uri;

/* renamed from: nrf */
final class nrf implements nvz {
    private final Uri a;
    private final nvo b;
    private final nri c;
    private final nvi d;
    private final int e;
    private final nrm f = new nrm();
    private volatile boolean g;
    private boolean h;

    public nrf(Uri uri, nvo nvo, nri nri, nvi nvi, int i, long j) {
        this.a = (Uri) nwf.a((Object) uri);
        this.b = (nvo) nwf.a((Object) nvo);
        this.c = (nri) nwf.a((Object) nri);
        this.d = (nvi) nwf.a((Object) nvi);
        this.e = i;
        this.f.a = j;
        this.h = true;
    }

    public final void d() {
        this.g = true;
    }

    public final boolean e() {
        return this.g;
    }

    public final void f() {
        Throwable th;
        nqx nqx;
        int i = 0;
        while (i == 0 && !this.g) {
            try {
                long j = this.f.a;
                long a = this.b.a(new nvq(this.a, j, -1, null));
                if (a != -1) {
                    a += j;
                }
                nqx nqx2 = new nqx(this.b, j, a);
                try {
                    nrc a2 = this.c.a(nqx2);
                    if (this.h) {
                        a2.b();
                        this.h = false;
                    }
                    while (i == 0 && !this.g) {
                        this.d.b(this.e);
                        i = a2.a(nqx2, this.f);
                    }
                    if (i != 1) {
                        this.f.a = nqx2.c;
                    } else {
                        i = 0;
                    }
                    nxf.a(this.b);
                } catch (Throwable th2) {
                    th = th2;
                    if (!(i == 1 || nqx == null)) {
                        this.f.a = nqx.c;
                    }
                    nxf.a(this.b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                nqx = null;
                this.f.a = nqx.c;
                nxf.a(this.b);
                throw th;
            }
        }
    }
}
