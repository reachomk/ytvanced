package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: jkc */
final class jkc extends bik {
    private final /* synthetic */ jjy b;

    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public final int c() {
        return this.b.c.size();
    }

    public final Object a(ViewGroup viewGroup, int i) {
        jjy jjy = this.b;
        View view = (View) jjy.c.get(jjy.b.c(i));
        this.b.b.addView(view, 0);
        return view;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        this.b.b.removeView((View) obj);
    }

    public final int b(Object obj) {
        for (int i = 0; i < this.b.c.size(); i++) {
            if (((View) this.b.c.get(i)) == obj) {
                return this.b.b.c(i);
            }
        }
        return -2;
    }

    /* synthetic */ jkc(jjy jjy) {
        this.b = jjy;
    }
}
