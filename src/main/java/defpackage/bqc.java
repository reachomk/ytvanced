package defpackage;

/* renamed from: bqc */
public class bqc implements bqm {
    public int a;
    private int b;
    private final int c;
    private final float d;

    public bqc() {
        this(2500, 1, 1.0f);
    }

    public bqc(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final int aZ_() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public void a_(bqn bqn) {
        int i = this.a + 1;
        this.a = i;
        int i2 = this.b;
        this.b = i2 + ((int) (((float) i2) * this.d));
        if (i > this.c) {
            throw bqn;
        }
    }
}
