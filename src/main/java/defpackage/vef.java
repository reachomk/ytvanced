package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vef */
public final class vef implements vlp, vlx {
    public final bcaa a;
    public final bcaa b;
    private final Map c = new HashMap();

    public vef(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ void a(vss vss) {
        vry vry = (vry) vss;
        ajmp ajmp = (ajmp) this.c.remove(vry.a);
        if (ajmp == null) {
            ((vls) this.a.get()).d(vry);
            return;
        }
        ajmv e = vry.g.e();
        if (e != null) {
            e.b(ajmp);
        }
        ((vls) this.a.get()).d(vry);
    }

    public final /* synthetic */ void b(vss vss) {
        ((vls) this.a.get()).e((vry) vss);
    }

    public final /* synthetic */ void a(vss vss, vsj vsj) {
        vss = (vry) vss;
        vsj = (vrx) vsj;
        if (this.c.containsKey(vss.a)) {
            ((vlr) this.b.get()).a(vss, vsj, new vly("Redundant schedule"));
            return;
        }
        ajmv e = vss.g.e();
        if (e == null) {
            ((vlr) this.b.get()).a(vss, vsj, new vly("No cueRangeRegistrar available"));
            return;
        }
        ajmp vee = new vee(this, vss, vsj);
        this.c.put(vss.a, vee);
        e.a(vee);
        ((vlr) this.b.get()).a();
    }
}
