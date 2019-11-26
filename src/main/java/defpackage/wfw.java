package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint;
import java.util.Map;

/* renamed from: wfw */
public final class wfw implements aaap {
    private final aaun a;

    public wfw(aaun aaun) {
        this.a = (aaun) amqw.a((Object) aaun);
    }

    public final void a(apxu apxu, Map map) {
        wfi wfi = (wfi) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wfi.class);
        if (TextUtils.isEmpty(wfi.a())) {
            wfi.b(null);
            return;
        }
        Object obj;
        aaun aaun = this.a;
        aavf aavf = new aavf(aaun.c, aaun.d.c());
        anxr access$000 = anxl.checkIsLite(UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.updateCommentReplyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aavf.a = aali.b(((UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint) obj).b);
        aavf.a(aabc.a(apxu));
        access$000 = anxl.checkIsLite(axft.b);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(axft.b);
            apxu.a(access$000);
            Object b2 = apxu.h.b(access$000.d);
            if (b2 == null) {
                b2 = access$000.b;
            } else {
                b2 = access$000.a(b2);
            }
            axfr axfr = (axfr) b2;
            if (!axfr.b.isEmpty()) {
                aavf.a(axfr.b);
            }
        }
        aavf.b = aali.b(wfi.a());
        aaun aaun2 = this.a;
        aaun2.e.b(aaun2.a.a(aavf, akbm.class, new wfv(wfi), aauv.a));
    }
}
