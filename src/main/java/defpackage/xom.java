package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* renamed from: xom */
public final class xom {
    public final View a;
    public GradientDrawable b;
    public int[] c;

    public xom(View view) {
        this.a = (View) amqw.a((Object) view);
    }

    public final void a(int[] iArr) {
        if (iArr != null) {
            int length = iArr.length;
            if (length != 0) {
                if (this.c != iArr) {
                    if (this.b == null) {
                        this.b = new GradientDrawable();
                        this.a.setBackground(this.b);
                    }
                    if (length == 1) {
                        if (this.c == null) {
                            this.c = new int[2];
                        }
                        int[] iArr2 = this.c;
                        int i = iArr[0];
                        iArr2[1] = i;
                        iArr2[0] = i;
                    } else {
                        this.c = iArr;
                    }
                    this.b.setColors(this.c);
                    xpr.a(this.a, true);
                }
                return;
            }
        }
        xpr.a(this.a, false);
    }
}
