package defpackage;

import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: kqs */
public final class kqs {
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
