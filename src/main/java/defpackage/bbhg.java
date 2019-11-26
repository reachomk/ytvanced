package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: bbhg */
public final class bbhg {
    public final String a;
    public final Map b;

    public bbhg(String str, Map map) {
        this.a = (String) amqw.a((Object) str, (Object) "policyName");
        this.b = (Map) amqw.a((Object) map, (Object) "rawConfigValue");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bbhg) {
            bbhg bbhg = (bbhg) obj;
            if (this.a.equals(bbhg.a) && this.b.equals(bbhg.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("policyName", this.a);
        a.a("rawConfigValue", this.b);
        return a.toString();
    }
}
