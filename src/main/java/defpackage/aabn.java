package defpackage;

/* renamed from: aabn */
final /* synthetic */ class aabn implements Runnable {
    private final aabs a;

    public aabn(aabs aabs) {
        this.a = aabs;
    }

    public final void run() {
        aabs aabs = this.a;
        aabs.d = false;
        for (String str : aabs.a.keySet()) {
            aabt d = aabs.d(str);
            if (d.b != null) {
                aabs.a(aadz.f().a(str).a(d.b).a(d.c).b(null).b(aadu.a).d());
            }
        }
        if (!aabs.a.isEmpty()) {
            xtl.d("[ENTITY] Internal storage entity map was not clear after removals.");
            aabs.a.clear();
        }
        for (aaeh a : aabs.b.values()) {
            a.a();
        }
        aabs.b.clear();
        for (aaeh a2 : aabs.c.values()) {
            a2.a();
        }
        aabs.c.clear();
    }
}
