package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: bapt */
abstract class bapt implements baqa {
    public final Map a;

    bapt(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }
}
