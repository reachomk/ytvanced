package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import java.util.List;

/* renamed from: xrh */
public final class xrh {
    public static void a(SwipeLayout swipeLayout, List list) {
        amqw.a((Object) swipeLayout);
        amqw.a((Object) list);
        if (swipeLayout.g != null || !list.isEmpty()) {
            if (!(swipeLayout.g instanceof LinearLayout)) {
                View linearLayout = new LinearLayout(swipeLayout.getContext());
                linearLayout.setLayoutParams(new LayoutParams(-2, -1));
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                swipeLayout.a(linearLayout);
            }
            LinearLayout linearLayout2 = (LinearLayout) swipeLayout.g;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
                for (View addView : list) {
                    linearLayout2.addView(addView, new LayoutParams(-2, -1));
                }
            }
            swipeLayout.h = list.isEmpty() ^ 1;
        }
    }
}
