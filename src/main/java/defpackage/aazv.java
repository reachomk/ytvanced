package defpackage;

/* renamed from: aazv */
public final class aazv extends aazt {
    protected aazv(aamd aamd, afpt afpt) {
        super("like/like", aamd, afpt);
    }

    public final /* synthetic */ anzd c() {
        asuw asuw = (asuw) asut.d.createBuilder();
        auad auad = this.a;
        asuw.copyOnWrite();
        asut asut = (asut) asuw.instance;
        if (auad != null) {
            asut.c = auad;
            asut.a |= 2;
            return asuw;
        }
        throw new NullPointerException();
    }
}
