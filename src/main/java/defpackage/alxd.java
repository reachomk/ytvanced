package defpackage;

/* renamed from: alxd */
final /* synthetic */ class alxd implements amro {
    private final alwu a;

    alxd(alwu alwu) {
        this.a = alwu;
    }

    public final Object get() {
        uib a = this.a.a.a("/client_streamz/youtube/notifications/topic_sub_count", uig.a("event_type"), uig.b("is_success"));
        a.a();
        return a;
    }
}
