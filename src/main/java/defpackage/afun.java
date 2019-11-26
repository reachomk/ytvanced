package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction;
import java.util.Map;

/* renamed from: afun */
public final class afun implements aaap {
    private final Context a;

    public afun(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.removeNotificationTrayItemAction);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.removeNotificationTrayItemAction);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction = (RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction) b;
            afxv.a(this.a, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.b, removeNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.c);
        }
    }
}
