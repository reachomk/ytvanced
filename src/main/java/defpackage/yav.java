package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.RemoveConversationItemActionOuterClass$RemoveConversationItemAction;
import java.util.Map;

/* renamed from: yav */
public final class yav implements aaap {
    private final akmx a;

    public yav(akmx akmx) {
        this.a = (akmx) amqw.a((Object) akmx);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(RemoveConversationItemActionOuterClass$RemoveConversationItemAction.removeConversationItemAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        RemoveConversationItemActionOuterClass$RemoveConversationItemAction removeConversationItemActionOuterClass$RemoveConversationItemAction = (RemoveConversationItemActionOuterClass$RemoveConversationItemAction) b;
        String str = removeConversationItemActionOuterClass$RemoveConversationItemAction.b;
        String str2 = removeConversationItemActionOuterClass$RemoveConversationItemAction.c;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Uri a = ycq.a(str, str2);
            ycm ycm = (ycm) this.a.a(a);
            if (ycm != null) {
                akmx akmx = this.a;
                ycl a2 = ycm.a();
                a2.f = true;
                akmx.b(a, a2.a());
            }
        }
    }
}
