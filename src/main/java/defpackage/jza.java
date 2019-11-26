package defpackage;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.apps.youtube.app.common.widget.ActiveItemIndicatorView;
import com.google.android.youtube.R;

/* renamed from: jza */
final class jza implements jyw {
    public final ActiveItemIndicatorView a;
    private final Context b;
    private ajry c;

    jza(Context context, ActiveItemIndicatorView activeItemIndicatorView) {
        this.b = context;
        this.a = activeItemIndicatorView;
    }

    public final void a(ajry ajry) {
        int i;
        this.c = ajry;
        ajry = this.c;
        ajsa[] ajsaArr = ajry.a;
        int length = ajsaArr != null ? ajsaArr.length : 0;
        ajsa[] ajsaArr2 = (ajsa[]) ajry.getExtension(ajrx.c);
        if (ajsaArr2 != null) {
            i = length;
            for (ajsa ajsa : ajsaArr2) {
                if (ajsa != null) {
                    i--;
                }
            }
            length = i;
        }
        if (length > 0) {
            ActiveItemIndicatorView activeItemIndicatorView = this.a;
            activeItemIndicatorView.b = length;
            float[] fArr = activeItemIndicatorView.a;
            if (fArr == null || fArr.length != length + length) {
                activeItemIndicatorView.a = new float[(length + length)];
            }
            LayoutParams layoutParams = (LayoutParams) activeItemIndicatorView.getLayoutParams();
            length = this.c.g;
            i = length - 1;
            if (length != 0) {
                if (i != 1) {
                    layoutParams.gravity = 8388693;
                    layoutParams.setMarginEnd(this.b.getResources().getDimensionPixelSize(R.dimen.promo_panel_text_layout_start_end_margin));
                    this.a.a(1);
                } else {
                    layoutParams.gravity = 81;
                    layoutParams.setMarginEnd(0);
                    this.a.a(2);
                }
                this.a.setLayoutParams(layoutParams);
                return;
            }
            throw null;
        }
        a(false);
    }

    public final void a(int i) {
        ActiveItemIndicatorView activeItemIndicatorView = this.a;
        if (i < 0 || i >= activeItemIndicatorView.b) {
            throw new IllegalStateException("Selections not within bounds");
        }
        activeItemIndicatorView.c = i;
        activeItemIndicatorView.b();
        activeItemIndicatorView.invalidate();
    }

    public final void a(boolean z) {
        xpr.a(this.a, z);
    }

    public final int a() {
        return this.a.a();
    }
}
