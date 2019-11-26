package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;

/* renamed from: aliu */
final class aliu implements TextWatcher {
    private final /* synthetic */ aleo a;

    aliu(aleo aleo) {
        this.a = aleo;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aleo aleo = this.a;
        String charSequence2 = charSequence.toString();
        arml arml = null;
        aleo.g = null;
        aleo.f = charSequence2.trim();
        aleo.j = false;
        aleo.b.a(null, null);
        aler aler = aleo.b;
        aolz aolz = aleo.d;
        if ((aolz.a & 2) != 0) {
            arml = aolz.c;
            if (arml == null) {
                arml = arml.f;
            }
        }
        aler.a(ajqy.a(arml));
        aleo.b.a(false);
        if (Patterns.EMAIL_ADDRESS.matcher(aleo.f).matches()) {
            aleo.a(true);
            aleo.d();
            return;
        }
        aleo.a(false);
        aleo.h = false;
    }
}
