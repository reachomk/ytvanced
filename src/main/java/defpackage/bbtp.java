package defpackage;

/* renamed from: bbtp */
final class bbtp extends bbpf {
    private final bbnv e;
    private final bbnu f;
    private Object g;
    private boolean h;

    bbtp(bbmo bbmo, bbnv bbnv, bbnu bbnu) {
        super(bbmo);
        this.e = bbnv;
        this.f = bbnu;
    }

    public final void b_(Object obj) {
        if (!this.c) {
            if (this.d != 0) {
                this.a.b_(obj);
                return;
            }
            try {
                Object a = this.e.a(obj);
                if (this.h) {
                    boolean a2 = this.f.a(this.g, a);
                    this.g = a;
                    if (a2) {
                        return;
                    }
                } else {
                    this.h = true;
                    this.g = a;
                }
                this.a.b_(obj);
            } catch (Throwable th) {
                b(th);
            }
        }
    }

    public final int a(int i) {
        return b(i);
    }

    public final Object bI_() {
        while (true) {
            Object bI_ = this.b.bI_();
            if (bI_ == null) {
                return null;
            }
            Object a = this.e.a(bI_);
            if (!this.h) {
                this.h = true;
                this.g = a;
                return bI_;
            } else if (this.f.a(this.g, a)) {
                this.g = a;
            } else {
                this.g = a;
                return bI_;
            }
        }
    }
}
