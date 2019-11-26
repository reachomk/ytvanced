package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.youtube.R;

/* renamed from: gek */
final class gek implements TextWatcher {
    private final /* synthetic */ gei a;

    gek(gei gei) {
        this.a = gei;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        boolean z = false;
        if (trim.contains("<") || trim.contains(">")) {
            gei gei = this.a;
            gei.af.c(gei.a((int) R.string.reel_playlist_creation_title_error));
            this.a.ad.setEnabled(false);
            return;
        }
        this.a.af.c(null);
        if (trim.length() > 0) {
            z = true;
        }
        this.a.ad.setEnabled(z);
    }
}
