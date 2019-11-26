package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ihl */
final class ihl implements OnClickListener {
    private final /* synthetic */ ihm a;

    ihl(ihm ihm) {
        this.a = ihm;
    }

    public final void onClick(View view) {
        Object obj = this.a.h;
        if (obj != null) {
            apxr apxr = ((apxp) obj).c;
            if (apxr == null) {
                apxr = apxr.g;
            }
            anxp anxp = apxr.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                apxr = ((apxp) this.a.h).c;
                if (apxr == null) {
                    apxr = apxr.g;
                }
                anxp = apxr.b;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                anxp.a(access$000);
                obj = anxp.h.b(access$000.d);
                if (obj == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(obj);
                }
                obj = (aohe) obj;
                List arrayList = new ArrayList(obj.k);
                if ((obj.a & 256) != 0) {
                    Object obj2 = obj.j;
                    if (obj2 == null) {
                        obj2 = apxu.d;
                    }
                    arrayList.add(obj2);
                }
                this.a.a(obj, arrayList);
            }
        }
    }
}
