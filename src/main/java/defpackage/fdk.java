package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.quantum.snackbar.Snackbar;

/* renamed from: fdk */
final class fdk implements fbt {
    private final Snackbar a;

    public fdk(Snackbar snackbar) {
        this.a = snackbar;
        this.a.setOnClickListener(null);
        this.a.setClickable(false);
        this.a.setOnTouchListener(new fdm());
    }

    public final /* synthetic */ View a(fbr fbr, fbv fbv) {
        fde fde = (fde) fbr;
        CharSequence f = fde.f();
        if (TextUtils.isEmpty(f)) {
            this.a.a(fde.e());
        } else {
            this.a.a(fde.e(), f.toString(), new fdj(fbv, fde));
        }
        return this.a;
    }
}
