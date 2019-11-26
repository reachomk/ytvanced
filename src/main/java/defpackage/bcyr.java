package defpackage;

/* renamed from: bcyr */
final class bcyr extends bcup {
    private boolean a;
    private Object b;
    private final /* synthetic */ bcup c;
    private final /* synthetic */ bcyp d;

    bcyr(bcyp bcyp, bcup bcup, bcup bcup2) {
        this.d = bcyp;
        this.c = bcup2;
        super(bcup);
    }

    public final void e_(Object obj) {
        if (this.a) {
            try {
                obj = this.d.a.a(this.b, obj);
            } catch (Throwable th) {
                bcva.a(th, this.c, obj);
                return;
            }
        }
        this.a = true;
        this.b = obj;
        this.c.e_(obj);
    }

    public final void a(Throwable th) {
        this.c.a(th);
    }

    public final void bM_() {
        this.c.bM_();
    }
}
