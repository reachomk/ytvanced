package defpackage;

import com.google.protos.youtube.api.innertube.RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;
import java.util.Map;

/* renamed from: dzm */
public final class dzm implements aaap {
    public final aaas a;
    public final xoi b;
    private final abdx c;

    public dzm(abdx abdx, aaas aaas, xoi xoi) {
        this.c = (abdx) amqw.a((Object) abdx);
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (xoi) amqw.a((Object) xoi);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        abdx abdx = this.c;
        anxr access$000 = anxl.checkIsLite(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aaml abeo = new abeo(abdx.c, abdx.d.c(), ((RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint) obj).b);
        abeo.a(apxu.b);
        abdx abdx2 = this.c;
        abdx2.h.a(abeo, new dzl(this));
    }
}
