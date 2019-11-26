package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwh */
public final /* synthetic */ class lwh implements xpx {
    private final WatchWhileLayout a;
    private final int b;

    public lwh(WatchWhileLayout watchWhileLayout, int i) {
        this.a = watchWhileLayout;
        this.b = i;
    }

    public final Object get() {
        WatchWhileLayout watchWhileLayout = this.a;
        return new Rect(watchWhileLayout.getLeft(), watchWhileLayout.getTop(), watchWhileLayout.getWidth(), watchWhileLayout.getHeight() - this.b);
    }
}
