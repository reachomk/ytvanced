package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: albw */
public final class albw {
    private final acwa a;
    private final akzb b;

    public albw(acwa acwa, akzb akzb) {
        this.a = acwa;
        this.b = akzb;
    }

    public final void a(TextView textView, alcg alcg, aphg aphg, CharSequence charSequence, OnClickListener onClickListener, int i) {
        if (aphg == null) {
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                return;
            }
            aphf aphf = (aphf) aphg.s.createBuilder();
            aphf.a(ajqy.a(charSequence.toString()));
            aphg = (aphg) ((anxl) aphf.build());
        }
        akyy a = this.b.a(textView);
        a.a(aphg, this.a.t());
        a.c = new albz(onClickListener, textView, alcg, i);
        if (a.f && aphg.b == 1) {
            int a2 = aphh.a(((Integer) aphg.c).intValue());
            if (a2 != 0 && a2 == 14) {
                View view = a.e;
                xpr.a(view, rz.a(view.getResources(), R.drawable.tooltip_button_background, a.e.getContext().getTheme()), a.h);
                a.g = true;
                a.f = false;
            }
        }
    }
}
