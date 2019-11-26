package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: wkx */
final class wkx implements TextWatcher {
    private final /* synthetic */ EditText a;
    private final /* synthetic */ wkt b;

    wkx(wkt wkt, EditText editText) {
        this.b = wkt;
        this.a = editText;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        wkt wkt = this.b;
        boolean z = false;
        if (!wkt.a() && this.b.b()) {
            z = true;
        }
        wkt.a(z);
        float lineSpacingExtra = this.a.getLineSpacingExtra();
        float lineSpacingMultiplier = this.a.getLineSpacingMultiplier();
        this.a.setLineSpacing(0.0f, 1.0f);
        this.a.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }
}
