package defpackage;

/* renamed from: aycm */
public final class aycm extends anxo implements anzf {
    private aycm() {
        super(aycn.i);
    }

    /* synthetic */ aycm(byte b) {
        super(aycn.i);
    }

    public final aycm a(int i) {
        copyOnWrite();
        aycn aycn = (aycn) this.instance;
        aycn.a |= 1;
        aycn.b = i - 1;
        return this;
    }
}
