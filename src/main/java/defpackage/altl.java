package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: altl */
public final class altl {
    public final String a;
    public final List b;

    public altl(String str, List list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof altl) {
            altl altl = (altl) obj;
            if (amqq.a(this.a, altl.a) && amqq.a(this.b, altl.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
