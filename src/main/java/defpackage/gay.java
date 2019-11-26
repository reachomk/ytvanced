package defpackage;

import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: gay */
final /* synthetic */ class gay implements OnGlobalLayoutListener {
    private final gaz a;

    gay(gaz gaz) {
        this.a = gaz;
    }

    public final void onGlobalLayout() {
        gaz gaz = this.a;
        gaz.a.getWindowVisibleDisplayFrame(gaz.c);
        int i = gaz.c.bottom;
        if (i != gaz.f) {
            boolean z = i == gaz.e;
            gaz.g = z;
            if (z) {
                if (gaz.h) {
                    gaz.a.getViewTreeObserver().removeOnGlobalLayoutListener(gaz.b);
                } else {
                    gba gba = gaz.d;
                    if (gba != null) {
                        gba.a();
                    }
                }
            }
            LayoutParams layoutParams = gaz.a.getLayoutParams();
            int[] iArr = new int[2];
            gaz.a.getLocationOnScreen(iArr);
            layoutParams.height = i - iArr[1];
            gaz.a.setLayoutParams(layoutParams);
            gaz.f = i;
        }
    }
}
