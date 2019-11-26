package defpackage;

import android.view.View;

/* renamed from: ggh */
public final class ggh {
    public static void a(View view) {
        ggh.a(view, 0);
    }

    public static void a(View view, long j) {
        xpr.a(view, true);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(125).setStartDelay(j);
    }

    public static void a(View view, boolean z) {
        if (view != null) {
            view.setVisibility(!z ? 8 : 0);
        }
    }
}
