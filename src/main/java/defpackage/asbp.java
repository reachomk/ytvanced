package defpackage;

/* renamed from: asbp */
public final class asbp extends anxq implements anzf {
    private asbp() {
        super(asbm.u);
    }

    public final asbp a(asib asib) {
        copyOnWrite();
        asbm asbm = (asbm) this.instance;
        asbm.b = (ashy) ((anxl) asib.build());
        asbm.a |= 1;
        return this;
    }

    public final asbp a(arkk arkk) {
        copyOnWrite();
        asbm asbm = (asbm) this.instance;
        asbm.i = (arkl) ((anxl) arkk.build());
        asbm.a |= 512;
        return this;
    }

    /* synthetic */ asbp(byte b) {
        super(asbm.u);
    }
}
