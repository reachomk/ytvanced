package defpackage;

/* renamed from: byn */
public final class byn implements bzq {
    private final byq a;

    public byn(byq byq) {
        this.a = byq;
    }

    public final bzp a(Object obj, int i, int i2, bsq bsq) {
        return new bzp(new chi(obj), new byp(obj.toString(), this.a));
    }

    public final boolean a(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
