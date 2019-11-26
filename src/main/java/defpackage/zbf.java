package defpackage;

import android.animation.Animator;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbf */
public final /* synthetic */ class zbf implements zn {
    private final HeartView a;

    public zbf(HeartView heartView) {
        this.a = heartView;
    }

    public final void a(Object obj) {
        HeartView heartView = this.a;
        int ordinal = ((zbt) obj).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ((Animator) heartView.e.get()).start();
            } else if (ordinal == 2) {
                ((Animator) heartView.d.get()).start();
            } else if (ordinal == 3) {
                ((Animator) heartView.f.get()).start();
            }
        } else if (heartView.i) {
            ((Animator) heartView.c.get()).start();
        } else {
            ((Animator) heartView.e.get()).start();
        }
    }
}
