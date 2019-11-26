package defpackage;

/* renamed from: axqs */
public final class axqs extends anxo implements anzf {
    private axqs() {
        super(axqt.g);
    }

    public final axqs a(String str) {
        copyOnWrite();
        axqt axqt = (axqt) this.instance;
        if (str != null) {
            axqt.a |= 4;
            axqt.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final axqs a() {
        copyOnWrite();
        axqt axqt = (axqt) this.instance;
        axqt.a |= 8;
        axqt.e = true;
        return this;
    }

    /* synthetic */ axqs(byte b) {
        super(axqt.g);
    }

    public final axqs a(int i) {
        copyOnWrite();
        axqt axqt = (axqt) this.instance;
        if (i != 0) {
            axqt.a |= 2;
            axqt.c = i - 2;
            return this;
        }
        throw new NullPointerException();
    }
}
