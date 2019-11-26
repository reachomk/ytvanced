package defpackage;

import android.view.View;

/* renamed from: hey */
public abstract class hey {
    public final View a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    private final float f;
    private final float g;

    hey(View view, int i, int i2, float f, float f2) {
        amqw.a((Object) view);
        boolean z = i <= i2;
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("position start:");
        stringBuilder.append(i);
        stringBuilder.append(" position end");
        stringBuilder.append(i2);
        amqw.b(z, stringBuilder.toString());
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = i2 - i;
        this.e = f;
        this.f = f2;
        this.g = Math.abs(f2 - f);
    }

    public abstract void a(float f);

    public final void a(int i) {
        float f;
        if (i <= this.b) {
            f = this.e;
        } else {
            int i2 = this.c;
            if (i < i2) {
                f = (((float) (i2 - i)) / ((float) this.d)) * this.g;
                float f2 = this.e;
                float f3 = this.f;
                f = f2 <= f3 ? f3 - f : f + f3;
            } else {
                f = this.f;
            }
        }
        a(f);
    }
}
