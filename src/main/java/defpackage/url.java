package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: url */
final /* synthetic */ class url implements OnClickListener {
    private final urj a;
    private final aphg b;

    url(urj urj, aphg aphg) {
        this.a = urj;
        this.b = aphg;
    }

    public final void onClick(View view) {
        urj urj = this.a;
        aphg aphg = this.b;
        usf usf = urj.aa;
        if (usf == null || (usf.a() && (usf.k || usf.b()))) {
            boolean z = true;
            urj.f(true);
            if ((aphg.a & 2048) != 0) {
                aaas aaas = urj.ac;
                apxu apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            } else {
                z = false;
            }
            if ((aphg.a & 4096) != 0) {
                aaas aaas2 = urj.ac;
                apxu apxu2 = aphg.m;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas2.a(apxu2, null);
            } else if (!z) {
                urj.dismiss();
                return;
            }
        }
        CharSequence charSequence;
        EditText editText;
        usf usf2 = urj.aa;
        if (!usf2.k && !usf2.a() && !usf2.b()) {
            charSequence = usf2.l;
        } else if (usf2.a()) {
            charSequence = usf2.n;
        } else {
            charSequence = usf2.m;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            usf2.d.setText(charSequence);
            usf2.d.setVisibility(0);
        }
        if (TextUtils.isEmpty(usf2.g.getText())) {
            editText = usf2.g;
            editText.setError(editText.getHint());
        }
        if (TextUtils.isEmpty(usf2.f.getText())) {
            editText = usf2.f;
            editText.setError(editText.getHint());
        }
        if (TextUtils.isEmpty(usf2.e.getText())) {
            EditText editText2 = usf2.e;
            editText2.setError(editText2.getHint());
        }
    }
}
