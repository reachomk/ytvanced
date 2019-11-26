package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Map;

/* renamed from: eve */
public final class eve implements aaap {
    public final xoi a;
    public final aaas b;
    public final akmx c;
    private final abjb d;

    public eve(abjb abjb, xoi xoi, aaas aaas, akmx akmx) {
        this.d = (abjb) amqw.a((Object) abjb);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (akmx) amqw.a((Object) akmx);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        evg evg = (evg) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", evg.class);
        if (evg != null) {
            evf evf = evg.b;
            if (evf != null) {
                evf.a();
            }
        }
        boolean z = evg != null && evg.a;
        abjb abjb = this.d;
        aaml abiy = new abiy(abjb.c, abjb.d.c());
        anxr access$000 = anxl.checkIsLite(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = (SubscribeEndpointOuterClass$SubscribeEndpoint) obj;
        for (String str : subscribeEndpointOuterClass$SubscribeEndpoint.b) {
            if (!TextUtils.isEmpty(str)) {
                abiy.a.add(str);
            }
        }
        if (!subscribeEndpointOuterClass$SubscribeEndpoint.d.isEmpty()) {
            abiy.c = subscribeEndpointOuterClass$SubscribeEndpoint.d;
        }
        access$000 = anxl.checkIsLite(axft.b);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(axft.b);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            axfr axfr = (axfr) obj;
            if (!axfr.b.isEmpty()) {
                abiy.a(axfr.b);
            }
        }
        abiy.b = subscribeEndpointOuterClass$SubscribeEndpoint.c;
        abiy.a(apxu.b);
        akdt akdt = (akdt) xsb.a(map, (Object) "command_status_callback", akdt.class);
        bblw a = akdt != null ? akdt.a() : null;
        abjb = this.d;
        abjb.a.a(abiy, new abje(abjb, new evd(this, map, subscribeEndpointOuterClass$SubscribeEndpoint, z, evg, a, apxu)));
    }
}
