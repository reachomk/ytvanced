package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: llv */
public final class llv extends llk {
    private final fpk a;

    public llv(fpk fpk) {
        super("SWSD");
        this.a = fpk;
    }

    public final int a(RecyclerView recyclerView, MotionEvent motionEvent) {
        return (this.a.b() && b(motionEvent)) ? 2 : 0;
    }

    public final int b(RecyclerView recyclerView, MotionEvent motionEvent) {
        return (this.a.b() && b(motionEvent)) ? 2 : 0;
    }

    private final boolean b(MotionEvent motionEvent) {
        if (!this.b && llk.a(motionEvent)) {
            b();
        }
        return this.b;
    }
}
