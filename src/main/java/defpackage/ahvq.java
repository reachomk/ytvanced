package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: ahvq */
public final class ahvq extends ahor implements ahpv, ahrs {
    public final akkq a;
    public final ahre b;
    public final ahrt c;
    public final ahrl e;
    public final ahmt f;
    private final ahou g;

    ahvq(Context context, ahry ahry, ahrt ahrt, akkq akkq, ViewGroup viewGroup, ahvw ahvw) {
        ahry ahry2 = ahry;
        ahrt ahrt2 = ahrt;
        ahvw ahvw2 = ahvw;
        amqw.a((Object) context);
        amqw.a((Object) ahry);
        this.c = (ahrt) amqw.a((Object) ahrt);
        amqw.a((Object) viewGroup);
        amqw.a((Object) ahvw);
        this.a = (akkq) amqw.a((Object) akkq);
        this.g = new ahou((ahpn) ahry2.c.clone(), 40.0f, 30.0f);
        ahpn ahpn = (ahpn) ((ahpn) amqw.a(ahrt.d())).clone();
        Resources resources = context.getResources();
        Bitmap a = ahsl.a(resources, (int) R.raw.white_box);
        ahsm a2 = ahsm.a(80.0f, 45.0f, ahsm.c);
        bcaa d = ahry2.a.d();
        this.b = new ahre(a, a2, (ahpn) ahpn.clone(), d);
        this.b.b(0.0f, 7.0f, 0.0f);
        ahqb ahqb = this.b;
        a(ahqb);
        this.e = new ahrl((ahpn) ahpn.clone(), ahrt2.b);
        ahrl ahrl = this.e;
        String string = resources.getString(R.string.up_next);
        if (TextUtils.isEmpty(string)) {
            ahrl.a.a("");
            ahrl.a.m_(true);
        } else {
            ahrl.a.a(string);
            ahrl.a.m_(false);
        }
        this.e.b(0.0f, 14.0f, 0.0f);
        a(this.e);
        ahqb ahqr = new ahqr(ahrt2, (ahpn) ahpn.clone(), d);
        ahqb = ahqr.a(ahsl.a(resources, (int) R.raw.vr_rect_solid_white), ahqr.a(1.0f, false), ahqr);
        ahqb a3 = ahqr.a(ahsl.a(resources, (int) R.raw.vr_semicircle_solid_white), ahqr.a(2.0f, false), ahqr);
        ahqb a4 = ahqr.a(ahsl.a(resources, (int) R.raw.vr_semicircle_solid_white), ahqr.a(2.0f, true), ahqr);
        ahqr.a(new ahpz(a3, ahpz.a(1.0f), ahpz.a(1.1f)));
        ahqr.a(new ahpz(a4, ahpz.a(1.0f), ahpz.a(1.1f)));
        ahqr.f = new ahpz(ahqb, ahpz.a(1.0f), ahpz.a(1.1f));
        ahqr.a(ahqr.f);
        float[] fArr = new float[]{0.0f, 0.0f, 0.0f};
        ahqr.g = new ahrj(a3, fArr, fArr);
        ahqr.h = new ahrj(a4, fArr, fArr);
        ahqr.a(ahqr.g);
        ahqr.a(ahqr.h);
        ahqr.e.a(new ahqq(ahqb, ahqr, a3, a4));
        ahqr.a(a3);
        ahqr.a(ahqb);
        ahqr.a(a4);
        ahqr.a(ahqr.e);
        ahqr.e.a(context.getString(R.string.cancel));
        ahqr.b(0.0f, -ahsl.a(30.0f), 0.0f);
        Handler handler = new Handler(Looper.getMainLooper());
        ahqr.c = new ahvt(handler, ahvw2, ahrt2);
        a(ahqr);
        ahqr = new ahup((ahpn) ahpn.clone(), d, ahsl.a(resources, (int) R.raw.vr_button_fill), 9.2f, ahsl.a(resources, (int) R.raw.vr_play));
        ahqr.c = new ahvs(handler, ahvw2, ahrt2);
        ahqr.b(0.0f, 7.0f, 0.0f);
        a(ahqr);
        this.f = new ahmt(viewGroup, context, handler, (ahpn) ahpn.clone(), ahry2.a.e(), 9.2f, false);
        this.f.b(0.0f, 7.0f, 0.0f);
        a(this.f);
        this.l = true;
    }

    public final boolean c(ahnj ahnj) {
        return false;
    }

    public final boolean a(ahnj ahnj) {
        return !f() && this.g.a(ahnj).a();
    }

    public final boolean b(ahnj ahnj) {
        return by_() ^ 1;
    }

    public final boolean a() {
        return f() ^ 1;
    }
}
