package defpackage;

/* renamed from: bars */
public final class bars {
    private final String a;

    private bars(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }

    public static bars a(String str) {
        return new bars(str);
    }
}
