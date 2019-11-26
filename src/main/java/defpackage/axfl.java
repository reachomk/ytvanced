package defpackage;

import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;

/* renamed from: axfl */
public final class axfl extends anxo implements anzf {
    private axfl() {
        super(SendShareEndpoint$SendShareToContactsEndpoint.f);
    }

    public final axfl a(asfa asfa) {
        copyOnWrite();
        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint) this.instance;
        if (asfa != null) {
            sendShareEndpoint$SendShareToContactsEndpoint.b = asfa;
            sendShareEndpoint$SendShareToContactsEndpoint.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final axfl a(asev asev) {
        copyOnWrite();
        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint) this.instance;
        sendShareEndpoint$SendShareToContactsEndpoint.c = (ases) ((anxl) asev.build());
        sendShareEndpoint$SendShareToContactsEndpoint.a |= 2;
        return this;
    }

    public /* synthetic */ axfl(byte b) {
        super(SendShareEndpoint$SendShareToContactsEndpoint.f);
    }
}
