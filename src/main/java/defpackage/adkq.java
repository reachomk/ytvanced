package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: adkq */
public final class adkq implements adaa {
    public static final String a = xtl.b("MDX.LocalNotifications");
    public static final int b = ((int) TimeUnit.MINUTES.toSeconds(60));
    private static final int e = ((int) TimeUnit.DAYS.toSeconds(7));
    private static final long f = TimeUnit.HOURS.toMillis(3);
    public final adkv c;
    public final adku d;
    private final qk g;
    private final bcaa h;
    private final boolean i;
    private final bcaa j;
    private final xsc k;
    private adkw l;

    public adkq(qk qkVar, adkv adkv, bcaa bcaa, boolean z, adku adku, bcaa bcaa2, xsc xsc) {
        this.g = qkVar;
        this.c = adkv;
        this.h = bcaa;
        this.i = z;
        this.d = adku;
        this.j = bcaa2;
        this.k = xsc;
    }

    public final String b() {
        return "local-notifications";
    }

    public final adac c() {
        adab e = adac.e();
        boolean z = false;
        if (this.c.a() && this.g.a() && !f().c() && !adld.a(this.k)) {
            z = true;
        }
        e = e.a(z).a(10);
        int i = 15;
        e = e.b(!this.i ? (int) f().d() : 15);
        if (!this.i) {
            i = (int) f().d();
        }
        return e.c(i).a();
    }

    public final void a() {
        if (!this.c.a()) {
            e();
        }
    }

    public final void a(amul amul) {
        Object obj = (f().b() == 0 || this.k.a() - f().b() <= f) ? null : 1;
        long a = this.k.a();
        adkw f = f();
        SharedPreferences sharedPreferences = f.a;
        long a2 = f.b.a();
        String str = "com.google.android.libraries.youtube.mdx.notification.LAST_SCAN_PERIOD_CHANGE_MS";
        if (a - sharedPreferences.getLong(str, a2) > TimeUnit.DAYS.toMillis(7)) {
            a = f().d();
            a += a;
            if (a < ((long) e)) {
                adkw f2 = f();
                f2.a.edit().putLong(str, f2.b.a()).putLong("com.google.android.libraries.youtube.mdx.notification.SCAN_PERIOD_MS", a).apply();
            }
        }
        if (amul.isEmpty() || !this.c.a() || f().c() || obj != null) {
            amul.isEmpty();
            this.c.a();
            f().c();
            e();
            return;
        }
        String.format("Discovered %d devices.", new Object[]{Integer.valueOf(amul.size())});
        bbs bbs = amul.size() == 1 ? (bbs) amul.get(0) : null;
        if (bbs == null) {
            e();
        } else if (!this.g.a()) {
            xtl.b(a, "Notifications not enabled.");
        } else if (!f().a.getBoolean("com.google.android.libraries.youtube.mdx.notification.LOCAL_NOTIFICATIONS_VISIBILITY", false) || this.i) {
            adkv adkv = this.c;
            adkv.b.execute(new adky(adkv, bbs, new adkp(this, bbs)));
        }
    }

    public final void d() {
        e();
    }

    public final void e() {
        if (!((Boolean) this.j.get()).booleanValue()) {
            this.d.a();
            f().a(false);
        }
    }

    public final adkw f() {
        if (this.l == null) {
            this.l = (adkw) this.h.get();
        }
        return this.l;
    }
}
