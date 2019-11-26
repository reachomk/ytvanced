package defpackage;

import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;

/* renamed from: xxj */
final class xxj implements afxc {
    public final atun a;
    private final apxu b;
    private final /* synthetic */ xxf c;

    public xxj(xxf xxf, apxu apxu) {
        this.c = xxf;
        this.b = (apxu) amqw.a((Object) apxu);
        this.a = (atun) amqw.a(zdc.b(apxu));
    }

    public final void a(atun atun) {
    }

    public final void a(atun atun, atur atur) {
        xxm xxm = this.c.b;
        apxu apxu = this.b;
        anxr access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        xxm.a(((SharedConversationEndpointOuterClass$SharedConversationEndpoint) b).c);
        this.c.b(this.b);
    }
}
