package defpackage;

import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint;
import java.util.List;
import java.util.Map;

/* renamed from: aawr */
public class aawr implements aaap {
    private static final aawv f = aawq.a;
    private static final aawu g = aawt.a;
    public final xci a;
    public final aaas b;
    public final aawv c;
    public final aawu d;
    public final xoi e;
    private final aawz h;

    public aawr(aawz aawz, xci xci, xoi xoi, aaas aaas) {
        this(aawz, xci, aaas, f, g, xoi);
    }

    public aawr(aawz aawz, xci xci, aaas aaas, aawv aawv, aawu aawu, xoi xoi) {
        this.h = (aawz) amqw.a((Object) aawz);
        this.a = (xci) amqw.a((Object) xci);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (aawv) amqw.a((Object) aawv);
        this.d = (aawu) amqw.a((Object) aawu);
        this.e = xoi;
    }

    public final void a(apxu apxu, Map map) {
        Object b;
        arjq arjq;
        anxr access$000;
        Object b2;
        String str;
        aawz aawz = this.h;
        aaml aaxa = new aaxa(aawz.c, aawz.d.c());
        anxr access$0002 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d)) {
            Object obj;
            access$0002 = anxl.checkIsLite(FeedbackEndpointOuterClass.feedbackEndpoint);
            apxu.a(access$0002);
            b = apxu.h.b(access$0002.d);
            if (b == null) {
                obj = access$0002.b;
            } else {
                obj = access$0002.a(b);
            }
            arjq = (arjq) obj;
        } else {
            arjq = null;
        }
        if (arjq == null) {
            access$000 = anxl.checkIsLite(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.undoFeedbackEndpoint);
            apxu.a(access$000);
            b2 = apxu.h.b(access$000.d);
            if (b2 == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b2);
            }
            str = ((UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint) b).b;
        } else {
            str = arjq.b;
        }
        aaxa.c(str);
        List<String> list = (List) xsb.a(map, (Object) "feedback_token", List.class);
        if (list != null) {
            for (String c : list) {
                aaxa.c(c);
            }
        }
        Boolean valueOf = Boolean.valueOf(false);
        if (((Boolean) xsb.c(map, "feedback_merge_token", valueOf)).booleanValue()) {
            aaxa.c = Boolean.valueOf(true);
        }
        if (((Boolean) xsb.c(map, "feedback_unencrypted", valueOf)).booleanValue()) {
            aaxa.b = Boolean.valueOf(true);
        }
        if (arjq != null) {
            aaxa.a = arjq.d;
        }
        access$000 = anxl.checkIsLite(axft.b);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(axft.b);
            apxu.a(access$000);
            b2 = apxu.h.b(access$000.d);
            if (b2 == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b2);
            }
            axfr axfr = (axfr) b;
            if (!axfr.b.isEmpty()) {
                aaxa.a(axfr.b);
            }
        }
        aaxa.a(aabc.a(apxu).d());
        this.a.d(new aaww(apxu, xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        aawz aawz2 = this.h;
        aawz2.a.a(aaxa, new aaws(this, apxu, map, arjq));
    }
}
