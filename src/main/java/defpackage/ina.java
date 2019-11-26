package defpackage;

/* renamed from: ina */
final /* synthetic */ class ina implements bcaa {
    private final imx a;

    ina(imx imx) {
        this.a = imx;
    }

    public final Object get() {
        Boolean bool = this.a.b;
        boolean z = false;
        if (!(bool == null || bool.booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
