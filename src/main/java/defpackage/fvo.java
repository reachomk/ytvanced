package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand;
import java.util.List;
import java.util.Map;

/* renamed from: fvo */
public final class fvo implements aaap {
    private final jjv a;

    public fvo(jjv jjv) {
        this.a = jjv;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand);
        apxu.a(access$000);
        amqw.a(apxu.h.a(access$000.d));
        access$000 = anxl.checkIsLite(MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        axak axak = ((MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand) obj).b;
        if (axak == null) {
            axak = axak.a;
        }
        avef avef = (avef) ajzv.a(ajzv.a(axak), avef.class);
        map = (Map) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", Map.class);
        if (map != null) {
            kjj kjj = (kjj) xsb.a(map, (Object) "multiReelDismissalCallback", kjj.class);
            axak[] axakArr = (axak[]) xsb.a(map, (Object) "reelItemRenderers", axak[].class);
            List list = (List) xsb.a(map, (Object) "reelDismissalInfo", List.class);
            if (axakArr != null && kjj != null && list != null) {
                jjv jjv = this.a;
                aeh aeh = jjv.g;
                if (aeh == null || !aeh.isShowing()) {
                    jjv.d.t().a(acwl.V, apxu, null);
                    jjv.i = list;
                    jjv.h.clear();
                    jjv.f.clear();
                    View a = jjv.a(avef, axakArr, kjj);
                    aeg aeg = new aeg(jjv.a, R.style.MultiReelDismissalDialog);
                    aeg.a(a);
                    jjv.g = aeg.a();
                    jjv.g.show();
                    Window window = jjv.g.getWindow();
                    window.setLayout(-1, -2);
                    LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 17;
                    window.setAttributes(attributes);
                }
            }
        }
    }
}
