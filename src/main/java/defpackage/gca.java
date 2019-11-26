package defpackage;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* renamed from: gca */
final class gca extends CountDownTimer {
    private final /* synthetic */ gbt a;

    gca(gbt gbt, long j) {
        this.a = gbt;
        super(j, 10);
    }

    public final void onTick(long j) {
        gbt gbt = this.a;
        double d = (double) j;
        double d2 = (double) gbt.a;
        Double.isNaN(d);
        Double.isNaN(d2);
        d = 1.0d - (1.0d - (d / d2));
        int integer = gbt.q().getInteger(R.integer.reel_camera_time_progress_bar_max);
        ProgressBar progressBar = this.a.ap;
        d2 = 1.0d - (d * d);
        d = (double) integer;
        Double.isNaN(d);
        progressBar.setProgress((int) (d2 * d));
    }

    public final void onFinish() {
        this.a.f();
    }
}
