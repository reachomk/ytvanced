package defpackage;

import com.google.protos.youtube.api.innertube.SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint;
import java.util.Map;

/* renamed from: alhz */
public final class alhz implements aaap {
    public final aaas a;
    private final aarh b;

    public alhz(aarh aarh, aaas aaas) {
        this.b = (aarh) amqw.a((Object) aarh);
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint.sendEmailInviteEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            String str = (String) map.get("send_email_invite_email");
            String str2 = (String) map.get("send_email_invite_token");
            alib alib = (alib) map.get("send_email_invite_listener");
            aarh aarh = this.b;
            afsw alhy = new alhy(this, alib);
            aaml aaud = new aaud(aarh.c, aarh.d.c(), str, str2);
            aaud.g();
            aarh.a(athm.d, aarh.g, aasn.a, aasp.a).a(aaud, alhy);
        }
    }
}
