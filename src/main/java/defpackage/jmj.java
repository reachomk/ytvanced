package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: jmj */
final class jmj extends aqd {
    private final /* synthetic */ jmh a;

    jmj(jmh jmh) {
        this.a = jmh;
    }

    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        jmh jmh = this.a;
        if (recyclerView == jmh.a && jmh.d != null) {
            Rect rect = new Rect();
            this.a.d.a.getGlobalVisibleRect(rect);
            if (!rect.contains((int) (motionEvent.getRawX() + 0.5f), (int) (motionEvent.getRawY() + 0.5f))) {
                jml jml = this.a.d;
                jml.b.clearFocus();
                xpr.a(jml.b);
                if (jml.f.length() == 0 && jml.h && !jml.e) {
                    jml.e();
                }
                this.a.a();
            }
        }
        return false;
    }
}
