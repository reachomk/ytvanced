package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: bbkv */
public final class bbkv {
    public static final bbkv b = new bbkv(bblb.a, bbky.a, bble.a);
    public final bble a;
    private final bblb c;
    private final bbky d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbkv) {
            bbkv bbkv = (bbkv) obj;
            return this.c.equals(bbkv.c) && this.d.equals(bbkv.d) && this.a.equals(bbkv.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.a);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 45) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("SpanContext{traceId=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", spanId=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", traceOptions=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private bbkv(bblb bblb, bbky bbky, bble bble) {
        this.c = bblb;
        this.d = bbky;
        this.a = bble;
    }

    static {
        bbli bbli = new bbli(bbli.c);
        ArrayList arrayList = bbli.b;
        bblf bblf = bbli.a;
    }
}
