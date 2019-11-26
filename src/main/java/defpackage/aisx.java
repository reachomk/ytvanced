package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.List;

/* renamed from: aisx */
public final class aisx implements aisr, ajks {
    public static aisp a = new aisy();
    public static aisp b = new aitb();
    public static aisp c = new aita();
    public static aisp d = new aitd();
    public String e;
    public aitg f;
    public aitf g;
    private final Context h;
    private final bcaa i;
    private final int j;
    private final BroadcastReceiver k;
    private final IntentFilter l;
    private final aiss m;
    private final bcaa n;
    private final ajkp o;
    private final aite p;
    private final xsc q;
    private final Handler r;
    private final zyw s;
    private volatile boolean t;
    private List u;
    private SparseArray v;
    private long w;
    private boolean x;

    public aisx(Context context, bcaa bcaa, ajkp ajkp, ajko ajko, int i, bcaa bcaa2, aiss aiss, xsc xsc, List list, zyw zyw) {
        this(context, bcaa, ajkp, ajko, i, bcaa2, aiss, xsc, list, zyw, aite.a);
    }

    public aisx(Context context, bcaa bcaa, ajkp ajkp, ajko ajko, int i, bcaa bcaa2, aiss aiss, xsc xsc, List list, zyw zyw, aite aite) {
        this.h = (Context) amqw.a((Object) context);
        this.m = (aiss) amqw.a((Object) aiss);
        this.i = bcaa;
        this.j = i;
        amqw.a((Object) ajko);
        this.n = (bcaa) amqw.a((Object) bcaa2);
        this.o = (ajkp) amqw.a((Object) ajkp);
        this.q = (xsc) amqw.a((Object) xsc);
        this.s = (zyw) amqw.a((Object) zyw);
        this.r = new Handler(Looper.getMainLooper());
        this.l = new IntentFilter();
        this.l.addAction("com.google.android.libraries.youtube.player.action.controller_notification_prev");
        this.l.addAction("com.google.android.libraries.youtube.player.action.controller_notification_play");
        this.l.addAction("com.google.android.libraries.youtube.player.action.controller_notification_pause");
        this.l.addAction("com.google.android.libraries.youtube.player.action.controller_notification_next");
        this.l.addAction("com.google.android.libraries.youtube.player.action.controller_notification_close");
        this.l.addAction("com.google.android.libraries.youtube.player.action.controller_notification_replay");
        this.l.addAction("com.google.android.libraries.youtube.player.action.controller_notification_retry");
        this.l.addAction("noop");
        for (aisp aisp : list) {
            if (aisp instanceof aiso) {
                aiso aiso = (aiso) aisp;
                aiso.a(this);
                this.l.addAction(aiso.b());
            }
        }
        this.k = new aitc(ajko, list);
        this.u = list;
        this.p = aite;
        this.v = new SparseArray();
    }

    public final synchronized void b() {
        a(false);
    }

    public final synchronized void a(boolean z) {
        if (!this.t) {
            this.t = true;
            this.h.registerReceiver(this.k, this.l);
        }
        this.o.a((ajks) this);
        c(z);
    }

    public final void a(int i) {
        if ((i & 163) != 0) {
            c(false);
        }
    }

    public final void a() {
        c(false);
    }

    public final synchronized void b(boolean z) {
        this.o.a.remove(this);
        if (z) {
            this.m.b();
        }
        for (aisp aisp : this.u) {
            if (aisp instanceof aiso) {
                ((aiso) aisp).f();
            }
        }
        if (this.t) {
            this.t = false;
            this.h.unregisterReceiver(this.k);
        }
        if (this.x) {
            this.r.removeCallbacks(new aisw(this));
            this.x = false;
        }
    }

    public final void a(aitl aitl) {
        this.v.put(2, aitl);
    }

