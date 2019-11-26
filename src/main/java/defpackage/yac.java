package defpackage;

import com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint;
import java.util.Map;

/* renamed from: yac */
public final class yac implements aaap {
    public final void a(apxu apxu, Map map) {
        yab yab = (yab) xsb.a(map, (Object) "edit_conversation_entry_listener", yab.class);
        anxr access$000 = anxl.checkIsLite(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        araq araq = ((EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint) b).b;
        if (araq == null) {
            araq = araq.c;
        }
        yab.a(araq);
    }
}
