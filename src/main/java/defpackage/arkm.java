package defpackage;

/* renamed from: arkm */
public final class arkm extends anxo implements anzf {
    private arkm() {
        super(arkn.c);
    }

    public final arkm a(String str) {
        copyOnWrite();
        arkn arkn = (arkn) this.instance;
        if (str != null) {
            arkn.a |= 2;
            arkn.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ arkm(byte b) {
        super(arkn.c);
    }
}
