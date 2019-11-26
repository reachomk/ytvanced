package defpackage;

import android.app.ActionBar;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;

/* renamed from: xot */
public final class xot extends xnu {
    public final ActionBar i;
    public final int j;
    private final xnw k = new xos(this);

    public xot(Window window, ActionBar actionBar, View view) {
        super(window);
        this.i = actionBar;
        a(view, 1);
        this.g = this.k;
        if (actionBar == null) {
            this.j = 0;
            return;
        }
        TypedArray obtainStyledAttributes = window.getContext().obtainStyledAttributes(new int[]{16843499});
        this.j = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z) {
        xok xok = this.d;
        if (xok.f != z) {
            xok.f = z;
            xok.a();
        }
    }
}
