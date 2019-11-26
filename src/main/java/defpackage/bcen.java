package defpackage;

/* renamed from: bcen */
public final class bcen extends anxo implements anzf {
    private bcen() {
        super(bceo.d);
    }

    public final bcen a(bced bced) {
        copyOnWrite();
        bceo bceo = (bceo) this.instance;
        bceo.c = (bcee) ((anxl) bced.build());
        bceo.a |= 2;
        return this;
    }

    /* synthetic */ bcen(byte b) {
        super(bceo.d);
    }

    public final bcen a(int i) {
        copyOnWrite();
        bceo bceo = (bceo) this.instance;
        bceo.a |= 1;
        bceo.b = i - 1;
        return this;
    }
}
