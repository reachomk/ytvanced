package defpackage;

import com.google.android.youtube.R;

/* renamed from: abxc */
final class abxc implements ugp {
    private final /* synthetic */ abxb a;

    public final void a() {
    }

    public final void a(ugo ugo, ugo ugo2) {
        abxb abxb;
        if (ugo2 == ugo.COLLAPSED) {
            abxb = this.a;
            abxb.c.setImageResource(abxb.e.resourceId);
            abxb = this.a;
            abxb.c.setContentDescription(abxb.a.getString(R.string.live_chat_expand_cd));
            this.a.a(0);
            xpr.a(this.a.b);
            this.a.h.a();
            this.a.b(false);
        } else if (ugo2 == ugo.EXPANDED || ugo2 == ugo.FULLY_EXPANDED) {
            abxb = this.a;
            abxb.c.setImageResource(abxb.f.resourceId);
            abxb = this.a;
            abxb.c.setContentDescription(abxb.a.getString(R.string.live_chat_collapse_cd));
            this.a.a(4);
            this.a.b(true);
        } else if (ugo2 == ugo.HIDDEN) {
            this.a.a(0);
            this.a.h.a();
        }
    }

    public final void b() {
    }

    public final void c() {
    }

    /* synthetic */ abxc(abxb abxb) {
        this.a = abxb;
    }
}
