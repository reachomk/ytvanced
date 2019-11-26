package defpackage;

/* renamed from: awun */
public final class awun extends anxo implements anzf {
    private awun() {
        super(awuk.e);
    }

    /* synthetic */ awun(byte b) {
        super(awuk.e);
    }

    public final awun a(int i) {
        copyOnWrite();
        awuk awuk = (awuk) this.instance;
        awuk.a |= 1;
        awuk.b = i - 1;
        return this;
    }

    public final awun b(int i) {
        copyOnWrite();
        awuk awuk = (awuk) this.instance;
        if (i != 0) {
            awuk.a |= 2;
            awuk.c = i - 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final awun c(int i) {
        copyOnWrite();
        awuk awuk = (awuk) this.instance;
        awuk.a |= 8;
        awuk.d = 0;
        return this;
    }
}
