package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.SlimMetadataButtonContainerLayout;
import com.google.android.youtube.R;

/* renamed from: kxv */
public final class kxv extends kyc implements kzc {
    private final Handler a;
    private final aizy b;
    private final ViewGroup f;
    private final SlimMetadataButtonContainerLayout g = ((SlimMetadataButtonContainerLayout) this.f.findViewById(R.id.button_container));
    private final kkj h;
    private final bgx i;
    private final Runnable j;

    public kxv(Context context, Handler handler, kza kza, aizy aizy, kkl kkl, zyw zyw) {
        kkl kkl2 = kkl;
        this.a = handler;
        this.b = aizy;
        this.f = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_action_bar, null);
        SlimMetadataButtonContainerLayout slimMetadataButtonContainerLayout = this.g;
        int i = 5;
        this.h = new kkj((ViewGroup) kkl.a(slimMetadataButtonContainerLayout, 1), foh.f(zyw), (bcaa) kkl.a(new kxu(this), 3), (aizy) kkl.a((aizy) kkl2.a.get(), 4), (agwc) kkl.a((agwc) kkl2.b.get(), 5), (kke) kkl.a((kke) kkl2.c.get(), 6), (kkq) kkl.a((kkq) kkl2.d.get(), 7), (kkm) kkl.a((kkm) kkl2.e.get(), 8), (kle) kkl.a((kle) kkl2.f.get(), 9), (kkc) kkl.a((kkc) kkl2.g.get(), 10));
        bhj bhj = new bhj();
        bgx eyl = new eyl();
        eyl.a((int) R.id.container);
        bhj.a(eyl);
        eyl = new bfl();
        eyl.d();
        bhj.a(eyl);
        eyl = new bga();
        eyl.d();
        bhj.a(eyl);
        this.i = bhj;
        this.j = new kxx(this, kza);
        boolean b = xss.b(context);
        this.g.a(b);
        SlimMetadataButtonContainerLayout slimMetadataButtonContainerLayout2 = this.g;
        if (b) {
            i = 6;
        }
        slimMetadataButtonContainerLayout2.a(i);
    }

    public final View K_() {
        return this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.g.b(this.e.f ^ 1);
        axpr axpr = (axpr) this.d;
        String d = this.e.d();
        akor akor = this.c;
        for (axpe axpe : axpr.b) {
            int i = axpe.a;
            if (i == 124608017) {
                this.h.a((axpc) axpe.b, d, akor);
            } else if (i == 124608045) {
                this.h.a((axpi) axpe.b, d, akor);
            } else if (i == 186676672) {
                this.h.a((axpa) axpe.b, d, akor);
            }
        }
        this.h.a();
        this.a.post(this.j);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        bhf.a(this.f);
        this.a.removeCallbacks(this.j);
        this.h.e();
    }

    public final void aD_() {
        bhf.a(this.f, this.i);
        this.g.b(this.e.f ^ 1);
    }

    public final aruh e() {
        axpr axpr = (axpr) this.d;
        if ((axpr.a & 2) == 0) {
            return null;
        }
        aruh aruh;
        axpg axpg = axpr.d;
        if (axpg == null) {
            axpg = axpg.c;
        }
        if (axpg.a == 102716411) {
            aruh = (aruh) axpg.b;
        } else {
            aruh = aruh.j;
        }
        return aruh;
    }

    public final aruh f() {
        axpr axpr = (axpr) this.d;
        if ((axpr.a & 1) == 0) {
            return null;
        }
        aruh aruh;
        axpg axpg = axpr.c;
        if (axpg == null) {
            axpg = axpg.c;
        }
        if (axpg.a == 102716411) {
            aruh = (aruh) axpg.b;
        } else {
            aruh = aruh.j;
        }
        return aruh;
    }

    public final aruh d() {
        kka c = this.h.c();
        return c != null ? c.h() : null;
    }

    public final boolean g() {
        avsj c = elq.c(this.b);
        return c != null && c.b;
    }

    public final boolean h() {
        return this.h.a(this.e.d()) != null;
    }

    public final boolean i() {
        return this.f.isShown();
    }

    public final View j() {
        return this.h.b();
    }

    public final View k() {
        return this.h.d();
    }

    public final String l() {
        return this.e.d();
    }
}
