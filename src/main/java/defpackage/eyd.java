package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ProgressBar;

/* renamed from: eyd */
public final class eyd implements OnLayoutChangeListener {
    private final ProgressBar a;
    private final tst b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public eyd(ProgressBar progressBar, tst tst, int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        amqw.a(i2 >= i);
        if (i4 < i3) {
            z = false;
        }
        amqw.a(z);
        this.a = (ProgressBar) amqw.a((Object) progressBar);
        this.b = (tst) amqw.a((Object) tst);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.a.getLayoutParams();
        i = this.g;
        i4 = (i4 - i2) - i;
        i2 = this.d;
        i3 = 0;
        if (i4 >= i2) {
            i = this.f;
        } else {
            i5 = this.c;
            if (i4 <= i5) {
                i = this.e;
                i2 = i5;
            } else {
                i3 = i / 2;
                i = this.f;
                i6 = this.e;
                i = Math.round(((((float) (i - i6)) / ((float) (i2 - i5))) * ((float) (i4 - i5))) + ((float) i6));
                i2 = -1;
            }
        }
        marginLayoutParams.height = i2;
        marginLayoutParams.bottomMargin = i3;
        marginLayoutParams.topMargin = i3;
        tst tst = this.b;
        if (i != tst.h) {
            tst.h = i;
            tst.invalidateSelf();
        }
    }
}
