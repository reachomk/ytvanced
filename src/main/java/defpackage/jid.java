package defpackage;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jid */
public final class jid implements akkr {
    public final akkq a;
    private final dvg b;
    private final acum c;
    private final xsc d;
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public jid(dvg dvg, akkq akkq, acum acum, xsc xsc) {
        this.b = dvg;
        this.a = akkq;
        this.c = acum;
        this.d = xsc;
    }

    public final void a(ImageView imageView, akko akko, aygk aygk) {
        if (aygk.c) {
            this.e.put(imageView, Long.valueOf(this.d.b()));
        }
    }

    public final void d(ImageView imageView, akko akko, aygk aygk) {
        if (aygk.c) {
            if (aygk.e) {
                Long l = (Long) this.f.get(imageView);
                asmz asmz;
                asmw asmw;
                if (l == null) {
                    ayfa ayfa = (ayfa) ((anxo) e(imageView, akko, aygk).toBuilder());
                    ayfa.a(false);
                    ayex ayex = (ayex) ((anxl) ayfa.build());
                    asmz = (asmz) asmw.f.createBuilder();
                    asmz.copyOnWrite();
                    asmw = (asmw) asmz.instance;
                    if (ayex != null) {
                        asmw.c = ayex;
                        asmw.b = 15;
                        this.c.a((asmw) ((anxl) asmz.build()));
                    } else {
                        throw new NullPointerException();
                    }
                }
                long b = this.d.b();
                long longValue = l.longValue();
                ayey ayey = (ayey) ayev.d.createBuilder();
                ayey.copyOnWrite();
                ayev ayev = (ayev) ayey.instance;
                ayev.a |= 1;
                ayev.b = true;
                ayey.copyOnWrite();
                ayev = (ayev) ayey.instance;
                ayev.a |= 2;
                ayev.c = (int) (b - longValue);
                ayev ayev2 = (ayev) ((anxl) ayey.build());
                asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw = (asmw) asmz.instance;
                if (ayev2 != null) {
                    asmw.c = ayev2;
                    asmw.b = 13;
                    this.c.a((asmw) ((anxl) asmz.build()));
                } else {
                    throw new NullPointerException();
                }
                this.f.remove(imageView);
            }
            this.e.remove(imageView);
        }
    }

    public final void b(ImageView imageView, akko akko, aygk aygk) {
        if (aygk.c) {
            long b = this.d.b();
            if (aygk.e) {
                this.f.put(imageView, Long.valueOf(this.d.b()));
            }
            ayfa ayfa = (ayfa) ((anxo) e(imageView, akko, aygk).toBuilder());
            Long l = (Long) this.e.get(imageView);
            if (l != null) {
                long longValue = l.longValue();
                ayfa.copyOnWrite();
                ayex ayex = (ayex) ayfa.instance;
                ayex.a |= 2;
                ayex.c = (int) (b - longValue);
                ayfa.a(true);
                this.e.remove(imageView);
            }
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            asmw.c = (anxl) ayfa.build();
            asmw.b = 15;
            this.c.a((asmw) ((anxl) asmz.build()));
        }
    }

    public final void c(ImageView imageView, akko akko, aygk aygk) {
        if (aygk.c) {
            this.e.remove(imageView);
        }
    }

    private final ayex e(ImageView imageView, akko akko, aygk aygk) {
        ayfa ayfa = (ayfa) ayex.j.createBuilder();
        if (!(akko == null || akko.f() == null)) {
            String a = akko.f().a();
            if (a != null) {
                ayfa.copyOnWrite();
                ayex ayex = (ayex) ayfa.instance;
                ayex.a |= 4;
                ayex.d = a;
            }
        }
        boolean z = aygk.e;
        ayfa.copyOnWrite();
        ayex ayex2 = (ayex) ayfa.instance;
        ayex2.a |= 1;
        ayex2.b = z;
        int width = imageView.getWidth();
        ayfa.copyOnWrite();
        ayex2 = (ayex) ayfa.instance;
        ayex2.a |= 16;
        ayex2.e = width;
        int height = imageView.getHeight();
        ayfa.copyOnWrite();
        ayex ayex3 = (ayex) ayfa.instance;
        ayex3.a |= 32;
        ayex3.f = height;
        float f = this.b.getResources().getDisplayMetrics().density;
        ayfa.copyOnWrite();
        ayex3 = (ayex) ayfa.instance;
        ayex3.a |= 64;
        ayex3.g = f;
        if (!(this.b.t() == null || this.b.t().c() == null || this.b.t().c().e == null)) {
            height = this.b.t().c().e.aH;
            ayfa.copyOnWrite();
            ayex3 = (ayex) ayfa.instance;
            ayex3.a |= 256;
            ayex3.h = height;
        }
        return (ayex) ((anxl) ayfa.build());
    }
}
