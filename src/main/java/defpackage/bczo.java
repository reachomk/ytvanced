package defpackage;

/* renamed from: bczo */
final class bczo extends bcup {
    private final /* synthetic */ bcup a;

    bczo(bcup bcup, bcup bcup2) {
        this.a = bcup2;
        super(bcup, false);
    }

    public final void e_(Object obj) {
        this.a.e_(obj);
    }

    public final void a(Throwable th) {
        try {
            this.a.a(th);
        } finally {
            this.a.b();
        }
    }

    public final void bM_() {
        try {
            this.a.bM_();
        } finally {
            this.a.b();
        }
    }
}
