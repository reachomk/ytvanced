package defpackage;

import java.util.Arrays;

/* renamed from: bazs */
public final class bazs {
    public String a = "unknown-authority";
    public barq b = barq.b;
    public String c;
    public batk d;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bazs) {
            bazs bazs = (bazs) obj;
            if (this.a.equals(bazs.a) && this.b.equals(bazs.b) && amqq.a(this.c, bazs.c) && amqq.a(this.d, bazs.d)) {
                return true;
            }
        }
        return false;
    }
}
