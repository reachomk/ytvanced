package defpackage;

import com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction;
import java.util.Map;

/* renamed from: had */
public final class had implements aaap {
    private final xci a;

    public had(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        xci xci = this.a;
        anxr access$000 = anxl.checkIsLite(ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.showSubscribePromoAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        xci.d(b);
    }
}
