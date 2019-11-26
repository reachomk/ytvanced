package defpackage;

/* renamed from: alxb */
final /* synthetic */ class alxb implements amro {
    private final alwu a;

    alxb(alwu alwu) {
        this.a = alwu;
    }

    public final Object get() {
        uib a = this.a.a.a("/client_streamz/youtube/notifications/push_count", uig.a("event_type"), uig.b("is_error"));
        a.a();
        return a;
    }
}
