package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: cxz */
public final class cxz {
    public static View a(View view, Object obj) {
        if (!obj.equals(view.getTag())) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View a = cxz.a(viewGroup.getChildAt(i), obj);
                    if (a != null) {
                        return a;
                    }
                }
            }
            view = null;
        }
        return view;
    }
}
