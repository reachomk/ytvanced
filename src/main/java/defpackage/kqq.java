package defpackage;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: kqq */
public final class kqq extends krf {
    private final TextView f;
    private final RatingBar g;
    private final TextView h;
    private final View i;
    private final View j = this.i.findViewById(R.id.icon_text_badge);
    private final ImageView k = ((ImageView) this.j.findViewById(R.id.icon_text_badge_icon));
    private final TextView l = ((TextView) this.j.findViewById(R.id.icon_text_badge_text));

    public kqq(akkq akkq, akvp akvp, akvo akvo, View view, View view2) {
        super(akkq, akvp, akvo, view, view2, false);
        this.f = (TextView) view2.findViewById(R.id.rating_text);
        this.g = (RatingBar) view2.findViewById(R.id.rating_bar);
        this.h = (TextView) view2.findViewById(R.id.price_text);
        this.i = view2.findViewById(R.id.icon_text_badge_layout);
    }

    public final void a(acvx acvx, Object obj, ajym ajym) {
        super.a(acvx, obj, ajym);
        float f = ajym.d;
        int i = ajym.e;
        int i2 = ajym.f;
        CharSequence a = ajqy.a(ajym.n);
        arwi arwi = (arwi) ajzv.a(ajym.g, arwi.class);
        if (f <= 0.0f) {
            this.f.setVisibility(8);
            this.g.setVisibility(8);
        } else {
            if (f > 0.0f && f > 5.0f) {
                f = 5.0f;
            }
            this.f.setText(String.format(Locale.getDefault(), "%1.1f", new Object[]{Float.valueOf(f)}));
            this.f.setVisibility(0);
            this.f.setTextColor(i);
            this.g.setRating(f);
            this.g.setVisibility(0);
            ((LayerDrawable) this.g.getProgressDrawable()).getDrawable(2).setColorFilter(i2, Mode.SRC_ATOP);
        }
        xpr.a(this.h, a);
        if (arwi == null) {
            this.i.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
        } else {
            arml arml;
            arml arml2;
            this.i.setVisibility(0);
            Drawable background = this.j.getBackground();
            if (background instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
                i = arwi.d;
                if (i == 0) {
                    gradientDrawable.setColor(this.j.getResources().getColor(R.color.icon_text_badge_background_color));
                } else {
                    gradientDrawable.setColor(i);
                }
            }
            if ((arwi.a & 1) == 0) {
                this.k.setVisibility(8);
            } else {
                ImageView imageView;
                arml = arwi.c;
                if (arml == null) {
                    arml = arml.f;
                }
                if (arml.b.size() > 0) {
                    imageView = this.k;
                    arml2 = arwi.c;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                    imageView.setColorFilter(((armp) arml2.b.get(0)).i);
                }
                imageView = this.k;
                akvp akvp = this.b;
                arwf arwf = arwi.b;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a2 = arwh.a(arwf.b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp.a(a2));
                this.k.setVisibility(0);
            }
            arml = arwi.c;
            if (arml == null) {
                arml = arml.f;
            }
            Spanned a3 = ajqy.a(arml);
            if (TextUtils.isEmpty(a3)) {
                this.l.setVisibility(8);
                return;
            }
            this.l.setVisibility(0);
            this.l.setText(a3);
            arml = arwi.c;
            if (arml == null) {
                arml = arml.f;
            }
            if (arml.b.size() > 0) {
                TextView textView = this.l;
                arml2 = arwi.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                textView.setTextColor(((armp) arml2.b.get(0)).i);
            }
        }
    }
}
