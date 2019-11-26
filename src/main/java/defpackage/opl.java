package defpackage;

import android.net.Uri;

/* renamed from: opl */
public final class opl extends ono implements oph {
    private final Uri b;
    private final ovh c;
    private final ofr d;
    private final owf e;
    private final String f;
    private final int g = 1048576;
    private long h = -9223372036854775807L;
    private boolean i;
    private owt j;

    opl(Uri uri, ovh ovh, ofr ofr, owf owf, String str) {
        this.b = uri;
        this.c = ovh;
        this.d = ofr;
        this.e = owf;
        this.f = str;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void a(owt owt) {
        this.j = owt;
        b(this.h, this.i);
    }

    public final ooj a(ook ook, ouw ouw, long j) {
        ovi a = this.c.a();
        owt owt = this.j;
        if (owt != null) {
            a.a(owt);
        }
        return new opa(this.b, a, this.d.a(), this.e, a(ook), this, ouw, this.f, this.g);
    }

    public final void a(ooj ooj) {
        owl owl = (opa) ooj;
        if (owl.p) {
            for (opm i : owl.m) {
                i.i();
            }
        }
        owl.f.a(owl);
        owl.i.removeCallbacksAndMessages(null);
        owl.j = null;
        owl.x = true;
        owl.b.b();
    }

    public final void a(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.h;
        }
        if (this.h != j || this.i != z) {
            b(j, z);
        }
    }

    private final void b(long j, boolean z) {
        this.h = j;
        this.i = z;
        a(new opu(j, z), null);
    }
}
