package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import com.google.android.youtube.R;

/* renamed from: akj */
public final class akj extends AppCompatImageView implements akm {
    public final /* synthetic */ akf a;

    public akj(akf akf, Context context) {
        this.a = akf;
        super(context, null, R.attr.actionOverflowButtonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        ask.a(this, getContentDescription());
        setOnTouchListener(new aki(this, this));
    }

    public final boolean d() {
        return false;
    }

    public final boolean e() {
        return false;
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.e();
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            i2 = getWidth();
            i4 = getHeight();
            int max = Math.max(i2, i4) / 2;
            i2 = (i2 + (getPaddingLeft() - getPaddingRight())) / 2;
            i4 = (i4 + (getPaddingTop() - getPaddingBottom())) / 2;
            st.a(background, i2 - max, i4 - max, i2 + max, i4 + max);
        }
        return frame;
    }
}
