package defpackage;

/* renamed from: aoxg */
public final class aoxg extends anxo implements anzf {
    private aoxg() {
        super(aoxe.e);
    }

    public final aoxg a(String str) {
        copyOnWrite();
        aoxe aoxe = (aoxe) this.instance;
        if (str != null) {
            aoxe.a |= 8;
            aoxe.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aoxg(byte b) {
        super(aoxe.e);
    }
}
