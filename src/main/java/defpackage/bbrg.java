package defpackage;

/* renamed from: bbrg */
final class bbrg extends bbyj {
    private final bbnv f;

    bbrg(bcto bcto, bbnv bbnv) {
        super(bcto);
        this.f = bbnv;
    }

    public final void c_(Object obj) {
        if (!this.d) {
            if (this.e != 0) {
                this.a.c_(null);
                return;
            }
            try {
                this.a.c_(bbow.a(this.f.a(obj), "The mapper function returned a null value."));
            } catch (Throwable th) {
                bbnm.a(th);
                this.b.d();
                a(th);
            }
        }
    }

    public final int a(int i) {
        bbpb bbpb = this.c;
        if (bbpb != null) {
            i = bbpb.a(3);
            if (i != 0) {
                this.e = i;
                return i;
            }
        }
        i = 0;
        return i;
    }

    public final Object bI_() {
        Object bI_ = this.c.bI_();
        return bI_ != null ? bbow.a(this.f.a(bI_), "The mapper function returned a null value.") : null;
    }
}
