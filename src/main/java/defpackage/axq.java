package defpackage;

import android.graphics.Typeface;

/* renamed from: axq */
public final class axq {
    public final bff a;
    public final char[] b;
    public final axt c;
    public final Typeface d;

    axq() {
        this.d = null;
        this.a = null;
        this.c = new axt(1024);
        this.b = new char[0];
    }

    public axq(Typeface typeface, bff bff) {
        this.d = typeface;
        this.a = bff;
        this.c = new axt(1024);
        int a = this.a.a();
        this.b = new char[(a + a)];
        a = this.a.a();
        for (int i = 0; i < a; i++) {
            Object axa = new axa(this, i);
            Character.toChars(axa.b(), this.b, i + i);
            aad.a(axa, (Object) "emoji metadata cannot be null");
            aad.a(axa.d() > 0, (Object) "invalid metadata codepoint length");
            this.c.a(axa, 0, axa.d() - 1);
        }
    }
}
