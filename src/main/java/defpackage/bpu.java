package defpackage;

import com.android.ex.photo.views.PhotoView;

/* renamed from: bpu */
public final class bpu implements Runnable {
    private final /* synthetic */ PhotoView a;

    public bpu(PhotoView photoView) {
        this.a = photoView;
    }

    public final void run() {
        float a = this.a.a();
        PhotoView photoView = this.a;
        float f = photoView.j;
        if (a > f) {
            f = 1.0f / (1.0f - (f / a));
            float f2 = 1.0f - f;
            float width = (float) (photoView.getWidth() / 2);
            float height = (float) (this.a.getHeight() / 2);
            float f3 = this.a.l.left * f2;
            float f4 = this.a.l.top * f2;
            float width2 = (((float) this.a.getWidth()) * f) + (this.a.l.right * f2);
            float height2 = (((float) this.a.getHeight()) * f) + (this.a.l.bottom * f2);
            if (width2 > f3) {
                width2 = (width2 + f3) / 2.0f;
            } else {
                width2 = Math.min(Math.max(width2, width), f3);
            }
            if (height2 > f4) {
                height2 = (height2 + f4) / 2.0f;
            } else {
                height2 = Math.min(Math.max(height2, height), f4);
            }
            photoView = this.a;
            photoView.h.a(a, photoView.j, width2, height2);
        }
    }
}
