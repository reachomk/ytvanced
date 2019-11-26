package defpackage;

import com.google.protos.youtube.api.innertube.DismissalEndpointOuterClass$DismissalEndpoint;
import java.util.Arrays;
import java.util.Map;

/* renamed from: dyc */
public final class dyc implements aaap, afsw {
    private final aawh a;
    private final xoi b;
    private final aaas c;

    public dyc(aawh aawh, xoi xoi, aaas aaas) {
        this.a = (aawh) amqw.a((Object) aawh);
        this.b = (xoi) amqw.a((Object) xoi);
        this.c = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        aawh aawh = this.a;
        aaml aawi = new aawi(aawh.c, aawh.d.c());
        anxr access$000 = anxl.checkIsLite(DismissalEndpointOuterClass$DismissalEndpoint.dismissalEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        DismissalEndpointOuterClass$DismissalEndpoint dismissalEndpointOuterClass$DismissalEndpoint = (DismissalEndpointOuterClass$DismissalEndpoint) obj;
        aawi.a = Arrays.asList(new String[]{dismissalEndpointOuterClass$DismissalEndpoint.b});
        aawi.a(apxu.b);
        this.a.a.a(aawi, (afsw) this);
        if (dismissalEndpointOuterClass$DismissalEndpoint.c.size() != 0) {
            this.c.a(dismissalEndpointOuterClass$DismissalEndpoint.c, map);
        }
    }

    public final void a(bqn bqn) {
        this.b.c(bqn);
    }

    private static boolean a(aslu aslu) {
        return aslu.c.size() > 0;
    }
}
