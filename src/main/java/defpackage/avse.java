package defpackage;

/* renamed from: avse */
public final class avse extends anxo implements anzf {
    private avse() {
        super(avsc.g);
    }

    public final avse a(String str) {
        copyOnWrite();
        avsc avsc = (avsc) this.instance;
        if (str != null) {
            avsc.a |= 1;
            avsc.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final avse b(String str) {
        copyOnWrite();
        avsc avsc = (avsc) this.instance;
        if (str != null) {
            avsc.a |= 2;
            avsc.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final avse a(int i) {
        copyOnWrite();
        avsc avsc = (avsc) this.instance;
        avsc.a |= 4;
        avsc.d = i;
        return this;
    }

    public final avse c(String str) {
        copyOnWrite();
        avsc avsc = (avsc) this.instance;
        if (str != null) {
            avsc.a |= 8;
            avsc.e = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ avse(byte b) {
        super(avsc.g);
    }
}
