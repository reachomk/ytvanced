package defpackage;

import com.google.protos.youtube.api.innertube.InviteToConversationEndpointOuterClass$InviteToConversationEndpoint;
import java.util.Map;

/* renamed from: yam */
public final class yam implements aaap {
    public final xoi a;
    public final aaas b;
    private final aarh c;

    public yam(aarh aarh, xoi xoi, aaas aaas) {
        this.c = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        yao yao = (yao) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", yao.class);
        anxr access$000 = anxl.checkIsLite(InviteToConversationEndpointOuterClass$InviteToConversationEndpoint.inviteToConversationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        InviteToConversationEndpointOuterClass$InviteToConversationEndpoint inviteToConversationEndpointOuterClass$InviteToConversationEndpoint = (InviteToConversationEndpointOuterClass$InviteToConversationEndpoint) obj;
        aarh aarh = this.c;
        String str = inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.b;
        anyd anyd = inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.c;
        anyd anyd2 = inviteToConversationEndpointOuterClass$InviteToConversationEndpoint.d;
        afsw yal = new yal(this, yao);
        aaml aaty = new aaty(aarh.c, aarh.d.c());
        aaty.a(aabc.a(apxu));
        aaty.a = aali.b(str);
        aaty.b = (String[]) anyd.toArray(new String[0]);
        aaty.c = (String[]) anyd2.toArray(new String[0]);
        aarh.a(asek.d, aarh.g, aasd.a, aasm.a).a(aaty, yal);
    }
}
