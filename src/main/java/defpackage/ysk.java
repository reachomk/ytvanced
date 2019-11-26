package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ysk */
final /* synthetic */ class ysk implements zaf {
    private final ysi a;

    ysk(ysi ysi) {
        this.a = ysi;
    }

    public final void a() {
        ysi ysi = this.a;
        if (ysi.i != null) {
            Map hashMap = new HashMap();
            if (yky.a(ysi.i) != null) {
                apxx apxx = (apxx) ((anxo) yky.a(ysi.i).toBuilder());
                hashMap.put("permission_requester", ysi.g);
                ysi.f.a((apxu) ((anxl) apxx.build()), hashMap);
            } else {
                apsa chatMessageLinkType = ((apsk) ysi.i.getEntity()).getChatMessageLinkType();
                apxx apxx2;
                if (chatMessageLinkType.b == 3 && ((Boolean) chatMessageLinkType.c).booleanValue()) {
                    apxx2 = (apxx) apxu.d.createBuilder();
                    apxx2.a(ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.connectionInviteUrlEndpoint, ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.a);
                    ysi.f.a((apxu) ((anxl) apxx2.build()), null);
                    return;
                }
                chatMessageLinkType = ((apsk) ysi.i.getEntity()).getChatMessageLinkType();
                if (chatMessageLinkType.b == 4 && ((Boolean) chatMessageLinkType.c).booleanValue()) {
                    apxx2 = (apxx) apxu.d.createBuilder();
                    apgd apgd = (apgd) apge.j.createBuilder();
                    apgd.a("FEconnections");
                    apxx2.a(BrowseEndpointOuterClass.browseEndpoint, (apge) ((anxl) apgd.build()));
                    ysi.f.a((apxu) ((anxl) apxx2.build()), null);
                }
            }
        }
    }
}
