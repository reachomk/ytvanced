package defpackage;

import com.google.protos.youtube.api.innertube.EditConversationPostEndpointOuterClass$EditConversationPostEndpoint;

/* renamed from: yum */
public final /* synthetic */ class yum implements bbnw {
    private final yuh a;

    public yum(yuh yuh) {
        this.a = yuh;
    }

    public final void accept(Object obj) {
        yuh yuh = this.a;
        araw araw = (araw) EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.c.createBuilder();
        String deleteToken = ((ylf) obj).getDeleteToken();
        araw.copyOnWrite();
        EditConversationPostEndpointOuterClass$EditConversationPostEndpoint editConversationPostEndpointOuterClass$EditConversationPostEndpoint = (EditConversationPostEndpointOuterClass$EditConversationPostEndpoint) araw.instance;
        if (deleteToken != null) {
            editConversationPostEndpointOuterClass$EditConversationPostEndpoint.a |= 1;
            editConversationPostEndpointOuterClass$EditConversationPostEndpoint.b = deleteToken;
            EditConversationPostEndpointOuterClass$EditConversationPostEndpoint editConversationPostEndpointOuterClass$EditConversationPostEndpoint2 = (EditConversationPostEndpointOuterClass$EditConversationPostEndpoint) ((anxl) araw.build());
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.editConversationPostEndpoint, editConversationPostEndpointOuterClass$EditConversationPostEndpoint2);
            yuh.b.a((apxu) ((anxl) apxx.build()), null);
            return;
        }
        throw new NullPointerException();
    }
}
