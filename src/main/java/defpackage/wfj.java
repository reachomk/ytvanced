package defpackage;

import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import java.util.Map;

/* renamed from: wfj */
public final class wfj implements aaap {
    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.commentsStreamReloadEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint) b;
        wel wel = (wel) xsb.a(map, (Object) "sectionController", wel.class);
        if (wel != null) {
            aqdb aqdb = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.b;
            if (aqdb == null) {
                aqdb = aqdb.c;
            }
            if ((aqdb.a & 1) != 0) {
                int a = aqcy.a(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c);
                if (a == 0) {
                    a = 1;
                }
                a--;
                aqdb aqdb2;
                if (a == 1) {
                    aqdb2 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.b;
                    if (aqdb2 == null) {
                        aqdb2 = aqdb.c;
                    }
                    awzv awzv = aqdb2.b;
                    if (awzv == null) {
                        awzv = awzv.d;
                    }
                    wel.a(awzv);
                } else if (a != 2) {
                    aqdb2 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.b;
                    if (aqdb2 == null) {
                        aqdb2 = aqdb.c;
                    }
                    b = aqdb2.b;
                    if (b == null) {
                        b = awzv.d;
                    }
                    wel.a(ajtj.a(b));
                } else {
                    aqdb2 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.b;
                    if (aqdb2 == null) {
                        aqdb2 = aqdb.c;
                    }
                    b = aqdb2.b;
                    if (b == null) {
                        b = awzv.d;
                    }
                    if (wel.a == 0) {
                        wel.a(10);
                    }
                    wel.a(ajtj.a(b));
                }
            }
        }
    }
}
