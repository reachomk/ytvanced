package defpackage;

/* renamed from: ce */
enum ce {
    n,
    i,
    f,
    t,
    v,
    w,
    j;

    public static ce a(String str) {
        return (ce) Enum.valueOf(ce.class, str);
    }
}
