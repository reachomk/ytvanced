package defpackage;

/* renamed from: aazu */
public final class aazu extends aazt {
    protected aazu(aamd aamd, afpt afpt) {
        super("like/removelike", aamd, afpt);
    }

    public final /* synthetic */ anzd c() {
        asva asva = (asva) asux.d.createBuilder();
        auad auad = this.a;
        asva.copyOnWrite();
        asux asux = (asux) asva.instance;
        if (auad != null) {
            asux.c = auad;
            asux.a |= 2;
            return asva;
        }
        throw new NullPointerException();
    }
}
