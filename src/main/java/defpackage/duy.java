package defpackage;

import android.os.CountDownTimer;
import com.google.android.apps.youtube.app.application.upgrade.NewVersionAvailableActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: duy */
public final class duy extends CountDownTimer {
    private final /* synthetic */ NewVersionAvailableActivity a;

    public duy(NewVersionAvailableActivity newVersionAvailableActivity, long j) {
        this.a = newVersionAvailableActivity;
        super(j, 1000);
    }

    public final void onTick(long j) {
        int toSeconds = ((int) TimeUnit.MILLISECONDS.toSeconds(j)) + 1;
        this.a.i.setProgress(toSeconds);
        this.a.h.setText(String.valueOf(toSeconds));
    }

    public final void onFinish() {
        this.a.j.setVisibility(8);
        this.a.g.setVisibility(0);
        this.a.l();
    }
}
