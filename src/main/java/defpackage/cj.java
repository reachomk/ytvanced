package defpackage;

/* renamed from: cj */
public enum cj {
    DOUBLE_OPTIONAL,
    DOUBLE_REQUIRED;

    public static cj a(String str) {
        return (cj) Enum.valueOf(cj.class, str);
    }
}
