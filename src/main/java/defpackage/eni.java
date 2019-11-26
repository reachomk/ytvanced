package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;

/* renamed from: eni */
public final /* synthetic */ class eni implements bcvk {
    private final YouTubePlayerOverlaysLayout a;

    public eni(YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout) {
        this.a = youTubePlayerOverlaysLayout;
    }

    public final void a(Object obj) {
        YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = this.a;
        Rect rect = (Rect) obj;
        if (!youTubePlayerOverlaysLayout.g.equals(rect)) {
            youTubePlayerOverlaysLayout.g.set(rect);
            youTubePlayerOverlaysLayout.requestLayout();
        }
    }
}
