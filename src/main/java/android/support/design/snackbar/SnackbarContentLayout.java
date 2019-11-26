package android.support.design.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.ji;
import defpackage.jk;

public class SnackbarContentLayout extends LinearLayout implements ji {
    public TextView a;
    public Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jk.a);
        this.c = obtainStyledAttributes.getDimensionPixelSize(jk.c, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(jk.g, -1);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        super.onMeasure(i, i2);
        if (this.c > 0) {
            measuredWidth = getMeasuredWidth();
            i3 = this.c;
            if (measuredWidth > i3) {
                i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        measuredWidth = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        i3 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        int lineCount = this.a.getLayout().getLineCount();
        if (lineCount <= 1 || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (lineCount <= 1) {
                measuredWidth = i3;
            }
            if (!a(0, measuredWidth, measuredWidth)) {
                return;
            }
        } else if (!a(1, measuredWidth, measuredWidth - i3)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    private final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.a;
        if (abe.x(textView)) {
            abe.a(textView, abe.j(textView), i2, abe.k(textView), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }

    public final void a() {
        this.a.setAlpha(0.0f);
        this.a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    public final void b() {
        this.a.setAlpha(1.0f);
        this.a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }
}
