package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* renamed from: bak */
public final class bak {
    public final BitmapDrawable a;
    public float b = 1.0f;
    public final Rect c;
    public Interpolator d;
    public long e;
    public final Rect f;
    public int g;
    public float h = 1.0f;
    public float i = 1.0f;
    public long j;
    public boolean k;
    public boolean l;
    public baj m;

    public bak(BitmapDrawable bitmapDrawable, Rect rect) {
        this.a = bitmapDrawable;
        this.f = rect;
        this.c = new Rect(rect);
        bitmapDrawable = this.a;
        if (bitmapDrawable != null && this.c != null) {
            bitmapDrawable.setAlpha((int) (this.b * 255.0f));
            this.a.setBounds(this.c);
        }
    }
}
