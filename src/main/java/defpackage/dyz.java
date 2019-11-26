package defpackage;

import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import java.util.Map;

/* renamed from: dyz */
public final class dyz implements aaap, dxi {
    private final fiz a;
    private final xci b;

    public dyz(fiz fiz, xci xci) {
        this.a = fiz;
        this.b = xci;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        fiw a;
        anxr access$000 = anxl.checkIsLite(OfflineEndpointOuterClass.offlineEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        String str = ((avnw) obj).b;
        boolean z = false;
        if (map != null) {
            String str2 = "com.google.android.libraries.youtube.rendering.presenter.PresentContext";
            if (map.containsKey(str2) && ((akor) map.get(str2)).a("nested_fragment_key", false)) {
                z = true;
            }
        }
        String str3 = (String) xsb.a(map, (Object) "offline_playlist_top_level_tab_id", String.class);
        if ("PPSV".equals(str)) {
            a = hrt.a(apxu);
        } else {
            a = hki.a(str, z, str3);
        }
        this.b.d(new efd());
        this.a.a(a);
    }
}
