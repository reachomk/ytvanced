package defpackage;

import android.content.Intent;
import com.google.android.libraries.youtube.comment.image.ImageGalleryActivity;

/* renamed from: lxy */
public final /* synthetic */ class lxy implements lye {
    private final nn a;

    public lxy(nn nnVar) {
        this.a = nnVar;
    }

    public final Intent a(apxu apxu) {
        Intent intent = new Intent(this.a, ImageGalleryActivity.class);
        intent.putExtra("navigation_endpoint", apxu.toByteArray());
        return intent.addFlags(536870912);
    }
}
