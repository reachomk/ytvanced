package defpackage;

/* renamed from: aazs */
public final class aazs extends aazt {
    protected aazs(aamd aamd, afpt afpt) {
        super("like/dislike", aamd, afpt);
    }

    public final /* synthetic */ anzd c() {
        asus asus = (asus) asup.d.createBuilder();
        auad auad = this.a;
        asus.copyOnWrite();
        asup asup = (asup) asus.instance;
        if (auad != null) {
            asup.c = auad;
            asup.a |= 2;
            return asus;
        }
        throw new NullPointerException();
    }
}
