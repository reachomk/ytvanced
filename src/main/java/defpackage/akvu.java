package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.google.android.youtube.R;

/* renamed from: akvu */
public final class akvu implements OnLayoutChangeListener {
    private final View a;
    private final View b;
    private final int[] c = new int[2];
    private final Rect d = new Rect();
    private final int e;

    public akvu(View view, View view2) {
        this.a = view;
        this.b = view2;
        this.e = view.getResources().getDimensionPixelSize(R.dimen.innertube_menu_anchor_size);
        if (view.getWidth() > 0) {
            a();
        }
        view.addOnLayoutChangeListener(this);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a();
    }

    private final void a() {
        if (this.b.getVisibility() != 0) {
            TouchDelegate touchDelegate = this.a.getTouchDelegate();
            if (touchDelegate instanceof xrl) {
                ((xrl) touchDelegate).a(this.b);
                return;
            } else {
                this.a.setTouchDelegate(null);
                return;
            }
        }
        this.a.getLocationOnScreen(this.c);
        int[] iArr = this.c;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = this.a.getWidth();
        this.b.getLocationOnScreen(this.c);
        int[] iArr2 = this.c;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        i3 += this.b.getWidth() / 2;
        int height = this.b.getHeight();
        int i5 = this.e / 2;
        this.d.top = Math.max(0, ((i4 + (height / 2)) - i2) - i5);
        Rect rect = this.d;
        rect.bottom = rect.top + this.e;
        if (abe.g(this.a) == 1) {
            rect = this.d;
            rect.left = i;
            rect.right = i + this.e;
        } else {
            this.d.left = Math.min(width - this.e, (i3 - i) - i5);
            this.d.right = width;
        }
        View view = this.a;
        View view2 = this.b;
        xrl.a(view, view2, new akvx(this.d, view2));
    }
}
