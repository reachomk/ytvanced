package defpackage;

import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;
import java.util.Map;

/* renamed from: hbf */
public final class hbf implements aaap {
    private final xci a;

    public hbf(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        xci xci = this.a;
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        anxr access$000 = anxl.checkIsLite(ToggleConversationActionOuterClass$ToggleConversationAction.toggleConversationAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        xci.d(new hbc(c, (ToggleConversationActionOuterClass$ToggleConversationAction) b));
    }
}
