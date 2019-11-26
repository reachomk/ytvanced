package defpackage;

import com.google.android.youtube.R;

/* renamed from: yrs */
final /* synthetic */ class yrs implements xsd {
    private final yrp a;

    yrs(yrp yrp) {
        this.a = yrp;
    }

    public final void a(Object obj) {
        yrp yrp = this.a;
        aadz aadz = (aadz) obj;
        yrp.k = (ykv) aadz.c();
        ymn ymn = (ymn) aadz.e().a("technodrome_metadata", ymn.c.getParserForType());
        ykv ykv = yrp.k;
        if (ykv == null || !ykv.b()) {
            yrp.g.a(null);
            yrp.g.a(null, false);
            if (yrp.h.bi_()) {
                yrp.g.b(false);
                yrp.g.a(false);
            }
        } else {
            if (!yrp.h.bg_()) {
                yrp.g.a(null);
            } else if (yrp.k.f()) {
                yrp.g.a(yrp.e_.getString(R.string.viewer_name_with_you, new Object[]{yrp.k.getName()}));
            } else {
                int ordinal = ykv.a(yrp.k, ymn).ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    yrp.g.a(yrp.e_.getString(R.string.blocked_user_name, new Object[]{yrp.k.getName()}));
                } else {
                    yrp.g.a(yrp.k.getName());
                }
            }
            if (yrp.h.bh_()) {
                yrp.g.a(yrp.k.getAvatar(), true);
            } else {
                yrp.g.a(null, false);
            }
            if (yrp.h.bi_()) {
                if (yrp.k.f()) {
                    yrp.g.b(false);
                    yrp.g.a(false);
                    return;
                }
                int ordinal2 = ykv.a(yrp.k, ymn).ordinal();
                if (ordinal2 == 2) {
                    yrp.g.a(true);
                    yrp.g.b(false);
                } else if (ordinal2 != 3) {
                    yrp.g.b(false);
                    yrp.g.a(false);
                } else {
                    yrp.g.b(true);
                    yrp.g.a(false);
                }
            }
        }
    }
}
