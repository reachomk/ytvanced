package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: bctn */
public final class bctn implements bctk {
    public final bcpt a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return bcpt.a;
        }
        return null;
    }

    public final Set a() {
        return Collections.singleton("UTC");
    }
}
