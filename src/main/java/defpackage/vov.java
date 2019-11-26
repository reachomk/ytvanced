package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vov */
public final class vov implements swd {
    private final aaas a;

    public vov(aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final anwy a() {
        return aqxc.e;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        aqxc aqxc = (aqxc) obj;
        View view = (View) swg.a().c();
        syj syj = (syj) swg.c().c();
        Map hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Object obj2 = null;
        if (swg.d().a() && (swg.d().b() instanceof akeb)) {
            akeb akeb = (akeb) swg.d().b();
            if (akeb.a() != null) {
                obj2 = akeb.a();
            }
            if (akeb.b() != null) {
                arrayList.addAll(akeb.b());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (apxu apxu : aqxc.c) {
            hashMap.clear();
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            if (view != null) {
                vqx vqx = new vqx(view);
                if (syj != null) {
                    vqx.a((int) syj.a, (int) syj.b);
                }
                arrayList2.add(vqx);
            } else {
                afpc.a(2, afpf.elements, "The command has no view set in its event data. Please use a command property that satisfies this. https://goto.google.com/cmdprops-android");
            }
            if (obj2 != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj2);
            }
            if (!arrayList2.isEmpty()) {
                hashMap.put("MacrosConverters.CustomConvertersKey", arrayList2.toArray(new aftl[arrayList2.size()]));
            }
            this.a.a(apxu, hashMap);
        }
        return bblt.a();
    }
}
