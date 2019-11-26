package defpackage;

import com.google.protos.youtube.api.innertube.EditConversationEndpointOuterClass$EditConversationEndpoint;

/* renamed from: arat */
public final class arat extends anxo implements anzf {
    private arat() {
        super(EditConversationEndpointOuterClass$EditConversationEndpoint.e);
    }

    public final arat a(String str) {
        copyOnWrite();
        EditConversationEndpointOuterClass$EditConversationEndpoint editConversationEndpointOuterClass$EditConversationEndpoint = (EditConversationEndpointOuterClass$EditConversationEndpoint) this.instance;
        if (str != null) {
            editConversationEndpointOuterClass$EditConversationEndpoint.a |= 1;
            editConversationEndpointOuterClass$EditConversationEndpoint.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ arat(byte b) {
        super(EditConversationEndpointOuterClass$EditConversationEndpoint.e);
    }
}
