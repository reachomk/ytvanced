package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: log */
public final class log {
    public final View a;
    public final int b;
    public final int c;
    public final lok d;
    public final loh e;
    public lof f;

    public log(View view, int i, int i2, lla lla, lla lla2, loh loh) {
        lla b = lkv.b(lla);
        lla b2 = lkv.b(lla2);
        lpl lpl = (lpl) ((SparseArray) lol.a.get()).get(i | i2);
        if (lpl != null) {
            lok a = lpl.a(view, i, b, i2, b2);
            a.a(0.0f);
            this(view, i, i2, a, loh);
            return;
        }
        throw new IllegalArgumentException("Unsupported transition.");
    }

    public log(View view, int i, int i2, lok lok, loh loh) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = lok;
        this.e = loh;
        lok.a(0.0f);
    }

    public final int a(int i) {
        int centerY;
        lok lok = this.d;
        Rect i2 = ((lom) lok.a.get(0)).a.i();
        List list = lok.a;
        Rect i3 = ((lom) list.get(list.size() - 1)).a.i();
        if (i == 1) {
            i = i2.centerY();
            centerY = i3.centerY();
        } else {
            i = i2.centerX();
            centerY = i3.centerX();
        }
        return centerY - i;
    }

    public final void a(float f) {
        lok lok = this.d;
        if (f != lok.c) {
            lok.a(f);
            loh loh = this.e;
            if (loh != null) {
                loh.a(this.b, this.c, f);
            }
        }
    }

    public final void a(float f, loi loi) {
        if (!a()) {
            int i = this.b;
            int i2 = this.c;
            Object obj = null;
            if ((lol.a(i) == 2 && lol.a(i2) == 1) || (lol.a(i) == 1 && lol.a(i2) == 2)) {
                obj = 1;
            }
            this.f = new lof(this, (long) ((int) (((float) ((long) this.a.getContext().getResources().getInteger(obj == null ? R.integer.next_gen_watch_transition_animation_duration_ms : R.integer.next_gen_watch_min_max_transition_animation_duration_ms))) * (1.0f - f))), f, loi);
            this.f.a.start();
        }
    }

    public final boolean a() {
        return this.f != null;
    }

    public final void b() {
        lof lof = this.f;
        if (lof != null) {
            lof.b = true;
            lof.a.cancel();
            this.f = null;
        }
    }
}
