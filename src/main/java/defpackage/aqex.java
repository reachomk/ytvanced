package defpackage;

/* renamed from: aqex */
public final class aqex extends anxo implements anzf {
    private aqex() {
        super(aqey.n);
    }

    public final aqex a(arml arml) {
        copyOnWrite();
        aqey aqey = (aqey) this.instance;
        if (arml != null) {
            aqey.f = arml;
            aqey.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final aqex a(apxu apxu) {
        copyOnWrite();
        aqey aqey = (aqey) this.instance;
        if (apxu != null) {
            aqey.c = apxu;
            aqey.b = 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final aqex a(aqer aqer) {
        copyOnWrite();
        aqey aqey = (aqey) this.instance;
        aqey.k = (aqes) ((anxl) aqer.build());
        aqey.a |= 16384;
        return this;
    }

    /* synthetic */ aqex(byte b) {
        super(aqey.n);
    }
}
