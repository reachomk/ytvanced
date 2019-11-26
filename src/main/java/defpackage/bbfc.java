package defpackage;

import java.util.Arrays;

/* renamed from: bbfc */
final class bbfc extends batz {
    public final barv a;
    public final baum b;
    public final bauw c;

    bbfc(bauw bauw, baum baum, barv barv) {
        this.c = (bauw) amqw.a((Object) bauw, (Object) "method");
        this.b = (baum) amqw.a((Object) baum, (Object) "headers");
        this.a = (barv) amqw.a((Object) barv, (Object) "callOptions");
    }

    public final baum b() {
        return this.b;
    }

    public final barv a() {
        return this.a;
    }

    public final bauw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bbfc bbfc = (bbfc) obj;
            return amqq.a(this.a, bbfc.a) && amqq.a(this.b, bbfc.b) && amqq.a(this.c, bbfc.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.a);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 31) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("[method=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" headers=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" callOptions=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
