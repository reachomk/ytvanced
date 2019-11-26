package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: emc */
final /* synthetic */ class emc implements amqv {
    public static final amqv a = new emc();

    private emc() {
    }

    public final boolean a(Object obj) {
        View view = (View) obj;
        if (view == null || view.getTag(R.id.player_overlay_tap_listener) == null || !(view.getTag(R.id.player_overlay_tap_listener) instanceof xqt)) {
            return false;
        }
        return true;
    }
}
