package defpackage;

/* renamed from: aqoi */
public final class aqoi extends anxo implements anzf {
    private aqoi() {
        super(aqoj.s);
    }

    public final aqoi a(long j) {
        copyOnWrite();
        aqoj aqoj = (aqoj) this.instance;
        aqoj.a |= 1;
        aqoj.b = j;
        return this;
    }

    public final aqoi a(String str) {
        copyOnWrite();
        aqoj aqoj = (aqoj) this.instance;
        if (str != null) {
            aqoj.a |= 8;
            aqoj.e = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final aqoi a(arml arml) {
        copyOnWrite();
        aqoj aqoj = (aqoj) this.instance;
        if (arml != null) {
            aqoj.j = arml;
            aqoj.a |= 256;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aqoi(byte b) {
        super(aqoj.s);
    }
}
