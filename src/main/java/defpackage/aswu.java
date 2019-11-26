package defpackage;

/* renamed from: aswu */
public final class aswu extends anxo implements anzf {
    private aswu() {
        super(aswr.c);
    }

    public final aswu a(String str) {
        copyOnWrite();
        aswr aswr = (aswr) this.instance;
        if (str != null) {
            aswr.a |= 1;
            aswr.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aswu(byte b) {
        super(aswr.c);
    }
}
