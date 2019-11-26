package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: abl */
final class abl implements OnAttachStateChangeListener, OnGlobalLayoutListener {
    private final WeakHashMap a = new WeakHashMap();

    abl() {
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onGlobalLayout() {
        for (Entry entry : this.a.entrySet()) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z = view.getVisibility() == 0;
            if (booleanValue != z) {
                if (z) {
                    abe.M(view);
                }
                this.a.put(view, Boolean.valueOf(z));
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
