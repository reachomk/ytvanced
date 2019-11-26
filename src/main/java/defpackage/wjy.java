package defpackage;

import android.text.SpannableString;
import android.text.Spanned;

/* renamed from: wjy */
final /* synthetic */ class wjy implements Runnable {
    private final wjv a;
    private final Spanned b;

    wjy(wjv wjv, Spanned spanned) {
        this.a = wjv;
        this.b = spanned;
    }

    public final void run() {
        wjv wjv = this.a;
        SpannableString spannableString = new SpannableString(this.b);
        grf grf = wjv.aA;
        wlu.a(spannableString, grf.e, grf.f, ((float) grf.b.getMeasuredWidth()) * 0.9f, grf.g);
        wjv.aq.append(spannableString);
    }
}
