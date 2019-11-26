package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: dik */
public class dik {
    public final LinkedList a;
    public String b;
    public final LinkedHashMap c = new LinkedHashMap();

    public dik(String str, din din) {
        this.b = str;
        this.a = new LinkedList();
        din.a();
    }

    public final void a(String str, String str2) {
        this.c.put(str, str2);
    }

    public final Map a() {
        return Collections.unmodifiableMap(this.c);
    }

    public static dil a(long j) {
        return new dil(j, null, null);
    }

    public final boolean a(dil dil, long j, String... strArr) {
        if (dil == null) {
            String str = this.b;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
            stringBuilder.append("In action: ");
            stringBuilder.append(str);
            stringBuilder.append(", label item shouldn't be null");
            Log.e("Ticker", stringBuilder.toString());
            return false;
        }
        this.a.add(new dil(j, strArr[0], dil));
        return true;
    }

    public static Map a(String str, Map map, StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        Map linkedHashMap;
        if (stringBuilder.length() > 0) {
            linkedHashMap = new LinkedHashMap();
            if (str != null) {
                linkedHashMap.put("action", str);
            }
            if (!(map == null || map.isEmpty())) {
                linkedHashMap.putAll(map);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            linkedHashMap.put("it", stringBuilder.toString());
            if (stringBuilder2.length() > 0) {
                stringBuilder2.deleteCharAt(stringBuilder2.length() - 1);
                linkedHashMap.put("irt", stringBuilder2.toString());
                return linkedHashMap;
            }
        }
        linkedHashMap = null;
        return linkedHashMap;
    }
}
