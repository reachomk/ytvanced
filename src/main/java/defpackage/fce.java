package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fce */
final class fce implements feb {
    private final /* synthetic */ fdl a;
    private final /* synthetic */ fcb b;

    fce(fcb fcb, fdl fdl) {
        this.b = fcb;
        this.a = fdl;
    }

    public final void a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                arjp arjp = (arjp) ((anxo) ((arjq) obj).toBuilder());
                if (TextUtils.isEmpty(this.a.m())) {
                    arjp.a();
                } else {
                    arjp.a(this.a.m());
                }
                apxx apxx = (apxx) ((anxo) apxu.toBuilder());
                apxx.a(FeedbackEndpointOuterClass.feedbackEndpoint, (arjq) ((anxl) arjp.build()));
                apxu = (apxu) ((anxl) apxx.build());
            }
            this.b.a.a(apxu, null);
        }
    }

    public final void a(List list) {
        if (!list.isEmpty()) {
            apxu apxu = (apxu) list.get(0);
            anxr access$000 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
            apxu.a(access$000);
            Map map = null;
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                arjp arjp = (arjp) ((anxo) ((arjq) obj).toBuilder());
                if (TextUtils.isEmpty(this.a.m())) {
                    arjp.a();
                } else {
                    arjp.a(this.a.m());
                }
                apxx apxx = (apxx) ((anxo) apxu.toBuilder());
                apxx.a(FeedbackEndpointOuterClass.feedbackEndpoint, (arjq) ((anxl) arjp.build()));
                apxu = (apxu) ((anxl) apxx.build());
                if (list.size() > 1) {
                    map = new HashMap();
                    ArrayList arrayList = new ArrayList(list.size() - 1);
                    for (int i = 1; i < list.size(); i++) {
                        apxu apxu2 = (apxu) list.get(i);
                        anxr access$0002 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
                        apxu2.a(access$0002);
                        Object b2 = apxu2.h.b(access$0002.d);
                        if (b2 == null) {
                            b2 = access$0002.b;
                        } else {
                            b2 = access$0002.a(b2);
                        }
                        arrayList.add(((arjq) b2).b);
                    }
                    map.put("feedback_merge_token", Boolean.valueOf(true));
                    map.put("feedback_token", arrayList);
                }
            }
            this.b.a.a(apxu, map);
        }
    }
}
