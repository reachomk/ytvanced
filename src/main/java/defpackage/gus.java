package defpackage;

/* renamed from: gus */
final class gus implements fao {
    private final /* synthetic */ gub a;

    public final void a(int i, boolean z) {
        akbc e = this.a.ak.e();
        if (!z) {
            this.a.bc.b();
        }
        gub gub = this.a;
        if (gub.ap == 0) {
            gub.ao();
        }
        this.a.aV.a(e);
        this.a.bh.b();
    }

    public final boolean a(int i) {
        this.a.a(false);
        return true;
    }

    public final void b(int i) {
        if (i == 1) {
            this.a.aV.a(false);
        } else if (i == 2) {
            this.a.aV.a(false);
        } else if (i == 0) {
            this.a.ao();
            this.a.aV.a(true);
        }
        this.a.ap = i;
    }

    public final void a(float f) {
        if (f != 0.0f && f != 1.0f) {
            this.a.a(true);
        }
    }

    /* synthetic */ gus(gub gub) {
        this.a = gub;
    }
}
