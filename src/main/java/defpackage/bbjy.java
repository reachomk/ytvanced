package defpackage;

/* renamed from: bbjy */
public abstract class bbjy {
    bbjy() {
    }

    public abstract String a();

    public static bbjy a(String str) {
        boolean z = str.length() <= 255 && bbiu.a(str);
        bbit.a(z, "Invalid TagValue: %s", str);
        return new bbjm(str);
    }
}
