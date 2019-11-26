package defpackage;

/* renamed from: axfq */
public final class axfq extends anxo implements anzf {
    private axfq() {
        super(axfr.c);
    }

    public final axfq a(String str) {
        copyOnWrite();
        axfr axfr = (axfr) this.instance;
        if (str != null) {
            axfr.a |= 1;
            axfr.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ axfq(byte b) {
        super(axfr.c);
    }
}
