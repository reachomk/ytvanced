package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: kre */
public class kre extends jxw implements akok {
    public final View A;
    public Bitmap B;
    public String C;
    private final akko D;
    private final akou E;
    private final akoj F;
    private akor G;
    private foq H;
    private final aaas a;
    private final fhb b;
    private final elv c;
    private final jty d;
    private final jup e;
    public final krc z;

    protected kre(akkq akkq, akvp akvp, akvo akvo, View view, View view2, View view3, Context context, aaas aaas, fhb fhb, gal gal, elv elv, jty jty, jup jup, akou akou) {
        aaas aaas2 = aaas;
        jty jty2 = jty;
        akou akou2 = akou;
        super(context, akkq, akou, view2, aaas, gal, akvp, null, null);
        this.z = new krc(akkq, akvp, akvo, view, view3, true);
        this.a = aaas2;
        this.b = fhb;
        this.c = elv;
        this.d = jty2;
        this.E = akou2;
        this.F = new akoj(aaas2, akou2, (akok) this);
        this.e = jup;
        this.A = view2.findViewById(R.id.thumbnail_layout);
        this.D = akko.h().a(new krh(this, jty2)).a();
    }

    /* renamed from: a */
    public final void a_(akor akor, foq foq) {
        apxu apxu;
        arml arml;
        arml arml2;
        aygk aygk;
        this.H = foq;
        aryi aryi = foq.b;
        this.C = aryi.j;
        ayfk ayfk = null;
        this.B = null;
        this.G = akor;
        akoj akoj = this.F;
        acvx acvx = akor.a;
        if ((aryi.a & 64) != 0) {
            apxu = aryi.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b(), this);
        if ((aryi.a & 4) != 0) {
            arml = aryi.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = ajqy.a(arml);
        if ((aryi.a & 4) != 0) {
            arml2 = aryi.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        a(a, ajqy.b(arml2), aryi.c, null);
        if ((aryi.a & 1) != 0) {
            aygk = aryi.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        a(aygk, this.D);
        a(ipo.a(aryi.c));
        esw esw = this.n;
        if (esw != null) {
            esw.a();
        }
        anxp anxp = aryi.d;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ayez.a);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = aryi.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(ayez.a);
            anxp.a(access$0002);
            Object b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            ayfk = (ayfk) b;
        }
        if (ayfk != null) {
            a(ayfk, 8);
        }
    }

    public final View K_() {
        return this.E.a();
    }

    public final void b() {
        if (this.B != null) {
            ely a = this.c.a(this.C);
            this.c.a(this.C, a != null ? a.a : 0, this.B, ScaleType.CENTER_CROP);
            this.d.a(this.C);
        }
    }

    public final bblt a(int i, fgz fgz) {
        if (i == 0) {
            return this.b.a(this.H);
        }
        return this.b.a(this.H, fgz, i == 2 ? 3 : 0);
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.A.setAlpha(1.0f);
        this.F.a();
    }

    public final void a(Map map) {
        Object obj;
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", this.A);
        aryi aryi = this.H.b;
        if ((aryi.a & 1) != 0) {
            obj = aryi.b;
            if (obj == null) {
                obj = aygk.f;
            }
        } else {
            obj = null;
        }
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", obj);
        this.e.a(this.H, map);
    }

    public final boolean a(View view) {
        jup jup = this.e;
        foq foq = this.H;
        aaas aaas = this.a;
        akor akor = this.G;
        return jup.a(foq, aaas, akor.a, akor.b(), this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        this.z.a(z);
    }
}
