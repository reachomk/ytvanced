package defpackage;

/* renamed from: uvq */
public final class uvq implements uvp {
    public final boolean a() {
        return false;
    }

    public final void a(uvs uvs) {
        xtl.d("Fingerprint auth not available for pre M devices. Ignore fingerprint authenticate attempt");
        ((uuo) uvs).e();
    }

    public final void b() {
        xtl.d("Fingerprint auth not available for pre M devices. Ignore fingerprint cancel attempt");
    }
}
