package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: er */
public class er extends aux {
    private eq a;
    private int b = 0;

    public er(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        b(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new eq(view);
        }
        this.a.a();
        this.a.b();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.a(i2);
            this.b = 0;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.b(view, i);
    }

    public boolean a(int i) {
        eq eqVar = this.a;
        if (eqVar != null) {
            return eqVar.a(i);
        }
        this.b = i;
        return false;
    }

    public int c() {
        eq eqVar = this.a;
        if (eqVar == null) {
            return 0;
        }
        return eqVar.b;
    }
}
