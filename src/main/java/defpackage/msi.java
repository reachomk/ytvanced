package defpackage;

import android.content.Context;

/* renamed from: msi */
public abstract class msi extends afki implements msj {
    private int a;
    private int b;
    private msm c;

    public msi(Context context) {
        super(context);
    }

    public final void a() {
    }

    public final void a(int i, int i2) {
        this.a = i;
        this.b = i2;
        requestLayout();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        i = msi.getDefaultSize(this.a, i);
        i2 = msi.getDefaultSize(this.b, i2);
        int i3 = this.a;
        if (i3 > 0) {
            int i4 = this.b;
            if (i4 > 0) {
                float f = ((((float) i3) / ((float) i4)) / (((float) i) / ((float) i2))) - 4.0f;
                if (f > 0.01f) {
                    i2 = (i4 * i) / i3;
                } else if (f < -0.01f) {
                    i = (i3 * i2) / i4;
                }
            }
        }
        setMeasuredDimension(i, i2);
        msm msm = this.c;
        if (msm != null) {
            msm.a(i, i2);
        }
    }

    public final void a(msm msm) {
        this.c = msm;
    }
}
