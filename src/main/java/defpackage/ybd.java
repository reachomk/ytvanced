package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction;
import java.util.Map;

/* renamed from: ybd */
public final class ybd implements aaap {
    private final akmx a;

    public ybd(akmx akmx) {
        this.a = akmx;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction.updateConversationItemHeartAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction = (UpdateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction) b;
        String str = updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction.b;
        String str2 = updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction.c;
        boolean z = updateConversationItemHeartActionOuterClass$UpdateConversationItemHeartAction.d;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Uri a = ycq.a(str, str2);
            ycm ycm = (ycm) this.a.a(a);
            if (ycm != null) {
                akmx akmx = this.a;
                ycl a2 = ycm.a();
                a2.a = z;
                akmx.b(a, a2.a());
            }
        }
    }
}
