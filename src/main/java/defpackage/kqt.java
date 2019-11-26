package defpackage;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: kqt */
public final class kqt {
    public static void a(TextView textView, RatingBar ratingBar, float f, int i, int i2) {
        if (!(textView == null || ratingBar == null)) {
            if (f <= 0.0f) {
                textView.setVisibility(8);
                ratingBar.setVisibility(8);
                return;
            }
            if (f > 5.0f) {
                f = 5.0f;
            }
            textView.setText(String.format(Locale.getDefault(), "%1.1f", new Object[]{Float.valueOf(f)}));
            textView.setVisibility(0);
            textView.setTextColor(i);
            ratingBar.setRating(f);
            ratingBar.setVisibility(0);
            ((LayerDrawable) ratingBar.getProgressDrawable()).getDrawable(2).setColorFilter(i2, Mode.SRC_ATOP);
        }
    }

    public static void a(TextView textView, Spanned spanned) {
        if (textView != null) {
            xpr.a(textView, (CharSequence) spanned);
        }
    }

    public static void a(ImageView imageView, aygk aygk, akkq akkq) {
        if (imageView == null || aygk == null) {
            imageView.setVisibility(8);
            return;
        }
        akkq.a(imageView, aygk);
        imageView.setVisibility(0);
    }
}
