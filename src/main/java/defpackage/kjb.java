package defpackage;

/* renamed from: kjb */
final class kjb implements akxu, xsu {
    public akxv a;
    public boolean b = true;
    public final /* synthetic */ kik c;

    public kjb(kik kik, akxv akxv) {
        this.c = kik;
        this.a = akxv;
        akxv.a((akxu) this);
    }

    public final void a(aafn aafn, boolean z) {
    }

    public final void b() {
    }

    public final void d() {
        if (this.a != null) {
            kik kik = this.c;
            if (kik.f != null) {
                String str = "REEL_REFRESH_IN_PROGRESS";
                if (kik.d.getBoolean(str, false) && this.b) {
                    this.c.d.edit().remove(str).apply();
                    this.c.f.post(new kja(this));
                }
            }
        }
    }

    public final void a() {
        this.b = true;
        d();
    }

    public final void e() {
        this.b = false;
    }

    public final void f() {
        this.b = false;
        c();
    }

    public final void c() {
        akxv akxv = this.a;
        if (akxv != null) {
            akxv.b((akxu) this);
            this.a = null;
        }
    }
}
