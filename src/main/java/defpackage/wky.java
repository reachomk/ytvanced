package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: wky */
final /* synthetic */ class wky implements Runnable {
    private final wkt a;

    wky(wkt wkt) {
        this.a = wkt;
    }

    public final void run() {
        wkt wkt = this.a;
        if (wkt.d != null) {
            SpannableString spannableString = new SpannableString(wkt.c());
            if (!TextUtils.isEmpty(spannableString)) {
                wlu.a(spannableString, wkt.b.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_corner_radius), wkt.b.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_horizontal_padding), ((float) wkt.d.getMeasuredWidth()) * 0.9f, xwe.a(wkt.b, R.attr.ytBadgeChipBackground, 0));
                wlr[] wlrArr = (wlr[]) spannableString.getSpans(0, spannableString.length(), wlr.class);
                if (wlrArr != null && wlrArr.length > 0) {
                    wkt.a(spannableString, wkt.r);
                }
            }
        }
    }
}
