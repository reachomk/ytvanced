package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.youtube.R;

/* renamed from: ajh */
public class ajh {
    public View a;
    public int b;
    public OnDismissListener c;
    private final Context d;
    private final aiw e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private ajm j;
    private aji k;
    private final OnDismissListener l;

    public ajh(Context context, aiw aiw, View view, boolean z) {
        this(context, aiw, view, z, R.attr.actionOverflowMenuStyle, 0);
    }

    public ajh(Context context, aiw aiw, View view, boolean z, int i, int i2) {
        this.b = 8388611;
        this.l = new ajk(this);
        this.d = context;
        this.e = aiw;
        this.a = view;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    public final void a(boolean z) {
        this.i = z;
        aji aji = this.k;
        if (aji != null) {
            aji.a(z);
        }
    }

    public final void a() {
        if (!c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final aji b() {
        if (this.k == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                aji ail = new ail(this.d, this.a, this.g, this.h, this.f);
            } else {
                aji ajp = new ajp(this.d, this.e, this.a, this.g, this.h, this.f);
            }
            r0.a(this.e);
            r0.a(this.l);
            r0.a(this.a);
            r0.a(this.j);
            r0.a(this.i);
            r0.a(this.b);
            this.k = r0;
        }
        return this.k;
    }

    public final boolean c() {
        if (f()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public final void a(int i, int i2, boolean z, boolean z2) {
        aji b = b();
        b.b(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, abe.g(this.a)) & 7) == 5) {
                i -= this.a.getWidth();
            }
            b.b(i);
            b.c(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        b.f_();
    }

    public final void d() {
        if (f()) {
            this.k.d();
        }
    }

    /* Access modifiers changed, original: protected */
    public void e() {
        this.k = null;
        OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean f() {
        aji aji = this.k;
        return aji != null && aji.e();
    }

    public final void a(ajm ajm) {
        this.j = ajm;
        aji aji = this.k;
        if (aji != null) {
            aji.a(ajm);
        }
    }
}
