package defpackage;

/* renamed from: av */
final class av implements ax {
    private final /* synthetic */ at a;

    av(at atVar) {
        this.a = atVar;
    }

    public final void a() {
    }

    public final void b() {
        at atVar = this.a;
        int i = atVar.a + 1;
        atVar.a = i;
        if (i == 1 && atVar.d) {
            atVar.f.a(aa.ON_START);
            atVar.d = false;
        }
    }

    public final void c() {
        at atVar = this.a;
        int i = atVar.b + 1;
        atVar.b = i;
        if (i != 1) {
            return;
        }
        if (atVar.c) {
            atVar.f.a(aa.ON_RESUME);
            atVar.c = false;
            return;
        }
        atVar.e.removeCallbacks(atVar.g);
    }
}
