package defpackage;

/* renamed from: augm */
public final class augm extends anxo implements anzf {
    private augm() {
        super(augn.c);
    }

    public final augm a(String str) {
        copyOnWrite();
        augn augn = (augn) this.instance;
        if (str != null) {
            augn.a = 1;
            augn.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ augm(byte b) {
        super(augn.c);
    }
}
