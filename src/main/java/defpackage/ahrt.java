package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahrt */
public final class ahrt extends ahor implements ahsc, ahsd {
    public final ahry a;
    public final ahrd b;
    public final ahor c = new ahor();
    public final List e = new ArrayList();
    public ahru f;
    public boolean g;
    public boolean h;
    public ahrw i;
    public ahrx j;
    public ahrs k;
    public ahrz m;
    private final ahou n;
    private final ahol o;
    private final ahnd p;
    private ahqn q;
    private boolean r;
    private boolean s;

    ahrt(Context context, ViewGroup viewGroup, ahry ahry) {
        this.a = (ahry) amqw.a((Object) ahry);
        this.b = new ahrd(viewGroup, context, new Handler(Looper.getMainLooper()), ahry.a.e());
        Resources resources = context.getResources();
        Bitmap a = ahsl.a(resources, (int) R.raw.vr_button_border_small);
        Bitmap a2 = ahsl.a(resources, (int) R.raw.vr_button_fill);
        ahpn ahpn = (ahpn) ahry.c.clone();
        ahpn.a(false);
        ahqb a3 = ahrt.a(a, ahpn, ahry);
        a3.a(new ahpt(a3, 0.8f, 0.0f));
        ahqb a4 = ahrt.a(a2, ahpn, ahry);
        a4.a(new ahpt(a4, 0.0f, 1.0f));
        this.p = new ahnd(new ahou(ahpn, 0.0f, 0.0f));
        this.p.a(a4);
        this.p.a(a3);
        this.n = new ahou((ahpn) ahry.c.clone(), ahry.j * 3.0f, ahry.k * 3.0f);
        this.q = ahry.i;
        ahry.a((ahsd) this);
        ahry.a((ahsc) this);
        a3 = new ahor();
        ahom ahom = new ahom(a3, this.b, new Handler(Looper.getMainLooper()), (ahpn) ahpn.clone(), ahry);
        super.a(this.c);
        super.a(this.p);
        super.a(a3);
        this.o = new ahol(ahom.a, ahom.b, ahom.c, (ahpn) ahom.d.clone(), ahom.e, resources.getString(R.string.vr_click_to_recenter));
        a(false);
    }

    public final void c() {
        boolean z;
        ahnd ahnd = this.p;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (!((ahqb) it.next()).f()) {
                z = false;
                break;
            }
        }
        z = true;
        ahnd.m_(z);
    }

    public final void d(ahnj ahnj) {
        if (!f()) {
            Object obj;
            Object obj2;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ahqb ahqb = (ahqb) it.next();
                if ((ahqb instanceof ahpv) && ((ahpv) ahqb).c(ahnj)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ahqb ahqb2 = (ahqb) it2.next();
                if ((ahqb2 instanceof ahpv) && ((ahpv) ahqb2).a(ahnj)) {
                    obj2 = 1;
                    break;
                }
            }
            obj2 = null;
            this.p.a(by_() ^ 1, ahnj);
            ahnd ahnd = this.p;
            boolean z = obj != null || obj2 == null;
            ahnd.m_(z);
            if (!(this.q == ahqn.FULL_SPHERICAL || this.q == ahqn.PARTIAL_SPHERICAL)) {
                ahol ahol;
                if (this.n.a(ahnj).a()) {
                    if (this.r) {
                        this.r = false;
                        ahol = this.o;
                        ahol.b.m_(true);
                        ahol.a.removeCallbacks(ahol.c);
                    }
                } else if (!this.r) {
                    this.r = true;
                    ahol = this.o;
                    ahol.b.m_(false);
                    ahol.a.postAtTime(ahol.c, SystemClock.uptimeMillis() + 5000);
                }
            }
            super.d(ahnj);
        }
        if (this.s) {
            this.a.a(0.0f);
            this.s = false;
        }
    }

    public final void a(ahqb ahqb) {
        throw new RuntimeException("Do not add children directly to the VrGroupNode; add them using addExternalChild!");
    }

    public final void e(ahnj ahnj) {
        super.e(ahnj);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (!((ahpv) ((ahqb) it.next())).b(ahnj)) {
                return;
            }
        }
        this.a.a(ahnj);
    }

    public final ahpn d() {
        return this.a.c;
    }

    public final void a(ahpv ahpv) {
        this.c.a((ahqb) ahpv);
        c();
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        int i = z ^ 1;
        this.l = i;
        this.s = i;
    }

    public final void bd_() {
        super.bd_();
        this.a.b((ahsd) this);
        this.a.b((ahsc) this);
    }

    public final void a(ahqn ahqn) {
        this.q = ahqn;
    }

    public final void a(float f, float f2) {
        this.n.a(f * 3.0f, f2 * 3.0f);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, boolean z2) {
        this.g = z;
        this.h = z2;
    }

    public final void c(boolean z) {
        for (ahrv b : this.e) {
            b.b(z);
        }
    }

    public final boolean e() {
        ahru ahru = this.f;
        return ahru == null || ahru.b();
    }

    public final void a(String str, String str2) {
        ahrx ahrx = this.j;
        if (ahrx == null) {
            xtl.c("Attempted to update the video metadata but the listener is null.");
        } else {
            ahrx.a(str, str2);
        }
    }

    public final void g() {
        this.a.b.l = false;
        ahrw ahrw = this.i;
        if (ahrw != null) {
            ahrw.e();
        }
    }

    public final boolean h() {
        ahrs ahrs = this.k;
        return ahrs != null && ahrs.a();
    }

    public final boolean i() {
        ahrz ahrz = this.m;
        return ahrz != null && ahrz.a();
    }

    private static ahng a(Bitmap bitmap, ahpn ahpn, ahry ahry) {
        ahng ahng = new ahng(bitmap, ahsm.a(ahsl.a((float) bitmap.getWidth()), ahsl.a((float) bitmap.getHeight()), ahsm.c), ahpn, ahry.a.d());
        ahng.a(new ahpz(ahng, ahpz.a(0.5f), ahpz.a(0.05f)));
        return ahng;
    }
}
