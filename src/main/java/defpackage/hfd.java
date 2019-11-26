package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import java.util.Map;

/* renamed from: hfd */
public final class hfd implements aaas {
    private final aaas a;
    private final aaan b;
    private final bapu c;
    private final adqf d;

    public hfd(aaas aaas, aaan aaan, adqf adqf, bapu bapu) {
        this.a = aaas;
        this.b = aaan;
        this.c = bapu;
        this.d = adqf;
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public final void a(apxu apxu, Map map) {
        if (apxu != null) {
            Object obj;
            adqe c = this.d.c();
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            azje azje = (azje) obj;
            anxr access$0002 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$0002);
            if (apxu.h.a(access$0002.d) && c != null && c.t().equals(azje.c) && c.s().equals(azje.b)) {
                ((hel) this.c.get()).a(true);
                return;
            }
            try {
                this.b.a(apxu).a(apxu, map);
            } catch (aabf unused) {
                this.a.a(apxu, map);
            }
        }
    }
}
