package defpackage;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: anob */
public final class anob implements anoj, anol {
    public Queue a = new ArrayDeque();
    private final Map b = new HashMap();

    anob() {
    }

    public final synchronized Set a(anoh anoh) {
        Map map = (Map) this.b.get(anoh.a);
        if (map != null) {
            return map.entrySet();
        }
        return Collections.emptySet();
    }
}
