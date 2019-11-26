package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.TimeUnit;

/* renamed from: jgz */
public final class jgz implements jxb {
    public final SharedPreferences a;
    public final xsc b;
    private final fmx c;
    private final acwa d;
    private int e;

    public jgz(SharedPreferences sharedPreferences, xsc xsc, fmx fmx, acwa acwa) {
        this.a = sharedPreferences;
        this.b = xsc;
        this.c = fmx;
        this.d = acwa;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.a;
        String str = ebn.PIVOT_BAR_TAP_COUNT;
        this.e = sharedPreferences.getInt(str, 0) + 1;
        this.a.edit().putInt(str, this.e).apply();
    }

    public final void a(fiw fiw) {
        if (fiw != null && fiw.a() != null) {
            apxu a = fiw.a();
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            a.a(access$000);
            Object b = a.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            apge apge = (apge) b;
            if ((apge.a & 1) != 0) {
                if ("FElibrary".equals(apge.b)) {
                    this.a.edit().putBoolean(ebn.PIVOT_BAR_LIBRARY_TAB_VISITED, true).apply();
                }
            }
        }
    }

    public final boolean b() {
        if (this.e >= 3) {
            return this.a.getBoolean(ebn.PIVOT_BAR_LIBRARY_TAB_VISITED, false) ^ 1;
        }
        return false;
    }

    public final boolean c() {
        if (this.e >= 6) {
            long j = this.a.getLong(ebn.PIVOT_BAR_LIBRARY_HINT_TIMESTAMP, 0);
            if (j != 0 && this.b.b() >= j + TimeUnit.HOURS.toMillis(24)) {
                return true;
            }
        }
        return false;
    }

    public final void a(avzx avzx, View view, albc albc) {
        aruh aruh;
        fmx fmx = this.c;
        avzr avzr = avzx.h;
        if (avzr == null) {
            avzr = avzr.c;
        }
        if (avzr.a == 102716411) {
            aruh = (aruh) avzr.b;
        } else {
            aruh = aruh.j;
        }
        fmx.a(aruh, view, avzx, this.d.t(), albc);
    }

    public final void a(View view, akbb akbb) {
        aruh aruh = null;
        if (akbb != null) {
            avdz avdz = akbb.e;
            if (avdz != null) {
                aruh = avdz.a == 102716411 ? (aruh) avdz.b : aruh.j;
            }
        }
        aruh aruh2 = aruh;
        if (view != null && aruh2 != null) {
            this.c.a(aruh2, view, akbb, this.d.t(), new jhc(this));
        }
    }

    public final albc d() {
        return new jhb(this);
    }
}
