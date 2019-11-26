package defpackage;

import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwn */
public final class lwn extends lwr {
    private final /* synthetic */ WatchWhileLayout a;

    public lwn(WatchWhileLayout watchWhileLayout) {
        this.a = watchWhileLayout;
        super(watchWhileLayout, 2, 0);
    }

    public final void a(int i) {
        WatchWhileLayout watchWhileLayout;
        if (i != 0) {
            watchWhileLayout = this.a;
            if (watchWhileLayout.g != 2) {
                watchWhileLayout.b.a(65, new acvs(acwc.WATCH_MINIMIZE_BUTTON), null);
            }
        }
        watchWhileLayout = this.a;
        int i2 = watchWhileLayout.c;
        int i3 = watchWhileLayout.f;
        a(i2, i3, lwq.a(i3 - i2, i3, a(), i == 2));
    }
}
