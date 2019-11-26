package defpackage;

import android.content.SharedPreferences;

/* renamed from: vnx */
public final class vnx {
    public final vmn a;
    public final xhv b;
    public final bcaa c;
    public final xpt d;
    public final airt e;
    public long f = Math.min(this.g.a(), this.h.getLong("last_ad_time", 0));
    private final xsc g;
    private final SharedPreferences h;

    public vnx(vnw vnw) {
        this.a = vnw.a;
        this.g = vnw.b;
        this.b = vnw.c;
        this.h = vnw.d;
        this.c = vnw.e;
        this.d = vnw.f;
        this.e = vnw.g;
    }

    public final int a() {
        if (this.f > 0) {
            double a = (double) (this.g.a() - this.f);
            Double.isNaN(a);
            long ceil = (long) Math.ceil(a / 1000.0d);
            if (ceil <= 2147483647L && ceil > 0) {
                return (int) ceil;
            }
        }
        return 0;
    }

    public final void a(long j) {
        this.f = j;
        this.h.edit().putLong("last_ad_time", j).apply();
    }
}
