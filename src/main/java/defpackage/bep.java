package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: bep */
final class bep extends OvalShape {
    private RadialGradient a;
    private final Paint b = new Paint();
    private final /* synthetic */ beq c;

    bep(beq beq, int i) {
        this.c = beq;
        beq.b = i;
        a((int) rect().width());
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResize(float f, float f2) {
        super.onResize(f, f2);
        a((int) f);
    }

    public final void draw(Canvas canvas, Paint paint) {
        int width = this.c.getWidth() / 2;
        float f = (float) width;
        float height = (float) (this.c.getHeight() / 2);
        canvas.drawCircle(f, height, f, this.b);
        canvas.drawCircle(f, height, (float) (width - this.c.b), paint);
    }

    private final void a(int i) {
        float f = (float) (i / 2);
        float f2 = f;
        this.a = new RadialGradient(f2, f, (float) this.c.b, new int[]{1023410176, 0}, null, TileMode.CLAMP);
        this.b.setShader(this.a);
    }
}
