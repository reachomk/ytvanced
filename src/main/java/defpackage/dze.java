package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint;
import java.util.Map;

/* renamed from: dze */
public final class dze implements aaap {
    private final ahcn a;

    public dze(ahcn ahcn) {
        this.a = (ahcn) amqw.a((Object) ahcn);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.offlineVideoWithOfflineabilityEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint = (OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint) b;
        int a = avrj.a(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.c);
        if (a == 0) {
            a = 1;
        }
        a--;
        if (a == 1) {
            axak axak = offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.d;
            if (axak == null) {
                axak = axak.a;
            }
            avsj avsj = (avsj) ajzv.a(ajzv.a(axak), avsj.class);
            if (avsj == null) {
                xtl.c("Object is not an offlineable video");
                return;
            }
            this.a.a(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.b, avsj, null, (acvx) xsb.a(map, (Object) "com.google.android.libraries.youtube.logging.interaction_logger", acvx.class));
        } else if (a != 2) {
            int a2 = avrj.a(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.c);
            if (a2 == 0) {
                a2 = 1;
            }
            String valueOf = String.valueOf(avrj.b(a2));
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 34);
            stringBuilder.append("Unsupported Offline Video Action: ");
            stringBuilder.append(valueOf);
            xtl.d(stringBuilder.toString());
        } else {
            this.a.a(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.b, false);
        }
    }
}
