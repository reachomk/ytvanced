package defpackage;

/* renamed from: ctf */
final class ctf implements cto {
    private ctf() {
    }

    public final String a() {
        return "rotation";
    }

    public final float a(Object obj) {
        return cte.a(obj, (cto) this).getRotation();
    }

    public final float a(clm clm) {
        return clm.g() ? clm.d() : 0.0f;
    }

    public final void a(Object obj, float f) {
        cte.a(obj, (cto) this).setRotation(f);
    }

    public final void b(Object obj) {
        cte.a(obj, (cto) this).setRotation(0.0f);
    }

    /* synthetic */ ctf(byte b) {
    }
}
