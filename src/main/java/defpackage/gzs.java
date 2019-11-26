package defpackage;

import com.google.protos.youtube.api.innertube.ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction;
import java.util.Map;

/* renamed from: gzs */
public final class gzs implements aaap {
    private final afwx a;

    public gzs(afwx afwx) {
        this.a = afwx;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.clearNotificationsUnreadCountAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        this.a.a(afwv.e().a(false).b(0).a((int) ((ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction) b).b).a("FEnotifications_inbox").a());
    }
}
