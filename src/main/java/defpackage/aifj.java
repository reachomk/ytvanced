package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aifj */
public final class aifj implements aifi {
    private final List a;

    public aifj(aifi... aifiArr) {
        this.a = (List) amqw.a(Arrays.asList(aifiArr));
    }

    public final void a(List list) {
        for (aifi a : this.a) {
            a.a(list);
        }
    }

    public final void c() {
        for (aifi c : this.a) {
            c.c();
        }
    }

    public final void d() {
        for (aifi d : this.a) {
            d.d();
        }
    }

    public final void a(float f) {
        for (aifi a : this.a) {
            a.a(f);
        }
    }

    public final void a(ajji ajji) {
        for (aifi a : this.a) {
            a.a(ajji);
        }
    }

    public final void a(int i, int i2) {
        for (aifi a : this.a) {
            a.a(i, i2);
        }
    }
}
