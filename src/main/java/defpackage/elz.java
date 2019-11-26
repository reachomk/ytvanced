package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: elz */
final /* synthetic */ class elz implements amqv {
    public static final amqv a = new elz();

    private elz() {
    }

    public final boolean a(Object obj) {
        View view = (View) obj;
        boolean z = false;
        if (view != null) {
            if (view.getTag(R.id.player_overlay_tap_listener) == null) {
                return !view.isClickable() ? z : true;
            } else {
                z = true;
            }
        }
    }
}
