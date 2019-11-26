package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: lll */
public final class lll extends llh {
    private final lln c;
    private final int d;
    private final Rect e = new Rect();

    public lll(Context context, eif eif) {
        lln lln = llo.a;
        super("SWFS", eif);
        this.c = lln;
        this.d = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent, ejd ejd) {
        if (ejd == ejd.WATCH_WHILE_FULLSCREEN) {
            this.c.a(recyclerView, this.e);
            this.e.inset(this.d, 0);
            if (!llh.a(motionEvent, this.e)) {
                b();
            }
        }
    }
}
