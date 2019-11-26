package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: bjj */
public final class bjj {
    public final bkj a = new bkj();
    public Map b;
    public Map c;
    public Map d;
    public aaf e;
    public zr f;
    public List g;
    public Rect h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public int m = 0;
    private final HashSet n = new HashSet();

    public final void a(String str) {
        bpb.a(str);
        this.n.add(str);
    }

    public final void a() {
        this.l = true;
    }

    public final void a(int i) {
        this.m += i;
    }

    public final bnv a(long j) {
        return (bnv) this.f.a(j);
    }

    public final float b() {
        return (float) ((long) ((c() / this.k) * 1000.0f));
    }

    public final float c() {
        return this.j - this.i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LottieComposition:\n");
        for (bnv a : this.g) {
            stringBuilder.append(a.a("\t"));
        }
        return stringBuilder.toString();
    }
}
