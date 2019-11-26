package defpackage;

/* renamed from: bczn */
final class bczn extends bcup {
    public boolean a;
    public final /* synthetic */ bczk b;
    private int c;
    private final /* synthetic */ bcup d;

    bczn(bczk bczk, bcup bcup) {
        this.b = bczk;
        this.d = bcup;
    }

    public final void bM_() {
        if (!this.a) {
            this.a = true;
            this.d.bM_();
        }
    }

    public final void a(Throwable th) {
        if (!this.a) {
            this.a = true;
            try {
                this.d.a(th);
            } finally {
                b();
            }
        }
    }

    public final void e_(Object obj) {
        if (!c()) {
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            int i3 = this.b.a;
            if (i < i3) {
                this.d.e_(obj);
                if (i2 == i3 && !this.a) {
                    this.a = true;
                    try {
                        this.d.bM_();
                    } finally {
                        b();
                    }
                }
            }
        }
    }

    public final void a(bcuc bcuc) {
        this.d.a(new bczm(this, bcuc));
    }
}
