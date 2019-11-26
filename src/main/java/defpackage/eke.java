package defpackage;

/* renamed from: eke */
public final class eke implements albc {
    private final /* synthetic */ ekb a;

    public eke(ekb ekb) {
        this.a = ekb;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
    }

    public final /* synthetic */ void a(Object obj) {
        String str = "offline_stream_snackbar_impressions";
        String str2 = "offline_stream_snackbar_last_shown";
        this.a.f.edit().putLong(str, this.a.f.getLong(str, 0) + 1).putLong(str2, this.a.g.a()).apply();
    }
}
