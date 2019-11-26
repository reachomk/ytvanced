package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ahir */
public final class ahir implements acxz {
    public final /* synthetic */ Map a(Object obj) {
        Map hashMap;
        aetv aetv = (aetv) obj;
        aahr aahr = aetv.b;
        if (aahr == null) {
            aahr = aetv.c;
        }
        if (aahr != null) {
            hashMap = new HashMap();
            hashMap.put("fmt", String.valueOf(aahr.b()));
            String str = "1";
            hashMap.put("mod_local", aahr.w() ? str : "0");
            if (aahr.x()) {
                hashMap.put("sc_acc", str);
                return hashMap;
            }
        }
        hashMap = null;
        return hashMap;
    }
}
