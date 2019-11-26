package defpackage;

/* renamed from: aqsl */
public final class aqsl extends anxo implements anzf {
    private aqsl() {
        super(aqsm.h);
    }

    public final aqsl a(String str) {
        copyOnWrite();
        aqsm aqsm = (aqsm) this.instance;
        if (str != null) {
            aqsm.a |= 1;
            aqsm.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final aqsl a(int i) {
        copyOnWrite();
        aqsm aqsm = (aqsm) this.instance;
        aqsm.a |= 2;
        aqsm.c = i;
        return this;
    }

    public final aqsl b(int i) {
        copyOnWrite();
        aqsm aqsm = (aqsm) this.instance;
        aqsm.a |= 4;
        aqsm.d = i;
        return this;
    }

    public final aqsl c(int i) {
        copyOnWrite();
        aqsm aqsm = (aqsm) this.instance;
        aqsm.a |= 32;
        aqsm.g = i;
        return this;
    }

    /* synthetic */ aqsl(byte b) {
        super(aqsm.h);
    }

    public final aqsl d(int i) {
        copyOnWrite();
        aqsm aqsm = (aqsm) this.instance;
        aqsm.a |= 8;
        aqsm.e = i - 1;
        return this;
    }

    public final aqsl e(int i) {
        copyOnWrite();
        aqsm aqsm = (aqsm) this.instance;
        aqsm.a |= 16;
        aqsm.f = i - 1;
        return this;
    }
}
