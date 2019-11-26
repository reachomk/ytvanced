package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.youtube.R;

/* renamed from: hjc */
final /* synthetic */ class hjc implements Runnable {
    private final hja a;
    private final ViewGroup b;
    private final SlimStatusBar c;
    private final boolean d;
    private final boolean e;

    hjc(hja hja, ViewGroup viewGroup, SlimStatusBar slimStatusBar, boolean z, boolean z2) {
        this.a = hja;
        this.b = viewGroup;
        this.c = slimStatusBar;
        this.d = z;
        this.e = z2;
    }

    public final void run() {
        hja hja = this.a;
        ViewGroup viewGroup = this.b;
        SlimStatusBar slimStatusBar = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        if (!hja.c(viewGroup, slimStatusBar)) {
            if (slimStatusBar.getParent() != null) {
                viewGroup.endViewTransition(slimStatusBar);
            }
            hja.b(viewGroup, slimStatusBar);
            viewGroup.addView(slimStatusBar);
            slimStatusBar.post(new hjg(viewGroup, slimStatusBar));
        }
        if (!z) {
            hja.j = 2;
            slimStatusBar.announceForAccessibility(slimStatusBar.getContext().getString(R.string.offline_bottom_status_bar_connection_lost));
            hja.a(acwc.OFFLINE_CONNECTIVITY_DISCONNECTED_BAR);
        } else if (z2) {
            hja.j = 5;
            slimStatusBar.announceForAccessibility(slimStatusBar.getContext().getString(R.string.bottom_status_bar_incognito_mode));
        } else {
            hja.j = 4;
            slimStatusBar.announceForAccessibility(slimStatusBar.getContext().getString(R.string.offline_bottom_status_bar_connection_regained));
            hja.a(acwc.OFFLINE_CONNECTIVITY_RECONNECTED_BAR);
        }
    }
}
