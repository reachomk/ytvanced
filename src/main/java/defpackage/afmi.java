package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: afmi */
public final class afmi {
    public afnh a = afml.a;
    private final Map b;

    public afmi(String str, String str2, afmk afmk, afmn afmn) {
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("cplatform", afmk.d);
        hashMap.put("c", afmn.d);
        hashMap.put("cver", xvd.a(str2));
        hashMap.put("cos", "Android");
        hashMap.put("cosver", VERSION.RELEASE);
        if ("REL".equals(VERSION.CODENAME)) {
            i = VERSION.SDK_INT;
        } else {
            i = VERSION.SDK_INT + 1;
        }
        hashMap.put("csdk", Integer.toString(i));
        hashMap.put("cbr", xvd.a(str));
        hashMap.put("cbrver", str2);
        hashMap.put("cbrand", Build.MANUFACTURER);
        hashMap.put("cmodel", Build.MODEL);
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public final Map a() {
        Map map = this.b;
        Map b = b();
        if (b.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap(map.size() + b.size());
        hashMap.putAll(map);
        hashMap.putAll(b);
        return hashMap;
    }

    public final xvo a(xvo xvo) {
        for (Entry entry : a().entrySet()) {
            xvo.b((String) entry.getKey(), (String) entry.getValue());
        }
        return xvo;
    }

    public final xvo b(xvo xvo) {
        for (Entry entry : this.b.entrySet()) {
            xvo.b((String) entry.getKey(), (String) entry.getValue());
        }
        return xvo;
    }

    public final Map b() {
        afne t = this.a.t();
        if (t == null) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("cplayer", t.name());
    }
}
