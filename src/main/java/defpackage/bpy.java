package defpackage;

import com.android.ex.photo.views.PhotoView;

/* renamed from: bpy */
public final class bpy implements Runnable {
    public final PhotoView a;
    public float b;
    public float c;
    public float d;
    public float e;
    public long f = -1;
    public boolean g;
    public boolean h;

    public bpy(PhotoView photoView) {
        this.a = photoView;
    }

    public final void a() {
        this.g = false;
        this.h = true;
    }

    public final void run() {
        if (!this.h) {
            float f;
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f;
            float f2 = j != -1 ? ((float) (currentTimeMillis - j)) / 1000.0f : 0.0f;
            int a = this.a.a(this.b * f2, this.c * f2);
            this.f = currentTimeMillis;
            float f3 = this.d * f2;
            if (Math.abs(this.b) > Math.abs(f3)) {
                this.b -= f3;
            } else {
                this.b = 0.0f;
            }
            f3 = this.e * f2;
            if (Math.abs(this.c) > Math.abs(f3)) {
                f3 = this.c - f3;
                this.c = f3;
                f = f3;
            } else {
                this.c = 0.0f;
                f3 = 0.0f;
                f = 0.0f;
            }
            f2 = this.b;
            if ((f2 == 0.0f && r0 == 0.0f) || a == 0) {
                a();
                this.a.b();
            } else {
                float f4 = 20000.0f;
                if (a == 1) {
                    if (f2 <= 0.0f) {
                        f4 = -20000.0f;
                    }
                    this.d = f4;
                    this.e = 0.0f;
                    this.c = 0.0f;
                } else if (a == 2) {
                    this.d = 0.0f;
                    if (f <= 0.0f) {
                        f4 = -20000.0f;
                    }
                    this.e = f4;
                    this.b = 0.0f;
                }
            }
            if (!this.h) {
                this.a.post(this);
            }
        }
    }
}
