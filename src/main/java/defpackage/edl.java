package defpackage;

import android.widget.ImageView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: edl */
public final class edl implements akkr, fao {
    private final xci a;
    private final akkq b;
    private final akzh c;
    private final Map d = new ConcurrentHashMap();
    private final int e;
    private final int f;
    private final int g;
    private fal h;
    private int i;
    private boolean j;

    private edl(xci xci, akkq akkq, akzh akzh, fal fal, int i, int i2, int i3) {
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = akzh;
        this.h = fal;
        this.a = (xci) amqw.a((Object) xci);
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.j = false;
    }

    public final void a(float f) {
    }

    public final void a(int i, boolean z) {
    }

    public final void b(int i) {
    }

    public final void a() {
        if (this.j) {
            fal fal = this.h;
            if (fal != null) {
                fal.b(this);
            }
            b();
        }
    }

    private final void b() {
        this.a.d(this.e != 2 ? new edt() : new edr());
        akzh akzh = this.c;
        if (akzh != null) {
            akzh.a.b(this);
        }
        this.b.b(this);
        this.h = null;
        this.d.clear();
        this.j = false;
    }

    public final void a(ImageView imageView, akko akko, aygk aygk) {
        if (this.j && this.i < this.f && imageView.getWidth() >= this.g) {
            this.d.put(imageView, Integer.valueOf(this.i));
            xci xci = this.a;
            int i = 0;
            if (!(akko == null || akko.f() == null)) {
                i = akko.f().b();
            }
            xci.d(new eea(i, this.i));
            this.i++;
        }
    }

    public final void b(ImageView imageView, akko akko, aygk aygk) {
        Integer num = (Integer) this.d.get(imageView);
        if (num != null) {
            this.a.d(new edx(num.intValue()));
            a(imageView);
        }
    }

    public final void c(ImageView imageView, akko akko, aygk aygk) {
        Integer num = (Integer) this.d.get(imageView);
        if (num != null) {
            this.a.d(new edy(num.intValue()));
            a(imageView);
        }
    }

    public final void d(ImageView imageView, akko akko, aygk aygk) {
        Integer num = (Integer) this.d.get(imageView);
        if (num != null) {
            this.a.d(new edv(num.intValue()));
            a(imageView);
        }
    }

    private final void a(ImageView imageView) {
        this.d.remove(imageView);
        if (this.d.isEmpty() && this.i >= this.f) {
            a();
        }
    }

    public final boolean a(int i) {
        b();
        return false;
    }

    public static edl a(xci xci, akkq akkq, akzh akzh, fal fal, int i, int i2, int i3) {
        if (i2 <= 0 || i3 < 0) {
            return null;
        }
        akkr edl = new edl(xci, akkq, akzh, fal, i, i2, i3);
        edl.a.d(edl.e != 2 ? new edw() : new edu());
        edl.d.clear();
        edl.i = 0;
        fal fal2 = edl.h;
        if (fal2 != null) {
            fal2.a((fao) edl);
        }
        akzh akzh2 = edl.c;
        if (akzh2 != null) {
            akzh2.a.a(edl);
        }
        edl.b.a(edl);
        edl.j = true;
        return edl;
    }
}
