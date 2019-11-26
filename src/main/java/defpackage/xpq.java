package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: xpq */
final class xpq extends LayerDrawable {
    public final Drawable a;
    public final int b;

    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* synthetic */ xpq(Drawable drawable, Drawable drawable2, int i) {
        super(new Drawable[]{drawable, drawable2});
        this.a = (Drawable) amqw.a((Object) drawable, (Object) "nonRipple drawable is null");
        amqw.a((Object) drawable2, (Object) "ripple drawable is null");
        this.b = i;
    }
}
