package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: bqd */
public final class bqd {
    public final int a;
    public final byte[] b;
    public final Map c;
    public final List d;
    public final boolean e;
    public final long f;

    @Deprecated
    public bqd(int i, byte[] bArr, Map map, boolean z, long j) {
        List list;
        if (map == null) {
            list = null;
        } else if (map.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                list.add(new bqb((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        List list2 = list;
        this(i, bArr, map, list2, z, j);
    }

    public bqd(int i, byte[] bArr, boolean z, long j, List list) {
        Map map;
        if (list == null) {
            map = null;
        } else if (list.isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (bqb bqb : list) {
                map.put(bqb.a, bqb.b);
            }
        }
        Map map2 = map;
        this(i, bArr, map2, list, z, j);
    }

    @Deprecated
    public bqd(int i, byte[] bArr, Map map) {
        this(i, bArr, map, false, 0);
    }

    @Deprecated
    public bqd(byte[] bArr, Map map) {
        this(200, bArr, map, false, 0);
    }

    private bqd(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        if (list == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(list);
        }
        this.e = z;
        this.f = j;
    }
}
