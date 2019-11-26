package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: batc */
public final class batc {
    public static final batc a = new batc().a(new basl(), true).a(baso.a, false);
    private static final amqh d = amqh.a(',');
    public final Map b;
    public final byte[] c;

    private final batc a(basz basz, boolean z) {
        return new batc(basz, z, this);
    }

    private batc(basz basz, boolean z, batc batc) {
        String a = basz.a();
        amqw.a(a.contains(",") ^ 1, (Object) "Comma is currently not allowed in message encoding");
        int size = batc.b.size();
        if (!batc.b.containsKey(basz.a())) {
            size++;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size);
        for (batb batb : batc.b.values()) {
            String a2 = batb.a.a();
            if (!a2.equals(a)) {
                linkedHashMap.put(a2, new batb(batb.a, batb.b));
            }
        }
        linkedHashMap.put(a, new batb(basz, z));
        this.b = Collections.unmodifiableMap(linkedHashMap);
        amqh amqh = d;
        HashSet hashSet = new HashSet(this.b.size());
        for (Entry entry : this.b.entrySet()) {
            if (((batb) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = amqh.a(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    private batc() {
        this.b = new LinkedHashMap(0);
        this.c = new byte[0];
    }
}
