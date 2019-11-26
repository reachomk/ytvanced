package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: admc */
public final class admc implements admf {
    public static final String a;
    private final xgq b;
    private final adlz c;

    public admc(xgq xgq, adlz adlz) {
        this.b = xgq;
        this.c = adlz;
    }

    public final Set a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptySet();
        }
        HashMap hashMap = new HashMap();
        for (adio adio : collection) {
            hashMap.put(adio.e, adio);
        }
        Set keySet = hashMap.keySet();
        xak.b();
        xhg b = xhc.b(String.valueOf(this.c.a()).concat("get_screen_availability"));
        try {
            b.c = xhb.a(Collections.singletonMap("lounge_token", TextUtils.join(",", keySet)), "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
        }
        xhc a = b.a();
        admb admb = new admb(a.b());
        aebj.a(this.b, a, admb);
        Map map = admb.a;
        HashSet hashSet = new HashSet();
        for (Entry entry : map.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                hashSet.add((adio) hashMap.get(entry.getKey()));
            }
        }
        return hashSet;
    }

    static {
        String valueOf = String.valueOf(admc.class.getCanonicalName());
        String str = "MDX.";
        a = xtl.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
