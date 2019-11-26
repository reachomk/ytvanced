package defpackage;

/* renamed from: auvo */
public final class auvo extends anxo implements anzf {
    private auvo() {
        super(auvl.f);
    }

    public final auvo a(arml arml) {
        copyOnWrite();
        auvl auvl = (auvl) this.instance;
        if (arml != null) {
            auvl.b = arml;
            auvl.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ auvo(byte b) {
        super(auvl.f);
    }
}
