package defpackage;

import com.google.protos.youtube.api.innertube.OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction;
import java.util.Map;

/* renamed from: wfq */
public final class wfq implements aaap {
    private final wfo a;

    public wfq(wfo wfo) {
        this.a = wfo;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.openCreateReplyDialogAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction = (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction) b;
        wfo wfo = this.a;
        wdx wdx = (wdx) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wdx.class);
        aqqu aqqu = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.b;
        if (aqqu == null) {
            aqqu = aqqu.c;
        }
        apya apya = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.c;
        if (apya == null) {
            apya = apya.c;
        }
        apya apya2 = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.d;
        if (apya2 == null) {
            apya2 = apya.c;
        }
        wfo.a(wdx, aqqu, apya, apya2);
    }
}
