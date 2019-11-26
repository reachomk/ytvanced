package defpackage;

/* renamed from: atcb */
public final class atcb extends anxo implements anzf {
    private atcb() {
        super(atcc.f);
    }

    public final atcb a(String str) {
        copyOnWrite();
        atcc atcc = (atcc) this.instance;
        if (str != null) {
            atcc.a |= 2;
            atcc.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atcb(byte b) {
        super(atcc.f);
    }
}
