package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.comment.image.ImageViewerActivity;

/* renamed from: whp */
public final /* synthetic */ class whp implements OnClickListener {
    private final ImageViewerActivity a;

    public whp(ImageViewerActivity imageViewerActivity) {
        this.a = imageViewerActivity;
    }

    public final void onClick(View view) {
        ImageViewerActivity imageViewerActivity = this.a;
        if (imageViewerActivity.j.getVisibility() != 0) {
            imageViewerActivity.j.setVisibility(0);
            imageViewerActivity.h.setVisibility(0);
            imageViewerActivity.i.setVisibility(0);
            imageViewerActivity.a(true);
            return;
        }
        imageViewerActivity.j.setVisibility(4);
        imageViewerActivity.h.setVisibility(4);
        imageViewerActivity.i.setVisibility(4);
        imageViewerActivity.a(false);
    }
}
