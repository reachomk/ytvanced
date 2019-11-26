package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: hwn */
public final class hwn {
    static long a(long j, long j2) {
        return TimeUnit.MILLISECONDS.toSeconds((j2 - j) + 999);
    }

    static void a(TextView textView, int i, long j) {
        String l = Long.toString(j);
        String string = textView.getResources().getString(i, new Object[]{Long.valueOf(j)});
        int indexOf = string.indexOf(l);
        SpannableString spannableString = new SpannableString(string);
        if (indexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(xwe.a(textView.getContext(), R.attr.ytOverlayTextPrimary)), indexOf, l.length() + indexOf, 33);
        }
        textView.setText(spannableString);
    }
}
