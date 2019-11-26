package defpackage;

import android.net.Uri;
import android.provider.MediaStore.Video.Media;
import java.io.File;

/* renamed from: agmu */
public final class agmu implements agmv {
    public final void a(File file) {
    }

    static {
        Uri[] uriArr = new Uri[]{Media.EXTERNAL_CONTENT_URI, Media.INTERNAL_CONTENT_URI};
    }
}
