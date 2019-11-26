package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import com.google.android.libraries.youtube.comment.image.ImageViewerActivity;
import com.google.android.youtube.R;

/* renamed from: whs */
public final class whs implements OnGlobalLayoutListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ ImageViewerActivity b;

    public whs(ImageViewerActivity imageViewerActivity, View view) {
        this.b = imageViewerActivity;
        this.a = view;
    }

    public final void onGlobalLayout() {
        ImageView imageView = (ImageView) this.b.findViewById(R.id.image_viewer_like_button);
        ImageView imageView2 = (ImageView) this.b.findViewById(R.id.image_viewer_dislike_button);
        ImageView imageView3 = (ImageView) this.b.findViewById(R.id.image_viewer_reply_button);
        ImageView imageView4 = (ImageView) this.b.findViewById(R.id.image_viewer_close_button);
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.image_viewer_like_dislike_buttons_tap_target_padding_x);
        int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.image_viewer_reply_button_tap_target_padding_x);
        int dimensionPixelSize3 = this.b.getResources().getDimensionPixelSize(R.dimen.image_viewer_close_button_tap_target_padding_x);
        wlj.a(imageView, dimensionPixelSize, 0, dimensionPixelSize, 0);
        wlj.a(imageView2, dimensionPixelSize, 0, dimensionPixelSize, 0);
        wlj.a(imageView3, dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        wlj.a(imageView4, dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
