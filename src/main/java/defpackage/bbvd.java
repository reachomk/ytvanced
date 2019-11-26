package defpackage;

/* renamed from: bbvd */
final class bbvd extends bbpf {
    private final bbnv e;

    bbvd(bbmo bbmo, bbnv bbnv) {
        super(bbmo);
        this.e = bbnv;
    }

    public final void b_(Object obj) {
        if (!this.c) {
            if (this.d != 0) {
                this.a.b_(null);
                return;
            }
            try {
                this.a.b_(bbow.a(this.e.a(obj), "The mapper function returned a null value."));
            } catch (Throwable th) {
                b(th);
            }
        }
    }

    public final int a(int i) {
        return b(i);
    }

    public final Object bI_() {
        Object bI_ = this.b.bI_();
        return bI_ != null ? bbow.a(this.e.a(bI_), "The mapper function returned a null value.") : null;
    }
}
