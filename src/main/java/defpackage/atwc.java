package defpackage;

/* renamed from: atwc */
public final class atwc extends anxo implements anzf {
    private atwc() {
        super(atwd.d);
    }

    public final atwc a(arml arml) {
        copyOnWrite();
        atwd atwd = (atwd) this.instance;
        if (arml != null) {
            atwd.b = arml;
            atwd.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atwc(byte b) {
        super(atwd.d);
    }
}
