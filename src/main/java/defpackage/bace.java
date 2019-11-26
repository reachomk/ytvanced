package defpackage;

/* renamed from: bace */
public final class bace extends anxo implements anzf {
    private bace() {
        super(bacc.e);
    }

    public final bace a(bach bach) {
        copyOnWrite();
        bacc bacc = (bacc) this.instance;
        if (bach != null) {
            bacc.a |= 1;
            bacc.b = bach.d;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bace(byte b) {
        super(bacc.e);
    }
}
