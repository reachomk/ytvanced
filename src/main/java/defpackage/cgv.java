package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: cgv */
final class cgv implements OnPreDrawListener {
    private final WeakReference a;

    cgv(cgw cgw) {
        this.a = new WeakReference(cgw);
    }

    public final boolean onPreDraw() {
        cgw cgw = (cgw) this.a.get();
        if (!(cgw == null || cgw.b.isEmpty())) {
            int c = cgw.c();
            int b = cgw.b();
            if (cgw.a(c, b)) {
                ArrayList arrayList = new ArrayList(cgw.b);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((cgr) arrayList.get(i)).a(c, b);
                }
                cgw.a();
            }
        }
        return true;
    }
}
