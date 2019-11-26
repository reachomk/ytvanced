package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: wms */
final /* synthetic */ class wms implements OnTouchListener {
    private final wmt a;

    wms(wmt wmt) {
        this.a = wmt;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wmt wmt = this.a;
        if (motionEvent.getAction() == 1) {
            Drawable drawable = wmt.c.getCompoundDrawables()[2];
            if (drawable != null && wmt.d && motionEvent.getX() >= ((float) (wmt.c.getRight() - drawable.getBounds().width()))) {
                wmt.c.setText("");
                return true;
            }
        }
        xpr.b(wmt.c);
        return false;
    }
}
