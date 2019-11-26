package defpackage;

/* renamed from: w */
final class w implements y {
    private final t a;

    w(t tVar) {
        this.a = tVar;
    }

    public final void a(af afVar, aa aaVar) {
        switch (aaVar.ordinal()) {
            case 0:
                this.a.aw_();
                break;
            case 1:
                this.a.B_();
                return;
            case 2:
                this.a.c();
                return;
            case 3:
                this.a.d();
                return;
            case 4:
                this.a.C_();
                return;
            case 5:
                this.a.a(afVar);
                return;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
    }
}
