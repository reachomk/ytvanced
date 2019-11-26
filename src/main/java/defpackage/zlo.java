package defpackage;

/* renamed from: zlo */
final /* synthetic */ class zlo implements zmu {
    private final zld a;

    zlo(zld zld) {
        this.a = zld;
    }

    public final void a(Object obj) {
        zld zld = this.a;
        znl znl = (znl) obj;
        synchronized (zld.e) {
            zld.e.put(znl.b, znl);
        }
        zld.i.a(znl.a);
    }
}
