package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: flw */
public class flw extends akwy {
    private final foi a;
    private final akdi b;

    protected flw(akpe akpe, akwn akwn, xci xci, xoi xoi, zzl zzl, akei akei, sxd sxd, aket aket, akyd akyd, foi foi, RecyclerView recyclerView, aana aana, akwb akwb, acvx acvx, akpb akpb, akxw akxw, akxj akxj, int i, akhs akhs, syb syb) {
        acvx acvx2 = acvx;
        akei akei2 = akei;
        sxd sxd2 = sxd;
        acvx acvx3 = acvx;
        aket aket2 = aket;
        akzk akzk = new akzk(akei2, sxd2, acvx3, aket2, aket.a().a(akhs), syb);
        super(akyd, recyclerView, akpe, akwn, aana, xci, akwb, xoi, acvx, akpb, akxw, akxj, akzk);
        int i2 = i;
        a(new flx(i2, akpb, zzl));
        a(new akya(this));
        this.a = foi;
        apv apv = this.a;
        if (apv != null) {
            RecyclerView recyclerView2 = this.o;
            if (!(!apv.a || acvx2 == null || apv.c)) {
                apv.b = acvx2;
                recyclerView2.a(apv);
                apv.c = true;
                recyclerView2.getContext();
            }
        }
        if (aket.a() != null) {
            akhs akhs2 = akhs;
            if (aket.a().a(akhs2).k()) {
                this.b = new akdi(aket.a().a(akhs2), akei, acvx2);
                a(this.b);
                return;
            }
        }
        this.b = null;
    }

    /* Access modifiers changed, original: protected */
    public void a(akab akab) {
        Object obj;
        axex axex = akab.f;
        if (axex != null) {
            int i = axex.a;
            if (i == 107984702) {
                b((ariq) axex.b);
            } else if (i == 171606645) {
                b((argn) axex.b);
            } else if (i == 207130962) {
                b((axqh) axex.b);
            }
        }
        akae akae = akab.e;
        if (akae != null) {
            obj = akae.e;
            if (obj == null) {
                obj = akae.a;
                if (obj == null) {
                    obj = akae.d;
                    if (obj == null) {
                        obj = akae.b;
                        if (obj == null) {
                            obj = akae.c;
                            if (obj == null) {
                                obj = akae.g;
                                if (obj == null) {
                                    axcs axcs = akae.f;
                                    if (axcs != null) {
                                        obj = axcs;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a(obj);
        }
        obj = null;
        a(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(akuu akuu) {
        int i = 0;
        if (akuu.a.a() && ((ajtf) akuu.a.b()).c() == ajti.RELOAD) {
            i = 1;
        }
        return i ^ 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        super.b();
        akdi akdi = this.b;
        if (akdi != null) {
            RecyclerView recyclerView = this.o;
            akdc akdc = new akdc(akdi.r, akdi.s, akdi.q, recyclerView);
            akdi.a.put(akda.class, akdc);
            if (recyclerView.m instanceof akpd) {
                recyclerView.getContext().getApplicationContext();
                akjw akjw = new akjw(recyclerView);
                RecyclerView recyclerView2 = akdi.d;
                if (recyclerView2 != null) {
                    if (!recyclerView.equals(recyclerView2)) {
                        akdi.b();
                    }
                }
                akdi.b = recyclerView.m;
                akdi.c = akjw;
                akdi.d = recyclerView;
                akdi.i = recyclerView.getWidth();
                akdi.j = recyclerView.getHeight();
                apn apn = recyclerView.n;
                boolean z = true;
                if (apn instanceof ans) {
                    if (((ans) apn).c != 1) {
                        z = false;
                    }
                    akdi.e = z;
                } else {
                    akdi.e = true;
                }
                akdi.d.a(akdi.f);
                akdi.d.addOnLayoutChangeListener(akdi.g);
                akdi.b.a(akdi.h);
                akdi.h.b(0, akdi.b.a());
            } else {
                recyclerView.getContext().getApplicationContext();
            }
        }
    }

    public void c() {
        super.c();
        apv apv = this.a;
        if (apv != null) {
            RecyclerView recyclerView = this.o;
            if (apv.a && apv.c) {
                recyclerView.b(apv);
                recyclerView.getContext();
                apv.c = false;
            }
        }
        akdi akdi = this.b;
        if (akdi != null) {
            akdi.b();
        }
    }
}
