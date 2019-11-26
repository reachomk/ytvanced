package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: pfl */
final class pfl extends BroadcastReceiver {
    public static final String a = pfl.class.getName();
    public final pgd b;
    public boolean c;
    public boolean d;

    pfl(pgd pgd) {
        pzr.a((Object) pgd);
        this.b = pgd;
    }

    public final void onReceive(Context context, Intent intent) {
        a();
        String action = intent.getAction();
        this.b.a().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean c = c();
            if (this.d != c) {
                this.d = c;
                pfh c2 = this.b.c();
                c2.a("Network connectivity status changed", Boolean.valueOf(c));
                c2.l().a(new pga(c2));
            }
        } else if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(a)) {
                pfh c3 = this.b.c();
                c3.a("Radio powered up");
                c3.f();
                Context i = c3.i();
                if (pfs.a(i) && pfr.a(i)) {
                    Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                    intent2.setComponent(new ComponentName(i, "com.google.android.gms.analytics.AnalyticsService"));
                    i.startService(intent2);
                } else {
                    c3.a(null);
                }
            }
        } else {
            this.b.a().c("NetworkBroadcastReceiver received unknown action", action);
        }
    }

    public final void a() {
        this.b.a();
        this.b.c();
    }

    public final void b() {
        if (this.c) {
            this.b.a().a("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                this.b.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.b.a().d("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        } catch (SecurityException unused) {
        }
        return false;
    }
}
