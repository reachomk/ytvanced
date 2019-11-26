package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;

/* renamed from: erb */
public final class erb implements TextWatcher {
    private final /* synthetic */ eqz a;

    public final void afterTextChanged(Editable editable) {
        eqz eqz;
        try {
            if (editable.toString().isEmpty()) {
                a(0);
                return;
            }
            long parseLong = Long.parseLong(editable.toString()) * 1000000;
            eqz = this.a;
            aqxj aqxj = eqz.f;
            if (parseLong < aqxj.x || parseLong > aqxj.y) {
                PrefixedEditText prefixedEditText = eqz.c;
                arml arml = aqxj.z;
                if (arml == null) {
                    arml = arml.f;
                }
                prefixedEditText.setError(ajqy.a(arml));
                a(0);
                return;
            }
            eqz.c.setError(null);
            a(parseLong);
        } catch (NumberFormatException unused) {
            eqz = this.a;
            PrefixedEditText prefixedEditText2 = eqz.c;
            arml arml2 = eqz.f.z;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            prefixedEditText2.setError(ajqy.a(arml2));
            a(0);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void a(long j) {
        eqy eqy = this.a.e;
        if (eqy != null) {
            eqy.a(j);
        }
    }

    /* synthetic */ erb(eqz eqz) {
        this.a = eqz;
    }
}
