package defpackage;

/* renamed from: akla */
final class akla implements wxg {
    private final wxg a;
    private final bcaa b;
    private final String c;

    public akla(wxg wxg, bcaa bcaa, String str) {
        this.a = wxg;
        this.b = bcaa;
        this.c = str;
    }

    public final void a(Object obj, Object obj2) {
        ((alwu) this.b.get()).a("DEFAULT_IMAGE_CLIENT", this.c, false);
        this.a.a(obj, obj2);
    }

    public final void a(Object obj, Exception exception) {
        ((alwu) this.b.get()).a("DEFAULT_IMAGE_CLIENT", this.c, true);
        this.a.a(obj, exception);
    }

    static String a(wyi wyi) {
        if (wyi instanceof wyr) {
            return "MEMORY";
        }
        return wyi instanceof wyt ? "DISK" : "UNKNOWN";
    }
}
