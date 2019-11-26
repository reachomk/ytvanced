package defpackage;

/* renamed from: atzs */
public final class atzs extends anxo implements anzf {
    private atzs() {
        super(atzt.c);
    }

    public final atzr a() {
        atzr atzr = ((atzt) this.instance).b;
        return atzr == null ? atzr.p : atzr;
    }

    public final atzs a(atzq atzq) {
        copyOnWrite();
        atzt atzt = (atzt) this.instance;
        atzt.b = (atzr) ((anxl) atzq.build());
        atzt.a |= 1;
        return this;
    }

    /* synthetic */ atzs(byte b) {
        super(atzt.c);
    }
}
