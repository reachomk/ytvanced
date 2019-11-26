package defpackage;

/* renamed from: alxe */
final /* synthetic */ class alxe implements amro {
    private final alwu a;

    alxe(alwu alwu) {
        this.a = alwu;
    }

    public final Object get() {
        uii uii;
        uim uim = this.a.a;
        uig[] uigArr = new uig[]{uig.a("cue_duration_state"), uig.b("is_forced_return")};
        String str = "/client_streamz/youtube/video_ads/cue_duration";
        synchronized (uim.b) {
            uii = (uid) uim.a.get(str);
            if (uii != null) {
                uii.a(uigArr);
            } else {
                uii = new uid(str, uim, uigArr);
                uim.a.put(uii.c, uii);
            }
        }
        uii.a();
        return uii;
    }
}
