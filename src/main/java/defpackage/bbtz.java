package defpackage;

/* renamed from: bbtz */
final class bbtz extends bbpf {
    private final bbny e;

    bbtz(bbmo bbmo, bbny bbny) {
        super(bbmo);
        this.e = bbny;
    }

    public final void b_(Object obj) {
        if (this.d == 0) {
            try {
                if (this.e.a(obj)) {
                    this.a.b_(obj);
                }
                return;
            } catch (Throwable th) {
                b(th);
                return;
            }
        }
        this.a.b_(null);
    }

    public final int a(int i) {
        return b(i);
    }

    public final Object bI_() {
        Object bI_;
        do {
            bI_ = this.b.bI_();
            if (bI_ == null) {
                break;
            }
        } while (!this.e.a(bI_));
        return bI_;
    }
}
