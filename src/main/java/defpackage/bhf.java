package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: bhf */
public final class bhf {
    public static ArrayList a = new ArrayList();
    private static bgx b = new bfj();
    private static ThreadLocal c = new ThreadLocal();

    static zj a() {
        zj zjVar;
        WeakReference weakReference = (WeakReference) c.get();
        if (weakReference != null) {
            zjVar = (zj) weakReference.get();
            if (zjVar != null) {
                return zjVar;
            }
        }
        zjVar = new zj();
        c.set(new WeakReference(zjVar));
        return zjVar;
    }

    public static void a(ViewGroup viewGroup, bgx bgx) {
        if (!a.contains(viewGroup) && abe.D(viewGroup)) {
            a.add(viewGroup);
            if (bgx == null) {
                bgx = b;
            }
            bgx = (bgx) bgx.clone();
            ArrayList arrayList = (ArrayList) bhf.a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((bgx) arrayList.get(i)).e(viewGroup);
                }
            }
            if (bgx != null) {
                bgx.a(viewGroup, true);
            }
            bgu a = bgu.a(viewGroup);
            if (a != null && bgu.a(a.a) == a) {
                Runnable runnable = a.b;
                if (runnable != null) {
                    runnable.run();
                }
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (bgx != null) {
                bhe bhe = new bhe(bgx, viewGroup);
                viewGroup.addOnAttachStateChangeListener(bhe);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(bhe);
            }
        }
    }

    public static void a(ViewGroup viewGroup) {
        a.remove(viewGroup);
        ArrayList arrayList = (ArrayList) bhf.a().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((bgx) arrayList2.get(size)).a(viewGroup);
                } else {
                    return;
                }
            }
        }
    }
}
