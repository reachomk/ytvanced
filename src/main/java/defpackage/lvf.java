package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: lvf */
final class lvf implements ejc, els, lkz {
    public llc a;
    private final elh b;
    private final eif c;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private boolean f;

    public lvf(elh elh, eif eif) {
        this.b = elh;
        this.c = eif;
    }

    public final void a(ejd ejd, ejd ejd2) {
        a();
    }

    public final void a(lla lla) {
        if (this.f) {
            lvf.a(lla, this.e);
            if (!this.d.equals(this.e)) {
                ((elf) this.b.get()).j().requestLayout();
            }
        }
    }

    public final void a(View view, int i, int i2) {
        if (this.f) {
            Rect h = this.a.a().h();
            LayoutParams layoutParams = view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(MeasureSpec.makeMeasureSpec(h.width(), 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(MeasureSpec.makeMeasureSpec(h.height(), 1073741824), 0, layoutParams.height));
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        if (this.f) {
            lvf.a(this.a.a(), this.d);
            view.layout(this.d.left, this.d.top, this.d.right, this.d.bottom);
        }
    }

    public final void a() {
        boolean z = false;
        if (this.c.c().b() && this.a != null) {
            z = true;
        }
        if (this.f != z) {
            this.f = z;
            ((elf) this.b.get()).j().a(!this.f ? null : this);
        }
    }

    private static void a(lla lla, Rect rect) {
        Rect h = lla.h();
        Rect i = lla.i();
        rect.set(h);
        rect.offset(-i.left, -i.top);
    }
}
