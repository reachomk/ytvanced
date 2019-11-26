package defpackage;

/* renamed from: bcwo */
final class bcwo extends bcwq {
    public static final long serialVersionUID = 338953216916120960L;
    private boolean b;

    public bcwo(bcup bcup) {
        super(bcup);
    }

    public final void e_(Object obj) {
        if (!this.b) {
            super.e_(obj);
        }
    }

    public final void bM_() {
        if (!this.b) {
            this.b = true;
            super.bM_();
        }
    }

    public final void a(Throwable th) {
        if (this.b) {
            bdeh.a(th);
            return;
        }
        this.b = true;
        super.a(th);
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        a(new bcvd("create: could not emit value due to lack of requests"));
    }
}
