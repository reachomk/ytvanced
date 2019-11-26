package defpackage;

import android.util.Pair;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: fhj */
final /* synthetic */ class fhj implements bbnp {
    private final fhk a;
    private final Pair b;

    fhj(fhk fhk, Pair pair) {
        this.a = fhk;
        this.b = pair;
    }

    public final void a() {
        fhk fhk = this.a;
        Pair pair = this.b;
        fhp fhp = fhk.b;
        if (fhp != null) {
            View view = (View) pair.first;
            xak.a();
            WeakHashMap weakHashMap = fhp.a;
            if (weakHashMap == null) {
                afpc.a(1, afpf.main, "Views map in ScrollSelectionVisibilityInspector is null.", 0.3d);
            } else if (weakHashMap.containsKey(view)) {
                String.valueOf(view).length();
                fhp.a.put(view, Integer.valueOf(2));
            }
        }
        fhk.a((Integer) pair.second);
    }
}
