package defpackage;

import com.google.protos.youtube.api.innertube.CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint;
import java.util.Map;

/* renamed from: wfn */
public final class wfn implements aaap {
    private final wfo a;

    public wfn(wfo wfo) {
        this.a = wfo;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.createCommentReplyDialogEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint = (CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint) b;
        wfo wfo = this.a;
        wdx wdx = (wdx) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wdx.class);
        aqqu aqqu = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.b;
        if (aqqu == null) {
            aqqu = aqqu.c;
        }
        apya apya = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.c;
        if (apya == null) {
            apya = apya.c;
        }
        apya apya2 = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.d;
        if (apya2 == null) {
            apya2 = apya.c;
        }
        wfo.a(wdx, aqqu, apya, apya2);
    }
}
