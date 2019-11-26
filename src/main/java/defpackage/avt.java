package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* renamed from: avt */
public abstract class avt implements avp {
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public final awn d;
    public boolean e = false;
    public final float f = Float.MAX_VALUE;
    public final float g = -3.4028235E38f;
    public final float h;
    public final ArrayList i = new ArrayList();
    private long j = 0;
    private final ArrayList k = new ArrayList();

    avt(awm awm) {
        this.d = new avy(awm);
        this.h = 1.0f;
    }

    public abstract boolean b(long j);

    public final avt a(float f) {
        this.b = f;
        this.c = true;
        return this;
    }

    private static void a(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.e) {
            b();
        }
    }

    public final boolean a(long j) {
        long j2 = this.j;
        if (j2 == 0) {
            this.j = j;
            b(this.b);
            return false;
        }
        this.j = j;
        boolean b = b(j - j2);
        float min = Math.min(this.b, this.f);
        this.b = min;
        min = Math.max(min, this.g);
        this.b = min;
        b(min);
        if (b) {
            b();
        }
        return b;
    }

    private final void b() {
        int i = 0;
        this.e = false;
        avn a = avn.a();
        a.a.remove(this);
        int indexOf = a.b.indexOf(this);
        if (indexOf >= 0) {
            a.b.set(indexOf, null);
            a.d = true;
        }
        this.j = 0;
        this.c = false;
        while (i < this.k.size()) {
            if (this.k.get(i) != null) {
                ((awi) this.k.get(i)).a();
            }
            i++;
        }
        avt.a(this.k);
    }

    private final void b(float f) {
        this.d.a(f);
        for (int i = 0; i < this.i.size(); i++) {
            if (this.i.get(i) != null) {
                ((awl) this.i.get(i)).a(this.b);
            }
        }
        avt.a(this.i);
    }

    static {
        avs avs = new avs("translationX");
        awb awb = new awb("translationY");
        awa awa = new awa("translationZ");
        awd awd = new awd("scaleX");
        awc awc = new awc("scaleY");
        awf awf = new awf("rotation");
        awe awe = new awe("rotationX");
        awh awh = new awh("rotationY");
        awg awg = new awg("x");
        avv avv = new avv("y");
        avu avu = new avu("z");
        avx avx = new avx("alpha");
        avw avw = new avw("scrollX");
        avz avz = new avz("scrollY");
    }
}
