package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
import java.util.Map;

/* renamed from: wfm */
public final class wfm implements aaap {
    private final aaun a;

    public wfm(aaun aaun) {
        this.a = (aaun) amqw.a((Object) aaun);
    }

    public final void a(apxu apxu, Map map) {
        wet wet = (wet) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wet.class);
        if (wet != null && TextUtils.isEmpty(wet.a()) && TextUtils.isEmpty(wet.e())) {
            wet.b(null);
            return;
        }
        Object obj;
        aaun aaun = this.a;
        aavb aavb = new aavb(aaun.c, aaun.d.c());
        anxr access$000 = anxl.checkIsLite(CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.createCommentReplyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aavb.a = aali.b(((CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint) obj).b);
        aavb.a(aabc.a(apxu));
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
                aavb.a(axfr.b);
            }
        }
        aavb.b = aali.b(wet.a());
        aavb.c = aali.b(wet.e());
        aaun aaun2 = this.a;
        aaun2.e.b(aaun2.a.a(aavb, ajty.class, new wfl(wet), aaut.a));
    }
}
