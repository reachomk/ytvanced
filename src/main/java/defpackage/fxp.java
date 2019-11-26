package defpackage;

import com.google.protos.youtube.api.innertube.ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint;
import java.util.Map;

/* renamed from: fxp */
public final class fxp implements aaap {
    private final xci a;

    public fxp(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            xci xci = this.a;
            anxr access$0002 = anxl.checkIsLite(ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint);
            apxu.a(access$0002);
            Object b = apxu.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            xci.d(new vde(((ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint) b).b));
        }
    }
}
