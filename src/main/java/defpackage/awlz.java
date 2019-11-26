package defpackage;

/* renamed from: awlz */
public final class awlz extends anxo implements anzf {
    private awlz() {
        super(awlw.o);
    }

    public final awlz a(long j) {
        copyOnWrite();
        awlw awlw = (awlw) this.instance;
        awlw.a |= 2;
        awlw.c = j;
        return this;
    }

    public final awlz a(boolean z) {
        copyOnWrite();
        awlw awlw = (awlw) this.instance;
        awlw.a |= 4;
        awlw.d = z;
        return this;
    }

    public final awlz a(double d) {
        copyOnWrite();
        awlw awlw = (awlw) this.instance;
        awlw.a |= 16;
        awlw.f = d;
        return this;
    }

    public final awlz a(arml arml) {
        copyOnWrite();
        awlw awlw = (awlw) this.instance;
        if (arml != null) {
            awlw.g = arml;
            awlw.a |= 32;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ awlz(byte b) {
        super(awlw.o);
    }
}
