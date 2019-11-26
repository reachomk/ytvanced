package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: azyn */
public final class azyn {
    private final Map a = new HashMap();

    public final void a(String str, String str2) {
        boolean z = false;
        if (!(str == null || str.isEmpty())) {
            z = true;
        }
        amqw.a(z);
        amqw.a((Object) str2);
        str = str.toLowerCase();
        this.a.put(str, new ArrayList());
        ((List) this.a.get(str)).add(str2);
    }

    public final void b(String str, String str2) {
        boolean z = false;
        if (!(str == null || str.isEmpty())) {
            z = true;
        }
        amqw.a(z);
        amqw.a((Object) str2);
        str = str.toLowerCase();
        if (!this.a.containsKey(str)) {
            this.a.put(str, new ArrayList());
        }
        ((List) this.a.get(str)).add(str2);
    }

    public final Set a() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final List a(String str) {
        List list = (List) this.a.get(str.toLowerCase());
        return list == null ? amul.g() : list;
    }

    public final String b(String str) {
        if (!this.a.containsKey(str.toLowerCase())) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (String str2 : (List) this.a.get(str.toLowerCase())) {
            if (str2 != null) {
                if (obj == null) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(str2);
                obj = null;
            }
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.a.entrySet());
        Collections.sort(arrayList, azym.a);
        Object stringBuilder = new StringBuilder("{");
        amqm b = amqh.a(", ").b("=");
        Iterator it = arrayList.iterator();
        try {
            amqw.a(stringBuilder);
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                stringBuilder.append(amqh.a(entry.getKey()));
                stringBuilder.append(b.b);
                stringBuilder.append(amqh.a(entry.getValue()));
                while (it.hasNext()) {
                    stringBuilder.append(b.a.a);
                    entry = (Entry) it.next();
                    stringBuilder.append(amqh.a(entry.getKey()));
                    stringBuilder.append(b.b);
                    stringBuilder.append(amqh.a(entry.getValue()));
                }
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
