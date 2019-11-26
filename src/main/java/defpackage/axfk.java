package defpackage;

import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;

/* renamed from: axfk */
public final class axfk extends anxo implements anzf {
    private axfk() {
        super(SendShareEndpoint$SendShareExternallyEndpoint.e);
    }

    public final aseq a() {
        aseq aseq = ((SendShareEndpoint$SendShareExternallyEndpoint) this.instance).c;
        return aseq == null ? aseq.d : aseq;
    }

    public final axfk a(aset aset) {
        copyOnWrite();
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint) this.instance;
        sendShareEndpoint$SendShareExternallyEndpoint.c = (aseq) ((anxl) aset.build());
        sendShareEndpoint$SendShareExternallyEndpoint.a |= 2;
        return this;
    }

    public /* synthetic */ axfk(byte b) {
        super(SendShareEndpoint$SendShareExternallyEndpoint.e);
    }
}
