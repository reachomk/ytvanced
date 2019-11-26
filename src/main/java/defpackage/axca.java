package defpackage;

/* renamed from: axca */
public final class axca extends anxo implements anzf {
    private axca() {
        super(axcb.c);
    }

    public final axca a(String str) {
        copyOnWrite();
        axcb axcb = (axcb) this.instance;
        if (str != null) {
            axcb.a |= 1;
            axcb.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ axca(byte b) {
        super(axcb.c);
    }
}
