package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: akii */
public final class akii extends cma {
    private Integer A;
    @cue(a = 13)
    public Boolean a;
    @cue(a = 13)
    public bapb b;
    @cue(a = 13)
    public bapb c;
    @cue(a = 13)
    public bapb d;
    @cue(a = 13)
    public akkq e;
    @cue(a = 0)
    public float f;
    @cue(a = 3)
    public int g;
    @cue(a = 13)
    public sxd u;
    private Integer v;
    private Integer w;
    private Boolean x;
    private Float y;
    private aygk z;

    public akii() {
        super("YouTubeImageFlat");
    }

    public final int A() {
        return 3;
    }

    public final void b(String str) {
        if (str.hashCode() != 12951634 || !str.equals("imageprefetch")) {
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean n() {
        return true;
    }

    public final boolean t() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean v() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int w() {
        return 30;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean x() {
        return false;
    }

    public final boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        akii akii = (akii) cma;
        if (this.j == akii.j) {
            return true;
        }
        Boolean bool = this.a;
        if (!bool == null ? bool.equals(akii.a) : akii.a == null) {
            return false;
        }
        bapb bapb = this.b;
        if (!bapb == null ? bapb.equals(akii.b) : akii.b == null) {
            return false;
        }
        bapb = this.c;
        if (!bapb == null ? bapb.equals(akii.c) : akii.c == null) {
            return false;
        }
        bapb = this.d;
        if (!bapb == null ? bapb.equals(akii.d) : akii.d == null) {
            return false;
        }
        akkq akkq = this.e;
        if (!akkq == null ? akkq.equals(akii.e) : akii.e == null) {
            return false;
        }
        if (Float.compare(this.f, akii.f) != 0 || this.g != akii.g) {
            return false;
        }
        sxd sxd = this.u;
        sxd sxd2 = akii.u;
        return sxd == null ? sxd2 == null : sxd.equals(sxd2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cma cma) {
        akii akii = (akii) cma;
        this.v = akii.v;
        this.w = akii.w;
        this.x = akii.x;
        this.y = akii.y;
        this.z = akii.z;
        this.A = akii.A;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(cmg cmg) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        cqp cqp3 = new cqp();
        bapb bapb = this.d;
        cqp.a = Boolean.valueOf(false);
        cqp2.a = Float.valueOf(0.0f);
        cqp3.a = Integer.valueOf(0);
        baoz baoz = (baoz) sza.a.a();
        try {
            if (bapb.a(baoz) != null && baoz.a() == 154604025) {
                baoj a = baoj.a(baoz.c());
                if (a.b()) {
                    cqp.a = Boolean.valueOf(a.b());
                } else if (a.a() > 0.5f) {
                    cqp2.a = Float.valueOf(a.a());
                }
            }
            sza.a.a(baoz);
            if (bapb.a() > 0 && bapb.g(0).b() != null) {
                cqp3.a = Integer.valueOf((int) bapb.g(0).b().a());
            }
            this.x = (Boolean) cqp.a;
            this.y = (Float) cqp2.a;
            this.v = (Integer) cqp3.a;
            float f = this.f;
            if (f > 0.0f) {
                cma.a("imageprefetch", new syr(f), cmg.h);
            }
        } catch (Throwable th) {
            sza.a.a(baoz);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        float c;
        bapb bapb = this.d;
        if (bapb.a() != 0) {
            bape g = bapb.g(0);
            c = ((float) g.c()) / ((float) g.d());
        } else {
            c = 1.0f;
        }
        cya.a(i, i2, c, crd);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return new akim(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        cqp cqp3 = new cqp();
        bapb bapb = this.d;
        aygj aygj = (aygj) aygk.f.createBuilder();
        for (int i = 0; i < bapb.a(); i++) {
            bape g = bapb.g(i);
            if (g.a() != null) {
                aygl aygl = (aygl) aygm.e.createBuilder();
                String str = !g.a().startsWith("//") ? "" : "https:";
                String valueOf = String.valueOf(g.a());
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                aygl.a(valueOf);
                aygl.a((int) g.c());
                aygl.b((int) g.d());
                aygj.a(aygl);
            }
        }
        cqp.a = (aygk) ((anxl) aygj.build());
        cqp2.a = Integer.valueOf(cmn.a());
        cqp3.a = Integer.valueOf(cmn.b());
        this.z = (aygk) cqp.a;
        this.A = (Integer) cqp2.a;
        this.w = (Integer) cqp3.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        ImageView imageView = (akim) obj;
        bapb bapb = this.d;
        bapb bapb2 = this.b;
        bapb bapb3 = this.c;
        Boolean bool = this.a;
        int i = this.g;
        akkq akkq = this.e;
        aygk aygk = this.z;
        boolean booleanValue = this.x.booleanValue();
        float floatValue = this.y.floatValue();
        int intValue = this.v.intValue();
        Context context = cmg.b;
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, bapb);
        }
        imageView.a = booleanValue;
        imageView.b = floatValue;
        imageView.c = intValue;
        imageView.d = bapb.b();
        if (aygk.b.size() <= 0) {
            int a = svj.a(context, bapb);
            if (a > 0) {
                imageView.setImageDrawable(rz.a(context.getResources(), a, null));
                return;
            }
            return;
        }
        akkn h = akko.h();
        h.a(akkw.c());
        h.b(false);
        if (bapb2 == null && bapb3 == null) {
            akkq.a(imageView, aygk, h.a());
        } else {
            akkq.a(imageView, aygk, h.a(new akij(context, bapb2, bapb3)).a());
        }
        if (i == 1) {
            imageView.post(new akik(imageView));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        ImageView imageView = (akim) obj;
        akkq akkq = this.e;
        imageView.setImageDrawable(null);
        imageView.a = false;
        imageView.b = 0.0f;
        imageView.c = 0;
        imageView.e = false;
        akkq.a(imageView);
    }

    public final void a(String str) {
        Object obj = (str.hashCode() == 12951634 && str.equals("imageprefetch")) ? null : -1;
        if (obj == null) {
            akkq akkq = this.e;
            aygk aygk = this.z;
            int intValue = this.A.intValue();
            int intValue2 = this.w.intValue();
            if (aygk != null && aygk.b.size() > 0) {
                akkq.a(aygk, intValue, intValue2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ cma g() {
        akii akii = (akii) super.g();
        akii.v = null;
        akii.w = null;
        akii.x = null;
        akii.y = null;
        akii.z = null;
        akii.A = null;
        return akii;
    }
}
