package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: xpi */
public final class xpi extends aqd {
    private final xor a;
    private final boolean b;

    public xpi(RecyclerView recyclerView, boolean z) {
        this.b = z;
        this.a = new xor((View) amqw.a((Object) recyclerView));
    }

    public xpi(RecyclerView recyclerView) {
        this(recyclerView, false);
    }

    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.a != null && (!this.b || recyclerView.canScrollHorizontally(-1))) {
            this.a.a(motionEvent);
        }
        return false;
    }
}
