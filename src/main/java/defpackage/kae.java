package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: kae */
public final class kae {
    public static void a(View view, GradientDrawable gradientDrawable, int i, Resources resources) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            view.setVisibility(0);
            gradientDrawable.setColor(resources.getColor(R.color.channel_list_sub_menu_avatar_unread));
        } else if (i2 != 2) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
            gradientDrawable.setColor(resources.getColor(R.color.channel_list_sub_menu_avatar_live));
        }
    }
}
