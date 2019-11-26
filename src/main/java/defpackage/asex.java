package defpackage;

/* renamed from: asex */
public final class asex extends anxo implements anzf {
    private asex() {
        super(aseu.c);
    }

    public final asex a(String str) {
        copyOnWrite();
        aseu aseu = (aseu) this.instance;
        if (str != null) {
            if (!aseu.a.a()) {
                aseu.a = anxl.mutableCopy(aseu.a);
            }
            aseu.a.add(str);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asex(byte b) {
        super(aseu.c);
    }
}
