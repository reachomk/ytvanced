package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abuq */
public final class abuq extends abto {
    private final View g = this.c.findViewById(R.id.live_chat_sticker_background);

    public abuq(Context context, akkl akkl, acwa acwa, aaas aaas, aklt aklt, akvp akvp, aktl aktl, abqy abqy, xwb xwb) {
        super(context, akkl, acwa, aaas, aklt, akvp, aktl, xwb);
        Resources resources = context.getResources();
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.c.setLayoutParams(marginLayoutParams);
    }

    public final int b() {
        return R.layout.live_chat_overlay_paid_sticker;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(SpannableStringBuilder spannableStringBuilder, boolean z) {
        if (z) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            float measureText = this.f / this.d.getPaint().measureText(" ");
            if (!TextUtils.isEmpty(this.e.getText())) {
                spannableStringBuilder2.append(this.e.getText());
                abxz.a(spannableStringBuilder2, measureText);
            }
            spannableStringBuilder2.append(spannableStringBuilder);
            this.e.setText(spannableStringBuilder2);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aufj aufj = (aufj) obj;
        super.a(akor, aufj);
        ((GradientDrawable) this.g.getBackground()).setColor(aufj.h);
        TextView textView = this.d;
        arml arml = aufj.f;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        if ((aufj.a & 64) != 0) {
            this.d.setTextColor(aufj.g);
        }
        if ((aufj.a & 512) != 0) {
            this.e.setTextColor(aufj.i);
        }
    }
}
