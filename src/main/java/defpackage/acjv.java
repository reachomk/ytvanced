package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: acjv */
final class acjv implements TextWatcher {
    private final /* synthetic */ acjp a;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        xpr.a(this.a.d, TextUtils.isEmpty(charSequence) ^ 1);
        acjp acjp = this.a;
        if (charSequence.length() > 0) {
            String charSequence2 = charSequence.toString();
            acjp.g = charSequence.toString();
            acey acey = acjp.a;
            aaml acfd = new acfd(acey.c, acey.d.c(), charSequence.toString());
            acfd.g();
            anjv a = acey.b.a(acfd, acey.a);
            a.a(new acjt(acjp, charSequence2, a), acjp.f);
            return;
        }
        acjp.g = null;
        acjp.e.e();
        acjp.e.aa_();
        acjp.c.setVisibility(8);
    }

    /* synthetic */ acjv(acjp acjp) {
        this.a = acjp;
    }
}
