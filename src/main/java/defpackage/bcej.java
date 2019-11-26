package defpackage;

/* renamed from: bcej */
public final class bcej extends anxo implements anzf {
    private bcej() {
        super(bcek.e);
    }

    public final String a() {
        return ((bcek) this.instance).b;
    }

    public final bcej a(String str) {
        copyOnWrite();
        bcek bcek = (bcek) this.instance;
        if (str != null) {
            bcek.a |= 1;
            bcek.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final bcej a(long j) {
        copyOnWrite();
        bcek bcek = (bcek) this.instance;
        bcek.a |= 2;
        bcek.d = j;
        return this;
    }

    /* synthetic */ bcej(byte b) {
        super(bcek.e);
    }
}
