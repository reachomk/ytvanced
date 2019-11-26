package defpackage;

import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;

/* renamed from: xxl */
public final class xxl {
    private final xxm a;
    private final xxf b;

    public xxl(xxm xxm, xxf xxf) {
        this.a = (xxm) amqw.a((Object) xxm);
        this.b = (xxf) amqw.a((Object) xxf);
    }

    public final void a(apxu apxu) {
        if (zdc.a(apxu)) {
            Object obj;
            anxr access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            SharedConversationEndpointOuterClass$SharedConversationEndpoint sharedConversationEndpointOuterClass$SharedConversationEndpoint = (SharedConversationEndpointOuterClass$SharedConversationEndpoint) obj;
            anvu anvu = sharedConversationEndpointOuterClass$SharedConversationEndpoint.d;
            ajvp ajvp = null;
            if (anvu.b() != 0) {
                ajvp ajvp2 = new ajvp();
                try {
                    aocf.mergeFrom(ajvp2, anvu.d());
                    ajvp = ajvp2;
                } catch (aocg unused) {
                }
            }
            if (ajvp != null) {
                xxm xxm = this.a;
                String str = sharedConversationEndpointOuterClass$SharedConversationEndpoint.c;
                xxm.a();
                long a = xxm.a((ajvp) xxm.a.get(str));
                long a2 = xxm.a(ajvp);
                if ((a2 == 0 && a == 0) || a2 > a) {
                    xxm.a.put(str, ajvp);
                }
                this.b.a(apxu);
            }
        }
    }
}
