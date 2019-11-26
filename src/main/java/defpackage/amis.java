package defpackage;

/* renamed from: amis */
final class amis extends alzj {
    private final /* synthetic */ bbnw a;
    private final /* synthetic */ amec b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ bbnr d;
    private final /* synthetic */ amip e;

    amis(amip amip, amec amec, bbnw bbnw, amec amec2, boolean z, bbnr bbnr) {
        this.e = amip;
        this.a = bbnw;
        this.b = amec2;
        this.c = z;
        this.d = bbnr;
        super(amec);
    }

    public final void b(amdz amdz) {
        bbnw bbnw = this.a;
        if (bbnw != null) {
            try {
                bbnw.accept(amdz);
            } catch (Exception unused) {
            }
        }
        int a = amee.a(this.b.b);
        if (a != 0 && a == 4 && !amdz.h()) {
            if (this.c && this.e.d()) {
                if (!amdz.g()) {
                    ambw ambw = this.e.b;
                    String a2 = amdz.a();
                    int i = this.e.g;
                    int a3 = ayuc.a(this.b.c);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    aysy aysy = (aysy) aysv.j.createBuilder();
                    aysy.a(27);
                    ayta ayta = (ayta) aysx.e.createBuilder();
                    ayta.a(a2);
                    aysy.a(ayta);
                    aysy.copyOnWrite();
                    aysv aysv = (aysv) aysy.instance;
                    if (i != 0) {
                        aysv.a |= 1024;
                        aysv.d = i - 1;
                        aysy.copyOnWrite();
                        aysv = (aysv) aysy.instance;
                        aysv.a |= 2048;
                        aysv.e = a3 - 1;
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.a((aysv) ((anxl) aysy.build()));
                        ambw.a.a((asmw) ((anxl) asmz.build()));
                    } else {
                        throw new NullPointerException();
                    }
                }
                amdz.a(true);
            } else if (!this.c && this.e.e()) {
                amdz.a(true);
            }
        }
    }

    public final bbnr a() {
        return this.d;
    }
}