    /* JADX WARNING: Missing block: B:25:0x0041, code skipped:
            return;
     */
    private final synchronized void c(boolean r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        if (r8 == 0) goto L_0x0004;
    L_0x0003:
        goto L_0x000d;
    L_0x0004:
        r0 = r7.t;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0040;
    L_0x0008:
        r0 = r7.x;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0040;
    L_0x000d:
        r0 = r7.q;	 Catch:{ all -> 0x003e }
        r0 = r0.b();	 Catch:{ all -> 0x003e }
        r2 = 1;
        if (r8 == 0) goto L_0x001b;
    L_0x0016:
        r7.d(r2);	 Catch:{ all -> 0x003e }
        monitor-exit(r7);
        return;
    L_0x001b:
        r3 = r7.w;	 Catch:{ all -> 0x003e }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r3 = r3 + r5;
        r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r8 > 0) goto L_0x0039;
    L_0x0024:
        r5 = 0;
        r3 = r3 - r0;
        r0 = java.lang.Math.max(r5, r3);	 Catch:{ all -> 0x003e }
        r8 = r7.r;	 Catch:{ all -> 0x003e }
        r3 = new aisz;	 Catch:{ all -> 0x003e }
        r3.<init>(r7);	 Catch:{ all -> 0x003e }
        r8.postDelayed(r3, r0);	 Catch:{ all -> 0x003e }
        r7.x = r2;	 Catch:{ all -> 0x003e }
        monitor-exit(r7);
        return;
    L_0x0039:
        r7.c();	 Catch:{ all -> 0x003e }
        monitor-exit(r7);
        return;
    L_0x003e:
        r8 = move-exception;
        goto L_0x0042;
    L_0x0040:
        monitor-exit(r7);
        return;
    L_0x0042:
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisx.c(boolean):void");
    }

    public final synchronized void c() {
        this.x = false;
        if (this.t) {
            aitg aitg = this.f;
            boolean z = true;
            if (aitg != null) {
                z = aitg.a();
            } else {
                int i = this.o.b;
                if (!(i == 5 || i == 2)) {
                    if (i != 9) {
                        z = false;
                    }
                }
            }
            d(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x022f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    private final synchronized void d(boolean r13) {
        /*
        r12 = this;
        monitor-enter(r12);
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x02dc }
        r7.<init>();	 Catch:{ all -> 0x02dc }
        r0 = r12.g;	 Catch:{ all -> 0x02dc }
        r8 = 2;
        r9 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x000c:
        r0 = r0.a();	 Catch:{ all -> 0x02dc }
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r10 = r0;
        goto L_0x0065;
    L_0x0015:
        r0 = new qg;	 Catch:{ all -> 0x02dc }
        r1 = r12.h;	 Catch:{ all -> 0x02dc }
        r0.<init>(r1);	 Catch:{ all -> 0x02dc }
        r1 = r12.o;	 Catch:{ all -> 0x02dc }
        r1 = r1.i;	 Catch:{ all -> 0x02dc }
        r0.a(r1);	 Catch:{ all -> 0x02dc }
        r1 = r12.o;	 Catch:{ all -> 0x02dc }
        r1 = r1.i;	 Catch:{ all -> 0x02dc }
        r0.e(r1);	 Catch:{ all -> 0x02dc }
        r1 = r12.o;	 Catch:{ all -> 0x02dc }
        r1 = r1.j;	 Catch:{ all -> 0x02dc }
        r0.b(r1);	 Catch:{ all -> 0x02dc }
        r1 = r12.j;	 Catch:{ all -> 0x02dc }
        r0.a(r1);	 Catch:{ all -> 0x02dc }
        r1 = r12.o;	 Catch:{ all -> 0x02dc }
        r1 = r1.m;	 Catch:{ all -> 0x02dc }
        r0.a(r1);	 Catch:{ all -> 0x02dc }
        r0.i = r8;	 Catch:{ all -> 0x02dc }
        r0.j = r9;	 Catch:{ all -> 0x02dc }
        r0.c();	 Catch:{ all -> 0x02dc }
        r1 = r12.i;	 Catch:{ all -> 0x02dc }
        r1 = r1.get();	 Catch:{ all -> 0x02dc }
        r1 = (android.app.PendingIntent) r1;	 Catch:{ all -> 0x02dc }
        r0.f = r1;	 Catch:{ all -> 0x02dc }
        r1 = r12.h;	 Catch:{ all -> 0x02dc }
        defpackage.xlr.a(r0, r1);	 Catch:{ all -> 0x02dc }
        r1 = r12.e;	 Catch:{ all -> 0x02dc }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x02dc }
        if (r1 != 0) goto L_0x0013;
    L_0x005b:
        r1 = r12.e;	 Catch:{ all -> 0x02dc }
        r1 = android.text.Html.fromHtml(r1);	 Catch:{ all -> 0x02dc }
        r0.c(r1);	 Catch:{ all -> 0x02dc }
        goto L_0x0013;
    L_0x0065:
        r0 = r12.u;	 Catch:{ all -> 0x02dc }
        r11 = r0.iterator();	 Catch:{ all -> 0x02dc }
    L_0x006b:
        r0 = r11.hasNext();	 Catch:{ all -> 0x02dc }
        r1 = 3;
        if (r0 == 0) goto L_0x022f;
    L_0x0072:
        r0 = r11.next();	 Catch:{ all -> 0x02dc }
        r0 = (defpackage.aisp) r0;	 Catch:{ all -> 0x02dc }
        r2 = b;	 Catch:{ all -> 0x02dc }
        r3 = 1;
        if (r0 == r2) goto L_0x0090;
    L_0x007d:
        r2 = c;	 Catch:{ all -> 0x02dc }
        if (r0 == r2) goto L_0x008e;
    L_0x0081:
        r2 = a;	 Catch:{ all -> 0x02dc }
        if (r0 == r2) goto L_0x008c;
    L_0x0085:
        r2 = d;	 Catch:{ all -> 0x02dc }
        if (r0 != r2) goto L_0x008a;
    L_0x0089:
        goto L_0x0091;
    L_0x008a:
        r1 = 0;
        goto L_0x0099;
    L_0x008c:
        r1 = 0;
        goto L_0x0091;
    L_0x008e:
        r1 = 2;
        goto L_0x0091;
    L_0x0090:
        r1 = 1;
    L_0x0091:
        r2 = r12.v;	 Catch:{ all -> 0x02dc }
        r1 = r2.get(r1);	 Catch:{ all -> 0x02dc }
        r1 = (defpackage.aitl) r1;	 Catch:{ all -> 0x02dc }
    L_0x0099:
        if (r1 != 0) goto L_0x009c;
    L_0x009b:
        goto L_0x00bf;
    L_0x009c:
        r1 = r1.a();	 Catch:{ all -> 0x02dc }
        if (r1 == 0) goto L_0x00bf;
    L_0x00a2:
        r0 = r1.a();	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x006b;
    L_0x00a8:
        r2 = r1.b();	 Catch:{ all -> 0x02dc }
        r3 = r1.c();	 Catch:{ all -> 0x02dc }
        r4 = r1.d();	 Catch:{ all -> 0x02dc }
        r6 = r1.e();	 Catch:{ all -> 0x02dc }
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x00bf:
        r1 = b;	 Catch:{ all -> 0x02dc }
        if (r0 == r1) goto L_0x01ff;
    L_0x00c3:
        r1 = c;	 Catch:{ all -> 0x02dc }
        if (r0 == r1) goto L_0x0160;
    L_0x00c7:
        r1 = a;	 Catch:{ all -> 0x02dc }
        if (r0 == r1) goto L_0x0130;
    L_0x00cb:
        r1 = d;	 Catch:{ all -> 0x02dc }
        if (r0 == r1) goto L_0x011b;
    L_0x00cf:
        r1 = r0 instanceof defpackage.aiso;	 Catch:{ all -> 0x02dc }
        if (r1 == 0) goto L_0x00f7;
    L_0x00d3:
        r0 = (defpackage.aiso) r0;	 Catch:{ all -> 0x02dc }
        r1 = r0.g();	 Catch:{ all -> 0x02dc }
        if (r1 == 0) goto L_0x006b;
    L_0x00db:
        r2 = r0.d();	 Catch:{ all -> 0x02dc }
        r3 = r0.e();	 Catch:{ all -> 0x02dc }
        r1 = r0.b();	 Catch:{ all -> 0x02dc }
        r4 = r12.a(r1);	 Catch:{ all -> 0x02dc }
        r6 = r0.h();	 Catch:{ all -> 0x02dc }
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x00f7:
        r0 = r0.getClass();	 Catch:{ all -> 0x02dc }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x02dc }
        r1 = r0.length();	 Catch:{ all -> 0x02dc }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02dc }
        r1 = r1 + 21;
        r2.<init>(r1);	 Catch:{ all -> 0x02dc }
        r1 = "Unknown Action class ";
        r2.append(r1);	 Catch:{ all -> 0x02dc }
        r2.append(r0);	 Catch:{ all -> 0x02dc }
        r0 = r2.toString();	 Catch:{ all -> 0x02dc }
        defpackage.xtl.c(r0);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x011b:
        r2 = 2130838996; // 0x7f0205d4 float:1.728299E38 double:1.0527743447E-314;
        r3 = 2131953142; // 0x7f1305f6 float:1.9542747E38 double:1.053324806E-314;
        r0 = "com.google.android.libraries.youtube.player.action.controller_notification_close";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x0130:
        r0 = r12.o;	 Catch:{ all -> 0x02dc }
        r0 = r0.d;	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x014b;
    L_0x0136:
        r2 = 2130839279; // 0x7f0206ef float:1.7283564E38 double:1.0527744846E-314;
        r3 = 2131953137; // 0x7f1305f1 float:1.9542736E38 double:1.0533248035E-314;
        r0 = "com.google.android.libraries.youtube.player.action.controller_notification_next";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x014b:
        r2 = 2130838401; // 0x7f020381 float:1.7281783E38 double:1.052774051E-314;
        r3 = 2131953137; // 0x7f1305f1 float:1.9542736E38 double:1.0533248035E-314;
        r0 = "noop";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x0160:
        r0 = r12.o;	 Catch:{ all -> 0x02dc }
        r0 = r0.b;	 Catch:{ all -> 0x02dc }
        switch(r0) {
            case 2: goto L_0x01dd;
            case 3: goto L_0x01c8;
            case 4: goto L_0x01c8;
            case 5: goto L_0x01b0;
            case 6: goto L_0x019b;
            case 7: goto L_0x0186;
            case 8: goto L_0x0171;
            case 9: goto L_0x01dd;
            case 10: goto L_0x01c8;
            default: goto L_0x0167;
        };	 Catch:{ all -> 0x02dc }
    L_0x0167:
        r2 = 2130838389; // 0x7f020375 float:1.7281759E38 double:1.052774045E-314;
        r3 = 2131953138; // 0x7f1305f2 float:1.9542739E38 double:1.053324804E-314;
        r0 = "noop";
        goto L_0x01f2;
    L_0x0171:
        r2 = 2130839038; // 0x7f0205fe float:1.7283075E38 double:1.0527743655E-314;
        r3 = 2131953141; // 0x7f1305f5 float:1.9542745E38 double:1.0533248055E-314;
        r0 = "com.google.android.libraries.youtube.player.action.controller_notification_retry";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x0186:
        r2 = 2130839249; // 0x7f0206d1 float:1.7283503E38 double:1.0527744697E-314;
        r3 = 2131953140; // 0x7f1305f4 float:1.9542743E38 double:1.053324805E-314;
        r0 = "com.google.android.libraries.youtube.player.action.controller_notification_replay";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x019b:
        r2 = 2130838404; // 0x7f020384 float:1.728179E38 double:1.0527740523E-314;
        r3 = 2131953138; // 0x7f1305f2 float:1.9542739E38 double:1.053324804E-314;
        r0 = "noop";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x01b0:
        r10.a(r9, r9, r3);	 Catch:{ all -> 0x02dc }
        r2 = 2130838389; // 0x7f020375 float:1.7281759E38 double:1.052774045E-314;
        r3 = 2131953138; // 0x7f1305f2 float:1.9542739E38 double:1.053324804E-314;
        r0 = "noop";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x01c8:
        r2 = 2130839213; // 0x7f0206ad float:1.728343E38 double:1.052774452E-314;
        r3 = 2131953138; // 0x7f1305f2 float:1.9542739E38 double:1.053324804E-314;
        r0 = "com.google.android.libraries.youtube.player.action.controller_notification_play";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x01dd:
        r2 = 2130839187; // 0x7f020693 float:1.7283377E38 double:1.052774439E-314;
        r3 = 2131953138; // 0x7f1305f2 float:1.9542739E38 double:1.053324804E-314;
        r0 = "com.google.android.libraries.youtube.player.action.controller_notification_pause";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x01f2:
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x01ff:
        r0 = r12.o;	 Catch:{ all -> 0x02dc }
        r0 = r0.c;	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x021a;
    L_0x0205:
        r2 = 2130839284; // 0x7f0206f4 float:1.7283574E38 double:1.052774487E-314;
        r3 = 2131953139; // 0x7f1305f3 float:1.954274E38 double:1.0533248045E-314;
        r0 = "com.google.android.libraries.youtube.player.action.controller_notification_prev";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x021a:
        r2 = 2130838402; // 0x7f020382 float:1.7281785E38 double:1.0527740513E-314;
        r3 = 2131953139; // 0x7f1305f3 float:1.954274E38 double:1.0533248045E-314;
        r0 = "noop";
        r4 = r12.a(r0);	 Catch:{ all -> 0x02dc }
        r6 = 1;
        r0 = r12;
        r1 = r10;
        r5 = r7;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x02dc }
        goto L_0x006b;
    L_0x022f:
        r0 = r7.size();	 Catch:{ all -> 0x02dc }
        r0 = java.lang.Math.min(r0, r1);	 Catch:{ all -> 0x02dc }
        r1 = new int[r0];	 Catch:{ all -> 0x02dc }
    L_0x0239:
        if (r9 >= r0) goto L_0x024a;
    L_0x023b:
        r2 = r7.get(r9);	 Catch:{ all -> 0x02dc }
        r2 = (java.lang.Integer) r2;	 Catch:{ all -> 0x02dc }
        r2 = r2.intValue();	 Catch:{ all -> 0x02dc }
        r1[r9] = r2;	 Catch:{ all -> 0x02dc }
        r9 = r9 + 1;
        goto L_0x0239;
    L_0x024a:
        r0 = r12.p;	 Catch:{ all -> 0x02dc }
        r0 = r0.d();	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x0258;
    L_0x0252:
        r0 = new vv;	 Catch:{ all -> 0x02dc }
        r0.<init>();	 Catch:{ all -> 0x02dc }
        goto L_0x025d;
    L_0x0258:
        r0 = new vu;	 Catch:{ all -> 0x02dc }
        r0.<init>();	 Catch:{ all -> 0x02dc }
    L_0x025d:
        r0.a = r1;	 Catch:{ all -> 0x02dc }
        r1 = r12.n;	 Catch:{ all -> 0x02dc }
        r1 = r1.get();	 Catch:{ all -> 0x02dc }
        r1 = (defpackage.wq) r1;	 Catch:{ all -> 0x02dc }
        r1 = r1.d();	 Catch:{ all -> 0x02dc }
        r0.f = r1;	 Catch:{ all -> 0x02dc }
        r10.a(r0);	 Catch:{ all -> 0x02dc }
        r0 = r12.p;	 Catch:{ all -> 0x02dc }
        r0 = r0.d();	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x02a5;
    L_0x0278:
        r0 = new android.widget.RemoteViews;	 Catch:{ all -> 0x02dc }
        r1 = r12.h;	 Catch:{ all -> 0x02dc }
        r1 = r1.getPackageName();	 Catch:{ all -> 0x02dc }
        r2 = r12.p;	 Catch:{ all -> 0x02dc }
        r2 = r2.a();	 Catch:{ all -> 0x02dc }
        r0.<init>(r1, r2);	 Catch:{ all -> 0x02dc }
        r1 = r12.p;	 Catch:{ all -> 0x02dc }
        r1 = r1.b();	 Catch:{ all -> 0x02dc }
        r2 = r12.o;	 Catch:{ all -> 0x02dc }
        r2 = r2.i;	 Catch:{ all -> 0x02dc }
        r0.setTextViewText(r1, r2);	 Catch:{ all -> 0x02dc }
        r1 = r12.p;	 Catch:{ all -> 0x02dc }
        r1 = r1.c();	 Catch:{ all -> 0x02dc }
        r2 = r12.o;	 Catch:{ all -> 0x02dc }
        r2 = r2.j;	 Catch:{ all -> 0x02dc }
        r0.setTextViewText(r1, r2);	 Catch:{ all -> 0x02dc }
        r10.v = r0;	 Catch:{ all -> 0x02dc }
    L_0x02a5:
        r0 = r12.s;	 Catch:{ all -> 0x02dc }
        r0 = defpackage.aipo.h(r0);	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x02c9;
    L_0x02ad:
        r0 = r12.u;	 Catch:{ all -> 0x02dc }
        r0 = r0.iterator();	 Catch:{ all -> 0x02dc }
    L_0x02b3:
        r1 = r0.hasNext();	 Catch:{ all -> 0x02dc }
        if (r1 == 0) goto L_0x02c9;
    L_0x02b9:
        r1 = r0.next();	 Catch:{ all -> 0x02dc }
        r1 = (defpackage.aisp) r1;	 Catch:{ all -> 0x02dc }
        r2 = r1 instanceof defpackage.aiso;	 Catch:{ all -> 0x02dc }
        if (r2 == 0) goto L_0x02b3;
    L_0x02c3:
        r1 = (defpackage.aiso) r1;	 Catch:{ all -> 0x02dc }
        r1.a(r12);	 Catch:{ all -> 0x02dc }
        goto L_0x02b3;
    L_0x02c9:
        r0 = r12.m;	 Catch:{ all -> 0x02dc }
        r1 = r10.e();	 Catch:{ all -> 0x02dc }
        r0.a(r1, r13);	 Catch:{ all -> 0x02dc }
        r13 = r12.q;	 Catch:{ all -> 0x02dc }
        r0 = r13.b();	 Catch:{ all -> 0x02dc }
        r12.w = r0;	 Catch:{ all -> 0x02dc }
        monitor-exit(r12);
        return;
    L_0x02dc:
        r13 = move-exception;
        monitor-exit(r12);
        goto L_0x02e0;
    L_0x02df:
        throw r13;
    L_0x02e0:
        goto L_0x02df;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisx.d(boolean):void");
    }

    private final void a(qg qgVar, int i, int i2, PendingIntent pendingIntent, List list, boolean z) {
        qgVar.a(new qf(i, this.h.getText(i2), pendingIntent).a());
        if (z) {
            list.add(Integer.valueOf(qgVar.b.size() - 1));
        }
    }

    private final PendingIntent a(String str) {
        return PendingIntent.getBroadcast(this.h, 0, new Intent().setPackage(this.h.getPackageName()).setAction(str), 134217728);
    }
}
