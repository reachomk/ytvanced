package defpackage;

/* renamed from: bcxx */
final class bcxx extends bcup {
    private Object a;
    private boolean b;
    private final /* synthetic */ bcup c;
    private final /* synthetic */ bcxu d;

    bcxx(bcxu bcxu, bcup bcup, bcup bcup2) {
        this.d = bcxu;
        this.c = bcup2;
        super(bcup);
    }

    public final void e_(Object obj) {
        try {
            Object a = this.d.a.a(obj);
            Object obj2 = this.a;
            this.a = a;
            if (this.b) {
                try {
                    a = ((Boolean) this.d.b.a(obj2, a)).booleanValue();
                    if (a == null) {
                        this.c.e_(obj);
                        return;
                    } else {
                        a(1);
                        return;
                    }
                } catch (Throwable th) {
                    bcva.a(th, this.c, a);
                    return;
                }
            }
            this.b = true;
            this.c.e_(obj);
        } catch (Throwable th2) {
            bcva.a(th2, this.c, obj);
        }
    }

    public final void a(Throwable th) {
        this.c.a(th);
    }

    public final void bM_() {
        this.c.bM_();
    }
}
