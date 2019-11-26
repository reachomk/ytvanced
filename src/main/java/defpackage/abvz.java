package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: abvz */
final class abvz implements TextWatcher {
    private final int a;
    private boolean b;
    private ForegroundColorSpan c;
    private final /* synthetic */ abvm d;

    abvz(abvm abvm) {
        this.d = abvm;
        this.a = xwe.a(abvm.a, R.attr.ytTextDisabled, 0);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        i = charSequence.length();
        boolean z = false;
        Object obj = i == 0 ? null : 1;
        abvm abvm = this.d;
        int a = abvm.f.a(charSequence, abvm.n);
        abvm abvm2 = this.d;
        boolean z2 = a > abvm2.m;
        ImageView i4 = abvm2.i();
        Object obj2;
        if ((obj == null || i4.isShown()) && (!(i == 0 && i4.isShown()) && z2 == this.b)) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (!(i4 == null || obj2 == null)) {
            boolean z3 = obj != null && this.d.h;
            abvm.a(i4, z3);
            ViewGroup j = this.d.j();
            if (this.d.g && i == 0) {
                z = true;
            }
            abvm.a(j, z);
            i = z2 ^ 1;
            i4.setEnabled(i);
            abvm abvm3 = this.d;
            if (i == 0) {
                Drawable a2 = ra.a(abvm3.a, abvm3.j.a(10));
                a2.setAlpha(abvm3.a.getResources().getInteger(abvm3.j.a(11)));
                i4.setImageDrawable(a2);
            } else {
                i4.setImageDrawable(ra.a(abvm3.a, abvm3.j.a(9)));
            }
        }
        abvm abvm4 = this.d;
        if (abvm4.p) {
            abvm4.b(abvm4.m - a);
        } else if (abvm4.r() != null) {
            this.d.r().setVisibility(8);
        }
        if (z2 || this.b) {
            if (charSequence instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                ForegroundColorSpan foregroundColorSpan = this.c;
                if (foregroundColorSpan != null) {
                    spannableStringBuilder.removeSpan(foregroundColorSpan);
                }
                if (!z2) {
                    this.c = null;
                } else if (charSequence.length() > this.d.m) {
                    this.c = new ForegroundColorSpan(this.a);
                    spannableStringBuilder.setSpan(this.c, this.d.m, charSequence.length(), 33);
                }
            }
            this.b = z2;
        }
    }
}
