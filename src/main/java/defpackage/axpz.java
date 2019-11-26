package defpackage;

/* renamed from: axpz */
public final class axpz extends anxq implements anzf {
    private axpz() {
        super(axpw.e);
    }

    public final axpz a(axak axak) {
        copyOnWrite();
        axpw axpw = (axpw) this.instance;
        if (axak != null) {
            if (!axpw.b.a()) {
                axpw.b = anxl.mutableCopy(axpw.b);
            }
            axpw.b.add(axak);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ axpz(byte b) {
        super(axpw.e);
    }
}
