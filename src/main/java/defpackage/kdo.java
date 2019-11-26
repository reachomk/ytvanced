package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.google.android.youtube.R;

/* renamed from: kdo */
public final class kdo implements akot, fgz, fhn, kfi {
    public final FrameLayout a;
    private final Context b;
    private final fhb c;
    private final boolean d;
    private final int e;
    private final kdv f;
    private kdr g;
    private kdr h;
    private Object i;
    private foq j;
    private kdr k;
    private boolean l;

    public kdo(Context context, fhb fhb, exr exr, kdv kdv) {
        this(context, fhb, exr, kdv, false);
    }

    public final fhc b() {
        return null;
    }

    public kdo(Context context, fhb fhb, exr exr, kdv kdv, boolean z) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (fhb) amqw.a((Object) fhb);
        amqw.a((Object) exr);
        this.f = (kdv) amqw.a((Object) kdv);
        this.d = z;
        this.e = R.layout.inline_muted_metadata;
        this.a = new FrameLayout(context);
        a(foq.a);
        this.a.addView(this.k.K_());
    }

    public final View K_() {
        return this.a;
    }

    public final void a_(akor akor, Object obj) {
        this.i = obj;
        foq b = fod.b(obj);
        this.j = b == null ? foq.a : b;
        if (a(b)) {
            this.a.removeAllViews();
            this.a.addView(this.k.K_());
        }
        a(this.l);
        this.k.a_(akor, this.j);
    }

    public final void b(boolean z) {
        if (xrn.c(this.b) && z) {
            View childAt = this.a.getChildAt(0);
            if (aca.a(childAt.createAccessibilityNodeInfo()).a.isAccessibilityFocused()) {
                childAt.performAccessibilityAction(128, null);
                childAt.sendAccessibilityEvent(8);
            }
        }
    }

    private final boolean a(foq foq) {
        kdr kdr;
        boolean a = kdr.a(foq);
        if (c() != 2 || foq == null || foa.b(foq)) {
            if (kdo.a(this.g, a)) {
                this.g = a(new flu(this.b), a((int) R.layout.inline_muted_video_full_bleed, !a ? this.e : R.layout.inline_muted_metadata_swap));
            }
            kdr = this.g;
        } else {
            if (kdo.a(this.h, a)) {
                if (this.d) {
                    this.h = a(new flu(this.b), a((int) R.layout.promoted_video_item_land, this.e));
                } else {
                    this.h = a(new flu(this.b), a(!a ? R.layout.video_feed_entry : R.layout.video_feed_entry_swap, this.e));
                    View K_ = this.h.K_();
                    xpr.a(K_.findViewById(R.id.post_author), false);
                    xpr.a(K_.findViewById(R.id.post_text), false);
                }
            }
            kdr = this.h;
        }
        if (this.k == kdr) {
            return false;
        }
        this.k = kdr;
        return true;
    }

    public final void a(akpb akpb) {
        kdr kdr = this.h;
        if (kdr != null) {
            kdr.a(akpb);
        }
        kdr = this.g;
        if (kdr != null) {
            kdr.a(akpb);
        }
        this.l = false;
        this.j = null;
        this.i = null;
    }

    private final int c() {
        return this.b.getResources().getConfiguration().orientation;
    }

    public final View a() {
        if (this.k == null) {
            return null;
        }
        if (c() == 2) {
            foq foq = this.j;
            if (!(foq == null || foa.b(foq))) {
                return null;
            }
        }
        return this.k.c;
    }

    public final void a(boolean z) {
        this.l = z;
        kdr kdr = this.g;
        if (kdr != null && kdr.C != z) {
            kdr.C = z;
            if (z && kdr.B != null) {
                ely a = kdr.a.a(kdr.z);
                kdr.a.a(kdr.z, a != null ? a.a : 0, kdr.B, ScaleType.CENTER_CROP);
                kdr.d.a(kdr.z);
            }
        }
    }

    private final kdr a(akou akou, View view) {
        kdv kdv = this.f;
        return new kdr((Context) kdv.a((Context) kdv.a.get(), 1), (akkq) kdv.a((akkq) kdv.b.get(), 2), (akvp) kdv.a((akvp) kdv.c.get(), 3), (aaas) kdv.a((aaas) kdv.d.get(), 4), (gal) kdv.a((gal) kdv.e.get(), 5), (elv) kdv.a((elv) kdv.f.get(), 6), (akvo) kdv.a((akvo) kdv.g.get(), 7), (jty) kdv.a((jty) kdv.h.get(), 8), (fga) kdv.a((fga) kdv.i.get(), 9), (jup) kdv.a((jup) kdv.j.get(), 10), (klo) kdv.a((klo) kdv.k.get(), 11), (akoa) kdv.a((akoa) kdv.l.get(), 12), (hmc) kdv.a((hmc) kdv.m.get(), 13), (zyw) kdv.a((zyw) kdv.n.get(), 14), (jfw) kdv.a((jfw) kdv.o.get(), 15), (kfl) kdv.a((kfl) kdv.p.get(), 16), (akou) kdv.a(akou, 17), (View) kdv.a(view, 18), (kfi) kdv.a(this, 19), this.d);
    }

    private final View a(int i, int i2) {
        View inflate = View.inflate(this.b, i, null);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.inline_metadata_stub);
        if (!(viewStub == null || i2 == 0)) {
            viewStub.setLayoutResource(i2);
            viewStub.inflate();
        }
        return inflate;
    }

    public final bblt a(int i) {
        kdr kdr = this.k;
        if (kdr.e != null) {
            if ((i == 1 || i == 2) && kdr.a(kdr.A)) {
                kdr.e.a();
            } else if (i == 0 && kdr.a(kdr.A)) {
                kdr.e.b();
            }
        }
        if (i == 0) {
            return this.c.a(this.j);
        }
        return this.c.a(this.j, this, i == 2 ? 3 : 0);
    }

    public final boolean a(fhn fhn) {
        if ((fhn instanceof kdo) && ((kdo) fhn).i == this.i) {
            return true;
        }
        return false;
    }

    private static boolean a(kdr kdr, boolean z) {
        if (kdr != null) {
            if ((kdr.e != null) == z) {
                return false;
            }
        }
        return true;
    }
}
