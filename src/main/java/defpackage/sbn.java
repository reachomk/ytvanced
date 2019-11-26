package defpackage;

/* renamed from: sbn */
final class sbn extends pjk {
    private final /* synthetic */ sap a;

    sbn(sap sap) {
        this.a = sap;
    }

    public final void a(int i) {
        sap sap = this.a;
        sap.p = i;
        sap.c(false);
        if (sap.D != null && sap.c(2)) {
            bbb.a(null);
        }
        for (sbo c : sap.H) {
            c.c(i);
        }
        if (sap.d != null) {
            "null".length();
            String.valueOf(bbb.c()).length();
            bbb.a(bbb.b());
        }
        sap.a(null, null);
        sap.b(false);
        sap.B();
    }

    public final void a() {
        sap sap = this.a;
        if (sap.h()) {
            try {
                String str = "onApplicationStatusChanged() reached: ";
                String valueOf = String.valueOf(pje.b.d(sap.m));
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                for (sbo j : sap.H) {
                    j.j();
                }
            } catch (IllegalStateException e) {
                sdf.a(sap.r, "onApplicationStatusChanged()", e);
            }
        }
    }

    public final void b() {
        sap sap = this.a;
        try {
            sap.w();
            sap.x();
            for (sbo k : sap.H) {
                k.k();
            }
        } catch (sbt | sbv e) {
            sdf.a(sap.r, "Failed to get volume", e);
        }
    }
}
