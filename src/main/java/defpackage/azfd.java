package defpackage;

/* renamed from: azfd */
public final class azfd extends anxo implements anzf {
    private azfd() {
        super(azfa.h);
    }

    public final azfd a(anvu anvu) {
        copyOnWrite();
        azfa azfa = (azfa) this.instance;
        if (anvu != null) {
            azfa.a |= 1;
            azfa.b = anvu;
            return this;
        }
        throw new NullPointerException();
    }

    public final azfd a(int i) {
        copyOnWrite();
        azfa azfa = (azfa) this.instance;
        azfa.a |= 2;
        azfa.c = i;
        return this;
    }

    public final azfd b(int i) {
        copyOnWrite();
        azfa azfa = (azfa) this.instance;
        azfa.a |= 4;
        azfa.d = i;
        return this;
    }

    public final azfd c(int i) {
        copyOnWrite();
        azfa azfa = (azfa) this.instance;
        azfa.a |= 8;
        azfa.e = i;
        return this;
    }

    /* synthetic */ azfd(byte b) {
        super(azfa.h);
    }
}
