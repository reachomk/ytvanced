package defpackage;

import java.io.Serializable;

/* renamed from: bcpw */
public abstract class bcpw implements Serializable {
    public static final bcpw a = new bcpz("eras", (byte) 1);
    public static final bcpw b = new bcpz("centuries", (byte) 2);
    public static final bcpw c = new bcpz("weekyears", (byte) 3);
    public static final bcpw d = new bcpz("years", (byte) 4);
    public static final bcpw e = new bcpz("months", (byte) 5);
    public static final bcpw f = new bcpz("weeks", (byte) 6);
    public static final bcpw g = new bcpz("days", (byte) 7);
    public static final bcpw h = new bcpz("halfdays", (byte) 8);
    public static final bcpw i = new bcpz("hours", (byte) 9);
    public static final bcpw j = new bcpz("minutes", (byte) 10);
    public static final bcpw k = new bcpz("seconds", (byte) 11);
    public static final bcpw l = new bcpz("millis", (byte) 12);
    public static final long serialVersionUID = 8765135187319L;
    public final String m;

    protected bcpw(String str) {
        this.m = str;
    }

    public abstract bcpx a(bcpl bcpl);

    public final String toString() {
        return this.m;
    }
}
