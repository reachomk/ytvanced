package defpackage;

import android.os.Vibrator;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;

/* renamed from: aiho */
public final class aiho extends aihp {
    private final /* synthetic */ TimeBar b;

    public aiho(TimeBar timeBar) {
        this.b = timeBar;
    }

    public final void a(int i) {
        if (i == 2 && this.a == 3) {
            Vibrator vibrator = this.b.a;
            if (vibrator != null) {
                vibrator.vibrate(25);
            }
        }
        if (this.a == 3) {
            TimeBar timeBar = this.b;
            timeBar.a(timeBar.h());
        }
    }
}
