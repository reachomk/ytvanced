package defpackage;

import com.google.protos.youtube.api.innertube.AdFeedbackEndpointOuterClass$AdFeedbackEndpoint;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import java.util.List;

/* renamed from: aaar */
public final class aaar {
    private static final List a = amul.a(avjd.b, axft.b);

    public static Object a(apxu apxu) {
        Object b;
        anxr access$000 = anxl.checkIsLite(PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                return b;
            }
        }
        anxo anxo = null;
        for (anwy anwy : a) {
            anxr access$0002 = anxl.checkIsLite(anwy);
            apxu.a(access$0002);
            if (apxu.h.a(access$0002.d)) {
                if (anxo == null) {
                    anxo = (apxx) ((anxo) apxu.toBuilder());
                }
                anxo.c(anwy);
            }
        }
        anxl anxl = anxo != null ? (apxu) ((anxl) anxo.build()) : apxu;
        if (!anxl.equals(apxu.d)) {
            try {
                access$000 = anxl.checkIsLite(anxa.c().a(apxu.d, anzg.a(anxl)));
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                return b;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
