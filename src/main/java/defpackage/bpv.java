package defpackage;

import com.android.ex.photo.views.PhotoView;

/* renamed from: bpv */
public final class bpv implements Runnable {
    public final PhotoView a;
    public float b;
    public float c;
    public long d = -1;
    public boolean e;
    public boolean f;

    public bpv(PhotoView photoView) {
        this.a = photoView;
    }

    public final void a() {
        this.e = false;
        this.f = true;
    }

    public final void run() {
        if (!this.f) {
            float f;
            float f2;
            float f3;
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.d;
            float f4 = j != -1 ? (float) (currentTimeMillis - j) : 0.0f;
            if (j == -1) {
                this.d = currentTimeMillis;
            }
            if (f4 < 100.0f) {
                f = 100.0f - f4;
                f2 = (this.b / f) * 10.0f;
                f3 = (this.c / f) * 10.0f;
                if (Math.abs(f2) > Math.abs(this.b) || Float.isNaN(f2)) {
                    f2 = this.b;
                }
                if (Math.abs(f3) > Math.abs(this.c) || Float.isNaN(f3)) {
                    f3 = this.c;
                }
            } else {
                f2 = this.b;
                f3 = this.c;
            }
            this.a.a(f2, f3);
            f = this.b - f2;
            this.b = f;
            f2 = this.c - f3;
            this.c = f2;
            if (f == 0.0f && f2 == 0.0f) {
                a();
            }
            if (!this.f) {
                this.a.post(this);
            }
        }
    }
}
