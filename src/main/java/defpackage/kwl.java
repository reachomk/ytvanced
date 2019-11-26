package defpackage;

import java.util.Arrays;

/* renamed from: kwl */
final class kwl {
    private final String a;
    private final String b;

    public kwl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kwl) {
            kwl kwl = (kwl) obj;
            if (amqq.a(this.a, kwl.a) && amqq.a(this.b, kwl.b)) {
                return true;
            }
        }
        return false;
    }
}
