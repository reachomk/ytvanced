package defpackage;

import android.media.VolumeProvider;
import android.os.Build.VERSION;

/* renamed from: vq */
public class vq {
    public final int a;
    public final int b;
    public int c;
    public vs d;
    private VolumeProvider e;

    public vq(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public void a(int i) {
    }

    public void b(int i) {
    }

    public final Object a() {
        if (this.e == null && VERSION.SDK_INT >= 21) {
            this.e = new vt(this, this.a, this.b, this.c);
        }
        return this.e;
    }
}
