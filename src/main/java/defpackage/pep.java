package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: pep */
final class pep implements Runnable {
    private final /* synthetic */ pgq a;

    pep(pgq pgq) {
        this.a = pgq;
    }

    public final void run() {
        boolean booleanValue;
        pgq pgq = this.a;
        pgq.f();
        pgv.a();
        Object obj = pgq.g.a;
        if (!pfs.a(obj)) {
            pgq.b("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!pfr.a(obj)) {
            pgq.c("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        pzr.a(obj);
        if (pei.a != null) {
            booleanValue = pei.a.booleanValue();
        } else {
            booleanValue = pfy.a(obj, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
            pei.a = Boolean.valueOf(booleanValue);
        }
        if (!booleanValue) {
            pgq.b("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        pfq p = pgq.p();
        pgv.a();
        p.f();
        if (p.b == 0) {
            String str = "first_run";
            long j = p.a.getLong(str, 0);
            if (j != 0) {
                p.b = j;
            } else {
                long a = p.h().a();
                Editor edit = p.a.edit();
                edit.putLong(str, a);
                if (!edit.commit()) {
                    p.b("Failed to commit first run time");
                }
                p.b = a;
            }
        }
        if (!pgq.d("android.permission.ACCESS_NETWORK_STATE")) {
            pgq.c("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            pgq.q();
        }
        if (!pgq.d("android.permission.INTERNET")) {
            pgq.c("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            pgq.q();
        }
        if (pfr.a(pgq.i())) {
            pgq.a("AnalyticsService registered in the app manifest and enabled");
        } else {
            pgq.b("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!(pgq.e || pgq.b.d())) {
            pgq.c();
        }
        pgq.d();
    }
}
