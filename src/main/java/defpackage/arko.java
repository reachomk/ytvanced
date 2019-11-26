package defpackage;

/* renamed from: arko */
public final class arko extends anxo implements anzf {
    private arko() {
        super(arkp.i);
    }

    public final arko a(String str) {
        copyOnWrite();
        arkp arkp = (arkp) this.instance;
        if (str != null) {
            arkp.a |= 4;
            arkp.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final arko b(String str) {
        copyOnWrite();
        arkp arkp = (arkp) this.instance;
        if (str != null) {
            arkp.a |= 64;
            arkp.h = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ arko(byte b) {
        super(arkp.i);
    }

    public final arko a(int i) {
        copyOnWrite();
        arkp arkp = (arkp) this.instance;
        arkp.a |= 1;
        arkp.b = i - 1;
        return this;
    }
}
