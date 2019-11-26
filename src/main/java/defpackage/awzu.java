package defpackage;

/* renamed from: awzu */
public final class awzu extends anxo implements anzf {
    private awzu() {
        super(awzv.d);
    }

    public final awzu a(String str) {
        copyOnWrite();
        awzv awzv = (awzv) this.instance;
        if (str != null) {
            awzv.a |= 1;
            awzv.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ awzu(byte b) {
        super(awzv.d);
    }
}
