package defpackage;

/* renamed from: atbr */
public final class atbr extends anxo implements anzf {
    private atbr() {
        super(atbs.d);
    }

    public final atbr a(String str) {
        copyOnWrite();
        atbs atbs = (atbs) this.instance;
        if (str != null) {
            atbs.a |= 1;
            atbs.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final atbr b(String str) {
        copyOnWrite();
        atbs atbs = (atbs) this.instance;
        if (str != null) {
            atbs.a |= 2;
            atbs.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atbr(byte b) {
        super(atbs.d);
    }
}
