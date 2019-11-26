package defpackage;

/* renamed from: how */
final class how implements ajth {
    private final aafj a;

    how(String str, akab akab) {
        if (akab != null) {
            for (akad akad : akab.b) {
                ajwt ajwt = akad.c;
                if (ajwt != null && str.equals(ajwt.f)) {
                    this.a = new aafj(ajwt);
                    return;
                }
            }
        }
        this.a = null;
    }

    public final ajtk a() {
        return null;
    }

    public final void a(Object obj) {
    }

    public final byte[] b() {
        return zzp.b;
    }

    public final Object c() {
        return this.a;
    }
}
