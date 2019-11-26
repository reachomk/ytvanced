package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: aaav */
public final /* synthetic */ class aaav {
    public static void a(aaas aaas, apxu[] apxuArr, Map map) {
        if (r0 != 0) {
            for (apxu a : apxuArr) {
                aaas.a(a, map);
            }
        }
    }

    public static void a(aaas aaas, List list, Map map) {
        if (!list.isEmpty()) {
            for (apxu a : list) {
                aaas.a(a, map);
            }
        }
    }

    @Deprecated
    public static void a(aaas aaas, apxu[] apxuArr, Object obj) {
        Map a;
        if (obj != null) {
            a = amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        } else {
            a = amwm.a;
        }
        aaas.a(apxuArr, a);
    }

    @Deprecated
    public static void a(aaas aaas, List list, Object obj) {
        Map a;
        if (obj != null) {
            a = amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        } else {
            a = amwm.a;
        }
        aaas.a(list, a);
    }
}
