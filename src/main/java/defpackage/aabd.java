package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: aabd */
public final class aabd {
    public static void a(aaas aaas, apxu[] apxuArr, Object obj) {
        Map a = obj != null ? amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : null;
        if (aaas != null && apxuArr != null) {
            for (apxu apxu : apxuArr) {
                if (apxu != null) {
                    aaas.a(apxu, a);
                }
            }
        }
    }

    public static void a(aaas aaas, List list, Object obj) {
        aabd.a(aaas, list, obj != null ? amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : null);
    }

    public static void a(aaas aaas, List list, Map map) {
        if (aaas != null && list != null) {
            for (apxu apxu : list) {
                if (apxu != null) {
                    aaas.a(apxu, map);
                }
            }
        }
    }
}
