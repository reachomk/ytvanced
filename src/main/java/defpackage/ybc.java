package defpackage;

import com.google.protos.youtube.api.innertube.ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction;
import java.util.Map;

/* renamed from: ybc */
public final class ybc implements aaap {
    private final aarh a;

    public ybc(aarh aarh) {
        this.a = (aarh) amqw.a((Object) aarh);
    }

    public final void a(apxu apxu, Map map) {
        aarh aarh = this.a;
        anxr access$000 = anxl.checkIsLite(ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction.showRelatedVideoRepliesAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        String str = ((ShowRelatedVideoRepliesActionOuterClass$ShowRelatedVideoRepliesAction) b).b;
        afsw ybb = new ybb(map);
        aaml aaua = new aaua(aarh.c, aarh.d.c(), str, false);
        aaua.g();
        aarh.a(atft.f, aarh.g, aash.a, aasg.a).a(aaua, ybb);
    }
}
