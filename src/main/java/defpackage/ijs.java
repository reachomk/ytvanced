package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;

/* renamed from: ijs */
public final class ijs extends xqo implements OnScaleGestureListener {
    public boolean a = false;
    public boolean b;
    private final ScaleGestureDetector d;
    private final GestureDetector e;
    private final zl f = new zl();

    public ijs(Context context) {
        this.d = new ScaleGestureDetector(context, this);
        this.e = new GestureDetector(context, new ijr(this));
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final void a(iju iju) {
        this.f.add(iju);
    }

    public final void a() {
        this.a = false;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        this.e.onTouchEvent(motionEvent);
        this.d.onTouchEvent(motionEvent);
        if (this.a && motionEvent.getPointerCount() == 1 && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            int i = 0;
            while (true) {
                zl zlVar = this.f;
                if (i >= zlVar.b) {
                    break;
                }
                ((iju) zlVar.a(i)).e(this.b);
                i++;
            }
            this.a = false;
            this.b = false;
        }
        return this.a;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        int i = 0;
        while (true) {
            zl zlVar = this.f;
            if (i >= zlVar.b) {
                return true;
            }
            ((iju) zlVar.a(i)).a(scaleFactor);
            i++;
        }
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.a = true;
        int i = 0;
        while (true) {
            zl zlVar = this.f;
            if (i >= zlVar.b) {
                return true;
            }
            ((iju) zlVar.a(i)).j();
            i++;
        }
    }
}
