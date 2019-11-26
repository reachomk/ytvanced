package defpackage;

/* renamed from: zll */
final /* synthetic */ class zll implements zmq {
    private final zld a;
    private final zmm b;

    zll(zld zld, zmm zmm) {
        this.a = zld;
        this.b = zmm;
    }

    public final void a(Object obj) {
        zld zld = this.a;
        zmm zmm = this.b;
        zld.f = ((zmj) obj).a(ayzc.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS);
        zld.c.add(zmm.a(new zli(zld, zmm)));
    }
}
