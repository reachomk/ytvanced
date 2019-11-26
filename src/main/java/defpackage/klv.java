package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: klv */
public final class klv {
    public static List a(akor akor, Object obj, List list, akpb akpb, xrg xrg, SwipeLayout swipeLayout) {
        if (xrg != null) {
            xrg.a.add(swipeLayout);
        }
        swipeLayout.c();
        if (list.size() == 0) {
            return null;
        }
        akor akor2 = new akor(akor);
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        akor2.a(hashMap);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            aphg aphg = (aphg) list.get(i);
            if (aphg != null) {
                Object kls = new kls(aphg);
                akot a = akoz.a(akpb, kls, null);
                if (a != null) {
                    akoz.a(a.K_(), a, akpb.a(kls));
                    a.a_(akor2, kls);
                    arrayList.add(a.K_());
                    if (list2 == null) {
                        list2 = new ArrayList();
                    }
                    list2.add(a);
                }
            }
        }
        xrh.a(swipeLayout, arrayList);
        return list2;
    }

    public static void a(xrg xrg, SwipeLayout swipeLayout, List list, akpb akpb) {
        if (list != null) {
            for (akot K_ : list) {
                View K_2 = K_.K_();
                if (K_2.getParent() != null) {
                    ((ViewGroup) K_2.getParent()).removeView(K_2);
                }
                akpb.a(K_2);
            }
            list.clear();
        }
        if (xrg != null) {
            xrg.a.remove(swipeLayout);
        }
        xrh.a(swipeLayout, Collections.emptyList());
    }
}
