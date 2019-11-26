package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import java.util.Map;

/* renamed from: aaez */
public final class aaez implements aaap {
    private final Activity a;
    private final aaey b;
    private final amqp c;

    public aaez(Activity activity, aaey aaey, amqp amqp) {
        this.a = activity;
        this.b = aaey;
        this.c = amqp;
    }

    public final void a(apxu apxu, Map map) {
        String str;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                str = ((aoxd) b).b;
                this.b.a(this.a, str);
                return;
            }
        }
        if (this.c.a()) {
            str = ((aafb) this.c.b()).b();
            this.b.a(this.a, str);
            return;
        }
        xtl.c("ApplicationHelpEndpoint resolved with no help context.");
    }
}
