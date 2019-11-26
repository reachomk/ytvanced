package defpackage;

/* renamed from: asmt */
public final class asmt extends anxo implements anzf {
    private asmt() {
        super(asmq.d);
    }

    public final asmt a(String str) {
        copyOnWrite();
        asmq asmq = (asmq) this.instance;
        if (str != null) {
            asmq.a |= 1;
            asmq.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asmt(byte b) {
        super(asmq.d);
    }
}
