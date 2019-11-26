package defpackage;

import com.android.ex.photo.views.PhotoView;

/* renamed from: bpt */
public final class bpt implements Runnable {
    private final PhotoView a;
    private float b;
    private long c;
    private boolean d;

    public bpt(PhotoView photoView) {
        this.a = photoView;
    }

    public final void run() {
        if (!this.d) {
            if (this.b != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.c;
                float f = ((float) (j != -1 ? currentTimeMillis - j : 0)) * 0.0f;
                float f2 = this.b;
                if ((f2 < 0.0f && f2 + f > 0.0f) || (f2 > 0.0f && f2 + f < 0.0f)) {
                    f = -f2;
                }
                PhotoView photoView = this.a;
                photoView.k += f;
                photoView.b.postRotate(f, (float) (photoView.getWidth() / 2), (float) (photoView.getHeight() / 2));
                photoView.invalidate();
                f2 = this.b + f;
                this.b = f2;
                if (f2 == 0.0f) {
                    this.d = true;
                }
                this.c = currentTimeMillis;
            }
            if (!this.d) {
                this.a.post(this);
            }
        }
    }
}
