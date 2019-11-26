package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import com.google.android.youtube.R;

/* renamed from: atg */
public abstract class atg {
    private static final Interpolator a = new atf();
    private static final Interpolator b = new ati();
    private int c = -1;

    public static int a(int i, int i2) {
        int i3 = i & 789516;
        if (i3 == 0) {
            return i;
        }
        i &= i3 ^ -1;
        if (i2 != 0) {
            i3 += i3;
            i |= -789517 & i3;
            i2 = (i3 & 789516) << 2;
        } else {
            i2 = i3 << 2;
        }
        return i | i2;
    }

    public static int b(int i, int i2) {
        return i2 << (i << 3);
    }

    public static int c(int i, int i2) {
        int i3 = i & 3158064;
        if (i3 == 0) {
            return i;
        }
        i &= i3 ^ -1;
        if (i2 != 0) {
            i2 = i3 >> 1;
            i |= -3158065 & i2;
            i2 = (i2 & 3158064) >> 2;
        } else {
            i2 = i3 >> 2;
        }
        return i | i2;
    }

    public abstract int a(RecyclerView recyclerView, aqj aqj);

    public void a(aqj aqj) {
        throw null;
    }

    public boolean a() {
        throw null;
    }

    public boolean a(RecyclerView recyclerView, aqj aqj, aqj aqj2) {
        throw null;
    }

    public boolean b() {
        throw null;
    }

    public abstract boolean b(RecyclerView recyclerView, aqj aqj, aqj aqj2);

    public abstract void c();

    /* Access modifiers changed, original: final */
    public final int b(RecyclerView recyclerView, aqj aqj) {
        return atg.c(a(recyclerView, aqj), abe.g(recyclerView));
    }

    public final boolean c(RecyclerView recyclerView, aqj aqj) {
        return (b(recyclerView, aqj) & 16711680) != 0;
    }

    public static void b(aqj aqj) {
        ato.a.a(aqj.a);
    }

    public static void a(RecyclerView recyclerView, aqj aqj, float f, float f2, boolean z) {
        ato.a.a(recyclerView, aqj.a, f, f2, z);
    }

    public final int a(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.c;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.c = i3;
        }
        int abs = Math.abs(i2);
        float f = ((float) abs) / ((float) i);
        float f2 = 1.0f;
        abs = (int) (((float) (((int) Math.signum((float) i2)) * i3)) * b.getInterpolation(Math.min(1.0f, f)));
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        abs = (int) (((float) abs) * a.getInterpolation(f2));
        if (abs != 0) {
            return abs;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }
}
