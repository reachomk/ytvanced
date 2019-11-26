package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

/* renamed from: ugl */
public final class ugl implements ugy {
    private final /* synthetic */ ExpandingScrollView a;

    public ugl(ExpandingScrollView expandingScrollView) {
        this.a = expandingScrollView;
    }

    public final boolean a(MotionEvent motionEvent) {
        View view = this.a.i;
        if (view == null) {
            return false;
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
