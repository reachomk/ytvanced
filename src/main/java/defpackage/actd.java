package defpackage;

import android.os.CountDownTimer;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
import java.util.concurrent.TimeUnit;

/* renamed from: actd */
public final class actd extends CountDownTimer {
    private final /* synthetic */ WaitingIndicatorView a;

    public actd(WaitingIndicatorView waitingIndicatorView, long j) {
        this.a = waitingIndicatorView;
        super(j, 1000);
    }

    public final void onTick(long j) {
        this.a.c.setText(String.format("%d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j))}));
    }

    public final void onFinish() {
        this.a.c.setVisibility(8);
        actc actc = this.a.d;
        if (actc != null) {
            actc.af();
        }
    }
}
