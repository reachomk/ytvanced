package defpackage;

import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint;

/* renamed from: axfm */
public final class axfm extends anxo implements anzf {
    private axfm() {
        super(SendShareEndpoint$SendShareToConversationEndpoint.f);
    }

    public final asfa a() {
        asfa asfa = ((SendShareEndpoint$SendShareToConversationEndpoint) this.instance).b;
        return asfa == null ? asfa.f : asfa;
    }

    public final axfm a(asfd asfd) {
        copyOnWrite();
        SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = (SendShareEndpoint$SendShareToConversationEndpoint) this.instance;
        sendShareEndpoint$SendShareToConversationEndpoint.b = (asfa) ((anxl) asfd.build());
        sendShareEndpoint$SendShareToConversationEndpoint.a |= 1;
        return this;
    }

    public /* synthetic */ axfm(byte b) {
        super(SendShareEndpoint$SendShareToConversationEndpoint.f);
    }
}
