package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: stg */
public final class stg extends Drawable {
    private static final int[] i = new int[]{16842919};
    private static final int[] j = new int[]{16843518};
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public float d = 0.0f;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    private final Paint k = new Paint(1);
    private final RectF l = new RectF();
    private Path m = null;

    public stg() {
        this.k.setStyle(Style.FILL);
        this.k.setColor(0);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        int color = this.k.getColor();
        int i;
        if (StateSet.stateSetMatches(i, iArr)) {
            i = this.a;
            if (color == i) {
                return false;
            }
            this.k.setColor(i);
            invalidateSelf();
            return true;
        } else if (StateSet.stateSetMatches(j, iArr)) {
            i = this.b;
            if (color == i) {
                return false;
            }
            this.k.setColor(i);
            invalidateSelf();
            return true;
        } else {
            int i2 = this.c;
            if (i2 != 0) {
                if (color == i2) {
                    return false;
                }
                this.k.setColor(i2);
                invalidateSelf();
                return true;
            } else if (color == 0) {
                return super.onStateChange(iArr);
            } else {
                this.k.setColor(0);
                invalidateSelf();
                return true;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        this.l.set(rect);
        if (!a() && this.m == null) {
            float f;
            float[] fArr = new float[8];
            if (this.e) {
                f = this.d;
                fArr[0] = f;
                fArr[1] = f;
            }
            if (this.f) {
                f = this.d;
                fArr[2] = f;
                fArr[3] = f;
            }
            if (this.h) {
                f = this.d;
                fArr[4] = f;
                fArr[5] = f;
            }
            if (this.g) {
                f = this.d;
                fArr[6] = f;
                fArr[7] = f;
            }
            Path path = new Path();
            path.addRoundRect(this.l, fArr, Direction.CW);
            this.m = path;
        }
        if (this.c != 0 && !isStateful()) {
            this.k.setColor(this.c);
        }
    }

    /* JADX WARNING: Missing block: B:14:0x001e, code skipped:
            if (r3.g == false) goto L_0x0020;
     */
    private final boolean a() {
        /*
        r3 = this;
        r0 = r3.e;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0014;
    L_0x0006:
        r0 = r3.f;
        if (r0 == 0) goto L_0x0022;
    L_0x000a:
        r0 = r3.h;
        if (r0 == 0) goto L_0x0022;
    L_0x000e:
        r0 = r3.g;
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0020;
    L_0x0013:
        return r2;
    L_0x0014:
        r0 = r3.f;
        if (r0 != 0) goto L_0x0022;
    L_0x0018:
        r0 = r3.h;
        if (r0 != 0) goto L_0x0022;
    L_0x001c:
        r0 = r3.g;
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        r2 = 1;
    L_0x0022:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stg.a():boolean");
    }

    public final void draw(Canvas canvas) {
        if (this.d <= 0.5f) {
            canvas.drawRect(this.l, this.k);
        } else if (a()) {
            RectF rectF = this.l;
            float f = this.d;
            canvas.drawRoundRect(rectF, f, f, this.k);
        } else {
            canvas.drawPath((Path) amqw.a(this.m), this.k);
        }
    }

    public final void setAlpha(int i) {
        this.k.setAlpha(i);
    }

    public final int getAlpha() {
        return this.k.getAlpha();
    }

    public final boolean isStateful() {
        return (this.a == 0 && this.b == 0) ? false : true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
    }

    public final ColorFilter getColorFilter() {
        return this.k.getColorFilter();
    }

    public final int getOpacity() {
        int alpha = this.k.getAlpha();
        if (alpha == 255) {
            if (this.d < 0.5f) {
                return -1;
            }
        } else if (alpha == 0) {
            return -2;
        }
        return -3;
    }
}
