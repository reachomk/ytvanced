package defpackage;

import com.google.protos.youtube.api.innertube.GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint;

/* renamed from: yut */
final /* synthetic */ class yut implements bbnw {
    private final yuh a;
    private final String b;
    private final String c;

    yut(yuh yuh, String str, String str2) {
        this.a = yuh;
        this.b = str;
        this.c = str2;
    }

    public final void accept(Object obj) {
        yuh yuh = this.a;
        String str = this.b;
        String str2 = this.c;
        apxx apxx = (apxx) apxu.d.createBuilder();
        arqx arqx = (arqx) GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.e.createBuilder();
        String getConversationAttachmentToken = ((ykd) obj).getGetConversationAttachmentToken();
        arqx.copyOnWrite();
        GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint = (GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint) arqx.instance;
        if (getConversationAttachmentToken != null) {
            getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.a |= 1;
            getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.b = getConversationAttachmentToken;
            arqx.a(str);
            arqx.copyOnWrite();
            GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint2 = (GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint) arqx.instance;
            if (str2 != null) {
                getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint2.a |= 4;
                getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint2.d = str2;
                apxx.a(GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.getConversationAttachmentEndpoint, (GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint) ((anxl) arqx.build()));
                yuh.b.a((apxu) ((anxl) apxx.build()), null);
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
