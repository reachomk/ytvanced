package defpackage;

import android.os.Build.VERSION;

/* renamed from: pft */
final class pft implements Runnable {
    private final /* synthetic */ pfu a;

    pft(pfu pfu) {
        this.a = pfu;
    }

    public final void run() {
        pfu pfu = this.a;
        Integer num = pfu.a;
        if (num != null) {
            if (((pfw) pfu.d.b).a(num.intValue())) {
                this.a.b.a("Local AnalyticsService processed last dispatch request");
            }
            return;
        }
        if (VERSION.SDK_INT >= 24) {
            this.a.b.a("AnalyticsJobService processed last dispatch request");
            pfu = this.a;
            ((pfw) pfu.d.b).a(pfu.c);
        }
    }
}
