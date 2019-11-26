package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: vnm */
final class vnm implements acxz {
    vnm() {
    }

    public final /* synthetic */ Map a(Object obj) {
        vpa vpa = (vpa) obj;
        zj zjVar = new zj(1);
        int ordinal = vpa.a.ordinal();
        String str = "yt_abt";
        if (ordinal == 1) {
            zjVar = new zj(5);
            zjVar.put("mod_ad_pr", "1");
            if (!TextUtils.isEmpty(vpa.f.m())) {
                zjVar.put("ad_at", vpa.f.m());
            }
            zjVar.put("ad_cpn", vpa.f.l());
            zjVar.put("ad_docid", xvd.f(vpa.f.d()));
            zjVar.put(str, Integer.toString(vpa.b.d));
            for (atwo atwo : vpa.f.s()) {
                zjVar.put(atwo.d, atwo.b == 2 ? (String) atwo.c : "");
            }
            return zjVar;
        } else if (ordinal != 3) {
            return null;
        } else {
            zjVar.put(str, Integer.toString(vpa.b.d));
            return zjVar;
        }
    }
}
