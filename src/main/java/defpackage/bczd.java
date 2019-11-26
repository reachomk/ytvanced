package defpackage;

/* renamed from: bczd */
final class bczd extends bcup implements bcvl {
    public final boolean a;
    public final bcue b;
    public Thread c;
    private final bcup d;
    private bctz e;

    bczd(bcup bcup, boolean z, bcue bcue, bctz bctz) {
        this.d = bcup;
        this.a = z;
        this.b = bcue;
        this.e = bctz;
    }

    public final void e_(Object obj) {
        this.d.e_(obj);
    }

    public final void a(Throwable th) {
        try {
            this.d.a(th);
        } finally {
            this.b.b();
        }
    }

    public final void bM_() {
        try {
            this.d.bM_();
        } finally {
            this.b.b();
        }
    }

    public final void a() {
        bctz bctz = this.e;
        this.e = null;
        this.c = Thread.currentThread();
        bctz.a((bcup) this);
    }

    public final void a(bcuc bcuc) {
        this.d.a(new bczc(this, bcuc));
    }
}
