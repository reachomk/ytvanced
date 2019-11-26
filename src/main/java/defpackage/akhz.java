package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: akhz */
public final class akhz extends cma {
    private aygk A;
    private Integer B;
    @cue(a = 13)
    public Boolean a;
    @cue(a = 13)
    public akhx b;
    @cue(a = 13)
    public bdhi c;
    @cue(a = 13)
    public bdhi d;
    @cue(a = 13)
    public bdhi e;
    @cue(a = 13)
    public akkq f;
    @cue(a = 0)
    public float g;
    @cue(a = 3)
    public int u;
    @cue(a = 13)
    public sxd v;
    private Integer w;
    private Integer x;
    private Boolean y;
    private Float z;

    public akhz() {
        super("YouTubeImage");
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
        akhz akhz = (akhz) cma;
        if (this.j == akhz.j) {
            return true;
        }
        Boolean bool = this.a;
        if (!bool == null ? bool.equals(akhz.a) : akhz.a == null) {
            return false;
        }
        akhx akhx = this.b;
        if (!akhx == null ? akhx.equals(akhz.b) : akhz.b == null) {
            return false;
        }
        bdhi bdhi = this.c;
        if (!bdhi == null ? bdhi.equals(akhz.c) : akhz.c == null) {
            return false;
        }
        bdhi = this.d;
        if (!bdhi == null ? bdhi.equals(akhz.d) : akhz.d == null) {
            return false;
        }
        bdhi = this.e;
        if (!bdhi == null ? bdhi.equals(akhz.e) : akhz.e == null) {
            return false;
        }
        akkq akkq = this.f;
        if (!akkq == null ? akkq.equals(akhz.f) : akhz.f == null) {
            return false;
        }
        if (Float.compare(this.g, akhz.g) != 0 || this.u != akhz.u) {
            return false;
        }
        sxd sxd = this.v;
        sxd sxd2 = akhz.v;
        return sxd == null ? sxd2 == null : sxd.equals(sxd2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cma cma) {
        akhz akhz = (akhz) cma;
        this.w = akhz.w;
        this.x = akhz.x;
        this.y = akhz.y;
        this.z = akhz.z;
        this.A = akhz.A;
        this.B = akhz.B;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(cmg cmg) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        cqp cqp3 = new cqp();
        bdhi bdhi = this.e;
        cqp.a = Boolean.valueOf(false);
        cqp2.a = Float.valueOf(0.0f);
        cqp3.a = Integer.valueOf(0);
        bdhl bdhl = bdhi.c;
        bdgj bdgj = bdhl != null ? (bdgj) szb.a(bdhl, bdgj.a) : null;
        if (bdgj != null) {
            if (bdgj.d()) {
                cqp.a = Boolean.valueOf(bdgj.c());
            } else if (bdgj.b()) {
                cqp2.a = Float.valueOf(bdgj.a());
            }
        }
        bdhk[] bdhkArr = bdhi.a;
        if (!(bdhkArr.length == 0 || !bdhkArr[0].d() || bdhi.a[0].c().b == 0)) {
            cqp3.a = Integer.valueOf(bdhi.a[0].c().b);
        }
        this.y = (Boolean) cqp.a;
        this.z = (Float) cqp2.a;
        this.w = (Integer) cqp3.a;
        float f = this.g;
        if (f > 0.0f) {
            cma.a("imageprefetch", new syr(f), cmg.h);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn, int i, int i2, crd crd) {
        float f;
        bdhk[] bdhkArr = this.e.a;
        if (bdhkArr.length != 0) {
            bdhk bdhk = bdhkArr[0];
            f = ((float) bdhk.b) / ((float) bdhk.c);
        } else {
            f = 1.0f;
        }
        cya.a(i, i2, f, crd);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Context context) {
        return new akiy(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, cmn cmn) {
        cqp cqp = new cqp();
        cqp cqp2 = new cqp();
        cqp cqp3 = new cqp();
        aygj aygj = (aygj) aygk.f.createBuilder();
        for (bdhk bdhk : this.e.a) {
            if (bdhk.b()) {
                aygl aygl = (aygl) aygm.e.createBuilder();
                String str = !bdhk.a().startsWith("//") ? "" : "https:";
                String valueOf = String.valueOf(bdhk.a());
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                aygl.a(valueOf);
                aygl.a(bdhk.b);
                aygl.b(bdhk.c);
                aygj.a(aygl);
            }
        }
        cqp.a = (aygk) ((anxl) aygj.build());
        cqp2.a = Integer.valueOf(cmn.a());
        cqp3.a = Integer.valueOf(cmn.b());
        this.A = (aygk) cqp.a;
        this.B = (Integer) cqp2.a;
        this.x = (Integer) cqp3.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(cmg cmg, Object obj) {
        ImageView imageView = (akiy) obj;
        bdhi bdhi = this.e;
        bdhi bdhi2 = this.c;
        bdhi bdhi3 = this.d;
        Boolean bool = this.a;
        int i = this.u;
        akkq akkq = this.f;
        aygk aygk = this.A;
        akhx akhx = this.b;
        boolean booleanValue = this.y.booleanValue();
        float floatValue = this.z.floatValue();
        int intValue = this.w.intValue();
        Context context = cmg.b;
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, bdhi);
        }
        imageView.a = booleanValue;
        imageView.b = floatValue;
        imageView.c = intValue;
        imageView.d = bdhi.b;
        if (aygk.b.size() <= 0) {
            int a = svk.a(context, bdhi);
            if (a > 0) {
                imageView.setImageDrawable(rz.a(context.getResources(), a, null));
                return;
            }
            return;
        }
        akkn h = akko.h();
        h.a(akkw.c());
        h.b(false);
        if (akhx != null) {
            akiu akiu = new akiu(bdhi3, context, imageView, akhx);
            aygm b = aklb.b(aygk, imageView.getWidth(), imageView.getHeight());
            if (bdhi2 != null) {
                akis.a(bdhi2, imageView, context);
            }
            akkq.c(Uri.parse(b.b), akiu);
        } else if (bdhi2 == null && bdhi3 == null) {
            akkq.a(imageView, aygk, h.a());
        } else {
            akkq.a(imageView, aygk, h.a(new akiv(context, bdhi2, bdhi3)).a());
        }
        if (i == 1) {
            imageView.post(new akir(imageView));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(cmg cmg, Object obj) {
        akhx akhx = this.b;
        if (akhx != null) {
            FrameSequenceDrawable frameSequenceDrawable = akhx.e;
            if (frameSequenceDrawable != null) {
                frameSequenceDrawable.start();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg, Object obj) {
        ImageView imageView = (akiy) obj;
        akkq akkq = this.f;
        akhx akhx = this.b;
        imageView.setImageDrawable(null);
        imageView.a = false;
        imageView.b = 0.0f;
        imageView.c = 0;
        imageView.e = false;
        akkq.a(imageView);
        if (akhx != null) {
            FrameSequenceDrawable frameSequenceDrawable = akhx.e;
            if (frameSequenceDrawable != null) {
                frameSequenceDrawable.stop();
            }
        }
    }

    public final void a(String str) {
        Object obj = (str.hashCode() == 12951634 && str.equals("imageprefetch")) ? null : -1;
        if (obj == null) {
            akkq akkq = this.f;
            akhx akhx = this.b;
            aygk aygk = this.A;
            int intValue = this.B.intValue();
            int intValue2 = this.x.intValue();
            if (akhx == null && aygk != null && aygk.b.size() > 0) {
                akkq.a(aygk, intValue, intValue2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ cma g() {
        akhz akhz = (akhz) super.g();
        akhz.w = null;
        akhz.x = null;
        akhz.y = null;
        akhz.z = null;
        akhz.A = null;
        akhz.B = null;
        return akhz;
    }
}
