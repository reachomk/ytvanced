package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bbbf */
final class bbbf {
    public final List a;
    public final List b;
    public final List c;

    bbbf(List list, List list2, List list3) {
        this.a = Collections.unmodifiableList((List) amqw.a((Object) list, (Object) "addresses"));
        this.b = Collections.unmodifiableList((List) amqw.a((Object) list2, (Object) "txtRecords"));
        this.c = Collections.unmodifiableList((List) amqw.a((Object) list3, (Object) "balancerAddresses"));
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("addresses", this.a);
        a.a("txtRecords", this.b);
        a.a("balancerAddresses", this.c);
        return a.toString();
    }
}
