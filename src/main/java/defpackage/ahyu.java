package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: ahyu */
final class ahyu implements Runnable {
    private final /* synthetic */ ahys a;

    ahyu(ahys ahys) {
        this.a = ahys;
    }

    public final void run() {
        if (this.a.g()) {
            Rect a = this.a.d.a();
            int width = a.width();
            int height = a.height();
            ahyo ahyo = this.a.h;
            LayoutParams layoutParams = ahyo.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = ahyo.b();
            }
            layoutParams.width = width;
            layoutParams.height = height;
            ahyo.setLayoutParams(layoutParams);
            for (ahzj ahzj : this.a.i) {
                ajuh ajuh = ahzj.b;
                float f = (float) width;
                float f2 = ajuh.f * f;
                float f3 = f2 / ajuh.h;
                int paddingLeft = ahzj.b().getPaddingLeft();
                int paddingRight = ahzj.b().getPaddingRight();
                int paddingTop = ahzj.b().getPaddingTop();
                int paddingBottom = ahzj.b().getPaddingBottom();
                int round = Math.round(ahzj.b.e * f);
                int round2 = Math.round(ahzj.b.g * ((float) height));
                int round3 = Math.round(f2);
                int round4 = Math.round(f3);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ahzj.b().getLayoutParams();
                layoutParams2.leftMargin = round - paddingLeft;
                layoutParams2.topMargin = round2 - paddingTop;
                layoutParams2.width = (round3 + paddingLeft) + paddingRight;
                layoutParams2.height = (round4 + paddingTop) + paddingBottom;
                ahzj.b().setLayoutParams(layoutParams2);
                TextView textView = ahzj.e;
                if (textView != null) {
                    textView.setMaxLines(f3 > ahzj.f ? 2 : 1);
                }
            }
            ahzw ahzw = this.a.n;
            if (ahzw != null) {
                ahzw.b();
            }
        }
    }
}
