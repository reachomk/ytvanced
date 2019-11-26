package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: aeom */
public final class aeom extends Exception implements aevf {
    private final String a;
    private final Map b;

    public aeom(String str) {
        this(str, Collections.emptyMap());
    }

    private aeom(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final String a(long j) {
        StringBuilder stringBuilder = new StringBuilder("error.");
        stringBuilder.append(this.a);
        for (Entry entry : this.b.entrySet()) {
            stringBuilder.append(';');
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append('.');
            stringBuilder.append((String) entry.getValue());
        }
        return stringBuilder.toString();
    }

    /* synthetic */ aeom(String str, Map map, byte b) {
        this(str, map);
    }
}
