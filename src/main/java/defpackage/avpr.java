package defpackage;

/* renamed from: avpr */
public final class avpr extends anxo implements anzf {
    private avpr() {
        super(avps.c);
    }

    /* synthetic */ avpr(byte b) {
        super(avps.c);
    }

    public final avpr a(int i) {
        copyOnWrite();
        avps avps = (avps) this.instance;
        avps.a |= 2;
        avps.b = i - 1;
        return this;
    }
}
