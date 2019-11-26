package defpackage;

/* renamed from: ansq */
public final class ansq extends anxo implements anzf {
    private ansq() {
        super(ansr.d);
    }

    public final ansq a(String str) {
        copyOnWrite();
        ansr ansr = (ansr) this.instance;
        if (str != null) {
            ansr.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ ansq(byte b) {
        super(ansr.d);
    }
}
