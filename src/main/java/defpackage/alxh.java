package defpackage;

/* renamed from: alxh */
final /* synthetic */ class alxh implements amro {
    private final alwu a;

    alxh(alwu alwu) {
        this.a = alwu;
    }

    public final Object get() {
        uib a = this.a.a.a("/client_streamz/youtube/video_ads/cue_state", uig.b("is_cue_start_time_changed"), uig.b("has_predict_start_cuepoint"), uig.b("has_start_cuepoint"), uig.b("has_continue_cuepoint"), uig.b("has_stop_cuepoint"));
        a.a();
        return a;
    }
}
