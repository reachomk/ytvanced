package defpackage;

import com.google.protos.youtube.api.innertube.SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: eag */
public final class eag implements aaap {
    private final xcx a;

    public eag(xcx xcx) {
        this.a = xcx;
    }

    public final void a(apxu apxu, Map map) {
        String str = (String) xsb.a(map, (Object) "SilentSubmitUserFeedbackCommandResolver.DESCRIPTION_KEY", String.class);
        if (str != null && str.length() != 0) {
            anxr access$000 = anxl.checkIsLite(SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.silentSubmitUserFeedbackCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand = (SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand) b;
            Map hashMap = new HashMap();
            for (Entry entry : Collections.unmodifiableMap(silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.c).entrySet()) {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
            thq thq = (thq) this.a.b.get();
            thx thx = (thx) this.a.c.get();
            thx.b(str);
            thx.c(silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.b);
            thx.a(thq.a());
            thx.a(hashMap);
            thq.a(thx.a());
        }
    }
}
