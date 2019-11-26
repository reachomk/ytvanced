package defpackage;

import android.widget.Toast;
import com.google.android.libraries.youtube.comment.image.ImageViewerActivity;
import com.google.android.youtube.R;

/* renamed from: wht */
public final class wht implements wxg {
    private final /* synthetic */ ImageViewerActivity a;

    public wht(ImageViewerActivity imageViewerActivity) {
        this.a = imageViewerActivity;
    }

    private final void a() {
        Toast.makeText(this.a.getApplicationContext(), R.string.image_viewer_failed_to_load, 0).show();
    }
}
