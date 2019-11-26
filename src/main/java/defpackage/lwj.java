package defpackage;

import android.animation.Animator;
import android.content.Context;
import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;
import com.google.android.youtube.R;

/* renamed from: lwj */
public final class lwj extends lwr {
    private final int a;
    private final /* synthetic */ WatchWhileLayout b;

    public lwj(WatchWhileLayout watchWhileLayout, Context context) {
        this.b = watchWhileLayout;
        super(watchWhileLayout, 0, 1);
        this.a = (int) context.getResources().getDimension(R.dimen.watch_while_mini_player_dismiss_animation_distance);
    }

    public final void a(boolean z) {
        int abs = Math.abs(this.b.d) + this.a;
        int i = this.b.d;
        a(i, (i < 0 ? -1 : 1) * abs, !z ? 250 : 187);
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.b.a(3, new acvs(acwc.MINI_PLAYER_DISMISSAL_BUTTON), null);
        super.onAnimationEnd(animator);
    }
}
