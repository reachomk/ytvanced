package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: llq */
public final class llq extends llk {
    public llq() {
        super("SWIH");
    }

    public final void a(View view, int i, int i2) {
        if (i2 == 0 && (i & 1) != 0 && fpl.a(view)) {
            b();
        }
    }

    public final boolean a(View view, float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && fpl.a(view);
    }

    public final int a(RecyclerView recyclerView, MotionEvent motionEvent) {
        return (this.b && llk.a(motionEvent)) ? 2 : 0;
    }

    public final int b(RecyclerView recyclerView, MotionEvent motionEvent) {
        return (this.b && llk.a(motionEvent)) ? 2 : 0;
    }
}
