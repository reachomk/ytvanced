package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;

/* renamed from: bah */
public final class bah implements OnClickListener {
    private final /* synthetic */ MediaRouteExpandCollapseButton a;

    public bah(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        int i = mediaRouteExpandCollapseButton.e ^ 1;
        mediaRouteExpandCollapseButton.e = i;
        if (i != 0) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.a);
            this.a.a.start();
            mediaRouteExpandCollapseButton = this.a;
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.d);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.b);
            this.a.b.start();
            mediaRouteExpandCollapseButton = this.a;
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.c);
        }
        OnClickListener onClickListener = this.a.f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
