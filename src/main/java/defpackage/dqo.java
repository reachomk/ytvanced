package defpackage;

import com.google.protos.youtube.api.innertube.SignOutEndpointOuterClass;
import java.util.Map;

/* renamed from: dqo */
public final class dqo implements aaap {
    private final afqe a;
    private final uyp b;
    private final aaas c;

    public dqo(afqe afqe, uyp uyp, aaas aaas) {
        this.a = afqe;
        this.b = uyp;
        this.c = aaas;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(SignOutEndpointOuterClass.signOutEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(SignOutEndpointOuterClass.signOutEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            if ((((axnp) obj).a & 2) != 0) {
                access$000 = anxl.checkIsLite(SignOutEndpointOuterClass.signOutEndpoint);
                apxu.a(access$000);
                Object b2 = apxu.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                axnp axnp = (axnp) b2;
                uyp uyp = this.b;
                axnn axnn = axnp.b;
                if (axnn == null) {
                    axnn = axnn.c;
                }
                uyp.a(axnn.b);
                if ((axnp.a & 4) != 0 && this.b.d()) {
                    apxu = axnp.c;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    this.c.a(uzj.a(apxu), map);
                    return;
                }
            }
        }
        this.a.a("User requested sign out.");
    }
}
