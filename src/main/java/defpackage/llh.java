package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: llh */
public abstract class llh extends llk {
    public llc a;
    private final eif c;

    llh(String str, eif eif) {
        super(str);
        this.c = eif;
    }

    public abstract void a(RecyclerView recyclerView, MotionEvent motionEvent, ejd ejd);

    public final int a(RecyclerView recyclerView, MotionEvent motionEvent) {
        return c(recyclerView, motionEvent) ? 2 : 0;
    }

    public final int b(RecyclerView recyclerView, MotionEvent motionEvent) {
        return c(recyclerView, motionEvent) ? 2 : 0;
    }

    private final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!llk.a(motionEvent) || motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (this.b) {
            return true;
        }
        a(recyclerView, motionEvent, this.c.c());
        return this.b;
    }

    static boolean a(MotionEvent motionEvent, Rect rect) {
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }
}
