package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.SurveyEndpointOuterClass$SurveyEndpoint;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.Map;

/* renamed from: eaa */
public final class eaa implements aaap {
    private final fcb a;

    public eaa(fcb fcb) {
        this.a = (fcb) amqw.a((Object) fcb);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(LiveChatAction.showLiveChatSurveyCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        auca auca = (auca) obj;
        anxp anxp = auca.b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(SurveyRenderer.surveyTriggerRenderer);
        anxp.a(access$0002);
        Object b2;
        fcb fcb;
        aybc aybc;
        if (anxp.h.a(access$0002.d)) {
            anxp anxp2 = auca.b;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$000 = anxl.checkIsLite(SurveyRenderer.surveyTriggerRenderer);
            anxp2.a(access$000);
            b2 = anxp2.h.b(access$000.d);
            if (b2 == null) {
                b2 = access$000.b;
            } else {
                b2 = access$000.a(b2);
            }
            aybe aybe = (aybe) b2;
            if ((aybe.a & 16) != 0) {
                fcb = this.a;
                aybc = aybe.e;
                if (aybc == null) {
                    aybc = aybc.f;
                }
                fcb.a(aybc);
                return;
            }
            return;
        }
        access$000 = anxl.checkIsLite(SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            fcb = this.a;
            anxr access$0003 = anxl.checkIsLite(SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint);
            apxu.a(access$0003);
            b2 = apxu.h.b(access$0003.d);
            if (b2 == null) {
                b2 = access$0003.b;
            } else {
                b2 = access$0003.a(b2);
            }
            aybc = ((SurveyEndpointOuterClass$SurveyEndpoint) b2).b;
            if (aybc == null) {
                aybc = aybc.f;
            }
            fcb.a(aybc);
        }
    }
}
