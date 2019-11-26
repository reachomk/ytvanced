package defpackage;

/* renamed from: bcwv */
final class bcwv extends bcup {
    private final bcup a;
    private final bcvq b;
    private boolean c;

    public bcwv(bcup bcup, bcvq bcvq) {
        this.a = bcup;
        this.b = bcvq;
        a(0);
    }

    public final void e_(Object obj) {
        try {
            if (((Boolean) this.b.a(obj)).booleanValue()) {
                this.a.e_(obj);
            } else {
                a(1);
            }
        } catch (Throwable th) {
            bcva.b(th);
            b();
            a(bcvh.a(th, obj));
        }
    }

    public final void a(Throwable th) {
        if (this.c) {
            bdeh.a(th);
            return;
        }
        this.c = true;
        this.a.a(th);
    }

    public final void bM_() {
        if (!this.c) {
            this.a.bM_();
        }
    }

    public final void a(bcuc bcuc) {
        super.a(bcuc);
        this.a.a(bcuc);
    }
}
