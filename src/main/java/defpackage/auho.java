package defpackage;

/* renamed from: auho */
public final class auho extends anxo implements anzf {
    private auho() {
        super(auhp.g);
    }

    /* synthetic */ auho(byte b) {
        super(auhp.g);
    }

    public final auho a(int i) {
        copyOnWrite();
        auhp auhp = (auhp) this.instance;
        auhp.a |= 4;
        auhp.d = i - 1;
        return this;
    }

    public final auho b(int i) {
        copyOnWrite();
        auhp auhp = (auhp) this.instance;
        auhp.a |= 8;
        auhp.e = i - 1;
        return this;
    }
}
