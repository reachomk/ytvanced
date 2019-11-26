package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.comment.image.ImageViewerActivity;

/* renamed from: whq */
public final /* synthetic */ class whq implements OnClickListener {
    private final ImageViewerActivity a;
    private final aphg b;

    public whq(ImageViewerActivity imageViewerActivity, aphg aphg) {
        this.a = imageViewerActivity;
        this.b = aphg;
    }

    public final void onClick(View view) {
        ImageViewerActivity imageViewerActivity = this.a;
        aphg aphg = this.b;
        if ((aphg.a & 4096) != 0) {
            aaas aaas = ImageViewerActivity.l.a;
            apxu apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, ImageViewerActivity.k);
        }
        imageViewerActivity.finish();
    }
}
