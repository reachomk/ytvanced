package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: knb */
class knb {
    private final ImageView a = ((ImageView) this.d.findViewById(R.id.channel_avatar));
    private final TextView b = ((TextView) this.d.findViewById(R.id.post_author));
    public final /* synthetic */ kmx c;
    public final View d;
    public final knd e;
    private final TextView f = ((TextView) this.d.findViewById(R.id.post_text));
    private View g;

    public knb(kmx kmx, int i) {
        this.c = kmx;
        this.d = View.inflate(kmx.a, i, null);
        this.e = new knd(kmx.a, kmx.b, this.d, kmx.c, kmx.f, kmx.k, kmx.l, kmx.g);
    }

    public void a(akor akor) {
        b(akor);
        akor akor2 = new akor(akor);
        akor2.b = this.c.n.b();
        a(this.e.v, akor2);
    }

    public final void b(akor akor) {
        aygk aygk;
        arml arml;
        ayri ayri;
        arml arml2;
        arml arml3;
        ayri ayri2;
        aped aped;
        apdz apdz;
        auxa auxa;
        azdt a = this.c.n.a();
        akkq akkq = this.c.b;
        ImageView imageView = this.a;
        appu appu = a.c == 33 ? (appu) a.d : appu.c;
        appw appw = appu.b;
        if (appw == null) {
            appw = appw.f;
        }
        if ((appw.a & 1) != 0) {
            appw appw2 = appu.b;
            if (appw2 == null) {
                appw2 = appw.f;
            }
            aygk = appw2.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else if (a.c == 19) {
            aygk = (aygk) a.d;
        } else {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        this.a.setOnClickListener(new kna(this, a));
        akor akor2 = new akor(akor);
        akor2.b = this.c.n.b();
        Spanned a2 = ajqy.a(this.c.n.a.d);
        boolean isEmpty = TextUtils.isEmpty(a2) ^ 1;
        xpr.a(this.b, isEmpty);
        xpr.a(this.f, isEmpty);
        boolean z = false;
        if (isEmpty) {
            int i;
            this.b.setText(ajqy.a(this.c.n.a.c));
            kmx kmx = this.c;
            arwf arwf = kmx.n.a.f;
            if (arwf == null) {
                i = 0;
            } else {
                akvp akvp = kmx.e;
                arwh a3 = arwh.a(arwf.b);
                if (a3 == null) {
                    a3 = arwh.UNKNOWN;
                }
                i = akvp.a(a3);
            }
            adl.a(this.b, i, 0);
            this.f.setText(a2);
        }
        if (this.c.n.a().A) {
            if (this.g == null) {
                this.g = ((ViewStub) this.d.findViewById(R.id.watched_overlay_stub)).inflate();
            }
            this.g.setVisibility(0);
        } else {
            View view = this.g;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        knd knd = this.e;
        apdj apdj = null;
        if ((a.a & 4) != 0) {
            arml = a.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        knd.a(ajqy.a(arml));
        knd = this.e;
        List a4 = amvj.a();
        Context context = knd.f;
        xsc xsc = knd.a;
        if ((a.a & 1048576) != 0) {
            ayri = a.x;
            if (ayri == null) {
                ayri = ayri.d;
            }
        } else {
            ayri = null;
        }
        CharSequence a5 = joc.a(context, xsc, ayri);
        if (TextUtils.isEmpty(a5)) {
            arml2 = a.p;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            if (TextUtils.isEmpty(ajqy.a(arml2))) {
                if ((a.a & 4096) != 0) {
                    arml2 = a.o;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                a5 = ajqy.a(arml2);
            } else {
                arml2 = a.p;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                a5 = ajqy.a(arml2);
            }
            a4.add(fpi.a(a5));
            if ((a.a & 1024) != 0) {
                arml2 = a.m;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            a4.add(fpi.a(ajqy.a(arml2)));
        } else {
            a4.add(a5);
        }
        if ((a.a & 512) != 0) {
            arml2 = a.l;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        a5 = fpi.a(ajqy.a(arml2));
        if (kmx.b(a) != null) {
            z = true;
        }
        knd.a(a5, a4, z);
        knd = this.e;
        if ((a.a & 2048) != 0) {
            arml3 = a.n;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        } else {
            arml3 = null;
        }
        CharSequence a6 = ajqy.a(arml3);
        if ((a.a & 2048) != 0) {
            arml = a.n;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence b = ajqy.b(arml);
        List list = a.B;
        if ((a.a & 1048576) != 0) {
            ayri2 = a.x;
            if (ayri2 == null) {
                ayri2 = ayri.d;
            }
        } else {
            ayri2 = null;
        }
        knd.a(a6, b, list, ayri2);
        knd = this.e;
        aygk = a.f;
        if (aygk == null) {
            aygk = aygk.f;
        }
        knd.a(aygk);
        this.e.a(ipo.a(a.B));
        knd = this.e;
        apdx apdx = a.t;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 1) == 0) {
            aped = null;
        } else {
            apdx = a.t;
            if (apdx == null) {
                apdx = apdx.g;
            }
            aped = apdx.b;
            if (aped == null) {
                aped = aped.g;
            }
        }
        knd.a(aped);
        knd = this.e;
        apdx = a.s;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 4) == 0) {
            apdz = null;
        } else {
            apdx = a.s;
            if (apdx == null) {
                apdx = apdx.g;
            }
            apdz = apdx.d;
            if (apdz == null) {
                apdz = apdz.e;
            }
        }
        knd.a(apdz);
        this.e.q.a(kmx.b(a));
        knd = this.e;
        apdx = a.u;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((8 & apdx.a) != 0) {
            apdx apdx2 = a.u;
            if (apdx2 == null) {
                apdx2 = apdx.g;
            }
            auxa = apdx2.e;
            if (auxa == null) {
                auxa = auxa.f;
            }
        } else {
            auxa = null;
        }
        knd.a(auxa);
        kmx kmx2 = this.c;
        for (apdh apdh : a.r) {
            if ((apdh.a & 524288) != 0) {
                apdj = apdh.q;
                if (apdj == null) {
                    apdj = apdj.c;
                }
                kmx2.m = apdj;
                kmx2 = this.c;
                kmx2.j.a(this.e.p, kmx2.m);
                this.e.a_(akor2, a);
            }
        }
        kmx2.m = apdj;
        kmx2 = this.c;
        kmx2.j.a(this.e.p, kmx2.m);
        this.e.a_(akor2, a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, akor akor) {
        auvn auvn;
        kmx kmx = this.c;
        akvo akvo = kmx.d;
        View view2 = this.d;
        ham ham = kmx.n;
        auvr auvr = ham.a().z;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr auvr2 = ham.a().z;
            if (auvr2 == null) {
                auvr2 = auvr.c;
            }
            auvn = auvr2.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
        }
        akvo.a(view2, view, auvn, this.c.n, akor.a);
    }
}
