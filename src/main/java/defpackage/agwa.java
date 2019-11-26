package defpackage;

import android.content.SharedPreferences;

/* renamed from: agwa */
public final class agwa {
    private final xta a;
    private final SharedPreferences b;
    private final zzf c;
    private final afpu d;
    private final bcaa e;

    public agwa(xta xta, SharedPreferences sharedPreferences, zzf zzf, afpu afpu, bcaa bcaa) {
        this.a = xta;
        this.b = sharedPreferences;
        this.c = zzf;
        this.d = afpu;
        this.e = bcaa;
    }

    public final long a() {
        afzi j = ((agwc) this.e.get()).b().j();
        if (j != null) {
            return Math.max(0, j.b().d());
        }
        return 0;
    }

    public final long b() {
        afzi j = ((agwc) this.e.get()).b().j();
        if (j == null) {
            return 0;
        }
        return Math.max(0, xta.a(j.c()) - this.c.c().e);
    }

    public final long c() {
        afzi j = ((agwc) this.e.get()).b().j();
        return j != null ? xve.a(this.c, j.c()) : 0;
    }

    public final long d() {
        String str = "main_app_auto_offline_storage_limit_megabytes_%s";
        if (this.d.c() != afpt.g) {
            str = xuq.a(str, this.d.c().a());
        }
        return this.b.contains(str) ? ((long) this.b.getInt(str, 0)) * 1048576 : 0;
    }
}
