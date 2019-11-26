package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: fhp */
public final class fhp {
    public final WeakHashMap a;
    private final View b;
    private final RecyclerView c;
    private final apn d;
    private final int e;
    private final WeakReference f;
    private xpu g;

    public fhp(View view, fhq fhq) {
        this.b = view;
        this.c = fhq.l();
        RecyclerView recyclerView = this.c;
        this.d = recyclerView != null ? recyclerView.n : null;
        this.e = fhq.k();
        this.f = new WeakReference(fhq);
        this.a = new WeakHashMap();
    }

    public final Pair a(boolean z) {
        WeakReference weakReference = this.f;
        int i = -1;
        if (weakReference != null) {
            fhq fhq = (fhq) weakReference.get();
            if (fhq != null) {
                i = fhq.m();
            }
        }
        this.a.size();
        if (this.g == null) {
            this.g = new xpu();
        }
        Object obj = null;
        float f = 0.0f;
        int i2 = 0;
        for (View view : this.a.keySet()) {
            int b = b(view);
            if (b >= 0) {
                int i3;
                float c;
                int width;
                xpu.a(this.g, view, this.b);
                if (this.e == 0) {
                    i3 = this.g.a.left;
                } else {
                    i3 = this.g.a.top;
                }
                if (this.e == 0) {
                    c = (float) this.g.c();
                    width = this.g.a.width();
                } else {
                    c = (float) this.g.d();
                    width = this.g.a.height();
                }
                c /= (float) width;
                if (c < 0.5f) {
                    this.a.put(view, Integer.valueOf(0));
                } else {
                    if (!z && d(view)) {
                        c += 0.25f;
                    }
                    if (b == i) {
                        c += 0.25f;
                    }
                    String valueOf = String.valueOf(view);
                    String valueOf2 = String.valueOf(this.a.get(view));
                    StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 90) + valueOf2.length());
                    stringBuilder.append("View ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(": videoViewTop = ");
                    stringBuilder.append(i3);
                    stringBuilder.append("; visibilityPercent = ");
                    stringBuilder.append(c);
                    stringBuilder.append("; selection state = ");
                    stringBuilder.append(valueOf2);
                    stringBuilder.toString();
                    float f2 = c - f;
                    if (f2 >= 0.0f && (f2 > 0.1f || (i2 >= 0 && i3 >= 0 && i3 < i2))) {
                        if (!(obj == null || view == obj)) {
                            this.a.put(obj, Integer.valueOf(0));
                        }
                        obj = view;
                        i2 = i3;
                        f = c;
                    } else {
                        this.a.put(view, Integer.valueOf(0));
                    }
                }
            }
        }
        if (!c(obj)) {
            String.valueOf(obj == null ? "null" : obj).length();
            this.a.put(obj, Integer.valueOf(1));
        }
        return new Pair(obj, Integer.valueOf(b(obj)));
    }

    /* Access modifiers changed, original: final */
    public final void a(View view) {
        xak.a();
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            afpc.a(1, afpf.main, "Views map in ScrollSelectionVisibilityInspector is null.", 0.3d);
            return;
        }
        if (weakHashMap.containsKey(view) && c(view)) {
            String.valueOf(view).length();
            this.a.put(view, Integer.valueOf(0));
        }
    }

    public final int b(View view) {
        if (view != null) {
            apn apn = this.d;
            if (apn != null) {
                view = apn.d(view);
                if (view != null) {
                    return RecyclerView.e(view);
                }
            }
        }
        return -1;
    }

    private final boolean c(View view) {
        WeakHashMap weakHashMap = this.a;
        if ((weakHashMap != null && weakHashMap.containsKey(view) && ((Integer) this.a.get(view)).intValue() == 1) || d(view)) {
            return true;
        }
        return false;
    }

    private final boolean d(View view) {
        WeakHashMap weakHashMap = this.a;
        return weakHashMap != null && weakHashMap.containsKey(view) && ((Integer) this.a.get(view)).intValue() == 2;
    }
}
