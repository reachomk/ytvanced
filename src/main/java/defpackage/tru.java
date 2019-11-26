package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: tru */
public final class tru {
    private static final Map a = Collections.synchronizedMap(new WeakHashMap());

    public static trs a(View view) {
        if (view == null) {
            return null;
        }
        if (!a.containsKey(view)) {
            Object tag = view.getTag(R.id.visual_element_view_tag);
            if (tag == null || !(tag instanceof Integer)) {
                tag = view.getTag();
                if (tag == null || !(tag instanceof String)) {
                    a.put(view, null);
                } else {
                    a.put(view, trs.a((String) tag));
                }
            } else {
                a.put(view, new trs(((Integer) tag).intValue()));
            }
        }
        return (trs) a.get(view);
    }

    public static void a(View view, trs trs) {
        a.put(view, trs);
    }

    public static trv b(View view) {
        List arrayList;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            arrayList = new ArrayList(viewGroup.getChildCount());
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(tru.b(viewGroup.getChildAt(i)));
            }
        } else {
            arrayList = Collections.emptyList();
        }
        return trv.a(tru.a(view), arrayList);
    }
}
