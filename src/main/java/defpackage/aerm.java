package defpackage;

/* renamed from: aerm */
public final class aerm {
    public final String a;
    public final String b;
    public final String c;

    aerm(String str, afne afne, aajs aajs) {
        this.a = str;
        int ordinal = afne.ordinal();
        str = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "" : "exo2" : "exo" : "fw";
        this.b = str;
        str = "vod";
        if (aajs == null) {
            str = "invalid";
        } else if (aajs.a()) {
            str = aajs.d() ? "manifestless" : !aajs.x() ? "hls-live" : "dash";
        } else if (aajs.g()) {
            if (aajs.d()) {
                str = "mfless-post-live";
            } else if (aajs.x()) {
                str = "dash-post-live";
            } else if (aajs.c()) {
                str = "hls-post-live";
            }
        } else if (aajs.x()) {
            str = "dash-otf";
        }
        this.c = str;
    }
}
