package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;

/* renamed from: ypq */
public final class ypq implements afxo {
    private final String a;

    ypq(String str) {
        this.a = xvd.a(str);
    }

    public final boolean a(aouo aouo) {
        if ((aouo.a & 2) == 0) {
            return false;
        }
        CharSequence charSequence;
        anxp anxp = aouo.e;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = aouo.e;
            if (anxp2 == null) {
                anxp2 = apxu.d;
            }
            anxr access$0002 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
            anxp2.a(access$0002);
            Object b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            charSequence = ((SharedConversationEndpointOuterClass$SharedConversationEndpoint) b).b;
        } else {
            charSequence = null;
        }
        return TextUtils.equals(this.a, charSequence);
    }
}
