package defpackage;

/* renamed from: avji */
public final class avji extends anxo implements anzf {
    private avji() {
        super(avjj.c);
    }

    public final avji a(apxu apxu) {
        copyOnWrite();
        avjj avjj = (avjj) this.instance;
        if (apxu != null) {
            avjj.b = apxu;
            avjj.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ avji(byte b) {
        super(avjj.c);
    }
}
