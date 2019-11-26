package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ksv */
public final class ksv extends krf {
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final RatingBar i;
    private final ImageView j;
    private final TextView k;

    public ksv(akkq akkq, akvp akvp, akvo akvo, View view, View view2, boolean z) {
        super(akkq, akvp, akvo, view, view2, z);
        this.f = (ImageView) view2.findViewById(R.id.second_thumbnail);
        this.g = (TextView) view2.findViewById(R.id.app_store_text);
        this.h = (TextView) view2.findViewById(R.id.rating_text);
        this.i = (RatingBar) view2.findViewById(R.id.rating);
        this.j = (ImageView) view2.findViewById(R.id.rating_star);
        this.k = (TextView) view2.findViewById(R.id.price);
    }

    public final void a(acvx acvx, Object obj, ajyp ajyp, aviq aviq) {
        a(acvx, obj, ajyp, aviq, null);
    }

    public final void a(acvx acvx, Object obj, ajyp ajyp, aviq aviq, Integer num) {
        ImageView imageView;
        super.a(acvx, obj, ajyp, aviq, num);
        aygk aygk = ajyp.a;
        aygk aygk2 = ajyp.b;
        CharSequence a = ajqy.a(ajyp.f);
        float f = ajyp.g;
        CharSequence a2 = ajqy.a(ajyp.h);
        boolean z = ajyp.u;
        if (aygk == null && aygk2 == null) {
            imageView = this.e;
            imageView.setImageDrawable(ra.a(imageView.getContext(), !z ? R.drawable.native_ad_fallback_thumbnail : R.drawable.native_ad_fallback_square_thumbnail));
            this.e.setVisibility(0);
        } else if (aygk == null) {
            this.e.setVisibility(8);
        }
        if (aygk2 != null) {
            this.a.a(this.f, aygk2);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        if (z) {
            a();
            a(2, 1);
            a(Integer.valueOf(16));
        } else {
            b();
            a(1, 2);
            c();
        }
        TextView textView = this.g;
        if (textView != null) {
            xpr.a(textView, a);
        }
        if (f > 0.0f) {
            float f2 = 5.0f;
            if (f <= 5.0f) {
                f2 = f;
            }
            this.h.setText(String.format("%1.1f", new Object[]{Float.valueOf(f2)}));
            this.h.setVisibility(0);
            RatingBar ratingBar = this.i;
            if (ratingBar != null) {
                ratingBar.setRating(f2);
                this.i.setVisibility(0);
            }
            imageView = this.j;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            this.h.setVisibility(8);
            RatingBar ratingBar2 = this.i;
            if (ratingBar2 != null) {
                ratingBar2.setVisibility(8);
            }
            imageView = this.j;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        xpr.a(this.k, a2);
    }

    private final void a(int i, int i2) {
        krf.a(this.c, i);
        krf.a(this.d, i2);
        krf.a(this.g, i2);
        krf.a(this.h, i2);
        krf.a(this.i, i2);
        krf.a(this.k, i2);
    }
}
