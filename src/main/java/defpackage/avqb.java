package defpackage;

/* renamed from: avqb */
public final class avqb extends anxo implements anzf {
    private avqb() {
        super(avqc.j);
    }

    /* synthetic */ avqb(byte b) {
        super(avqc.j);
    }

    public final avqb a(int i) {
        copyOnWrite();
        avqc avqc = (avqc) this.instance;
        if (i != 0) {
            avqc.a |= 8;
            avqc.e = i - 1;
            return this;
        }
        throw new NullPointerException();
    }
}
