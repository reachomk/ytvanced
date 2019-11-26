package defpackage;

import android.text.TextUtils;

@Deprecated
/* renamed from: amca */
public final class amca {
    private final amce a;
    private final amab b;

    public amca(amce amce, amab amab) {
        this.a = amce;
        this.b = amab;
    }

    public final boolean a(ambv ambv) {
        amea amea = ambv.a;
        amea amea2 = ambv.b;
        if ((amea == null && amea2 == null) || (amea != null && amea.equals(amea2))) {
            return false;
        }
        if (amea == null) {
            String str = amea2.c;
            boolean f = this.a.f();
            boolean g = this.a.g();
            if (f || g) {
                amdz amdz = (amdz) ((anxo) amea2.toBuilder());
                if (!amdz.d()) {
                    amdz.c(amec.g);
                }
                int a = ayuc.a(amdz.e().c);
                if (a == 0 || a == 1) {
                    ameb ameb = (ameb) amec.g.createBuilder();
                    if (f) {
                        ameb.c(8);
                    } else {
                        ameb.c(9);
                    }
                    amdz.a(ameb);
                }
                amea2 = (amea) ((anxl) amdz.build());
            }
            this.b.a(str, amea2);
            return false;
        }
        String str2 = amea.c;
        String str3 = amea.g;
        if (amea2 == null) {
            this.b.a(str2, str3, amea.L);
            return false;
        } else if (!TextUtils.equals(amea2.c, str2)) {
            throw new AssertionError("Identity associated with an upload job must not change");
        } else if (TextUtils.equals(amea2.g, str3)) {
            amab amab;
            amec amec = amea.s;
            if (amec == null) {
                amec = amec.g;
            }
            long j = amec.f;
            amec amec2 = amea2.s;
            if (amec2 == null) {
                amec2 = amec.g;
            }
            if (j != amec2.f) {
                amab = this.b;
                amec amec3 = amea2.s;
                if (amec3 == null) {
                    amec3 = amec.g;
                }
                amab.a(str2, str3, amec3);
            }
            if (!TextUtils.equals(amea.G, amea2.G)) {
                this.b.a(str2, str3, amea2.G);
            }
            int a2 = amem.a(amea.H);
            if (a2 == 0) {
                a2 = 1;
            }
            int a3 = amem.a(amea2.H);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a2 != a3) {
                amab = this.b;
                a3 = amem.a(amea2.H);
                if (a3 == 0) {
                    a3 = 1;
                }
                amab.a(str2, str3, a3);
            }
            if (amjq.b(amea) != amjq.b(amea2)) {
                this.b.b(str2, str3, amjq.c(amea2));
            }
            boolean z = amea.L;
            boolean z2 = amea2.L;
            if (z != z2) {
                this.b.a(str2, str3, z2, false);
            } else if (z && !amea.M && amea2.M) {
                this.b.a(str2, str3, true, true);
            }
            boolean z3 = amea.M;
            z = amea2.M;
            if (z3 != z && z) {
                this.b.a(str2, str3);
            }
            Object obj = amea.f;
            if (obj == null) {
                obj = ameo.g;
            }
            ameo ameo = amea2.f;
            if (ameo == null) {
                ameo = ameo.g;
            }
            if (!amqq.a(obj, ameo)) {
                this.b.a(str2, str3, ameo);
            }
            return false;
        } else {
            throw new AssertionError("Frontend upload id of an upload job must not change");
        }
    }
}
