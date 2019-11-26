package defpackage;

import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwt */
public final class lwt extends lwr {
    private final /* synthetic */ WatchWhileLayout a;

    public lwt(WatchWhileLayout watchWhileLayout) {
        this.a = watchWhileLayout;
        super(watchWhileLayout, 2, 1);
    }

    public final void a(boolean z) {
        WatchWhileLayout watchWhileLayout = this.a;
        int i = watchWhileLayout.d;
        a(i, 0, lwq.a(i, watchWhileLayout.e, 250, z));
    }
}
