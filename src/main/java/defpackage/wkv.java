package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wkv */
final /* synthetic */ class wkv implements OnClickListener {
    private final wkt a;
    private final View b;

    wkv(wkt wkt, View view) {
        this.a = wkt;
        this.b = view;
    }

    public final void onClick(View view) {
        wkt wkt = this.a;
        View view2 = this.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wkt.c());
        wlu.a(spannableStringBuilder);
        if (wkt.a() || !wkt.b()) {
            wkt.d();
        } else {
            wkt.a.setCancelable(false);
            wkt.a.setCanceledOnTouchOutside(false);
            wkt.e.setVisibility(4);
            view2.setVisibility(0);
            wkt.d.setEnabled(false);
            wla wla = wkt.q;
            if (wla != null) {
                wla.a(spannableStringBuilder.toString(), wkt.n);
            }
        }
    }
}
