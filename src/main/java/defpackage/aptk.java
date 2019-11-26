package defpackage;

/* renamed from: aptk */
public final class aptk extends anxo implements anzf {
    private aptk() {
        super(aptl.i);
    }

    public final aptk a(aptm aptm) {
        copyOnWrite();
        aptl aptl = (aptl) this.instance;
        aptl.d = (aptn) ((anxl) aptm.build());
        aptl.a |= 1;
        return this;
    }

    public final aptk a(arml arml) {
        copyOnWrite();
        aptl aptl = (aptl) this.instance;
        if (arml != null) {
            aptl.e = arml;
            aptl.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final aptk a(boolean z) {
        copyOnWrite();
        aptl aptl = (aptl) this.instance;
        aptl.a |= 64;
        aptl.g = z;
        return this;
    }

    public final anvu a() {
        return ((aptl) this.instance).h;
    }

    /* synthetic */ aptk(byte b) {
        super(aptl.i);
    }
}
