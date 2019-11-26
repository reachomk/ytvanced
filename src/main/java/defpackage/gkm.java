package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.videoeffects.stickers.text.ColorChip;

/* renamed from: gkm */
final /* synthetic */ class gkm implements gko {
    private final Rect a;
    private final MotionEvent b;

    gkm(Rect rect, MotionEvent motionEvent) {
        this.a = rect;
        this.b = motionEvent;
    }

    public final boolean a(ColorChip colorChip) {
        Rect rect = this.a;
        MotionEvent motionEvent = this.b;
        ((View) colorChip.getParent()).getHitRect(rect);
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }
}
