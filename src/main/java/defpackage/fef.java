package defpackage;

import com.google.protos.youtube.api.innertube.ShowMealbarActionOuterClass$ShowMealbarAction;
import java.util.Map;

/* renamed from: fef */
public final class fef implements aaap {
    private final fcs a;
    private final acwa b;

    public fef(fcs fcs, acwa acwa) {
        this.a = fcs;
        this.b = acwa;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ShowMealbarActionOuterClass$ShowMealbarAction showMealbarActionOuterClass$ShowMealbarAction = (ShowMealbarActionOuterClass$ShowMealbarAction) b;
            axlu axlu = showMealbarActionOuterClass$ShowMealbarAction.b;
            if (axlu == null) {
                axlu = axlu.c;
            }
            if ((axlu.a & 1) != 0) {
                axlu axlu2 = showMealbarActionOuterClass$ShowMealbarAction.b;
                if (axlu2 == null) {
                    axlu2 = axlu.c;
                }
                auuc auuc = axlu2.b;
                if (auuc == null) {
                    auuc = auuc.p;
                }
                this.a.a(auuc, this.b.t());
            }
        }
    }
}
