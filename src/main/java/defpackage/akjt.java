package defpackage;

import java.util.Set;

/* renamed from: akjt */
public class akjt extends taa implements akoq {
    public akjt(Set set, int i, float f) {
        super(i, f);
    }

    public final void a(akor akor, aknh aknh, int i) {
        Object obj = null;
        if (!this.k.isEmpty()) {
            if (this.i == 0 && this.j == 0) {
                a();
            }
            int a = a(i);
            if (a < this.k.size()) {
                tad tad = (tad) this.k.get(a);
                if (tad.a == i) {
                    obj = tad.b;
                }
            }
        }
        if (obj != null) {
            akor.a("PresenterPreparerContextDecoratorKey", obj);
        }
    }
}
