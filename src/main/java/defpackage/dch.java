package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.ComponentTree;

/* renamed from: dch */
final class dch extends apv {
    public dcb a;
    public apn b;
    private final czb c;
    private View d;
    private int e = -1;

    dch(czb czb) {
        this.c = czb;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        int d = this.c.d();
        if (d != -1) {
            i2 = d;
            while (i2 >= 0) {
                if (this.c.a(i2)) {
                    break;
                }
                i2--;
            }
            i2 = -1;
            ComponentTree c = this.c.c(d);
            View view = this.d;
            if (!(view == null || c == null || view == c.getLithoView())) {
                this.d.setTranslationY(0.0f);
                this.d = null;
            }
            if (i2 == -1 || c == null) {
                this.a.b();
                this.e = -1;
            } else if (d == i2) {
                cpq lithoView = c.getLithoView();
                i2++;
                if (!(this.c.b(i2) && this.c.a(i2))) {
                    lithoView.setTranslationY((float) (-lithoView.getTop()));
                }
                this.d = lithoView;
                this.a.b();
                this.e = -1;
            } else {
                int i3 = 0;
                if (this.a.l.getVisibility() == 8 || i2 != this.e) {
                    ComponentTree c2 = this.c.c(i2);
                    cpq lithoView2 = c2.getLithoView();
                    if (!(lithoView2 == null || lithoView2.getWindowToken() == null)) {
                        lithoView2.onStartTemporaryDetach();
                    }
                    dcb dcb = this.a;
                    if (c2.getLithoView() != null) {
                        cpq lithoView3 = c2.getLithoView();
                        lithoView3.B = lithoView3.t;
                    }
                    dcb.l.a(c2);
                    dcb.c(dcb.getWidth());
                    dcb dcb2 = this.a;
                    dcb2.l.setVisibility(0);
                    dcb2.l.m();
                }
                i = this.c.i_();
                while (d <= i) {
                    if (this.c.a(d)) {
                        i3 = Math.min((this.b.c(d).getTop() - this.a.l.getBottom()) + this.a.getPaddingTop(), 0);
                        break;
                    }
                    d++;
                }
                this.a.l.setTranslationY((float) i3);
                this.e = i2;
            }
        }
    }
}
