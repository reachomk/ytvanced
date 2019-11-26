package defpackage;

/* renamed from: apxx */
public final class apxx extends anxq implements anzf {
    private apxx() {
        super(apxu.d);
    }

    public final apxx a(anvu anvu) {
        copyOnWrite();
        apxu apxu = (apxu) this.instance;
        if (anvu != null) {
            apxu.a |= 1;
            apxu.b = anvu;
            return this;
        }
        throw new NullPointerException();
    }

    public final apxx a() {
        copyOnWrite();
        apxu apxu = (apxu) this.instance;
        apxu.a &= -2;
        apxu.b = apxu.d.b;
        return this;
    }

    /* synthetic */ apxx(byte b) {
        super(apxu.d);
    }
}
