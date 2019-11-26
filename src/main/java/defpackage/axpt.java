package defpackage;

/* renamed from: axpt */
public final class axpt extends anxo implements anzf {
    private axpt() {
        super(axpr.f);
    }

    public final axpt a(axpe axpe) {
        copyOnWrite();
        axpr axpr = (axpr) this.instance;
        if (axpe != null) {
            if (!axpr.b.a()) {
                axpr.b = anxl.mutableCopy(axpr.b);
            }
            axpr.b.add(axpe);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ axpt(byte b) {
        super(axpr.f);
    }
}
