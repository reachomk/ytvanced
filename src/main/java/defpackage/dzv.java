package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ShowTooltipCommandOuterClass;
import java.util.Map;

/* renamed from: dzv */
public final class dzv implements aaap {
    private final wev a;
    private final acwa b;
    private final alcb c;

    public dzv(wev wev, acwa acwa, alcb alcb) {
        this.a = wev;
        this.b = acwa;
        this.c = alcb;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowTooltipCommandOuterClass.showTooltipCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        axnb axnb = (axnb) b;
        if ((axnb.a & 1) != 0) {
            ajzw a;
            Object c = xsb.c(map, "hint_anchor_tag");
            if ((axnb.a & 1) != 0) {
                axak axak = axnb.b;
                if (axak == null) {
                    axak = axak.a;
                }
                a = ajzv.a(axak);
            } else {
                a = null;
            }
            b = ajzv.b(a);
            if ((b instanceof aruh) && (c instanceof View)) {
                this.a.a((aruh) b, (View) c, xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.b.t());
            } else if (b instanceof ayhz) {
                this.c.a((ayhz) b, dzy.a);
            }
        }
    }
}
