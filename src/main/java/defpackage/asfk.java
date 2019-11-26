package defpackage;

/* renamed from: asfk */
public final class asfk extends anxo implements anzf {
    private asfk() {
        super(asfl.c);
    }

    public final asfk a(String str) {
        copyOnWrite();
        asfl asfl = (asfl) this.instance;
        if (str != null) {
            asfl.a |= 1;
            asfl.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asfk(byte b) {
        super(asfl.c);
    }
}
