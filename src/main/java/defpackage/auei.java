package defpackage;

/* renamed from: auei */
public final class auei extends anxo implements anzf {
    private auei() {
        super(auej.m);
    }

    public final auei a(arml arml) {
        copyOnWrite();
        auej auej = (auej) this.instance;
        if (arml != null) {
            auej.f = arml;
            auej.a |= 16;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ auei(byte b) {
        super(auej.m);
    }
}
