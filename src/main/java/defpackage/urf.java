package defpackage;

import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;

/* renamed from: urf */
public final class urf {
    public final urs a;
    public final afpu b;
    public final aanz c;

    public urf(urs urs, afpu afpu, aanz aanz) {
        this.a = (urs) amqw.a((Object) urs);
        this.b = (afpu) amqw.a((Object) afpu);
        this.c = (aanz) amqw.a((Object) aanz);
    }

    public final void a(int i) {
        if (this.b.a()) {
            urs urs = this.a;
            apkx apkx = (apkx) ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.d.createBuilder();
            apkx.copyOnWrite();
            ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) apkx.instance;
            if (i != 0) {
                channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.a |= 2;
                channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.c = i - 1;
                ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint2 = (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) ((anxl) apkx.build());
                apxx apxx = (apxx) apxu.d.createBuilder();
                apxx.a(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint2);
                urs.b((apxu) ((anxl) apxx.build()));
                return;
            }
            throw new NullPointerException();
        }
        this.a.u_();
    }
}
