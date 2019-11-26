package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: anip */
final class anip extends anin {
    anip(aniq aniq, amuh amuh) {
        super(aniq, amuh);
    }

    public final /* synthetic */ Object a(List list) {
        ArrayList a = amvj.a(list.size());
        for (amqp amqp : list) {
            a.add(amqp != null ? amqp.c() : null);
        }
        return Collections.unmodifiableList(a);
    }
}
