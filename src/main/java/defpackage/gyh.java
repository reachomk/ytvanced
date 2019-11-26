package defpackage;

import android.graphics.PorterDuff.Mode;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.youtube.R;

/* renamed from: gyh */
final class gyh implements TextWatcher {
    private final /* synthetic */ gyb a;

    gyh(gyb gyb) {
        this.a = gyb;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        gyb gyb;
        if (charSequence.length() > 0) {
            gyb = this.a;
            gyb.aa.setColorFilter(ra.c(gyb.p(), R.color.white_header_controls_color), Mode.MULTIPLY);
            return;
        }
        gyb = this.a;
        gyb.aa.setColorFilter(ra.c(gyb.p(), R.color.send_report_form_initial_color), Mode.MULTIPLY);
    }
}
