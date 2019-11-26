package defpackage;

/* renamed from: bcyq */
final class bcyq extends bcup {
    private Object a = this.b;
    private final /* synthetic */ Object b;
    private final /* synthetic */ bcyt c;
    private final /* synthetic */ bcyp d;

    bcyq(bcyp bcyp, Object obj, bcyt bcyt) {
        this.d = bcyp;
        this.b = obj;
        this.c = bcyt;
    }

    public final void e_(Object obj) {
        try {
            obj = this.d.a.a(this.a, obj);
            this.a = obj;
            this.c.e_(obj);
        } catch (Throwable th) {
            bcva.a(th, this, obj);
        }
    }

    public final void a(Throwable th) {
        this.c.a(th);
    }

    public final void bM_() {
        this.c.bM_();
    }

    public final void a(bcuc bcuc) {
        bcyt bcyt = this.c;
        if (bcuc != null) {
            long j;
            synchronized (bcyt.b) {
                if (bcyt.c == null) {
                    j = bcyt.a;
                    if (j != Long.MAX_VALUE) {
                        j--;
                    }
                    bcyt.a = 0;
                    bcyt.c = bcuc;
                } else {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
            }
            if (j > 0) {
                bcuc.a(j);
            }
            bcyt.b();
            return;
        }
        throw new NullPointerException();
    }
}
