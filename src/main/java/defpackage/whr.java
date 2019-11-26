package defpackage;

import android.graphics.drawable.Drawable;
import com.android.ex.photo.views.PhotoView;
import com.google.android.libraries.youtube.comment.image.ImageViewerActivity;

/* renamed from: whr */
final /* synthetic */ class whr implements Runnable {
    private final ImageViewerActivity a;
    private final Drawable b;

    whr(ImageViewerActivity imageViewerActivity, Drawable drawable) {
        this.a = imageViewerActivity;
        this.b = drawable;
    }

    public final void run() {
        boolean z;
        ImageViewerActivity imageViewerActivity = this.a;
        Drawable drawable = this.b;
        PhotoView photoView = imageViewerActivity.g;
        if (drawable != null) {
            Drawable drawable2 = photoView.a;
            if (drawable != drawable2) {
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                photoView.a = drawable;
                photoView.i = 0.0f;
                photoView.a.setCallback(photoView);
                z = true;
                photoView.a(z);
                photoView.invalidate();
                imageViewerActivity.g.setVisibility(0);
            }
        }
        z = false;
        photoView.a(z);
        photoView.invalidate();
        imageViewerActivity.g.setVisibility(0);
    }
}
