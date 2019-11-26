package defpackage;

/* renamed from: aztx */
public final class aztx extends anxo implements anzf {
    private aztx() {
        super(aztu.c);
    }

    /* synthetic */ aztx(byte b) {
        super(aztu.c);
    }

    public final aztx a(int i) {
        copyOnWrite();
        aztu aztu = (aztu) this.instance;
        aztu.a |= 1;
        aztu.b = i - 1;
        return this;
    }
}
