package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: igc */
public final class igc extends aito implements eln, iif, xcp {
    public final fos a;
    public final ibv b;
    public final ajjz c;
    private final vzx d;
    private final akkq e;
    private final acvx f;
    private final eif g;
    private final boolean h;
    private final ige i = new ige();
    private final boolean j;
    private final akzb k;
    private final icp l;

    public igc(Activity activity, fos fos, acvx acvx, akkq akkq, eif eif, aaas aaas, lnr lnr, zyw zyw, zzl zzl, vrk vrk, ajjz ajjz, akzb akzb, icp icp) {
        super(activity);
        this.a = fos;
        this.g = (eif) amqw.a((Object) eif);
        this.c = (ajjz) amqw.a((Object) ajjz);
        this.e = (akkq) amqw.a((Object) akkq);
        this.f = acvx;
        this.k = akzb;
        this.l = icp;
        lnr.a((eln) this);
        this.j = foh.a(zyw, zzl);
        this.h = true;
        this.d = new vzx(activity, aaas, acvx);
        this.b = new ibv(new wac(activity), acvx, vrk, !this.j ? 8 : 4);
    }

    /* Access modifiers changed, original: protected|final */
    public final aitx b(Context context) {
        aitx b = super.b(context);
        if (this.j) {
            b.a();
            b.b = 0;
        }
        return b;
    }

    private final void e() {
        this.b.a(this.i.a);
        ibv ibv = this.b;
        boolean c = c();
        if (!ibv.n) {
            return;
        }
        if (c) {
            ibv.g.a(null, null, null);
        } else {
            ibv.g.a(null, null, null);
        }
    }

    public final void a(ImageView imageView) {
        ibv ibv = this.b;
        vzp vzp = ibv.h;
        amqw.a((Object) imageView);
        amqw.b(vzp.a == null);
        vzp.a = imageView;
        vzp.a.setVisibility(8);
        imageView.setOnClickListener(new ica(ibv));
    }

    public final void a(aitp aitp) {
        wac wac = this.b.a;
        amqw.a((Object) aitp);
        amqw.b(wac.a == null);
        wac.a = aitp;
        wac.a.a(new wab(wac));
        wac.a.a(8);
    }

    public final void a(wae wae) {
        this.b.a(wae);
    }

    public final boolean c() {
        return this.i.a();
    }

    public final boolean a(ejd ejd) {
        return emq.a(ejd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        if (i == 0) {
            e();
        }
    }

    public final void b(ejd ejd) {
        boolean z = true;
        if (!(ejd.f() || ejd.n())) {
            z = false;
        }
        ige ige = this.i;
        if (ige.c != z || ige.d != ejd.a()) {
            ige = this.i;
            ige.c = z;
            ige.d = ejd.a();
            b(2);
        }
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(xci xci, boolean z) {
        if (z) {
            xci.a((Object) this);
        } else {
            xci.b(this);
        }
    }

    public final void a(vxc vxc) {
        this.i.a = vxc;
        ibv ibv = this.b;
        vyc j = vxc.j();
        boolean a = this.i.a();
        if (ibv.n) {
            wac wac = ibv.a;
            wac.h = a;
            wac.b(j, a);
        }
        if (c()) {
            af_();
        } else {
            ibv ibv2 = this.b;
            if (ibv2.n) {
                ibv2.h.b(Boolean.valueOf(false), false);
            }
            super.ag_();
        }
        b(1);
    }

    public final void a(int i, float f) {
        ((RelativeLayout) a()).setTranslationX((float) i);
        ((RelativeLayout) a()).setAlpha(f);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahkk.class};
        } else if (i == 0) {
            ahkk ahkk = (ahkk) obj;
            ige ige = this.i;
            boolean z = ige.b;
            boolean z2 = ahkk.a;
            if (z != z2) {
                ige.b = z2;
                b(4);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
