package defpackage;

/* renamed from: amlc */
public enum amlc {
    DEFAULT,
    MINIMAL,
    CHROMELESS;

    public static amlc a(String str) {
        return (amlc) Enum.valueOf(amlc.class, str);
    }
}
