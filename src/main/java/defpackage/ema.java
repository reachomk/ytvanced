package defpackage;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: ema */
public final class ema implements xqt, xqx {
    private final View a;
    private Point b;

    public ema(View view) {
        this.a = view;
    }

    private final Point d(MotionEvent motionEvent) {
        if (this.b == null) {
            this.b = new Point();
        }
        this.b.set((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        fpl.a(this.b, this.a);
        return this.b;
    }

    public final void a(MotionEvent motionEvent) {
        View a = fpl.a(this.a, d(motionEvent), elz.a);
        if (a == null) {
            return;
        }
        if (a.getTag(R.id.player_overlay_tap_listener) != null) {
            ((xqx) a.getTag(R.id.player_overlay_tap_listener)).a(motionEvent);
        } else if (a.isClickable()) {
            a.performClick();
        }
    }

    public final void b(MotionEvent motionEvent) {
        View a = fpl.a(this.a, d(motionEvent), emc.a);
        if (a != null) {
            ((xqt) a.getTag(R.id.player_overlay_tap_listener)).b(motionEvent);
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        View a = fpl.a(this.a, d(motionEvent), emb.a);
        return a != null ? ((xqt) a.getTag(R.id.player_overlay_tap_listener)).c(motionEvent) : false;
    }
}
