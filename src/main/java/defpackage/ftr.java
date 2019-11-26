package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;

/* renamed from: ftr */
public final class ftr implements aaap, dxi {
    private final Context a;
    private final fiz b;
    private final xci c;
    private final afpu d;
    private final ebk e;
    private final eki f;

    public ftr(Context context, fiz fiz, xci xci, afpu afpu, ebk ebk, eki eki) {
        this.a = context;
        this.b = (fiz) amqw.a((Object) fiz);
        this.c = (xci) amqw.a((Object) xci);
        this.d = (afpu) amqw.a((Object) afpu);
        this.e = ebk;
        this.f = eki;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        fiw a;
        this.c.d(new efd());
        boolean z = (((Integer) xsb.c(map, "com.google.android.apps.youtube.app.endpoint.flags", Integer.valueOf(0))).intValue() & 16) != 0;
        anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        if ("FElibrary".equals(((apge) obj).b) && this.d.a() && ((!this.e.a || this.f.a()) && xss.c(this.a) == 4)) {
            a = gwl.a(apxu);
        } else {
            if (map != null) {
                String str = "com.google.android.libraries.youtube.rendering.presenter.PresentContext";
                if (map.containsKey(str)) {
                    a = gub.a(apxu, false, ((akor) map.get(str)).a("nested_fragment_key", false));
                }
            }
            a = gub.a(apxu);
        }
        a.b.putBoolean("pivot", z);
        a.c = (amqv) xsb.a(map, (Object) "replace_pane_predicate", amqv.class);
        this.b.a(a);
    }
}
