package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aijz */
public class aijz {
    public final Set e = new CopyOnWriteArraySet();
    public aikr f;

    public final boolean b(aikr aikr) {
        return amqq.a(this.f, aikr);
    }

    public void a(aikr aikr) {
        if (!b(aikr)) {
            this.f = aikr;
            for (aikd a : this.e) {
                a.a(aikr);
            }
        }
    }
}
