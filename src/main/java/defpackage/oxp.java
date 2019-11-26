package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: oxp */
public final class oxp implements oxo {
    public static final oxp a = new oxp(Collections.emptyMap());
    private int b;
    private final Map c;

    public oxp() {
        this(Collections.emptyMap());
    }

    public oxp(Map map) {
        this.c = Collections.unmodifiableMap(map);
    }

    public final oxp a(oxq oxq) {
        Object value;
        HashMap hashMap = new HashMap(this.c);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(oxq.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(oxq.a);
        for (Entry entry : hashMap2.entrySet()) {
            value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        for (String str : unmodifiableMap.keySet()) {
            value = unmodifiableMap.get(str);
            if (value instanceof Long) {
                value = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                value = ((String) value).getBytes(Charset.forName("UTF-8"));
            } else if (value instanceof byte[]) {
                value = (byte[]) value;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, value);
        }
        return !oxp.a(this.c, hashMap) ? new oxp(hashMap) : this;
    }

    public final Set a() {
        return this.c.entrySet();
    }

    public final String a(String str) {
        return this.c.containsKey(str) ? new String((byte[]) this.c.get(str), Charset.forName("UTF-8")) : null;
    }

    public final long b(String str) {
        return this.c.containsKey(str) ? ByteBuffer.wrap((byte[]) this.c.get(str)).getLong() : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj == null || getClass() != obj.getClass()) ? false : oxp.a(this.c, ((oxp) obj).c);
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (Entry entry : this.c.entrySet()) {
            i2 += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
        }
        this.b = i2;
        return i2;
    }

    private static boolean a(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
