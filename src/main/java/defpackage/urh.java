package defpackage;

import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import java.util.Map;

/* renamed from: urh */
public final class urh implements aaap {
    private final bcaa a;
    private final usl b;

    urh(bcaa bcaa, usl usl) {
        this.a = bcaa;
        this.b = usl;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint) obj;
        if ((channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.a & 2) == 0) {
            ((urs) this.a.get()).a(apxu);
            return;
        }
        usl usl = this.b;
        aavd aavd = (aavd) xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        anxl anxl = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
        if (anxl == null) {
            anxl = azrm.c;
        }
        azrp azrp = (azrp) ((anxo) anxl.toBuilder());
        aaqi a = usl.b.a();
        a.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.b;
        azrm azrm = (azrm) azrp.instance;
        azrr azrr = (azrr) ((anxo) (azrm.a == 1 ? (azro) azrm.b : azro.c).toBuilder());
        String a2 = aavd.a();
        azrr.copyOnWrite();
        azro azro = (azro) azrr.instance;
        if (a2 != null) {
            azro.a |= 1;
            azro.b = a2;
            azro azro2 = (azro) ((anxl) azrr.build());
            azrp.copyOnWrite();
            azrm azrm2 = (azrm) azrp.instance;
            if (azro2 != null) {
                azrm2.b = azro2;
                azrm2.a = 1;
                a.r = (azrm) ((anxl) azrp.build());
                usl.b.a(a, new uso(usl, aavd));
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
