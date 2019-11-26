package defpackage;

/* renamed from: aknc */
public final class aknc extends aknb {
    public final aknh a;
    public int b = Integer.MAX_VALUE;

    public aknc(aknh aknh) {
        this.a = (aknh) amqw.a((Object) aknh);
        aknh.b(new aknf(this));
    }

    public final void b(int i) {
        xak.a();
        if (this.b != i) {
            int d = this.a.d();
            int min = Math.min(this.b, d);
            d = Math.min(i, d);
            this.b = i;
            if (min == d) {
                return;
            }
            if (d <= min) {
                d(d, min - d);
            } else {
                b(min, d - min);
            }
        }
    }

    public final int d() {
        return Math.min(this.b, this.a.d());
    }

    public final boolean isEmpty() {
        return d() == 0;
    }

    public final Object c(int i) {
        return (i < 0 || i >= d()) ? null : this.a.c(i);
    }

    public final long a(int i) {
        return (i < 0 || i >= d()) ? 0 : this.a.a(i);
    }
}
