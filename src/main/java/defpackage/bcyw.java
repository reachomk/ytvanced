package defpackage;

/* renamed from: bcyw */
final class bcyw extends bcup {
    private int a;
    private final /* synthetic */ bcup b;
    private final /* synthetic */ bcyx c;

    bcyw(bcyx bcyx, bcup bcup, bcup bcup2) {
        this.c = bcyx;
        this.b = bcup2;
        super(bcup);
    }

    public final void bM_() {
        this.b.bM_();
    }

    public final void a(Throwable th) {
        this.b.a(th);
    }

    public final void e_(Object obj) {
        int i = this.a;
        if (i < this.c.a) {
            this.a = i + 1;
        } else {
            this.b.e_(obj);
        }
    }

    public final void a(bcuc bcuc) {
        this.b.a(bcuc);
        bcuc.a((long) this.c.a);
    }
}
