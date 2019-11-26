package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bauc */
public final class bauc {
    public final List a;
    public final barq b;
    private final Object c = null;

    public static baub a() {
        return new baub();
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("addresses", this.a);
        a.a("attributes", this.b);
        a.a("loadBalancingPolicyConfig", null);
        return a.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bauc) {
            bauc bauc = (bauc) obj;
            if (amqq.a(this.a, bauc.a) && amqq.a(this.b, bauc.b) && amqq.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ bauc(List list, barq barq) {
        this.a = Collections.unmodifiableList(new ArrayList((Collection) amqw.a((Object) list, (Object) "addresses")));
        this.b = (barq) amqw.a((Object) barq, (Object) "attributes");
    }
}
