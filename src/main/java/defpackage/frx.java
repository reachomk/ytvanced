package defpackage;

import com.google.protos.youtube.api.innertube.ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint;

/* renamed from: frx */
public final class frx implements yqt {
    private final aaas a;

    public frx(aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void a(String str) {
        aqmv aqmv = (aqmv) ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.d.createBuilder();
        aqmv.copyOnWrite();
        ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint = (ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint) aqmv.instance;
        if (str != null) {
            conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.a |= 1;
            conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.b = str;
            ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint2 = (ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint) ((anxl) aqmv.build());
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.conversationReplyPanelEndpoint, conversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint2);
            this.a.a((apxu) ((anxl) apxx.build()), null);
            return;
        }
        throw new NullPointerException();
    }
}
