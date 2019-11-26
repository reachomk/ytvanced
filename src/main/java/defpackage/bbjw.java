package defpackage;

/* renamed from: bbjw */
public abstract class bbjw {
    bbjw() {
    }

    public abstract String a();

    public static bbjw a(String str) {
        boolean z = !str.isEmpty() && str.length() <= 255 && bbiu.a(str);
        bbit.a(z, "Invalid TagKey name: %s", str);
        return new bbjk(str);
    }
}
