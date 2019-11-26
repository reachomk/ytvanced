package defpackage;

/* renamed from: acse */
public final /* synthetic */ class acse implements abyk {
    private final acrz a;

    public acse(acrz acrz) {
        this.a = acrz;
    }

    public final void a(boolean z) {
        acrz acrz = this.a;
        acrz.o = z;
        abyz abyz = acrz.i;
        if (abyz != null) {
            boolean z2 = false;
            if (!acrz.b && z) {
                z2 = true;
            }
            abyz.a = z2;
        }
        acab acab = acrz.m;
        if (acab != null) {
            acab.f();
        }
    }
}
