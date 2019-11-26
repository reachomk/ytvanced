package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hpr */
public final class hpr {
    public static final String a = agqr.a(asau.MAIN_DAILY_AUTO_OFFLINE);
    public static final String b = agqr.a(avmy.OFFLINE_CANDIDATE_TYPE_MAIN_DOWNLOAD_RECOMMENDATIONS);
    public final agwc c;
    public final agvs d;
    public final SharedPreferences e;
    public final afpu f;
    private final agwa g;

    public hpr(agwc agwc, agwa agwa, agvs agvs, SharedPreferences sharedPreferences, afpu afpu) {
        this.c = agwc;
        this.g = agwa;
        this.d = agvs;
        this.e = sharedPreferences;
        this.f = afpu;
    }

    public final List a() {
        return new ArrayList(this.c.b().o().b(a));
    }

    public final int b() {
        return (int) xrz.a(this.g.b());
    }

    public final long a(long j) {
        long d = this.g.d();
        long j2 = 0;
        if (d == 0) {
            return this.g.c() - j;
        }
        for (agqy g : a()) {
            j2 += g.g();
        }
        return d - j2;
    }

    public final void a(String str) {
        xak.b();
        agwf o = this.c.b().o();
        if (o != null) {
            o.i(str);
        }
    }
}
