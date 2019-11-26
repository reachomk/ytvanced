package defpackage;

import android.support.design.appbar.AppBarLayout;
import android.view.View;

/* renamed from: ek */
final class ek implements ef {
    private final /* synthetic */ eh a;

    ek(eh ehVar) {
        this.a = ehVar;
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        eh ehVar = this.a;
        ehVar.d = i;
        abx abx = ehVar.e;
        int b = abx != null ? abx.b() : 0;
        int childCount = this.a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.a.getChildAt(i2);
            el elVar = (el) childAt.getLayoutParams();
            eq a = eh.a(childAt);
            int i3 = elVar.a;
            if (i3 == 1) {
                a.a(th.a(-i, 0, this.a.b(childAt)));
            } else if (i3 == 2) {
                a.a(Math.round(((float) (-i)) * elVar.b));
            }
        }
        this.a.a();
        eh ehVar2 = this.a;
        if (ehVar2.c != null && b > 0) {
            abe.e(ehVar2);
        }
        this.a.a.a(((float) Math.abs(i)) / ((float) ((this.a.getHeight() - abe.o(this.a)) - b)));
    }
}
