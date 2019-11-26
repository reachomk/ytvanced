package defpackage;

/* renamed from: baat */
public final class baat extends anxo implements anzf {
    private baat() {
        super(baao.c);
    }

    public final baat a(String str) {
        copyOnWrite();
        baao baao = (baao) this.instance;
        if (str != null) {
            baao.a = 1;
            baao.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ baat(byte b) {
        super(baao.c);
    }
}
