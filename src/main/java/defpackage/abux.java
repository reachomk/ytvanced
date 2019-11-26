package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abux */
public final class abux extends abto {
    private final RelativeLayout g = ((RelativeLayout) this.c.findViewById(R.id.live_chat_sticker_background));

    public abux(Context context, akkl akkl, acwa acwa, aaas aaas, aklt aklt, akvp akvp, aktl aktl, abqy abqy, xwb xwb) {
        super(context, akkl, acwa, aaas, aklt, akvp, aktl, xwb);
    }

    public final int b() {
        return R.layout.live_chat_paid_sticker;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return false;
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.c.setBackgroundColor(0);
        ((GradientDrawable) this.g.getBackground()).setColor(0);
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
        if ((aufj.a & 128) != 0) {
            ((GradientDrawable) this.g.getBackground()).setColor(aufj.h);
        }
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
