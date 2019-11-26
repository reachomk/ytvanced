package defpackage;

/* renamed from: aoef */
public final class aoef extends anxo implements anzf {
    private aoef() {
        super(aoec.e);
    }

    public final aoef a(aoxs aoxs) {
        copyOnWrite();
        aoec aoec = (aoec) this.instance;
        aoec.d = aoxs;
        aoec.a |= 8;
        return this;
    }

    /* synthetic */ aoef(byte b) {
        super(aoec.e);
    }

    public final aoef a(int i) {
        copyOnWrite();
        aoec aoec = (aoec) this.instance;
        aoec.a |= 1;
        aoec.b = i - 1;
        return this;
    }
}
