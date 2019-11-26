package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ConversationEndpointOuterClass$ConversationEndpoint;
import com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;
import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;

/* renamed from: xzr */
public final class xzr implements aaai {
    public final boolean a(apxu apxu, apxu apxu2) {
        Object b;
        Object b2;
        anxr access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint = (ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) b;
                access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
                apxu2.a(access$000);
                b2 = apxu2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                return TextUtils.equals(conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.b, ((ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) b2).b);
            }
        }
        access$000 = anxl.checkIsLite(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                ConversationEndpointOuterClass$ConversationEndpoint conversationEndpointOuterClass$ConversationEndpoint = (ConversationEndpointOuterClass$ConversationEndpoint) b;
                access$000 = anxl.checkIsLite(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint);
                apxu2.a(access$000);
                b2 = apxu2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                return TextUtils.equals(conversationEndpointOuterClass$ConversationEndpoint.b, ((ConversationEndpointOuterClass$ConversationEndpoint) b2).b);
            }
        }
        access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                SharedConversationEndpointOuterClass$SharedConversationEndpoint sharedConversationEndpointOuterClass$SharedConversationEndpoint = (SharedConversationEndpointOuterClass$SharedConversationEndpoint) b;
                access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
                apxu2.a(access$000);
                b2 = apxu2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                return sharedConversationEndpointOuterClass$SharedConversationEndpoint.b.equals(((SharedConversationEndpointOuterClass$SharedConversationEndpoint) b2).b);
            }
        }
        return false;
    }
}
