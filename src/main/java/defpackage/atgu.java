package defpackage;

/* renamed from: atgu */
public final class atgu extends anxo implements anzf {
    private atgu() {
        super(atgr.m);
    }

    public final atgu a(arkl arkl) {
        copyOnWrite();
        atgr atgr = (atgr) this.instance;
        if (arkl != null) {
            atgr.j = arkl;
            atgr.a |= 256;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atgu(byte b) {
        super(atgr.m);
    }
}
