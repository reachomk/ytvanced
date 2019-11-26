package defpackage;

import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.common.ui.bottomui.Mealbar;

/* renamed from: fcl */
final class fcl implements fbt {
    private final Mealbar a;
    private final akkq b;

    public fcl(Mealbar mealbar, akkq akkq) {
        this.a = mealbar;
        this.a.setOnClickListener(null);
        this.b = akkq;
    }

    private static OnClickListener a(OnClickListener onClickListener, fbv fbv) {
        if (onClickListener != null) {
            return new fcn(onClickListener, fbv);
        }
        return new fco(fbv);
    }
}
