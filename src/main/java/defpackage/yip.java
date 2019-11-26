package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: yip */
public final class yip implements wxx {
    public final wya a;
    public final Map b = new HashMap();

    public yip(wxw wxw, wya wya) {
        this.a = wya;
        wxw.a("entity_polling_manager__fetch_entity", this);
    }

    public final int a(Bundle bundle) {
        Map a = a();
        for (yjd yjd : a.keySet()) {
            Set set = (Set) a.get(yjd);
            if (!(set == null || set.isEmpty())) {
                yjd.a(set, null);
            }
        }
        return 2;
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        for (zz zzVar : this.b.values()) {
            yjd yjd = (yjd) zzVar.a;
            amuh amuh = (amuh) zzVar.b;
            if (amuh != null) {
                Set set = (Set) hashMap.get(yjd);
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(yjd, set);
                }
                set.addAll(amuh);
            }
        }
        return hashMap;
    }
}
