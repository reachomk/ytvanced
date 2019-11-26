package defpackage;

import com.google.protos.youtube.api.innertube.ShareToConversationEndpointOuterClass$ShareToConversationEndpoint;
import java.util.Map;

/* renamed from: alik */
public final class alik implements aaap {
    public final xoi a;
    private final aarh b;

    public alik(aarh aarh, xoi xoi) {
        this.b = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
    }

    public final void a(apxu apxu, Map map) {
        alim alim = (alim) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", alim.class);
        anxr access$000 = anxl.checkIsLite(ShareToConversationEndpointOuterClass$ShareToConversationEndpoint.shareToConversationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ShareToConversationEndpointOuterClass$ShareToConversationEndpoint shareToConversationEndpointOuterClass$ShareToConversationEndpoint = (ShareToConversationEndpointOuterClass$ShareToConversationEndpoint) b;
        aarh aarh = this.b;
        String[] strArr = (String[]) shareToConversationEndpointOuterClass$ShareToConversationEndpoint.b.toArray(new String[0]);
        String[] strArr2 = (String[]) shareToConversationEndpointOuterClass$ShareToConversationEndpoint.c.toArray(new String[0]);
        axhs axhs = shareToConversationEndpointOuterClass$ShareToConversationEndpoint.d;
        if (axhs == null) {
            axhs = axhs.e;
        }
        String str = shareToConversationEndpointOuterClass$ShareToConversationEndpoint.e;
        String str2 = shareToConversationEndpointOuterClass$ShareToConversationEndpoint.f;
        String str3 = shareToConversationEndpointOuterClass$ShareToConversationEndpoint.h;
        afsw alin = new alin(this, alim);
        aaml aaue = new aaue(aarh.c, aarh.d.c());
        aaue.a = strArr;
        aaue.b = strArr2;
        aaue.c = axhs;
        aaue.d = aali.b(str);
        aaue.e = aali.b(str2);
        aaue.p = str3;
        aarh.a(asey.d, aarh.g, aasu.a, aasx.a).a(aaue, alin);
    }
}
