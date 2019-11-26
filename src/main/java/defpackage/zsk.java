package defpackage;

/* renamed from: zsk */
public final class zsk implements Comparable {
    public int a;
    public float b;
    public float c;

    zsk(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    /* Access modifiers changed, original: final */
    public final float a() {
        return this.c - this.b;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        int i;
        float a = a() - ((zsk) obj).a();
        if (Math.abs(a) < 0.001f) {
            i = 0;
        } else if (a > 0.0f) {
            return 1;
        } else {
            i = -1;
        }
        return i;
    }
}
