package defpackage;

/* renamed from: asdn */
public final class asdn extends anxo implements anzf {
    private asdn() {
        super(asdk.d);
    }

    public final asdn a(String str) {
        copyOnWrite();
        asdk asdk = (asdk) this.instance;
        if (str != null) {
            asdk.a |= 1;
            asdk.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final asdn b(String str) {
        copyOnWrite();
        asdk asdk = (asdk) this.instance;
        if (str != null) {
            asdk.a |= 2;
            asdk.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asdn(byte b) {
        super(asdk.d);
    }
}
