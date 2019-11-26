package defpackage;

/* renamed from: baaw */
public final class baaw extends anxo implements anzf {
    private baaw() {
        super(baau.e);
    }

    public final baaw a(baaz baaz) {
        copyOnWrite();
        baau baau = (baau) this.instance;
        if (baaz != null) {
            baau.a |= 1;
            baau.b = baaz.d;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ baaw(byte b) {
        super(baau.e);
    }
}
