package defpackage;

/* renamed from: bbrd */
final class bbrd extends bbyk {
    private final bbnv e;

    bbrd(bboy bboy, bbnv bbnv) {
        super(bboy);
        this.e = bbnv;
    }

    public final void c_(Object obj) {
        if (!this.c) {
            if (this.d != 0) {
                this.a.c_(null);
                return;
            }
            try {
                this.a.c_(bbow.a(this.e.a(obj), "The mapper function returned a null value."));
            } catch (Throwable th) {
                b(th);
            }
        }
    }

    public final boolean b(Object obj) {
        if (this.c) {
            return false;
        }
        try {
            return this.a.b(bbow.a(this.e.a(obj), "The mapper function returned a null value."));
        } catch (Throwable th) {
            b(th);
            return true;
        }
    }

    public final int a(int i) {
        bbpb bbpb = this.b;
        if (bbpb != null) {
            i = bbpb.a(3);
            if (i != 0) {
                this.d = i;
                return i;
            }
        }
        i = 0;
        return i;
    }

    public final Object bI_() {
        Object bI_ = this.b.bI_();
        return bI_ != null ? bbow.a(this.e.a(bI_), "The mapper function returned a null value.") : null;
    }
}
