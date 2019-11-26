package defpackage;

/* renamed from: avnd */
public final class avnd extends anxo implements anzf {
    private avnd() {
        super(avna.g);
    }

    public final avnd a(String str) {
        copyOnWrite();
        avna avna = (avna) this.instance;
        if (str != null) {
            avna.a |= 1;
            avna.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final avnd a(aygk aygk) {
        copyOnWrite();
        avna avna = (avna) this.instance;
        if (aygk != null) {
            avna.c = aygk;
            avna.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final avnd b(String str) {
        copyOnWrite();
        avna avna = (avna) this.instance;
        if (str != null) {
            avna.a |= 4;
            avna.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ avnd(byte b) {
        super(avna.g);
    }
}
