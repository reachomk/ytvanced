package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: abm */
final class abm {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    public WeakReference c = null;
    private SparseArray d = null;

    abm() {
    }

    public final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    static abm a(View view) {
        abm abm = (abm) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (abm != null) {
            return abm;
        }
        abm = new abm();
        view.setTag(R.id.tag_unhandled_key_event_manager, abm);
        return abm;
    }

    public final View a(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View a = a(viewGroup.getChildAt(childCount), keyEvent);
                if (a != null) {
                    return a;
                }
            }
        }
        if (abm.b(view)) {
            return view;
        }
        return null;
    }

    public static boolean b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((abn) arrayList.get(size)).a()) {
                    return true;
                }
            }
        }
        return false;
    }
}
