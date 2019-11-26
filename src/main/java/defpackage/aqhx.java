package defpackage;

/* renamed from: aqhx */
public final class aqhx extends anxo implements anzf {
    private aqhx() {
        super(aqhy.q);
    }

    public final aqhx a(arml arml) {
        copyOnWrite();
        aqhy aqhy = (aqhy) this.instance;
        if (arml != null) {
            aqhy.b = arml;
            aqhy.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final aqhx b(arml arml) {
        copyOnWrite();
        aqhy aqhy = (aqhy) this.instance;
        if (arml != null) {
            if (!aqhy.e.a()) {
                aqhy.e = anxl.mutableCopy(aqhy.e);
            }
            aqhy.e.add(arml);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aqhx(byte b) {
        super(aqhy.q);
    }
}
