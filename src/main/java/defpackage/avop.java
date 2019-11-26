package defpackage;

/* renamed from: avop */
public final class avop extends anxo implements anzf {
    private avop() {
        super(avoq.k);
    }

    public final avop a(String str) {
        copyOnWrite();
        avoq avoq = (avoq) this.instance;
        if (str != null) {
            avoq.a |= 1;
            avoq.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final avop a(long j) {
        copyOnWrite();
        avoq avoq = (avoq) this.instance;
        avoq.a |= 32;
        avoq.h = j;
        return this;
    }

    /* synthetic */ avop(byte b) {
        super(avoq.k);
    }
}
