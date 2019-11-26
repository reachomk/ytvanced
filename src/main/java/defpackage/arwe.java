package defpackage;

/* renamed from: arwe */
public final class arwe extends anxo implements anzf {
    private arwe() {
        super(arwf.c);
    }

    public final arwe a(arwh arwh) {
        copyOnWrite();
        arwf arwf = (arwf) this.instance;
        if (arwh != null) {
            arwf.a |= 1;
            arwf.b = arwh.el;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ arwe(byte b) {
        super(arwf.c);
    }
}
