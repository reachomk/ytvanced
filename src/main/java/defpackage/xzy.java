package defpackage;

import com.google.protos.youtube.api.innertube.EditConversationNameEndpointOuterClass$EditConversationNameEndpoint;
import java.util.Map;

/* renamed from: xzy */
public final class xzy implements aaap {
    public final xoi a;
    public final aaas b;
    public final xci c;
    private final aarh d;

    public xzy(aarh aarh, xoi xoi, aaas aaas, xci xci) {
        this.d = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.editConversationNameEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        EditConversationNameEndpointOuterClass$EditConversationNameEndpoint editConversationNameEndpointOuterClass$EditConversationNameEndpoint = (EditConversationNameEndpointOuterClass$EditConversationNameEndpoint) obj;
        this.d.a(apxu, editConversationNameEndpointOuterClass$EditConversationNameEndpoint.b, editConversationNameEndpointOuterClass$EditConversationNameEndpoint.c, null, new xzx(this, map, editConversationNameEndpointOuterClass$EditConversationNameEndpoint));
    }
}
