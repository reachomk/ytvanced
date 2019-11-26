package defpackage;

import com.google.protos.youtube.api.innertube.CameraFlashEndpointOuterClass$CameraFlashEndpoint;
import com.google.protos.youtube.api.innertube.ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint;
import com.google.protos.youtube.api.innertube.SwitchCameraEndpointOuterClass$SwitchCameraEndpoint;
import java.util.Map;

/* renamed from: acdt */
public final class acdt implements aaap {
    private final acdq a;

    public acdt(acdq acdq) {
        this.a = (acdq) amqw.a((Object) acdq);
    }

    public final void a(apxu apxu, Map map) {
        if (this.a.n_() == null) {
            xtl.c("StreamControlState null - livestream not in progress?");
            return;
        }
        acdr n_ = this.a.n_();
        anxr access$000 = anxl.checkIsLite(SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.switchCameraEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            n_.c();
            return;
        }
        access$000 = anxl.checkIsLite(ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.chatVisibilityEndpoint);
        apxu.a(access$000);
        Object b;
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.chatVisibilityEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            n_.a(((ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint) b).b);
            return;
        }
        access$000 = anxl.checkIsLite(CameraFlashEndpointOuterClass$CameraFlashEndpoint.cameraFlashEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(CameraFlashEndpointOuterClass$CameraFlashEndpoint.cameraFlashEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            n_.b(((CameraFlashEndpointOuterClass$CameraFlashEndpoint) b).b);
            return;
        }
        access$000 = anxl.checkIsLite(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.microphoneCaptureEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.microphoneCaptureEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            n_.c(((MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint) b).b ^ 1);
            return;
        }
        access$000 = anxl.checkIsLite(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
            apxu.a(access$000);
            Object b2 = apxu.h.b(access$000.d);
            if (b2 == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b2);
            }
            LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint) obj;
            if ((liveChatEndpointOuterClass$LiveChatEndpoint.a & 2) != 0) {
                aufw aufw = liveChatEndpointOuterClass$LiveChatEndpoint.c;
                if (aufw == null) {
                    aufw = aufw.g;
                }
                n_.a(aufw);
                return;
            }
            n_.a(apxu);
            return;
        }
        String valueOf = String.valueOf(apxu);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 38);
        stringBuilder.append("Unhandled StreamControlState command: ");
        stringBuilder.append(valueOf);
        throw new aabf(stringBuilder.toString());
    }
}
