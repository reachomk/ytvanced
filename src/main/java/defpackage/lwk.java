package defpackage;

import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwk */
public final class lwk extends lwr {
    private final /* synthetic */ WatchWhileLayout a;

    public lwk(WatchWhileLayout watchWhileLayout) {
        this.a = watchWhileLayout;
        super(watchWhileLayout, 1, 0);
    }

    public final void a(int i) {
        WatchWhileLayout watchWhileLayout;
        boolean z = true;
        if (i != 0) {
            watchWhileLayout = this.a;
            if (watchWhileLayout.g != 1) {
                watchWhileLayout.b.a(65, new acvs(acwc.MINI_PLAYER_EXPAND_BUTTON), null);
            }
        }
        watchWhileLayout = this.a;
        int i2 = watchWhileLayout.c;
        int i3 = watchWhileLayout.f;
        int a = a();
        if (i != 2) {
            z = false;
        }
        a(i2, 0, lwq.a(i2, i3, a, z));
    }
}
