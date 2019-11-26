package defpackage;

/* renamed from: auli */
public final class auli extends anxo implements anzf {
    private auli() {
        super(aulg.e);
    }

    public final auli a(String str) {
        copyOnWrite();
        aulg aulg = (aulg) this.instance;
        if (str != null) {
            aulg.a |= 1;
            aulg.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ auli(byte b) {
        super(aulg.e);
    }
}
