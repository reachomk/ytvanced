package defpackage;

/* renamed from: alyw */
public final class alyw implements alzf {
    private final ambw a;

    public alyw(ambw ambw) {
        this.a = ambw;
    }

    public final amea a(amea amea) {
        if (amea == null) {
            return null;
        }
        if (amea.C) {
            if (!(amea.L || amea.M)) {
                ambw ambw = this.a;
                String str = amea.g;
                aysy aysy = (aysy) aysv.j.createBuilder();
                aysy.a(26);
                ayta ayta = (ayta) aysx.e.createBuilder();
                ayta.a(str);
                aysy.a(ayta);
                aysv aysv = (aysv) ((anxl) aysy.build());
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.a(aysv);
                ambw.a.a((asmw) ((anxl) asmz.build()));
            }
            amdz amdz = (amdz) ((anxo) amea.toBuilder());
            amdz.a(false);
            amdz.copyOnWrite();
            amea amea2 = (amea) amdz.instance;
            amea2.b |= 4;
            amea2.L = true;
            amec amec = amea.Q;
            if (amec == null) {
                amec = amec.g;
            }
            int a = amee.a(amec.b);
            if (a == 0 || a != 2) {
                amec = amec.g;
            }
            amdz.m(amec);
            amec = amea.w;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.g(alyw.a(amec));
            amec = amea.I;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.h(alyw.a(amec));
            amec = amea.o;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.b(alyw.a(amec));
            amec = amea.o;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.i(alyw.a(amec));
            amec = amea.O;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.l(alyw.a(amec));
            amec = amea.v;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.f(alyw.a(amec));
            amec = amea.m;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.a(alyw.a(amec));
            amec = amea.t;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.d(alyw.a(amec));
            amec = amea.s;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.c(alyw.a(amec));
            amec = amea.u;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.e(alyw.a(amec));
            amec = amea.K;
            if (amec == null) {
                amec = amec.g;
            }
            amdz.j(alyw.a(amec));
            amec amec2 = amea.N;
            if (amec2 == null) {
                amec2 = amec.g;
            }
            amdz.k(alyw.a(amec2));
            return (amea) ((anxl) amdz.build());
        }
        throw new IllegalStateException("use_explicit_upload_flow must be true");
    }

    private static amec a(amec amec) {
        int a = amee.a(amec.b);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            return amjq.a();
        }
        return amec.g;
    }
}
