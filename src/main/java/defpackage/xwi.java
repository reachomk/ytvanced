package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: xwi */
public final class xwi {
    private final Map a;

    public final xwo a(String str) {
        return (xwo) this.a.get(str);
    }

    /* synthetic */ xwi(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }
}
