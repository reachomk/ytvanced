package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ahqh */
public final class ahqh implements ahsb {
    public final ajen a;
    public final ahqj b;
    public final boolean c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private float e;
    private float f;

    public ahqh(ajen ajen, ajex ajex, boolean z) {
        this.a = (ajen) amqw.a((Object) ajen);
        this.c = z;
        if (z) {
            this.b = new ahqj(this.d, ajex);
        } else {
            this.b = null;
        }
    }

    public final void a() {
        if (this.c) {
            ahqj ahqj = this.b;
            Handler handler = ahqj.a;
            if (handler != null) {
                handler.removeCallbacks(ahqj.h);
            }
            ahqj.i = true;
            ahqj.a(0);
        }
    }

    public final void a(float[] fArr) {
        if (this.c) {
            ahqj ahqj = this.b;
            if (!ahqj.g) {
                long j = ahqj.j;
                long currentTimeMillis = (System.currentTimeMillis() - ahqj.k) + j;
                long j2 = ahqj.l;
                if (currentTimeMillis > j2) {
                    if (j <= j2) {
                        j = currentTimeMillis;
                    }
                    if (j <= 2000 + j2 || j2 == -1) {
                        ahqj.l = j;
                        Handler handler = ahqj.a;
                        if (handler != null) {
                            handler.post(new ahql(ahqj, fArr, j));
                        }
                    }
                }
            }
        }
    }

    public final void a(float f, float f2) {
        if (f != this.e || f2 != this.f) {
            this.d.post(new ahqg(this, f, f2));
            this.e = f;
            this.f = f2;
        }
    }
}
