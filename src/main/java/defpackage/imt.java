package defpackage;

import java.util.List;

/* renamed from: imt */
public final class imt implements imr {
    private final apgu a;

    public final arml a() {
        arml arml = this.a.b;
        return arml == null ? arml.f : arml;
    }

    public final boolean i() {
        return true;
    }

    public final arml b() {
        arml arml = this.a.c;
        return arml == null ? arml.f : arml;
    }

    public final List c() {
        return this.a.d;
    }

    public final apxu d() {
        apgu apgu = this.a;
        if ((apgu.a & 4) == 0) {
            return null;
        }
        apxu apxu = apgu.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    public final apgw e() {
        apgu apgu = this.a;
        if ((apgu.a & 32) == 0) {
            return null;
        }
        apgw a = apgw.a(apgu.i);
        if (a == null) {
            a = apgw.BUNDLE_ITEM_STYLE_UNSPECIFIED;
        }
        return a;
    }

    public final aygk f() {
        apgu apgu = this.a;
        if ((apgu.a & 64) == 0) {
            return null;
        }
        aygk aygk = apgu.j;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return aygk;
    }

    public final List g() {
        return this.a.e;
    }

    public final byte[] h() {
        return this.a.k.d();
    }

    /* synthetic */ imt(apgu apgu) {
        this.a = apgu;
    }
}
