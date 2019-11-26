package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

/* renamed from: aoy */
public final class aoy implements amd {
    private final /* synthetic */ RecyclerView a;

    public aoy(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final void a(View view, int i) {
        this.a.addView(view, i);
        RecyclerView recyclerView = this.a;
        RecyclerView.d(view);
        apa apa = recyclerView.m;
        List list = recyclerView.w;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((apq) recyclerView.w.get(size)).a();
                } else {
                    return;
                }
            }
        }
    }

    public final int a(View view) {
        return this.a.indexOfChild(view);
    }

    public final void a(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.i(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }

    public final View b(int i) {
        return this.a.getChildAt(i);
    }

    public final void b() {
        int a = a();
        for (int i = 0; i < a; i++) {
            View b = b(i);
            this.a.i(b);
            b.clearAnimation();
        }
        this.a.removeAllViews();
    }

    public final aqj b(View view) {
        return RecyclerView.d(view);
    }

    public final void a(View view, int i, LayoutParams layoutParams) {
        aqj d = RecyclerView.d(view);
        if (d != null) {
            if (d.n() || d.b()) {
                d.i();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Called attach on a child which is not detached: ");
                stringBuilder.append(d);
                stringBuilder.append(this.a.a());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.a.attachViewToParent(view, i, layoutParams);
    }

    public final void c(int i) {
        View b = b(i);
        if (b != null) {
            aqj d = RecyclerView.d(b);
            if (d != null) {
                if (!d.n() || d.b()) {
                    d.b(256);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("called detach on an already detached child ");
                    stringBuilder.append(d);
                    stringBuilder.append(this.a.a());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        this.a.detachViewFromParent(i);
    }

    public final void c(View view) {
        aqj d = RecyclerView.d(view);
        if (d != null) {
            RecyclerView recyclerView = this.a;
            int i = d.n;
            if (i != -1) {
                d.m = i;
            } else {
                d.m = abe.f(d.a);
            }
            recyclerView.a(d, 4);
        }
    }

    public final void d(View view) {
        aqj d = RecyclerView.d(view);
        if (d != null) {
            this.a.a(d, d.m);
            d.m = 0;
        }
    }
}
