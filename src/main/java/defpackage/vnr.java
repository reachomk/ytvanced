package defpackage;

import java.util.Map;

/* renamed from: vnr */
final class vnr implements acxz {
    vnr() {
    }

    public final /* synthetic */ Map a(Object obj) {
        vow vow = (vow) obj;
        zj zjVar = new zj();
        zjVar.put("ad_cr", vow.b.j);
        aaga aaga = vow.a;
        if (aaga == null) {
            obj = "";
        } else {
            obj = aaga.l();
        }
        zjVar.put("ad_cpn", obj);
        return zjVar;
    }
}
