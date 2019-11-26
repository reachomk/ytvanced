package defpackage;

import com.google.protos.youtube.api.innertube.SignalServiceEndpointOuterClass$SignalServiceEndpoint;
import java.util.Map;

/* renamed from: dzx */
public final class dzx implements aaap {
    private final aaas a;

    public dzx(aaas aaas) {
        this.a = aaas;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            aaas aaas = this.a;
            anxr access$0002 = anxl.checkIsLite(SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint);
            apxu.a(access$0002);
            Object b = apxu.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aaas.a(((SignalServiceEndpointOuterClass$SignalServiceEndpoint) b).a, map);
        }
    }
}
