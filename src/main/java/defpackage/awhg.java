package defpackage;

/* renamed from: awhg */
public final class awhg extends anxo implements anzf {
    private awhg() {
        super(awhh.c);
    }

    public final awhg a(String str) {
        copyOnWrite();
        awhh awhh = (awhh) this.instance;
        if (str != null) {
            awhh.a |= 1;
            awhh.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ awhg(byte b) {
        super(awhh.c);
    }
}
