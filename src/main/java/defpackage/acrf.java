package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acrf */
public final class acrf extends abtm {
    public acrf(Context context, akkl akkl, acwa acwa, aaas aaas, aktl aktl, akvp akvp) {
        super(context, akkl, acwa, aaas, aktl, akvp);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.layout.live_chat_overlay_paid_message;
    }

    /* Access modifiers changed, original: protected|final */
    public final int d() {
        return R.drawable.live_chat_overlay_paid_message_top_background;
    }

    /* Access modifiers changed, original: protected|final */
    public final int e() {
        return R.drawable.live_chat_overlay_paid_message_full_background;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean f() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final MarginLayoutParams c() {
        return new MarginLayoutParams(-2, -2);
    }

    public final void a(akor akor, aued aued) {
        super.a_(akor, aued);
        Resources resources = this.c.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_paid_message_avatar_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_paid_message_bottom_bar_horizontal_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_avatar_margin);
        TextView textView;
        if (this.e.getVisibility() != 0) {
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_amount_vertical_padding_when_moderated);
            TextView textView2 = this.f;
            dimensionPixelSize /= 2;
            textView2.setPaddingRelative(dimensionPixelSize, dimensionPixelOffset3, textView2.getPaddingEnd(), dimensionPixelOffset3);
            textView = this.g;
            textView.setPaddingRelative(dimensionPixelSize - dimensionPixelOffset, 0, textView.getPaddingEnd(), 0);
            return;
        }
        textView = this.f;
        textView.setPaddingRelative(0, 0, textView.getPaddingEnd(), 0);
        textView = this.g;
        textView.setPaddingRelative((dimensionPixelSize + dimensionPixelOffset) + dimensionPixelOffset2, 0, textView.getPaddingEnd(), 0);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a_(akor, (aued) obj);
    }
}
