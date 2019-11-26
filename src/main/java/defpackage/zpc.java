package defpackage;

import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;

/* renamed from: zpc */
public final /* synthetic */ class zpc implements Runnable {
    private final GalleryActivity a;

    public zpc(GalleryActivity galleryActivity) {
        this.a = galleryActivity;
    }

    public final void run() {
        GalleryActivity galleryActivity = this.a;
        if (galleryActivity.m != null && galleryActivity.l == null) {
            if (galleryActivity.n) {
                galleryActivity.o = true;
            } else {
                galleryActivity.o();
            }
        }
    }
}
