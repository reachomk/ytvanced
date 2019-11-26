package defpackage;

import java.io.Serializable;

/* renamed from: anas */
final class anas implements Serializable {
    public static final long serialVersionUID = 0;
    private final String a;
    private final int b;
    private final String c;

    private final Object readResolve() {
        return new anaq(this.a, this.b, this.c);
    }

    /* synthetic */ anas(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }
}
