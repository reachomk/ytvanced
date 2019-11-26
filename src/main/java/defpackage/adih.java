package defpackage;

/* renamed from: adih */
public enum adih {
    UNSUPPORTED,
    ENABLED,
    DISABLED;

    public static adih a(String str) {
        return (adih) Enum.valueOf(adih.class, str);
    }
}
