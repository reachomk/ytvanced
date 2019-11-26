package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

/* renamed from: aog */
final class aog implements OnTouchListener {
    private final /* synthetic */ aoa a;

    aog(aoa aoa) {
        this.a = aoa;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        aoa aoa;
        if (action == 0) {
            PopupWindow popupWindow = this.a.r;
            if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < this.a.r.getWidth() && y >= 0 && y < this.a.r.getHeight()) {
                aoa = this.a;
                aoa.p.postDelayed(aoa.o, 250);
            }
        } else if (action == 1) {
            aoa = this.a;
            aoa.p.removeCallbacks(aoa.o);
        }
        return false;
    }
}
