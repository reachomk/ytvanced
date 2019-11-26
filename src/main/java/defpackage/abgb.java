package defpackage;

/* renamed from: abgb */
public final class abgb extends aaml {
    public String a = "";

    public abgb(aamd aamd, afpt afpt) {
        super("playlist/get_suggested_playlist_videos", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        assc assc = (assc) asrz.d.createBuilder();
        String str = this.a;
        assc.copyOnWrite();
        asrz asrz = (asrz) assc.instance;
        if (str != null) {
            asrz.a |= 2;
            asrz.c = str;
            return assc;
        }
        throw new NullPointerException();
    }
}
