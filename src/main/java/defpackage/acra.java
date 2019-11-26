package defpackage;

import android.content.Context;
import android.widget.Button;
import com.google.android.youtube.R;

/* renamed from: acra */
public final class acra {
    public static boolean a(Context context, Button button, int i) {
        int i2 = i - 1;
        Integer num = null;
        if (i != 0) {
            Integer valueOf;
            if (i2 == 2) {
                num = Integer.valueOf(R.drawable.lc_button_style_primary);
                valueOf = Integer.valueOf(R.color.lc_button_style_primary_text);
            } else if (i2 == 3) {
                num = Integer.valueOf(R.drawable.lc_button_style_destructive);
                valueOf = Integer.valueOf(R.color.lc_button_style_destructive_text);
            } else if (i2 == 13) {
                num = Integer.valueOf(R.drawable.lc_button_style_light_text);
                valueOf = Integer.valueOf(R.color.lc_button_style_blue_text);
            } else if (i2 != 15) {
                valueOf = null;
            } else {
                num = Integer.valueOf(R.drawable.lc_button_style_light_text);
                valueOf = Integer.valueOf(R.color.lc_button_style_light_text_text);
            }
            if (num == null || valueOf == null) {
                return false;
            }
            button.setBackground(ra.a(context, num.intValue()));
            button.setTextColor(ra.c(context, valueOf.intValue()));
            return true;
        }
        throw null;
    }
}
