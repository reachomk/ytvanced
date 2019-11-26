package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.comment.image.ImageViewerActivity;

/* renamed from: who */
public final /* synthetic */ class who implements OnClickListener {
    private final ImageViewerActivity a;

    public who(ImageViewerActivity imageViewerActivity) {
        this.a = imageViewerActivity;
    }

    public final void onClick(View view) {
        this.a.finish();
    }
}
