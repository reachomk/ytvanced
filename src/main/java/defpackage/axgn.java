package defpackage;

/* renamed from: axgn */
public final class axgn extends anxo implements anzf {
    private axgn() {
        super(axgk.p);
    }

    public final axgn a(axak axak) {
        copyOnWrite();
        axgk axgk = (axgk) this.instance;
        if (axak != null) {
            axgk.m = axak;
            axgk.a |= 8192;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ axgn(byte b) {
        super(axgk.p);
    }
}
