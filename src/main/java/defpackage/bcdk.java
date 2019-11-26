package defpackage;

/* renamed from: bcdk */
public final class bcdk extends anxo implements anzf {
    private bcdk() {
        super(bcdh.c);
    }

    public final bcdk a(bcdf bcdf) {
        copyOnWrite();
        bcdh bcdh = (bcdh) this.instance;
        if (bcdf != null) {
            bcdh.b = bcdf;
            bcdh.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bcdk(byte b) {
        super(bcdh.c);
    }
}
