package defpackage;

import android.view.View;

/* renamed from: hew */
public final class hew extends hey {
    public hew(View view, int i, int i2, float f, float f2) {
        super(view, i, i2, f, f2);
        boolean z = false;
        boolean z2 = f >= 0.0f && f <= 1.0f;
        amqw.b(z2);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            z = true;
        }
        amqw.b(z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(float f) {
        this.a.setAlpha(f);
    }
}
