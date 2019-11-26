package defpackage;

import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: has */
public final class has {
    public final alcb a;
    public final fnh b;
    public final Set c = new HashSet();
    public aybc d;
    private final fcb e;
    private final fcs f;
    private final ekb g;
    private final acvx h;
    private auuc i;

    public has(fcb fcb, fcs fcs, acvx acvx, alcb alcb, fnh fnh, ekb ekb) {
        this.e = fcb;
        this.f = fcs;
        this.h = acvx;
        this.a = alcb;
        this.b = fnh;
        this.g = ekb;
    }

    public final void a(akcb akcb) {
        atoy atoy = akcb.i;
        if (atoy != null && atoy.a == 152873793) {
            ayhz ayhz = (ayhz) atoy.b;
            this.c.add(this.b.a(ayhz));
            this.a.a(ayhz, new hav(this));
        }
        atpc atpc = akcb.h;
        aybc aybc = null;
        aybe aybe = (atpc == null || atpc.a != 84469052) ? null : (aybe) atpc.b;
        if (aybe != null) {
            if ((aybe.a & 16) != 0) {
                aybc = aybe.e;
                if (aybc == null) {
                    aybc = aybc.f;
                }
            }
            this.d = aybc;
            this.e.a(this.d);
            return;
        }
        atoy atoy2 = akcb.i;
        if (atoy2 != null && atoy2.a == 96907215) {
            this.i = (auuc) atoy2.b;
            this.f.a(this.i, this.h);
            return;
        }
        ekb ekb = this.g;
        if (ekb.c.c() && ekb.e.k() != null && ekb.e.k().w()) {
            long j;
            apxn a = ekb.a.a();
            if (a == null || (a.a & 16) == 0) {
                j = 0;
            } else {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                j = aulu.aU;
            }
            boolean a2 = fpc.a(ekb.f, "offline_stream_snackbar_last_shown", TimeUnit.SECONDS.toMillis(j), ekb.g.a());
            apxn a3 = ekb.a.a();
            int i = 0;
            if (!(a3 == null || (a3.a & 16) == 0)) {
                aulu aulu2 = a3.e;
                if (aulu2 == null) {
                    aulu2 = aulu.bw;
                }
                i = aulu2.aV;
            }
            long j2 = ekb.f.getLong("offline_stream_snackbar_impressions", 0);
            j = (long) i;
            if (a2 && j2 < j) {
                if (ekb.h == null) {
                    ekb.h = ekb.d.b().b(ekb.b.getString(R.string.offline_stream_snackbar_text)).a(new eke(ekb)).c(true).d();
                }
                ekb.d.b(ekb.h);
            }
        }
    }

    public final void a() {
        this.f.a(this.i);
        this.e.b(this.d);
        ekb ekb = this.g;
        albl albl = ekb.h;
        if (albl != null) {
            ekb.d.a(albl);
        }
    }
}
