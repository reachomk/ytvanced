package defpackage;

import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import java.util.Map;

/* renamed from: wfp */
public final class wfp implements aaap {
    private final aaun a;
    private final aaas b;

    public wfp(aaun aaun, aaas aaas) {
        this.a = (aaun) amqw.a((Object) aaun);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        Iterable iterable;
        afsw afsw = (afsw) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", afsw.class);
        if (afsw == null) {
            afsw = afsy.a(ajsj.class);
        }
        Object c = xsb.c(map, "com.google.android.libraries.youtube.comment.action_tag");
        anxr access$000 = anxl.checkIsLite(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint) obj;
        if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.c.size() > 0) {
            iterable = performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.c;
        } else {
            iterable = amul.a(performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.b);
        }
        aaun aaun = this.a;
        asfs asfs = (asfs) asft.d.createBuilder();
        asfs.copyOnWrite();
        asft asft = (asft) asfs.instance;
        if (!asft.c.a()) {
            asft.c = anxl.mutableCopy(asft.c);
        }
        anvf.addAll(iterable, asft.c);
        aaml aauk = new aauk(aaun.c, aaun.d.c(), asfs);
        aauk.a(apxu.b);
        anxr access$0002 = anxl.checkIsLite(axft.b);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d)) {
            access$0002 = anxl.checkIsLite(axft.b);
            apxu.a(access$0002);
            Object b2 = apxu.h.b(access$0002.d);
            if (b2 == null) {
                b2 = access$0002.b;
            } else {
                b2 = access$0002.a(b2);
            }
            axfr axfr = (axfr) b2;
            if (!axfr.b.isEmpty()) {
                aauk.a(axfr.b);
            }
        }
        this.a.b.a(aauk, afsw);
        if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() > 0 && c != null) {
            this.b.a(performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d, c);
        }
    }
}
