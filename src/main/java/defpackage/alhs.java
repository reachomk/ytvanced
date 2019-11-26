package defpackage;

import com.google.protos.youtube.api.innertube.FindEmailUserEndpointOuterClass$FindEmailUserEndpoint;
import java.util.Map;

/* renamed from: alhs */
public final class alhs implements aaap {
    private final aarh a;

    public alhs(aarh aarh) {
        this.a = (aarh) amqw.a((Object) aarh);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(FindEmailUserEndpointOuterClass$FindEmailUserEndpoint.findEmailUserEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            String str = (String) map.get("find_email_user_email");
            alhu alhu = (alhu) map.get("find_email_user_listener");
            aarh aarh = this.a;
            afsw alhv = new alhv(alhu);
            aaml aatl = new aatl(aarh.c, aarh.d.c(), str);
            aatl.g();
            aarh.a(asof.i, aarh.g, aasl.a, aask.a).a(aatl, alhv);
        }
    }
}
