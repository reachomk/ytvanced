package defpackage;

/* renamed from: askp */
public final class askp extends anxo implements anzf {
    private askp() {
        super(askm.c);
    }

    public final askp a(String str) {
        copyOnWrite();
        askm askm = (askm) this.instance;
        if (str != null) {
            askm.a |= 1;
            askm.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ askp(byte b) {
        super(askm.c);
    }
}
