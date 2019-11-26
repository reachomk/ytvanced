package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: paw */
public final class paw {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = aocf.UNSET_ENUM_VALUE;
    public int d = aocf.UNSET_ENUM_VALUE;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public final List n = new ArrayList();
    public int o;

    paw() {
    }

    public final int a() {
        return this.h - this.i;
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        pat pat = (pat) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - pat.m()) - i);
        this.b = Math.min(this.b, (view.getTop() - pat.n()) - i2);
        this.c = Math.max(this.c, (view.getRight() + pat.o()) + i3);
        this.d = Math.max(this.d, (view.getBottom() + pat.p()) + i4);
    }
}
