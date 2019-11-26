package com.google.android.apps.youtube.app.ui.actionbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.apv;
import defpackage.eh;
import defpackage.jov;
import defpackage.jpk;

public class MainCollapsingToolbarLayout extends eh {
    public jov f;
    public boolean g;
    private RecyclerView h;
    private boolean i;
    private apv j = new jpk(this);

    public MainCollapsingToolbarLayout(Context context) {
        super(context);
    }

    public MainCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MainCollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    public final void a(boolean r5, boolean r6) {
        /*
        r4 = this;
        r0 = r4.b();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x004e;
    L_0x0007:
        r5 = r4.h;
        r5 = r5.n;
        r5 = (defpackage.ans) r5;
        r5 = r5.p();
        r0 = 1;
        r1 = 0;
        if (r5 > 0) goto L_0x002e;
    L_0x0015:
        r5 = r4.h;
        r5 = r5.getChildAt(r1);
        r2 = r5.getHeight();
        r2 = r2 * 3;
        r2 = r2 / 4;
        r5 = r5.getBottom();
        if (r5 > 0) goto L_0x002b;
    L_0x0029:
        r5 = 0;
        goto L_0x002f;
    L_0x002b:
        if (r5 <= r2) goto L_0x002e;
    L_0x002d:
        goto L_0x0029;
    L_0x002e:
        r5 = 1;
    L_0x002f:
        r2 = r4.getParent();
        r2 = r2 instanceof com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout;
        if (r2 == 0) goto L_0x0042;
    L_0x0037:
        r2 = r4.getParent();
        r2 = (com.google.android.apps.youtube.app.ui.actionbar.ElevatedAppBarLayout) r2;
        r3 = r5 ^ 1;
        r2.b(r3);
    L_0x0042:
        r2 = r4.i;
        if (r2 != 0) goto L_0x0047;
    L_0x0046:
        goto L_0x004b;
    L_0x0047:
        if (r5 == 0) goto L_0x004a;
    L_0x0049:
        goto L_0x004b;
    L_0x004a:
        r1 = 1;
    L_0x004b:
        r4.a(r1);
    L_0x004e:
        r4.g = r5;
        super.a(r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout.a(boolean, boolean):void");
    }

    public final void b(boolean z) {
        this.i = z;
        a(z);
    }

    private final boolean b() {
        if (this.f.g() && !(this.b == null && this.c == null)) {
            RecyclerView recyclerView = this.h;
            if (recyclerView != null && recyclerView.getChildCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(boolean z) {
        if (!b()) {
            return false;
        }
        a(false, z);
        return true;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == recyclerView) {
            c(false);
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.b(this.j);
        }
        this.h = recyclerView;
        recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.a(this.j);
            c(false);
        }
    }
}
