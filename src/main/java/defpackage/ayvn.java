package defpackage;

/* renamed from: ayvn */
public final class ayvn extends anxo implements anzf {
    private ayvn() {
        super(ayvl.d);
    }

    public final ayvn a(String str) {
        copyOnWrite();
        ayvl ayvl = (ayvl) this.instance;
        if (str != null) {
            ayvl.a |= 1;
            ayvl.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ ayvn(byte b) {
        super(ayvl.d);
    }
}
