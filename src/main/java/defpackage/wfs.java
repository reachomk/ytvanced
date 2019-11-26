package defpackage;

import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import java.util.Map;

/* renamed from: wfs */
public final class wfs implements aaap {
    public final void a(apxu apxu, Map map) {
        wfk wfk = (wfk) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wfk.class);
        anxr access$000 = anxl.checkIsLite(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d) && wfk != null) {
            access$000 = anxl.checkIsLite(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            wfk.a((UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) b);
        }
    }
}
