package defpackage;

/* renamed from: atyn */
public final class atyn extends anxo implements anzf {
    private atyn() {
        super(atyk.i);
    }

    public final atyn a(int i) {
        copyOnWrite();
        atyk atyk = (atyk) this.instance;
        atyk.a |= 1;
        atyk.b = i;
        return this;
    }

    /* synthetic */ atyn(byte b) {
        super(atyk.i);
    }

    public final atyn b(int i) {
        copyOnWrite();
        atyk atyk = (atyk) this.instance;
        atyk.a |= 8;
        atyk.c = i - 1;
        return this;
    }
}
