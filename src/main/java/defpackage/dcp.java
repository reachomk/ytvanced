package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Handler;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* renamed from: dcp */
public final class dcp extends Drawable implements Callback, TextContent, crs {
    public Layout b;
    public float c;
    public boolean d;
    public boolean e;
    public CharSequence f;
    public ColorStateList g;
    public int h;
    public int i;
    public ClickableSpan[] j;
    public ImageSpan[] k;
    public dcr l;
    public float m;
    public boolean n;
    public Handler o;
    public cyh p;
    private int q;
    private int r;
    private Path s;
    private boolean t;
    private Paint u;
    private dcs v;

    private final boolean d(MotionEvent motionEvent) {
        return false;
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        if (this.b != null) {
            int save = canvas.save();
            Rect bounds = getBounds();
            if (this.d) {
                canvas.clipRect(bounds);
            }
            canvas.translate((float) bounds.left, ((float) bounds.top) + this.c);
            Layout layout = this.b;
            Path path = null;
            if (!(this.q == this.r || Color.alpha(0) == 0)) {
                if (this.t) {
                    if (this.s == null) {
                        this.s = new Path();
                    }
                    this.b.getSelectionPath(this.q, this.r, this.s);
                    this.t = false;
                }
                path = this.s;
            }
            layout.draw(canvas, path, this.u, 0);
            canvas.restoreToCount(save);
        }
    }

    public final boolean isStateful() {
        return this.g != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        if (this.g != null) {
            Layout layout = this.b;
            if (layout != null) {
                int color = layout.getPaint().getColor();
                int colorForState = this.g.getColorForState(iArr, this.h);
                if (colorForState != color) {
                    this.b.getPaint().setColor(colorForState);
                    invalidateSelf();
                }
            }
        }
        return super.onStateChange(iArr);
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        if (b(motionEvent) || c(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                if (!(actionMasked != 2 || this.n || this.v == null)) {
                    Rect bounds = getBounds();
                    if (dcp.a(bounds, motionEvent)) {
                        float x = motionEvent.getX();
                        int i = bounds.left;
                        if (this.v.a != b(((int) x) - i, ((int) motionEvent.getY()) - bounds.top)) {
                            b();
                        }
                    } else {
                        b();
                    }
                }
                int i2 = this.n ^ 1;
                if (actionMasked == 1) {
                    b();
                }
                Rect bounds2 = getBounds();
                if (dcp.a(bounds2, motionEvent)) {
                    ClickableSpan b = b(((int) motionEvent.getX()) - bounds2.left, ((int) motionEvent.getY()) - bounds2.top);
                    if (b == null) {
                        a();
                    } else {
                        if (actionMasked == 1) {
                            a();
                            if (i2 != 0) {
                                b.onClick(view);
                            }
                        } else if (actionMasked == 0) {
                            if (b instanceof czw) {
                                this.v = new dcs(this, (czw) b, view);
                                this.o.postDelayed(this.v, (long) ViewConfiguration.getLongPressTimeout());
                            }
                            Spanned spanned = (Spanned) this.f;
                            a(spanned.getSpanStart(b), spanned.getSpanEnd(b));
                        }
                        return true;
                    }
                }
            }
            a();
            b();
        }
        if (d(motionEvent)) {
            Rect bounds3 = getBounds();
            int c = c(((int) motionEvent.getX()) - bounds3.left, ((int) motionEvent.getY()) - bounds3.top);
            if (c >= 0 && c <= this.f.length()) {
                dcr dcr = null;
                dcr.a();
            }
        }
        return false;
    }

    private final void b() {
        Handler handler = this.o;
        if (handler != null) {
            handler.removeCallbacks(this.v);
            this.v = null;
        }
        this.n = false;
    }

    public final boolean a(MotionEvent motionEvent) {
        return b(motionEvent) || c(motionEvent) || d(motionEvent);
    }

    private final boolean b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        Object obj = (actionMasked == 1 || actionMasked == 0) ? 1 : null;
        return (this.e && dcp.a(getBounds(), motionEvent) && obj != null) || actionMasked == 3;
    }

    private final boolean c(MotionEvent motionEvent) {
        return (!this.e || this.o == null || motionEvent.getAction() == 0) ? false : true;
    }

    private static boolean a(Rect rect, MotionEvent motionEvent) {
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final List getTextItems() {
        CharSequence charSequence = this.f;
        return charSequence == null ? Collections.emptyList() : Collections.singletonList(charSequence);
    }

    private final ClickableSpan b(int i, int i2) {
        i = c(i, i2);
        if (i >= 0) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) this.f).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    private final int c(int i, int i2) {
        float primaryHorizontal;
        i2 = this.b.getLineForVertical(i2);
        float d = d(this.b.getLineStart(i2), i2);
        int lineVisibleEnd = this.b.getLineVisibleEnd(i2) - 1;
        if (lineVisibleEnd < 0) {
            primaryHorizontal = this.b.getPrimaryHorizontal(0);
        } else {
            int i3 = 1;
            float[] fArr = new float[1];
            this.b.getPaint().getTextWidths(this.f, lineVisibleEnd, lineVisibleEnd + 1, fArr);
            float d2 = d(lineVisibleEnd, i2);
            if (this.b.isRtlCharAt(lineVisibleEnd)) {
                i3 = -1;
            }
            primaryHorizontal = d2 + (((float) i3) * fArr[0]);
        }
        float f = d <= primaryHorizontal ? primaryHorizontal : d;
        if (d > primaryHorizontal) {
            d = primaryHorizontal;
        }
        float f2 = (float) i;
        if (f2 >= d && f2 <= f) {
            try {
                return this.b.getOffsetForHorizontal(i2, f2);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    private final float d(int i, int i2) {
        if ((this.b.getParagraphDirection(i2) == -1) == this.b.isRtlCharAt(i)) {
            return this.b.getPrimaryHorizontal(i);
        }
        return this.b.getSecondaryHorizontal(i);
    }

    public final void a(int i, int i2) {
        if (Color.alpha(0) == 0) {
            return;
        }
        if (this.q != i || this.r != i2) {
            this.q = i;
            this.r = i2;
            Paint paint = this.u;
            if (paint == null) {
                this.u = new Paint();
                this.u.setColor(0);
            } else {
                paint.setColor(0);
            }
            this.t = true;
            invalidateSelf();
        }
    }

    public final void a() {
        a(0, 0);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
