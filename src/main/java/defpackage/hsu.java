package defpackage;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import java.util.Collection;

/* renamed from: hsu */
public final class hsu {
    public static long a(Collection collection) {
        long j = 0;
        for (agqy agqy : collection) {
            if (agqy.n()) {
                j += agqy.h();
            }
        }
        return j;
    }

    public static String a(Context context, CharSequence charSequence, long j) {
        String valueOf = String.valueOf(charSequence);
        String b = xvd.b(context.getResources(), j);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 3) + String.valueOf(b).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(" • ");
        stringBuilder.append(b);
        return stringBuilder.toString();
    }

    public static OnGlobalLayoutListener a(TextView textView, TextView textView2) {
        return new hst(textView, textView2);
    }
}
