package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.youtube.R;

/* renamed from: ali */
public class ali extends SeekBar {
    private final alk a;

    public ali(Context context) {
        this(context, null);
    }

    public ali(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public ali(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new alk(this);
        this.a.a(attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        alk alk = this.a;
        if (alk.c != null) {
            int max = alk.b.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = alk.c.getIntrinsicWidth();
                int intrinsicHeight = alk.c.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight >> 1;
                }
                alk.c.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                float width = ((float) ((alk.b.getWidth() - alk.b.getPaddingLeft()) - alk.b.getPaddingRight())) / ((float) max);
                intrinsicWidth = canvas.save();
                canvas.translate((float) alk.b.getPaddingLeft(), (float) (alk.b.getHeight() / 2));
                for (intrinsicHeight = 0; intrinsicHeight <= max; intrinsicHeight++) {
                    alk.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(intrinsicWidth);
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        alk alk = this.a;
        Drawable drawable = alk.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(alk.b.getDrawableState())) {
            alk.b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
