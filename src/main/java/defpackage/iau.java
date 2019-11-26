package defpackage;

import android.content.res.Resources;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: iau */
public final class iau implements ejc {
    public final eif a;
    public final bcud b;
    public final acvx c;
    public final xxd d;
    public final ImageView e;

    iau(eif eif, bcud bcud, acvx acvx, xxd xxd, ImageView imageView) {
        this.a = eif;
        this.b = bcud;
        this.c = acvx;
        this.d = xxd;
        this.e = imageView;
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean g = ejd.g();
        boolean g2 = ejd2.g();
        if (g != g2) {
            if (g2) {
                b();
            } else {
                a();
            }
        }
        boolean a = ejd.a();
        boolean a2 = ejd2.a();
        if (a != a2) {
            a(a2);
        }
    }

    public final void a(boolean z) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources = this.e.getResources();
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_horiz_padding);
        if (z) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_top_padding_fullscreen);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_top_padding);
        }
        if (z) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_bottom_padding_fullscreen);
        } else {
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.controls_overlay_collapse_button_bottom_padding);
        }
        this.e.setPaddingRelative(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2);
    }

    public final void a() {
        this.e.setImageResource(R.drawable.ic_chevron);
        ImageView imageView = this.e;
        imageView.setContentDescription(imageView.getResources().getString(R.string.accessibility_collapse));
    }

    public final void b() {
        this.e.setImageResource(R.drawable.ic_collapse_white_24);
        ImageView imageView = this.e;
        imageView.setContentDescription(imageView.getResources().getString(R.string.accessibility_dismiss_chat_video));
    }
}
