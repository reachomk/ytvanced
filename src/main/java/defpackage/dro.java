package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.concurrent.Executor;

/* renamed from: dro */
public final class dro extends nd implements fjm, lco {
    public bcaa Z;
    public akpe aa;
    public akdk ab;
    public bcaa ac;
    public fjg ad;
    public lwc ae;
    public abji af;
    public fcb ag;
    public Executor ah;
    public eif ai;
    public akpk aj;
    public akwm ak;
    public acvx al;
    private akpd am;
    private boolean an;

    public final void a(eiy eiy) {
    }

    public final void W() {
        dismiss();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((drt) xse.a(p())).a(this);
        this.aj = new akpk();
        akph akph = new akph();
        akph.a(akda.class, new akpa(this.Z));
        akph.a(akwl.class, new akpa(this.ac));
        this.am = this.aa.a(akph);
        this.am.a(this.aj);
        this.am.a(new akod(this.al));
        this.ad.a((fjm) this);
        this.ae.n().a((lco) this);
    }

    public final Dialog a(Bundle bundle) {
        return new ff(p(), this.a);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.profile_card_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        recyclerView.a(this.am);
        recyclerView.a(new ans());
        this.aj.add(dro.a(new akuu(), null));
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.an) {
            abji abji = this.af;
            abjk abjk = new abjk(abji.c, abji.d.c());
            abjk.g();
            atjd atjd = (atjd) atje.c.createBuilder();
            atjm atjm = atjm.a;
            atjd.copyOnWrite();
            atje atje = (atje) atjd.instance;
            if (atjm != null) {
                atje.b = atjm;
                atje.a = 5;
                abjk.a = (atje) ((anxl) atjd.build());
                xan.a(this.af.a.a(abjk), this.ah, drr.a, new drq(this));
                return;
            }
            throw new NullPointerException();
        }
    }

    public final void X_() {
        super.X_();
        this.ae.n().b(this);
    }

    public final void a(fjl fjl) {
        dismiss();
    }

    public final void C() {
        dismiss();
    }

    public final void a(asrp asrp) {
        anxr access$000;
        Object b;
        arbs arbs;
        akdk akdk;
        anxp anxp;
        anxr access$0002;
        Object b2;
        X();
        this.an = asrp.g;
        this.al.a(new acvs(asrp.f.d()));
        anxp anxp2 = asrp.c;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        anxr access$0003 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
        anxp2.a(access$0003);
        boolean a = anxp2.h.a(access$0003.d);
        arbs arbs2 = null;
        if (a) {
            anxp2 = asrp.c;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp2.a(access$000);
            b = anxp2.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            arbs = (arbs) b;
        } else {
            arbs = null;
        }
        if (arbs != null) {
            akdk = this.ab;
            anxp = asrp.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0002 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp.a(access$0002);
            b2 = anxp.h.b(access$0002.d);
            if (b2 == null) {
                b2 = access$0002.b;
            } else {
                b2 = access$0002.a(b2);
            }
            this.aj.add(akdk.b((arbs) b2));
        }
        anxp2 = asrp.e;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
        anxp2.a(access$000);
        if (anxp2.h.a(access$000.d)) {
            anxp2 = asrp.e;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp2.a(access$000);
            b = anxp2.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            arbs = (arbs) b;
        } else {
            arbs = null;
        }
        if (arbs != null) {
            akdk = this.ab;
            anxp = asrp.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0002 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp.a(access$0002);
            b2 = anxp.h.b(access$0002.d);
            if (b2 == null) {
                b2 = access$0002.b;
            } else {
                b2 = access$0002.a(b2);
            }
            this.aj.add(akdk.b((arbs) b2));
        }
        anxp2 = asrp.d;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
        anxp2.a(access$000);
        if (anxp2.h.a(access$000.d)) {
            anxp2 = asrp.d;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$0003 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp2.a(access$0003);
            b = anxp2.h.b(access$0003.d);
            if (b == null) {
                b = access$0003.b;
            } else {
                b = access$0003.a(b);
            }
            arbs2 = (arbs) b;
        }
        if (arbs2 != null) {
            akdk = this.ab;
            anxp anxp3 = asrp.d;
            if (anxp3 == null) {
                anxp3 = axak.a;
            }
            access$0003 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp3.a(access$0003);
            Object b3 = anxp3.h.b(access$0003.d);
            if (b3 == null) {
                b3 = access$0003.b;
            } else {
                b3 = access$0003.a(b3);
            }
            this.aj.add(akdk.b((arbs) b3));
        }
    }

    public final void X() {
        this.aj.clear();
    }

    public static akwl a(akux akux, akwm akwm) {
        akwk a = akwl.a();
        a.d = akwm;
        a.a = akux;
        return a.a();
    }
}
