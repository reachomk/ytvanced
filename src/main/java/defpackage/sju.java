package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: sju */
public final class sju {
    public static List a(List list) {
        if (!list.contains("GDI_DEFAULT_SCOPE_FLAG")) {
            return list;
        }
        if (list.size() <= 1) {
            return Collections.emptyList();
        }
        throw new IllegalArgumentException("Default scope flag must be the only requested scope");
    }
}
