package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: acyl */
final class acyl implements acyb {
    private final acxx a;
    private final Class b;
    private final amqv c;
    private final boolean d;
    private final Set e = new HashSet();
    private final Set f = new HashSet();
    private final /* synthetic */ acyi g;

    public final acyb a(Class cls) {
        this.e.add((Class) amqw.a((Object) cls));
        return this;
    }

    public final acyb b(Class cls) {
        this.f.add((Class) amqw.a((Object) cls));
        return this;
    }

    /* synthetic */ acyl(acyi acyi, acxx acxx, Class cls, amqv amqv, boolean z) {
        this.g = acyi;
        this.a = (acxx) amqw.a((Object) acxx);
        this.b = cls;
        this.c = amqv;
        this.d = z;
    }
}
