package defpackage;

import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.os.BadParcelableException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: mjr */
public final class mjr implements fps {
    public final lyl a;
    public final aaas b;
    public final bcaa c;
    public final mjw d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    private final alfi i;
    private final afpu j;
    private final ehz k;
    private final edz l;
    private final bcaa m;
    private final mkp n;
    private final mkj o;
    private final dvc p;
    private final mjs q;
    private final bcaa r;
    private final Executor s;
    private final Set t = new CopyOnWriteArraySet();
    private anjv u;

    public static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("source");
        return !TextUtils.isEmpty(stringExtra) ? stringExtra.equals("shortcut") : false;
    }

    public mjr(lyl lyl, aaas aaas, alfi alfi, afpu afpu, ehz ehz, edz edz, bcaa bcaa, bcaa bcaa2, mkp mkp, mjw mjw, mkj mkj, dvc dvc, mjs mjs, bcaa bcaa3, Executor executor) {
        this.a = lyl;
        this.b = aaas;
        this.i = alfi;
        this.j = afpu;
        this.k = ehz;
        this.l = edz;
        this.c = bcaa;
        this.m = bcaa2;
        this.n = mkp;
        this.d = mjw;
        this.o = mkj;
        this.p = dvc;
        this.q = mjs;
        this.r = bcaa3;
        this.s = executor;
    }

    public final void a(fpr fpr) {
        if (c()) {
            this.t.add(fpr);
        } else {
            fpr.a();
        }
    }

    public final void b(fpr fpr) {
        this.t.remove(fpr);
    }

    public final void a() {
        this.e = false;
    }

    public final void a(Intent intent, Bundle bundle) {
        anjv a;
        if (bundle != null) {
            try {
                this.a.w();
                this.g = bundle.getBoolean("has_handled_intent", false);
            } catch (BadParcelableException e) {
                xtl.a("handleIntent failed", e);
                a = anjf.a(Boolean.FALSE);
            }
        }
        if (this.g || intent == null) {
            a = anjf.a(Boolean.FALSE);
            a(a);
        }
        if (mjr.a(intent) && this.m != null) {
            lyl lyl = this.a;
            String action = intent.getAction();
            if (VERSION.SDK_INT >= 25) {
                ((ShortcutManager) lyl.getSystemService(ShortcutManager.class)).reportShortcutUsed(action);
            }
        }
        if ("com.google.android.youtube.action.open.search".equals(intent.getAction())) {
            this.e = true;
            a = anjf.a(Boolean.TRUE);
        } else {
            a = a(intent, true);
        }
        a(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a5  */
    public final defpackage.anjv a(android.content.Intent r24, boolean r25) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r24;
        r2 = r0.a;
        defpackage.afxv.a(r2, r1);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 23;
        if (r2 < r3) goto L_0x0014;
    L_0x000f:
        r2 = r0.a;
        defpackage.afxv.b(r2, r1);
    L_0x0014:
        r2 = r0.n;
        r3 = r24.getAction();
        r4 = android.text.TextUtils.isEmpty(r3);
        r5 = 1;
        r6 = 0;
        if (r4 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x0065;
    L_0x0023:
        r4 = "com.google.android.apps.wellbeing.VIEW_APP_USAGE";
        r3 = r3.startsWith(r4);
        if (r3 == 0) goto L_0x0065;
    L_0x002b:
        r1 = r2.a;
        r2 = defpackage.apxu.d;
        r2 = r2.createBuilder();
        r2 = (defpackage.apxx) r2;
        r3 = defpackage.apge.j;
        r3 = r3.createBuilder();
        r3 = (defpackage.apgd) r3;
        r4 = "SPtime_watched";
        r3.a(r4);
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.apge) r3;
        r4 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r2.a(r4, r3);
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.apxu) r2;
        r1.a(r2, r6);
        r1 = r0.q;
        r1.j = r5;
        r1 = java.lang.Boolean.TRUE;
        r1 = defpackage.anjf.a(r1);
        return r1;
    L_0x0065:
        r2 = "navigation_endpoint";
        r3 = r1.hasExtra(r2);
        r4 = 5;
        r7 = 4;
        r8 = 3;
        r9 = 0;
        if (r3 == 0) goto L_0x00f5;
    L_0x0071:
        r3 = r24.getExtras();
        r2 = r3.getByteArray(r2);
        r2 = defpackage.aaax.a(r2);
        r3 = com.google.protos.youtube.api.innertube.NavigateAndOpenDialogEndpointOuterClass.navigateAndOpenDialogEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r8 = r2.h;
        r3 = r3.d;
        r3 = r8.a(r3);
        if (r3 != 0) goto L_0x0096;
    L_0x0090:
        r3 = r0.b;
        r3.a(r2, r6);
        goto L_0x00c8;
    L_0x0096:
        r3 = com.google.protos.youtube.api.innertube.NavigateAndOpenDialogEndpointOuterClass.navigateAndOpenDialogEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r8 = r3.d;
        r2 = r2.b(r8);
        if (r2 != 0) goto L_0x00ac;
    L_0x00a9:
        r2 = r3.b;
        goto L_0x00b0;
    L_0x00ac:
        r2 = r3.a(r2);
    L_0x00b0:
        r2 = (defpackage.avjc) r2;
        r3 = r0.b;
        r8 = r2.b;
        if (r8 != 0) goto L_0x00ba;
    L_0x00b8:
        r8 = defpackage.apxu.d;
    L_0x00ba:
        r3.a(r8, r6);
        r3 = r0.b;
        r2 = r2.c;
        if (r2 != 0) goto L_0x00c5;
    L_0x00c3:
        r2 = defpackage.apxu.d;
    L_0x00c5:
        r3.a(r2, r6);
    L_0x00c8:
        r2 = "record_interactions_endpoint";
        r3 = r1.hasExtra(r2);
        if (r3 == 0) goto L_0x00e1;
    L_0x00d0:
        r3 = r24.getExtras();
        r2 = r3.getByteArray(r2);
        r2 = defpackage.aabc.a(r2);
        r3 = r0.b;
        r3.a(r2, r6);
    L_0x00e1:
        r2 = "push_notification_clientstreamz_logging";
        r3 = r1.hasExtra(r2);
        if (r3 == 0) goto L_0x00f2;
    L_0x00e9:
        r3 = r0.r;
        r1 = r1.getStringExtra(r2);
        defpackage.afxh.a(r3, r1);
    L_0x00f2:
        r8 = 4;
        goto L_0x0303;
    L_0x00f5:
        r2 = "pane";
        r3 = r1.hasExtra(r2);
        r10 = 2;
        if (r3 == 0) goto L_0x0112;
    L_0x00fe:
        r1 = r24.getExtras();
        r1 = r1.getParcelable(r2);
        r1 = (defpackage.fiw) r1;
        r2 = r0.d;
        if (r25 != 0) goto L_0x010d;
    L_0x010c:
        r10 = 0;
    L_0x010d:
        r2.a(r1, r10);
        goto L_0x0303;
    L_0x0112:
        r2 = "watch";
        r3 = r1.hasExtra(r2);
        if (r3 == 0) goto L_0x0137;
    L_0x011a:
        r1 = r24.getExtras();
        r2 = r1.getParcelable(r2);
        r2 = (defpackage.airl) r2;
        r3 = r0.p;
        r8 = new eiy;
        r10 = "playback_start_flag";
        r1 = r1.getInt(r10, r9);
        r8.<init>(r2, r1);
        r3.a(r8);
        r8 = 1;
        goto L_0x0303;
    L_0x0137:
        r2 = "tv_sign_in_data";
        r3 = r1.hasExtra(r2);
        if (r3 == 0) goto L_0x01aa;
    L_0x013f:
        r3 = r0.a;
        r1 = r1.getBundleExtra(r2);
        r2 = r3.L;
        if (r1 == 0) goto L_0x01a0;
    L_0x0149:
        r3 = "com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode";
        r12 = r1.getString(r3);
        r3 = "com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId";
        r14 = r1.getString(r3);
        r3 = "";
        r11 = "com.google.android.libraries.youtube.mdx.tvsignin.keySignInSessionId";
        r13 = r1.getString(r11, r3);
        r11 = "com.google.android.libraries.youtube.mdx.tvsignin.keyAppStatusUri";
        r20 = r1.getString(r11, r3);
        r1 = android.text.TextUtils.isEmpty(r14);
        if (r1 != 0) goto L_0x01a0;
    L_0x0169:
        r1 = android.text.TextUtils.isEmpty(r13);
        if (r1 == 0) goto L_0x0175;
    L_0x016f:
        r1 = android.text.TextUtils.isEmpty(r12);
        if (r1 != 0) goto L_0x01a0;
    L_0x0175:
        r1 = new java.lang.Object[r8];
        r3 = android.text.TextUtils.isEmpty(r12);
        if (r3 == 0) goto L_0x0180;
    L_0x017d:
        r3 = "NO AUTH CODE";
        goto L_0x0181;
    L_0x0180:
        r3 = r12;
    L_0x0181:
        r1[r9] = r3;
        r1[r5] = r14;
        r1[r10] = r13;
        r3 = "Creating sign in request (%s, %s, %s)";
        java.lang.String.format(r3, r1);
        r1 = new aeal;
        r15 = 0;
        r16 = 1;
        r17 = 0;
        r18 = 1;
        r19 = 0;
        r21 = 0;
        r22 = 0;
        r11 = r1;
        r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        goto L_0x01a1;
    L_0x01a0:
        r1 = r6;
    L_0x01a1:
        if (r1 != 0) goto L_0x01a5;
    L_0x01a3:
        goto L_0x0303;
    L_0x01a5:
        r2.a(r1);
        goto L_0x0303;
    L_0x01aa:
        r2 = defpackage.zta.a(r24);
        if (r2 == 0) goto L_0x01c1;
    L_0x01b0:
        r2 = r0.a;
        r2 = r2.aO;
        r2 = r2.get();
        r2 = (defpackage.zta) r2;
        r2.b(r1);
        r1 = 7;
        r8 = 7;
        goto L_0x0303;
    L_0x01c1:
        r2 = "alias";
        r3 = r1.hasExtra(r2);
        if (r3 == 0) goto L_0x02c7;
    L_0x01c9:
        r2 = r1.getStringExtra(r2);
        r3 = com.google.android.apps.youtube.app.application.Shell$HomeActivity.class;
        r3 = r3.getName();
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x0249;
    L_0x01d9:
        r2 = r24.getAction();
        r0.f = r5;
        if (r2 == 0) goto L_0x01e5;
    L_0x01e1:
        r2 = r2.trim();
    L_0x01e5:
        r3 = "com.google.android.youtube.action.open.subscriptions";
        r3 = android.text.TextUtils.equals(r3, r2);
        if (r3 == 0) goto L_0x0231;
    L_0x01ed:
        r2 = r0.j;
        r2 = r2.a();
        if (r2 == 0) goto L_0x0206;
    L_0x01f5:
        r2 = r0.d;
        r3 = "FEsubscriptions";
        r3 = defpackage.aaax.a(r3);
        r3 = defpackage.gub.a(r3, r5);
        r2.a(r3);
        goto L_0x027d;
    L_0x0206:
        r2 = r0.d;
        r3 = "FEaccount";
        r3 = defpackage.aaax.a(r3);
        r3 = defpackage.gub.a(r3, r5);
        r2.a(r3);
        r2 = defpackage.gwd.aG();
        r3 = r0.o;
        if (r2 != 0) goto L_0x021e;
    L_0x021d:
        goto L_0x0222;
    L_0x021e:
        r11 = r3.b;
        r11.e = r2;
    L_0x0222:
        r2 = r3.a;
        r2 = r2.J;
        r2.b();
        r2 = r3.c;
        r3 = r3.a;
        r2.a(r3, r6, r6);
        goto L_0x027d;
    L_0x0231:
        r3 = "com.google.android.youtube.action.open.trending";
        r2 = android.text.TextUtils.equals(r3, r2);
        if (r2 == 0) goto L_0x027d;
    L_0x0239:
        r2 = r0.d;
        r3 = "FEtrending";
        r3 = defpackage.aaax.a(r3);
        r3 = defpackage.gub.a(r3, r5);
        r2.a(r3);
        goto L_0x027d;
    L_0x0249:
        r3 = com.google.android.apps.youtube.app.application.Shell$ResultsActivity.class;
        r3 = r3.getName();
        r3 = r2.equals(r3);
        if (r3 != 0) goto L_0x0274;
    L_0x0255:
        r3 = com.google.android.apps.youtube.app.application.Shell$MediaSearchActivity.class;
        r3 = r3.getName();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0262;
    L_0x0261:
        goto L_0x027a;
    L_0x0262:
        r2 = defpackage.airl.b(r24);
        if (r2 == 0) goto L_0x027a;
    L_0x0268:
        r3 = r0.p;
        r8 = new eiy;
        r8.<init>(r2);
        r3.a(r8);
        r8 = 1;
        goto L_0x027d;
    L_0x0274:
        r2 = r23.b(r24);
        if (r2 != 0) goto L_0x027c;
    L_0x027a:
        r8 = 0;
        goto L_0x027d;
    L_0x027c:
        r8 = 2;
    L_0x027d:
        if (r8 != 0) goto L_0x0290;
    L_0x027f:
        r2 = "query";
        r2 = r1.hasExtra(r2);
        if (r2 == 0) goto L_0x0290;
    L_0x0287:
        r2 = r23.b(r24);
        if (r2 != 0) goto L_0x028f;
    L_0x028d:
        r8 = 0;
        goto L_0x0290;
    L_0x028f:
        r8 = 2;
    L_0x0290:
        if (r8 != 0) goto L_0x02c4;
    L_0x0292:
        r2 = r24.getData();
        if (r2 != 0) goto L_0x02a8;
    L_0x0298:
        r3 = "playlist_uri";
        r3 = r1.hasExtra(r3);
        if (r3 == 0) goto L_0x02a8;
    L_0x02a0:
        r2 = "playlist_uri";
        r2 = r1.getParcelableExtra(r2);
        r2 = (android.net.Uri) r2;
    L_0x02a8:
        if (r2 == 0) goto L_0x02be;
    L_0x02aa:
        r3 = r0.a;
        r3 = defpackage.wxk.a(r3, r1);
        r6 = defpackage.anko.f();
        r8 = r0.k;
        r10 = new mjt;
        r10.<init>(r0, r2, r1, r6);
        r8.a(r2, r3, r10);
    L_0x02be:
        if (r6 == 0) goto L_0x02c2;
    L_0x02c0:
        r1 = 5;
        goto L_0x02c5;
    L_0x02c2:
        r1 = 0;
        goto L_0x02c5;
    L_0x02c4:
        r1 = r8;
    L_0x02c5:
        r8 = r1;
        goto L_0x0303;
    L_0x02c7:
        r2 = r24.getAction();
        r3 = "android.intent.action.SEARCH";
        r2 = android.text.TextUtils.equals(r3, r2);
        if (r2 == 0) goto L_0x02e5;
    L_0x02d3:
        r2 = "query";
        r2 = r1.hasExtra(r2);
        if (r2 != 0) goto L_0x02dc;
    L_0x02db:
        goto L_0x02e5;
    L_0x02dc:
        r1 = r23.b(r24);
        if (r1 != 0) goto L_0x02e3;
    L_0x02e2:
        r10 = 0;
    L_0x02e3:
        r8 = r10;
        goto L_0x0303;
    L_0x02e5:
        r2 = "video_picker";
        r1 = r1.hasExtra(r2);
        if (r1 == 0) goto L_0x0302;
    L_0x02ed:
        r1 = r0.d;
        r2 = "FEvideo_picker";
        r2 = defpackage.aaax.a(r2);
        r2 = defpackage.gub.a(r2);
        r1.a(r2);
        r0.h = r5;
        r1 = r0.q;
        r1.j = r5;
    L_0x0302:
        r8 = 0;
    L_0x0303:
        r1 = r0.f;
        if (r1 != 0) goto L_0x030c;
    L_0x0307:
        r1 = r0.l;
        r1.a();
    L_0x030c:
        if (r8 != r5) goto L_0x030f;
    L_0x030e:
        goto L_0x0316;
    L_0x030f:
        if (r8 == r4) goto L_0x0316;
    L_0x0311:
        r1 = r0.a;
        r1.w();
    L_0x0316:
        r0.g = r5;
        if (r8 != r7) goto L_0x031b;
    L_0x031a:
        goto L_0x031d;
    L_0x031b:
        if (r8 != r4) goto L_0x0322;
    L_0x031d:
        r1 = r0.i;
        r1.a();
    L_0x0322:
        if (r6 != 0) goto L_0x0331;
    L_0x0324:
        if (r8 == 0) goto L_0x0327;
    L_0x0326:
        goto L_0x0328;
    L_0x0327:
        r5 = 0;
    L_0x0328:
        r1 = java.lang.Boolean.valueOf(r5);
        r1 = defpackage.anjf.a(r1);
        return r1;
    L_0x0331:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjr.a(android.content.Intent, boolean):anjv");
    }

    private final boolean b(Intent intent) {
        String stringExtra = intent.getStringExtra("query");
        int i = 0;
        if (stringExtra == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str = "is:channel";
        String str2 = "is:playlists";
        if (stringExtra.contains(str)) {
            arrayList.add("search_filter=channel");
        } else if (stringExtra.contains(str2)) {
            arrayList.add("search_filter=playlist");
        }
        String str3 = "";
        str = stringExtra.replace(str, str3).replace(str2, str3).trim();
        fph fph = (fph) intent.getSerializableExtra("selected_time_filter");
        if (fph != null) {
            int ordinal = fph.ordinal();
            if (ordinal == 0) {
                arrayList.add("search_filter=live");
            } else if (ordinal == 1) {
                arrayList.add("search_filter=today");
            } else if (ordinal == 2) {
                arrayList.add("search_filter=week");
            } else if (ordinal == 3) {
                arrayList.add("search_filter=month");
            }
        }
        axnx axnx = (axnx) axny.b.createBuilder();
        if (!arrayList.isEmpty()) {
            axnt axnt = (axnt) axnu.e.createBuilder();
            axnt.copyOnWrite();
            axnu axnu = (axnu) axnt.instance;
            axnu.a |= 1;
            axnu.c = true;
            int size = arrayList.size();
            while (i < size) {
                String str4 = (String) arrayList.get(i);
                axnv axnv = (axnv) axnw.e.createBuilder();
                axnv.copyOnWrite();
                axnw axnw = (axnw) axnv.instance;
                if (str4 != null) {
                    axnw.a |= 4;
                    axnw.d = str4;
                    axnv.a(3);
                    axnt.copyOnWrite();
                    axnu axnu2 = (axnu) axnt.instance;
                    axnu2.a();
                    axnu2.b.add((axnw) ((anxl) axnv.build()));
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
            axnu axnu3 = (axnu) ((anxl) axnt.build());
            axnx.copyOnWrite();
            axny axny = (axny) axnx.instance;
            if (axnu3 != null) {
                axny.a();
                axny.a.add(axnu3);
            } else {
                throw new NullPointerException();
            }
        }
        this.d.a(irr.a(str, (axny) ((anxl) axnx.build()), null, false, false, null, false));
        return true;
    }

    private final boolean c() {
        anjv anjv = this.u;
        boolean z = true;
        if (anjv != null) {
            if (anjv.isDone()) {
                z = false;
            } else if (this.u.isCancelled()) {
                return false;
            } else {
                return z;
            }
        }
        return z;
    }

    public final void a(anjv anjv) {
        anjv anjv2 = this.u;
        if (anjv2 != null) {
            anjv2.cancel(true);
        }
        this.u = anjv;
        if (c()) {
            anjv.a(new mjq(this), this.s);
        } else {
            b();
        }
    }

    public final void b() {
        for (fpr a : this.t) {
            a.a();
        }
        this.t.clear();
    }
}
