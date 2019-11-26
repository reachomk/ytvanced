package defpackage;

import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
import java.util.Map;

/* renamed from: aben */
public final class aben implements aaap {
    public final aaas a;
    private final abdx b;

    public aben(abdx abdx, aaas aaas) {
        this.b = (abdx) amqw.a((Object) abdx);
        this.a = aaas;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        Object obj2 = (ajxm) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", ajxm.class);
        if (obj2 == null) {
            xtl.d("recordNotificationServiceEndpointCommand did not have proper tag.");
        }
        abdx abdx = this.b;
        aaml abep = new abep(abdx.c, abdx.d.c());
        anxr access$000 = anxl.checkIsLite(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        abep.a = ((RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint) obj).b.d();
        abep.a(apxu.b);
        abdx.b.a(abep, new abem(this, obj2));
        aaas aaas = this.a;
        if (aaas != null) {
            anxr access$0002 = anxl.checkIsLite(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint);
            apxu.a(access$0002);
            Object b2 = apxu.h.b(access$0002.d);
            if (b2 == null) {
                b2 = access$0002.b;
            } else {
                b2 = access$0002.a(b2);
            }
            aaas.a(((RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint) b2).c, obj2);
        }
    }
}
