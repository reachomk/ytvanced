package defpackage;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gsa */
public final class gsa {
    public static void a(TextView textView, armh armh) {
        if (textView != null) {
            if (!(armh == null || (armh.a & 1) == 0)) {
                int a = armf.a(armh.c);
                if (a != 0 && a == 3) {
                    apfb apfb = armh.b;
                    if (apfb == null) {
                        apfb = apfb.f;
                    }
                    Spannable spannableString = new SpannableString(textView.getText().toString());
                    gsa.a(spannableString, new StyleSpan(1));
                    gsa.a(spannableString, new ForegroundColorSpan(apfb.c));
                    textView.setText(spannableString);
                    Drawable a2 = ra.a(textView.getContext(), (int) R.drawable.badge_decorator_pill);
                    a2.setColorFilter(apfb.b, Mode.SRC_IN);
                    textView.setBackground(a2);
                    return;
                }
            }
            textView.setPadding(0, 0, 0, 0);
            textView.setBackground(null);
            textView.setText(textView.getText().toString());
        }
    }

    private static void a(Spannable spannable, Object obj) {
        spannable.setSpan(obj, 0, spannable.length(), 33);
    }
}
