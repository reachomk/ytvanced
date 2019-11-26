package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int a = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
    private final int b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        i = getResources().getDisplayMetrics().widthPixels;
        int i3 = this.a;
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(i - (i3 + i3), this.b), 1073741824), i2);
    }
}
