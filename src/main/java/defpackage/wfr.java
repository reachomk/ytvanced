package defpackage;

import com.google.protos.youtube.api.innertube.UpdateCommentEndpointOuterClass$UpdateCommentEndpoint;
import java.util.Map;

/* renamed from: wfr */
public final class wfr implements aaap {
    private final aaun a;

    public wfr(aaun aaun) {
        this.a = (aaun) amqw.a((Object) aaun);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        wfh wfh = (wfh) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wfh.class);
        aaun aaun = this.a;
        aave aave = new aave(aaun.c, aaun.d.c());
        anxr access$000 = anxl.checkIsLite(UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.updateCommentEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aave.a = aali.b(((UpdateCommentEndpointOuterClass$UpdateCommentEndpoint) obj).b);
        aave.a(aabc.a(apxu));
        aave.b = aali.b(wfh.a());
        aaun aaun2 = this.a;
        aaun2.e.b(aaun2.a.a(aave, akbo.class, new wfu(wfh), aaus.a));
    }
}
