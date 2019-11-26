package defpackage;

/* renamed from: bcam */
public final class bcam extends anxo implements anzf {
    private bcam() {
        super(bcaj.e);
    }

    public final bcam a(Iterable iterable) {
        copyOnWrite();
        bcaj bcaj = (bcaj) this.instance;
        if (!bcaj.b.a()) {
            bcaj.b = anxl.mutableCopy(bcaj.b);
        }
        anvf.addAll(iterable, bcaj.b);
        return this;
    }

    public final bcam b(Iterable iterable) {
        copyOnWrite();
        bcaj bcaj = (bcaj) this.instance;
        if (!bcaj.c.a()) {
            bcaj.c = anxl.mutableCopy(bcaj.c);
        }
        anvf.addAll(iterable, bcaj.c);
        return this;
    }

    public final bcam a(bcah bcah) {
        copyOnWrite();
        bcaj bcaj = (bcaj) this.instance;
        if (bcah != null) {
            bcaj.d = bcah;
            bcaj.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bcam(byte b) {
        super(bcaj.e);
    }
}
