package defpackage;

/* renamed from: abdu */
public final class abdu extends aaml {
    public anvu a;
    public anvu b;

    public abdu(aamd aamd, afpt afpt) {
        super("notification/opt_out", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        aszx aszx = (aszx) aszy.e.createBuilder();
        anvu anvu = this.a;
        aszx.copyOnWrite();
        aszy aszy = (aszy) aszx.instance;
        if (anvu != null) {
            aszy.a |= 4;
            aszy.c = anvu;
            anvu = this.b;
            aszx.copyOnWrite();
            aszy = (aszy) aszx.instance;
            if (anvu != null) {
                aszy.a |= 32;
                aszy.d = anvu;
                return aszx;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
