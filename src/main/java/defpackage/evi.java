package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Map;

/* renamed from: evi */
public final class evi implements aaap {
    public final xoi a;
    public final aaas b;
    public final akmx c;
    private final abjb d;

    public evi(xoi xoi, aaas aaas, abjb abjb, akmx akmx) {
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (aaas) amqw.a((Object) aaas);
        this.d = (abjb) amqw.a((Object) abjb);
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
        abjb abjb = this.d;
        aaml abjj = new abjj(abjb.c, abjb.d.c());
        anxr access$000 = anxl.checkIsLite(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        for (String str : ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) obj).b) {
            if (!TextUtils.isEmpty(str)) {
                abjj.a.add(str);
            }
        }
        access$000 = anxl.checkIsLite(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
        apxu.a(access$000);
        b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        String str2 = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) obj).d;
        if (!str2.isEmpty()) {
            abjj.c = str2;
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
                abjj.a(axfr.b);
            }
        }
        access$000 = anxl.checkIsLite(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
        apxu.a(access$000);
        b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        if ((((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) obj).a & 1) != 0) {
            access$000 = anxl.checkIsLite(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            abjj.b = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) obj).c;
        }
        abjj.a(apxu.b);
        akdt akdt = (akdt) xsb.a(map, (Object) "command_status_callback", akdt.class);
        bblw a = akdt != null ? akdt.a() : null;
        abjb = this.d;
        abjb.b.a(abjj, new abjh(abjb, new evh(this, map, apxu, evg, a)));
    }
}
