package defpackage;

import com.google.protos.youtube.api.innertube.ClickLoggingWrapperCommandOuterClass;
import java.util.Map;

/* renamed from: fxm */
public final class fxm implements aaap {
    private final aaas a;
    private final acwa b;

    public fxm(aaas aaas, acwa acwa) {
        this.a = aaas;
        this.b = acwa;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ClickLoggingWrapperCommandOuterClass.clickLoggingWrapperCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(ClickLoggingWrapperCommandOuterClass.clickLoggingWrapperCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            apuh apuh = (apuh) obj;
            if ((apuh.a & 2) != 0) {
                Map a = acwi.a(map, apuh.b);
                aaas aaas = this.a;
                apxu apxu2 = apuh.c;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, a);
            } else if (apuh.b) {
                this.b.t().a(3, new acvs(apxu.b), null);
            }
        }
    }
}
