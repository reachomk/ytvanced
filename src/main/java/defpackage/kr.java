package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;

/* renamed from: kr */
final class kr implements OnTouchListener {
    private final /* synthetic */ AutoCompleteTextView a;
    private final /* synthetic */ kk b;

    kr(kk kkVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = kkVar;
        this.a = autoCompleteTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.b.c()) {
                this.b.b = false;
            }
            this.b.a(this.a);
            view.performClick();
        }
        return false;
    }
}
