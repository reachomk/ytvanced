package defpackage;

/* renamed from: ill */
final /* synthetic */ class ill implements bcaa {
    private final ilf a;

    ill(ilf ilf) {
        this.a = ilf;
    }

    public final Object get() {
        Boolean bool = this.a.j;
        boolean z = false;
        if (!(bool == null || bool.booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
