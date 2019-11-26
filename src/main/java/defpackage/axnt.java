package defpackage;

/* renamed from: axnt */
public final class axnt extends anxo implements anzf {
    private axnt() {
        super(axnu.e);
    }

    public final int a() {
        return ((axnu) this.instance).b.size();
    }

    public final axnw a(int i) {
        return (axnw) ((axnu) this.instance).b.get(i);
    }

    public final axnt a(int i, axnv axnv) {
        copyOnWrite();
        axnu axnu = (axnu) this.instance;
        axnu.a();
        axnu.b.set(i, (axnw) ((anxl) axnv.build()));
        return this;
    }

    /* synthetic */ axnt(byte b) {
        super(axnu.e);
    }
}
