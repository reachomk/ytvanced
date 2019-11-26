package defpackage;

/* renamed from: acsi */
public final class acsi implements abyk {
    private final /* synthetic */ abyz a;
    private final /* synthetic */ acrz b;

    public acsi(acrz acrz, abyz abyz) {
        this.b = acrz;
        this.a = abyz;
    }

    public final void a(boolean z) {
        acrz acrz = this.b;
        acrz.o = z;
        abyz abyz = this.a;
        boolean z2 = false;
        if (!acrz.b && z) {
            z2 = true;
        }
        abyz.a = z2;
        acab acab = acrz.m;
        if (acab != null) {
            acab.f();
        }
    }
}
