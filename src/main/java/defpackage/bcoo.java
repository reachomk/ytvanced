package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcoo */
public final class bcoo extends bclb {
    public final int a;
    private final List b;
    private final String c;
    private final boolean d;
    private final String e;
    private final String f;
    private final AtomicLong g;
    private final bcor h;

    public bcoo(List list, int i, String str, List list2, boolean z, String str2, String str3, long j) {
        this.b = Collections.unmodifiableList(list);
        this.a = i;
        this.c = str;
        this.h = new bcor(Collections.unmodifiableList(list2));
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = new AtomicLong(j);
    }

    public final String a() {
        List list = this.b;
        return (String) list.get(list.size() - 1);
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final List d() {
        return this.h.a;
    }

    public final Map e() {
        bcor bcor = this.h;
        Map map = bcor.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Entry entry : bcor.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        bcor.b = Collections.unmodifiableMap(treeMap);
        return bcor.b;
    }

    public final String f() {
        return this.e;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), a(), this.b.toString(), Integer.valueOf(this.a), this.c, d().toString(), Boolean.valueOf(this.d), this.e, this.f, Long.valueOf(this.g.get())});
    }

    public final void a(long j) {
        this.g.set(j);
    }
}
