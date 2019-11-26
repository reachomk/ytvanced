package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.facebook.yoga.YogaDirection;

/* renamed from: czi */
final class czi implements OnPreDrawListener {
    private final /* synthetic */ czk a;
    private final /* synthetic */ czj b;
    private final /* synthetic */ YogaDirection c;

    czi(czk czk, czj czj, YogaDirection yogaDirection) {
        this.a = czk;
        this.b = czj;
        this.c = yogaDirection;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int i = this.b.a;
        if (i == -1) {
            if (this.c == YogaDirection.RTL) {
                this.a.fullScroll(66);
            }
            this.b.a = this.a.getScrollX();
        } else {
            this.a.setScrollX(i);
        }
        return true;
    }
}
