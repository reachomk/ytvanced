package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: llu */
public final class llu implements lqn {
    private final List a = new ArrayList();
    private lqk b;
    private View c;

    public final void a(View view) {
        amqw.b(this.c == null);
        this.c = view;
        a();
    }

    public final void b(View view) {
        amqw.b(this.c == view);
        b();
        this.c = null;
    }

    public final void c(View view) {
        this.a.add(view);
        lqk lqk = this.b;
        if (lqk != null && this.c != null) {
            lqk.a(view);
        }
    }

    public final void d(View view) {
        this.a.remove(view);
        lqk lqk = this.b;
        if (lqk != null && this.c != null) {
            lqk.b(view);
        }
    }

    public final void a(float f) {
        lqk lqk = this.b;
        if (lqk != null) {
            lqk.setAlpha(f);
        }
    }

    public final void a(lqk lqk) {
        if (this.b != lqk) {
            b();
            this.b = lqk;
            a();
        }
    }

    private final void a() {
        lqk lqk = this.b;
        if (lqk != null && this.c != null) {
            ((ViewGroup) lqk.e()).addView(this.c);
            for (View a : this.a) {
                this.b.a(a);
            }
        }
    }

    private final void b() {
        lqk lqk = this.b;
        if (lqk != null && this.c != null) {
            ((ViewGroup) lqk.e()).removeView(this.c);
            for (View b : this.a) {
                this.b.b(b);
            }
        }
    }
}
