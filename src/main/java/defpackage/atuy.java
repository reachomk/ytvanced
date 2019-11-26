package defpackage;

import com.google.protos.youtube.api.innertube.InviteMoreEndpointOuterClass$InviteMoreEndpoint;

/* renamed from: atuy */
public final class atuy extends anxo implements anzf {
    private atuy() {
        super(InviteMoreEndpointOuterClass$InviteMoreEndpoint.d);
    }

    public final atuy a(String str) {
        copyOnWrite();
        InviteMoreEndpointOuterClass$InviteMoreEndpoint inviteMoreEndpointOuterClass$InviteMoreEndpoint = (InviteMoreEndpointOuterClass$InviteMoreEndpoint) this.instance;
        if (str != null) {
            inviteMoreEndpointOuterClass$InviteMoreEndpoint.a |= 1;
            inviteMoreEndpointOuterClass$InviteMoreEndpoint.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ atuy(byte b) {
        super(InviteMoreEndpointOuterClass$InviteMoreEndpoint.d);
    }
}
