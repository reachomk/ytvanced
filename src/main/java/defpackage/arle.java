package defpackage;

/* renamed from: arle */
public final class arle extends anxo implements anzf {
    private arle() {
        super(arlf.e);
    }

    public final arml a() {
        arml arml = ((arlf) this.instance).b;
        return arml == null ? arml.f : arml;
    }

    public final String b() {
        return ((arlf) this.instance).c;
    }

    public final arle a(String str) {
        copyOnWrite();
        arlf arlf = (arlf) this.instance;
        if (str != null) {
            arlf.a |= 2;
            arlf.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ arle(byte b) {
        super(arlf.e);
    }
}
