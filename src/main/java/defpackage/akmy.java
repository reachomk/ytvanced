package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: akmy */
public final class akmy implements akoq {
    private final List a = new ArrayList();

    public final void a(akoq akoq) {
        amqw.a((Object) akoq);
        this.a.add(akoq);
    }

    public final void a(akor akor, aknh aknh, int i) {
        for (akoq a : this.a) {
            a.a(akor, aknh, i);
        }
    }
}
