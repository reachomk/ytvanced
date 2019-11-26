package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bavg */
public final class bavg {
    public final List a;
    public final barq b;
    private final bavb c = null;

    bavg(List list, barq barq) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = (barq) amqw.a((Object) barq, (Object) "attributes");
    }

    public static bavf a() {
        return new bavf();
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("addresses", this.a);
        a.a("attributes", this.b);
        a.a("serviceConfig", null);
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bavg) {
            bavg bavg = (bavg) obj;
            if (amqq.a(this.a, bavg.a) && amqq.a(this.b, bavg.b) && amqq.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null});
    }
}
