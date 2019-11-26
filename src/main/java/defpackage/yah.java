package defpackage;

import com.google.protos.youtube.api.innertube.GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: yah */
public final class yah implements aaap {
    public final amuw a;
    private final aarh b;

    public yah(aarh aarh, Set set) {
        this.b = (aarh) amqw.a((Object) aarh);
        this.a = amuw.a((Collection) set);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.getConversationAttachmentEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint = (GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint) b;
        aarh aarh = this.b;
        String str = getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.b;
        String str2 = getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.c;
        afsw yak = new yak(this, map, getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint);
        aaml aatp = new aatp(aarh.c, aarh.d.c(), str, str2);
        aatp.g();
        aarh.a(ajux.class, aarh.b, aase.a).a(aatp, yak);
    }
}
