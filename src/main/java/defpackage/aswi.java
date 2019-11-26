package defpackage;

/* renamed from: aswi */
public final class aswi extends anxo implements anzf {
    private aswi() {
        super(aswf.g);
    }

    public final aswi a(aurc aurc) {
        copyOnWrite();
        aswf aswf = (aswf) this.instance;
        if (aurc != null) {
            aswf.c = aurc;
            aswf.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aswi(byte b) {
        super(aswf.g);
    }
}
