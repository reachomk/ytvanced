package defpackage;

/* renamed from: antj */
public final class antj extends anxo implements anzf {
    private antj() {
        super(antg.c);
    }

    public final antj a(String str) {
        copyOnWrite();
        antg antg = (antg) this.instance;
        if (str != null) {
            antg.a = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ antj(byte b) {
        super(antg.c);
    }
}
