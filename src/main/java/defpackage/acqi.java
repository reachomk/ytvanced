package defpackage;

import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: acqi */
final class acqi implements afsw {
    private final /* synthetic */ acqf a;

    acqi(acqf acqf) {
        this.a = acqf;
    }

    public final void a(bqn bqn) {
        acqf acqf = this.a;
        acqf.ab.setEnabled(acqf.f());
        Toast.makeText(this.a.p(), this.a.q().getString(R.string.lc_error_generic), 0).show();
    }
}
