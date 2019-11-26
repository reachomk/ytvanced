package defpackage;

/* renamed from: azsj */
public final class azsj extends anxo implements anzf {
    private azsj() {
        super(azsg.c);
    }

    public final azsj a(String str) {
        copyOnWrite();
        azsg azsg = (azsg) this.instance;
        if (str != null) {
            azsg.a |= 1;
            azsg.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ azsj(byte b) {
        super(azsg.c);
    }
}
