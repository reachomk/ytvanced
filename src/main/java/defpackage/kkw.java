package defpackage;

import android.content.Context;
import android.widget.GridLayout;
import android.widget.GridLayout.Spec;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kkw */
final class kkw {
    public static final Spec a = GridLayout.spec(4);
    public static final Spec b = GridLayout.spec(3);
    public static final Spec c = GridLayout.spec(3);
    public static final Spec d = GridLayout.spec(0, 4, GridLayout.FILL);
    public static final Spec e = GridLayout.spec(2, 2, GridLayout.FILL);
    public static final Spec f = GridLayout.spec(1, 3, GridLayout.FILL);
    public final int g;
    public final int h;
    public boolean i = true;
    public final List j = new ArrayList();
    public final Context k;
    public final ChipCloudView l;
    public final int m;

    /* Access modifiers changed, original: final */
    public final void a(Object obj) {
        this.j.add(obj);
        this.i = true;
    }

    public final void a() {
        this.l.removeAllViews();
        this.i = true;
    }

    kkw(Context context, ChipCloudView chipCloudView, int i) {
        this.k = context;
        this.l = chipCloudView;
        this.m = i;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.slim_metadata_badge_collapsed_margin_start);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.slim_metadata_badge_expanded_margin_start);
        chipCloudView.a(1);
    }
}
