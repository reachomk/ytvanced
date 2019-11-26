package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: kyp */
public final class kyp implements ewb {
    public final ewi a;
    public final ewf b;
    public evz c;
    public evy d;
    public ewa e;
    public evx f;
    public ewc g;
    public final kyy h;
    public final fng i;
    public final kyw j;
    private final SharedPreferences k;
    private final albv l;

    public kyp(ewi ewi, ewf ewf, SharedPreferences sharedPreferences, albv albv, exu exu, kyy kyy, kyw kyw, fng fng) {
        this.a = ewi;
        this.b = ewf;
        this.k = sharedPreferences;
        this.l = albv;
        this.h = kyy;
        this.j = kyw;
        this.i = fng;
        SharedPreferences sharedPreferences2 = this.k;
        String str = ebn.TIME_FUSION_ENABLED;
        if (!sharedPreferences2.contains(str)) {
            this.k.edit().putLong(str, System.currentTimeMillis()).apply();
        }
        if (this.k.getBoolean(ebn.SHOW_SUBSCRIBERS_TAB_TUTORIAL, true)) {
            this.c = new evz(this.a, this.k, this.l);
            this.a.a(this.c);
        }
        if (this.k.getBoolean(ebn.SHOW_ACCOUNT_TAB_TUTORIAL, true)) {
            this.d = new evy(this.a, this.k, this.l);
            this.a.a(this.d);
        }
        if (this.k.getBoolean(ebn.SHOW_SUBS_CHANNELS_TUTORIAL, true)) {
            this.e = new ewa(this.a, this.k, this.l);
            this.a.a(this.e);
        }
        if (this.k.getBoolean(ebn.SHOW_CHANNELS_NOTIFICATIONS_TUTORIAL, true)) {
            this.f = new evx(this.a, this.k, this.l);
            this.a.a(this.f);
        }
        if (this.k.getBoolean(ebn.SHOW_TRENDING_TAB_TUTORIAL, true)) {
            this.g = new ewc(this.a, this.k, this.l);
            this.a.a(this.g);
        }
        exu.a(new kys(this));
    }

    public final boolean a() {
        if (!this.i.e()) {
            return false;
        }
        this.i.d();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    public final void a(defpackage.akbc r5) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        r2 = 0;
        if (r5 != 0) goto L_0x0008;
    L_0x0005:
        r5 = 0;
    L_0x0006:
        r0 = 0;
        goto L_0x0037;
    L_0x0008:
        r5 = r5.a;
        r3 = "FEsubscriptions";
        r3 = defpackage.kyp.a(r5, r3);
        if (r3 == 0) goto L_0x0015;
    L_0x0012:
        r1 = "show_subscribers_tab_tutorial";
        goto L_0x0005;
    L_0x0015:
        r3 = "FEaccount";
        r3 = defpackage.kyp.a(r5, r3);
        if (r3 == 0) goto L_0x0021;
    L_0x001d:
        r1 = "show_accounts_tab_tutorial";
        r5 = 0;
        goto L_0x0037;
    L_0x0021:
        r3 = "FEtrending";
        r3 = defpackage.kyp.a(r5, r3);
        if (r3 == 0) goto L_0x002c;
    L_0x0029:
        r1 = "show_trending_tab_tutorial";
        goto L_0x0005;
    L_0x002c:
        r3 = "FEwhat_to_watch";
        r5 = defpackage.kyp.a(r5, r3);
        if (r5 != 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0005;
    L_0x0035:
        r5 = 1;
        goto L_0x0006;
    L_0x0037:
        if (r1 == 0) goto L_0x0046;
    L_0x0039:
        r3 = r4.k;
        r3 = r3.edit();
        r1 = r3.putBoolean(r1, r2);
        r1.apply();
    L_0x0046:
        r1 = r4.h;
        r1.c = r0;
        r0 = r4.j;
        r0.c = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyp.a(akbc):void");
    }

    public static boolean a(apxu apxu, String str) {
        if (apxu != null) {
            Object obj;
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            if ((((apge) obj).a & 1) != 0) {
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu.a(access$000);
                Object b2 = apxu.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                if (ampq.a(((apge) b2).b, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(Object obj, View view) {
        if (this.e != null && (obj instanceof ajsg)) {
            int i = 0;
            for (ajsf ajsf : ((ajsg) obj).a) {
                if (ajsf.b != null) {
                    i++;
                }
            }
            if (i >= 5) {
                this.e.a = view;
            }
        } else if (this.f != null && (obj instanceof jya)) {
            jya jya = (jya) obj;
            if (!(jya.b() == null || jya.b().b() == null || !view.isShown())) {
                this.f.a = view;
            }
        } else if (obj instanceof avqg) {
            this.h.a(view);
            this.h.d = new kyr(this);
        }
        this.a.a();
    }

    public final void a(boolean z) {
        if (!z) {
            this.a.b(this.h);
        } else if (this.h.e()) {
            this.a.a(this.h);
        }
    }

    public final boolean b() {
        return this.j.b();
    }
}
