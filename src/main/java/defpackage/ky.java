package defpackage;

import android.widget.EditText;

/* renamed from: ky */
final class ky implements lg {
    private final /* synthetic */ kw a;

    ky(kw kwVar) {
        this.a = kwVar;
    }

    public final void a(EditText editText) {
        this.a.g.d(true);
        kw kwVar = this.a;
        kwVar.i.setChecked(kwVar.c() ^ 1);
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
