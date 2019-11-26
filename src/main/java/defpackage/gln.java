package defpackage;

import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import java.util.Map;

/* renamed from: gln */
public final class gln implements aaap {
    public final void a(apxu apxu, Map map) {
        gnp gnp = (gnp) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", gnp.class);
        anxr access$000 = anxl.checkIsLite(FlagVideoEndpointOuterClass$FlagVideoEndpoint.flagVideoEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        gnp.b(((FlagVideoEndpointOuterClass$FlagVideoEndpoint) b).b);
    }
}
