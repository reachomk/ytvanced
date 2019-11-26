package defpackage;

import com.google.protos.youtube.api.innertube.GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint;

/* renamed from: arqx */
public final class arqx extends anxo implements anzf {
    private arqx() {
        super(GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.e);
    }

    public final arqx a(String str) {
        copyOnWrite();
        GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint = (GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint) this.instance;
        if (str != null) {
            getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.a |= 2;
            getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ arqx(byte b) {
        super(GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.e);
    }
}
