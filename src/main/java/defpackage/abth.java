package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: abth */
final class abth implements TextWatcher {
    private final /* synthetic */ abta a;

    abth(abta abta) {
        this.a = abta;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        abta abta = this.a;
        ajwy ajwy = abta.l;
        if (ajwy != null) {
            auev[] auevArr = ajwy.b;
            if (auevArr != null) {
                i3 = auevArr.length;
                if (i3 != 0) {
                    long j = auevArr[0].b;
                    long j2 = auevArr[i3 - 1].c;
                    long a = abta.a(String.valueOf(charSequence));
                    this.a.a(a);
                    abta abta2 = this.a;
                    abta2.b(abta2.b(a));
                    abta2 = this.a;
                    boolean z = true;
                    if (a >= j && a <= j2) {
                        z = false;
                    }
                    abta2.f = z;
                    abta2.c();
                }
            }
        }
    }
}
