package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: pff */
public final class pff {
    public final Map a;
    public final long b;
    public final long c;
    public final boolean d;
    private final int e;
    private final String f;

    public pff(pgc pgc, Map map, long j, boolean z, long j2, int i) {
        pzr.a((Object) pgc);
        pzr.a((Object) map);
        this.c = j;
        this.d = z;
        this.b = j2;
        this.e = i;
        Collections.emptyList();
        CharSequence charSequence = null;
        TextUtils.isEmpty(charSequence);
        this.f = charSequence;
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            if (pff.a(entry.getKey())) {
                String a = pff.a(pgc, entry.getKey());
                if (a != null) {
                    hashMap.put(a, pff.b(pgc, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!pff.a(entry2.getKey())) {
                String a2 = pff.a(pgc, entry2.getKey());
                if (a2 != null) {
                    hashMap.put(a2, pff.b(pgc, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence) && (charSequence.equals("ma4.0.0") || charSequence.equals("ma4.0.1"))) {
            hashMap.remove("adid");
        }
        this.a = Collections.unmodifiableMap(hashMap);
    }

    private static boolean a(Object obj) {
        return obj != null ? obj.toString().startsWith("&") : false;
    }

    private static String a(pgc pgc, Object obj) {
        if (obj != null) {
            CharSequence obj2 = obj.toString();
            if (obj2.startsWith("&")) {
                obj2 = obj2.substring(1);
            }
            int length = obj2.length();
            if (length > 256) {
                obj2 = obj2.substring(0, 256);
                pgc.b("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
            }
            if (!TextUtils.isEmpty(obj2)) {
                return obj2;
            }
        }
        return null;
    }

    private static String b(pgc pgc, Object obj) {
        String obj2 = obj != null ? obj.toString() : "";
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        obj2 = obj2.substring(0, 8192);
        pgc.b("Hit param value is too long and will be trimmed", Integer.valueOf(length), obj2);
        return obj2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ht=");
        stringBuilder.append(this.c);
        if (this.b != 0) {
            stringBuilder.append(", dbId=");
            stringBuilder.append(this.b);
        }
        if (this.e != 0) {
            stringBuilder.append(", appUID=");
            stringBuilder.append(this.e);
        }
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String str = (String) arrayList.get(i);
            stringBuilder.append(", ");
            stringBuilder.append(str);
            stringBuilder.append("=");
            stringBuilder.append((String) this.a.get(str));
            i = i2;
        }
        return stringBuilder.toString();
    }
}
