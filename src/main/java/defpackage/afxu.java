package defpackage;

/* renamed from: afxu */
final class afxu implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ xsc b;
    private final /* synthetic */ afxs c;

    afxu(afxs afxs, boolean z, xsc xsc) {
        this.c = afxs;
        this.a = z;
        this.b = xsc;
    }

    public final void run() {
        afxs afxs = this.c;
        boolean z = this.a;
        if (afxs.a(this.b)) {
            String str = "pending_notification_registration";
            if (z) {
                afxs.b();
                afxs.b.edit().putBoolean(str, false).apply();
                return;
            }
            afxs.b.edit().putBoolean(str, true).apply();
        }
    }
}
