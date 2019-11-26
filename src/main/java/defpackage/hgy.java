package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: hgy */
public final class hgy implements ekf {
    private static final long a = TimeUnit.DAYS.toMillis(1);
    private final xsc b;
    private final zyw c;
    private final bcaa d;
    private final afpu e;
    private final SharedPreferences f;
    private final afym g;
    private final bcaa h;

    public hgy(xsc xsc, zyw zyw, bcaa bcaa, SharedPreferences sharedPreferences, afpu afpu, afym afym, bcaa bcaa2) {
        this.b = xsc;
        this.c = zyw;
        this.d = bcaa;
        this.f = sharedPreferences;
        this.e = afpu;
        this.g = afym;
        this.h = bcaa2;
    }

    public final boolean e() {
        return false;
    }

    public final boolean a() {
        if (b()) {
            if (!this.g.d(((agwc) this.d.get()).c())) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        return c();
    }

    public final boolean c() {
        return this.e.a() && d() && f();
    }

    public final boolean d() {
        if (foh.m(this.c) && this.e.a()) {
            boolean g = ((ekh) this.h.get()).g();
            String a = xuq.a("offline_access_enabled%s", this.e.c().a());
            String a2 = xuq.a("offline_access_updated_at%s", this.e.c().a());
            boolean z = this.f.getBoolean(a, false);
            long j = this.f.getLong(a2, 0);
            long a3 = this.b.a() - a;
            if (g) {
                if (!z || j < a3) {
                    this.f.edit().putBoolean(a, true).putLong(a2, this.b.a()).apply();
                }
            } else if (z) {
                if (j < a3) {
                    this.f.edit().remove(a).remove(a2).apply();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f.getBoolean("offline_recs_enabled", true);
    }
}
