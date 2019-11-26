package defpackage;

import com.google.protos.youtube.api.innertube.ContactMenuEndpointOuterClass$ContactMenuEndpoint;
import java.util.Map;

/* renamed from: dxq */
public final class dxq implements aaap {
    public final xoi a;
    private final nn b;
    private final aarh c;
    private final xwr d = new ybm();

    public dxq(nn nnVar, aarh aarh, xoi xoi) {
        this.b = (nn) amqw.a((Object) nnVar);
        this.c = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
    }

    public final void a(apxu apxu, Map map) {
        String str;
        alhm alhm = (alhm) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", alhm.class);
        Object c = xsb.c(map, "contact_menu_source_model");
        anxr access$000 = anxl.checkIsLite(ContactMenuEndpointOuterClass$ContactMenuEndpoint.contactMenuEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ContactMenuEndpointOuterClass$ContactMenuEndpoint contactMenuEndpointOuterClass$ContactMenuEndpoint = (ContactMenuEndpointOuterClass$ContactMenuEndpoint) b;
        xwr xwr = this.d;
        if ((contactMenuEndpointOuterClass$ContactMenuEndpoint.a & 2) != 0) {
            aqtc aqtc = contactMenuEndpointOuterClass$ContactMenuEndpoint.c;
            if (aqtc == null) {
                aqtc = aqtc.c;
            }
            str = aqtc.b;
        } else {
            str = null;
        }
        zav a = xwr.a(null, str, c);
        a.a(this.b);
        if (!contactMenuEndpointOuterClass$ContactMenuEndpoint.b.isEmpty()) {
            String str2 = contactMenuEndpointOuterClass$ContactMenuEndpoint.b;
            aarh aarh = this.c;
            afsw dxp = new dxp(this, alhm, a);
            aaml aatm = new aatm(aarh.c, aarh.d.c());
            aatm.a = aali.b(str2);
            aarh.a(ashd.d, aarh.g, aark.a, aarn.a).a(aatm, dxp);
        }
    }
}
