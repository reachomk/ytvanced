package defpackage;

import android.animation.ObjectAnimator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: uja */
public final class uja {
    public static final uja a = new uja(1);
    private static final ujd h = new ujd();
    public final long b;
    public boolean c;
    public ujc d;
    public ObjectAnimator e;
    public final List f = new CopyOnWriteArrayList();
    public boolean g;

    public uja(long j) {
        this.b = j;
        this.d = new ujb(0, j);
    }

    public static double a(double d, double d2, float f) {
        d2 -= d;
        double d3 = (double) f;
        Double.isNaN(d3);
        return d + (d2 * d3);
    }

    public final void a(uje uje) {
        this.f.add(uje);
    }

    public final void b(uje uje) {
        this.f.remove(uje);
    }

    public final boolean a() {
        ObjectAnimator objectAnimator = this.e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final long a(float f) {
        return this.d.c(f);
    }

    public final long b(float f) {
        return this.d.b(f);
    }

    public final float a(long j) {
        return this.d.a(j);
    }

    public final void a(ujb ujb, boolean z) {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.e = null;
        }
        uhy.b(this.d instanceof ujb);
        ujb ujb2 = (ujb) this.d;
        ujb ujb3 = !z ? ujb : ujb2;
        if (z) {
            ujb2 = ujb;
        }
        uiz uiz = new uiz(this, ujb3, ujb2, ujb);
        float f = 1.0f;
        float f2 = !z ? 1.0f : 0.0f;
        if (!z) {
            f = 0.0f;
        }
        uiz.a(f2);
        this.e = new ObjectAnimator();
        this.e.setTarget(uiz);
        this.e.setProperty(h);
        this.e.setPropertyName(h.getName());
        this.e.setFloatValues(new float[]{f});
        this.e.addListener(new ujg(this, ujb));
        this.e.setDuration(150);
        this.e.start();
        this.d = uiz;
        boolean z2 = this.c;
        this.c = z;
        if (z2 != z) {
            for (uje Q_ : this.f) {
                Q_.Q_();
            }
        }
    }

    public final void b() {
        for (uje o : this.f) {
            o.o();
        }
    }
}
