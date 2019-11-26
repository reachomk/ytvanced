package defpackage;

import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;
import java.util.Map;

/* renamed from: gzw */
public final class gzw implements aaap {
    private final akmx a;
    private final xci b;

    public gzw(akmx akmx, xci xci) {
        this.a = (akmx) amqw.a((Object) akmx);
        this.b = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        anxr access$000 = anxl.checkIsLite(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        anze anze = ((ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) b).b;
        if (anze == null) {
            anze = axat.k;
        }
        gzx gzx = new gzx(c, (ajzy) ajzv.a(anze, ajzy.class));
        this.b.d(gzx);
        apmi apmi = gzx.a.a;
        if (apmi != null) {
            evk evk = new evk(apmi);
            this.a.b(evk.a, evk);
        }
    }
}
