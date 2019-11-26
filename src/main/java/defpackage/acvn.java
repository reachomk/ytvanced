package defpackage;

import android.content.SharedPreferences;

/* renamed from: acvn */
public final class acvn extends acvj implements acwu, acwv {
    private final SharedPreferences h;
    private final acww i;

    public acvn(acww acww, xuu xuu, xci xci, acwe acwe, acwh acwh, acxa acxa, SharedPreferences sharedPreferences) {
        this(acww, xuu, xci, acwe, acwh, acxa, sharedPreferences, acxe.m);
    }

    public final void b() {
    }

    private acvn(acww acww, xuu xuu, xci xci, acwe acwe, acwh acwh, acxa acxa, SharedPreferences sharedPreferences, acxe acxe) {
        super(xuu, xci, acwe, acwh, acxa, acxe);
        this.i = (acww) amqw.a((Object) acww);
        this.h = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final void a(acwl acwl, acww acww, apxu apxu) {
        throw new UnsupportedOperationException("LayersInteractionLogger does not support to log new screen to a specified layer. This API exists for the sake of migration. Please use non deprecated logNewScreen APIs.");
    }

    public final void a(acwl acwl, azfa azfa, String str) {
        throw new UnsupportedOperationException("LayersInteractionLogger does not support to log new screen to a specified layer. This API exists for the sake of migration. Please use non deprecated logNewScreen APIs.");
    }

    /* Access modifiers changed, original: protected|final */
    public final azfa a(acwc acwc, int i) {
        azfd azfd = (azfd) azfa.h.createBuilder();
        azfd.a(acwc.dU);
        if (i > 0) {
            azfd.b(i);
        } else {
            azfd.b(0);
        }
        azfd.c(e());
        return (azfa) ((anxl) azfd.build());
    }

    private final synchronized int e() {
        int i;
        i = this.h.getInt("interaction_logging_client_side_ve_counter", 10000);
        if (i >= 60000) {
            i = 10000;
        }
        i++;
        this.h.edit().putInt("interaction_logging_client_side_ve_counter", i).apply();
        return i;
    }

    public final acvx a(acxe acxe) {
        acvn acvn = new acvn(this.i, this.a, this.b, this.c, this.d, this.e, this.h, acxe);
        acvn.a(acvn.c());
        return acvn;
    }

    public final acwp c() {
        return this.d.a(this.i);
    }

    public final void a(acwp acwp) {
        if (acwp != null) {
            this.d.a(this.i, acwp);
            this.d.a(acwp, this.f);
        }
    }

    public final String d() {
        acwp c = c();
        if (c == null) {
            return "";
        }
        return c.a;
    }
}
