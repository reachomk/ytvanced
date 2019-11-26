package defpackage;

/* renamed from: armo */
public final class armo extends anxq implements anzf {
    private armo() {
        super(armp.m);
    }

    public final armo a(String str) {
        copyOnWrite();
        armp armp = (armp) this.instance;
        if (str != null) {
            armp.a |= 1;
            armp.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final armo a() {
        copyOnWrite();
        armp armp = (armp) this.instance;
        armp.a |= 2;
        armp.c = true;
        return this;
    }

    public final armo a(apxu apxu) {
        copyOnWrite();
        armp armp = (armp) this.instance;
        if (apxu != null) {
            armp.k = apxu;
            armp.a |= 256;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ armo(byte b) {
        super(armp.m);
    }
}
