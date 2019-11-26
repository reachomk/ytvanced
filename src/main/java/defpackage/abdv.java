package defpackage;

/* renamed from: abdv */
public final class abdv extends aaml {
    public String a;
    public boolean b;

    public abdv(aamd aamd, afpt afpt) {
        super("notification/modify_playlist_preference", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        asyv asyv = (asyv) asyw.e.createBuilder();
        boolean z = this.b;
        asyv.copyOnWrite();
        asyw asyw = (asyw) asyv.instance;
        asyw.a |= 4;
        asyw.d = z;
        String str = this.a;
        if (str != null) {
            asyv.copyOnWrite();
            asyw = (asyw) asyv.instance;
            asyw.a |= 2;
            asyw.c = str;
        }
        return asyv;
    }
}
