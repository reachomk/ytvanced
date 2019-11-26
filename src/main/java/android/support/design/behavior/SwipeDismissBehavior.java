package android.support.design.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ado;
import defpackage.adt;
import defpackage.aux;
import defpackage.eu;
import defpackage.ev;

public class SwipeDismissBehavior extends aux {
    public ado a;
    public eu b;
    public int c = 0;
    public float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    private boolean g;
    private final adt h = new ev(this);

    public boolean b(View view) {
        return true;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = ado.a((ViewGroup) coordinatorLayout, this.h);
        }
        return this.a.a(motionEvent);
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ado ado = this.a;
        if (ado == null) {
            return false;
        }
        ado.b(motionEvent);
        return true;
    }

    public static float a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }
}
