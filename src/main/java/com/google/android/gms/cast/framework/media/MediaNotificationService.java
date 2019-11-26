package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.pkm;
import defpackage.pkp;
import defpackage.plh;
import defpackage.pli;
import defpackage.plj;
import defpackage.pll;
import defpackage.pln;
import defpackage.pls;
import defpackage.plt;
import defpackage.plu;
import defpackage.plv;
import defpackage.pmw;
import defpackage.pna;
import defpackage.pnb;
import defpackage.pni;
import defpackage.pnu;
import defpackage.pon;
import defpackage.pzr;
import defpackage.qbf;
import defpackage.qf;
import defpackage.qg;
import defpackage.qj;
import defpackage.qnt;
import defpackage.vu;
import java.util.ArrayList;
import java.util.List;

public class MediaNotificationService extends Service {
    public static final pon a = new pon("MediaNotificationService");
    public pln b;
    public Notification c;
    public pkp d;
    private plu e;
    private pli f;
    private ComponentName g;
    private ComponentName h;
    private List i = new ArrayList();
    private int[] j;
    private pmw k;
    private long l;
    private qnt m;
    private plj n;
    private Resources o;
    private pkm p;
    private pll q;
    private final BroadcastReceiver r = new pnb(this);

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        this.d = pkp.a(this);
        pkp pkp = this.d;
        String str = "Must be called from the main thread.";
        pzr.b(str);
        plh plh = pkp.d.c;
        this.e = plh.c;
        this.f = plh.a();
        this.o = getResources();
        this.g = new ComponentName(getApplicationContext(), plh.a);
        if (TextUtils.isEmpty(this.e.e)) {
            this.h = null;
        } else {
            this.h = new ComponentName(getApplicationContext(), this.e.e);
        }
        plu plu = this.e;
        this.k = plu.G;
        if (this.k == null) {
            this.i.addAll(plu.c);
            this.j = (int[]) this.e.a().clone();
        } else {
            this.j = null;
        }
        plu = this.e;
        this.l = plu.d;
        int dimensionPixelSize = this.o.getDimensionPixelSize(plu.s);
        this.n = new plj(1, dimensionPixelSize, dimensionPixelSize);
        this.m = new qnt(getApplicationContext(), this.n);
        this.p = new pna(this);
        pkp = this.d;
        Object obj = this.p;
        pzr.b(str);
        pzr.a(obj);
        try {
            pkp.b.a(new pni(obj));
        } catch (RemoteException unused) {
            pkp.a.b("Unable to call %s on %s.", "addVisibilityChangeListener", pnu.class.getSimpleName());
        }
        ComponentName componentName = this.h;
        if (componentName != null) {
            registerReceiver(this.r, new IntentFilter(componentName.flattenToString()));
        }
        if (qbf.c()) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* JADX WARNING: Missing block: B:31:0x0097, code skipped:
            if (r9.g == r1.g) goto L_0x009e;
     */
    public final int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = 1;
        if (r1 == 0) goto L_0x00e0;
    L_0x0007:
        r3 = r18.getAction();
        r4 = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x00e0;
    L_0x0013:
        r3 = "extra_media_info";
        r3 = r1.getParcelableExtra(r3);
        r3 = (com.google.android.gms.cast.MediaInfo) r3;
        if (r3 != 0) goto L_0x001f;
    L_0x001d:
        goto L_0x00dd;
    L_0x001f:
        r4 = r3.d;
        if (r4 == 0) goto L_0x00dd;
    L_0x0023:
        r5 = 0;
        r6 = "extra_remote_media_client_player_state";
        r6 = r1.getIntExtra(r6, r5);
        if (r6 == 0) goto L_0x00dd;
    L_0x002c:
        r7 = "extra_cast_device";
        r7 = r1.getParcelableExtra(r7);
        r7 = (com.google.android.gms.cast.CastDevice) r7;
        if (r7 == 0) goto L_0x00dd;
    L_0x0036:
        r8 = 2;
        if (r6 != r8) goto L_0x003b;
    L_0x0039:
        r10 = 1;
        goto L_0x003c;
    L_0x003b:
        r10 = 0;
    L_0x003c:
        r6 = new pll;
        r11 = r3.b;
        r3 = "com.google.android.gms.cast.metadata.TITLE";
        r12 = r4.a(r3);
        r13 = r7.c;
        r3 = "extra_media_session_token";
        r3 = r1.getParcelableExtra(r3);
        r14 = r3;
        r14 = (defpackage.xo) r14;
        r3 = "extra_can_skip_next";
        r15 = r1.getBooleanExtra(r3, r5);
        r3 = "extra_can_skip_prev";
        r16 = r1.getBooleanExtra(r3, r5);
        r9 = r6;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16);
        r3 = "extra_media_notification_force_update";
        r1 = r1.getBooleanExtra(r3, r5);
        if (r1 != 0) goto L_0x0099;
    L_0x0069:
        r1 = r0.q;
        if (r1 == 0) goto L_0x0099;
    L_0x006d:
        r3 = r6.b;
        r7 = r1.b;
        if (r3 != r7) goto L_0x0099;
    L_0x0073:
        r3 = r6.c;
        r7 = r1.c;
        if (r3 != r7) goto L_0x0099;
    L_0x0079:
        r3 = r6.d;
        r7 = r1.d;
        r3 = defpackage.ppj.a(r3, r7);
        if (r3 == 0) goto L_0x0099;
    L_0x0083:
        r3 = r6.e;
        r7 = r1.e;
        r3 = defpackage.ppj.a(r3, r7);
        if (r3 == 0) goto L_0x0099;
    L_0x008d:
        r3 = r6.f;
        r7 = r1.f;
        if (r3 != r7) goto L_0x0099;
    L_0x0093:
        r3 = r6.g;
        r1 = r1.g;
        if (r3 == r1) goto L_0x009e;
    L_0x0099:
        r0.q = r6;
        r17.a();
    L_0x009e:
        r1 = new pln;
        r3 = r0.f;
        if (r3 == 0) goto L_0x00ab;
    L_0x00a4:
        r3 = r0.n;
        r3 = defpackage.pli.a(r4, r3);
        goto L_0x00bb;
    L_0x00ab:
        r3 = r4.a();
        if (r3 != 0) goto L_0x00b3;
    L_0x00b1:
        r3 = 0;
        goto L_0x00bb;
    L_0x00b3:
        r3 = r4.a;
        r3 = r3.get(r5);
        r3 = (defpackage.pyb) r3;
    L_0x00bb:
        r1.<init>(r3);
        r3 = r0.b;
        if (r3 == 0) goto L_0x00cc;
    L_0x00c2:
        r4 = r1.a;
        r3 = r3.a;
        r3 = defpackage.ppj.a(r4, r3);
        if (r3 != 0) goto L_0x00e0;
    L_0x00cc:
        r3 = r0.m;
        r4 = new pnd;
        r4.<init>(r0, r1);
        r3.a = r4;
        r3 = r0.m;
        r1 = r1.a;
        r3.a(r1);
        goto L_0x00e0;
    L_0x00dd:
        r0.stopForeground(r2);
    L_0x00e0:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.onStartCommand(android.content.Intent, int, int):int");
    }

    public final void onDestroy() {
        qnt qnt = this.m;
        if (qnt != null) {
            qnt.a();
        }
        try {
            unregisterReceiver(this.r);
        } catch (IllegalArgumentException e) {
            a.a(e, "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
        }
        ((NotificationManager) getSystemService("notification")).cancel(1);
        pkp pkp = this.d;
        pkm pkm = this.p;
        pzr.b("Must be called from the main thread.");
        if (pkm != null) {
            try {
                pkp.b.b(new pni(pkm));
            } catch (RemoteException unused) {
                pkp.a.b("Unable to call %s on %s.", "addVisibilityChangeListener", pnu.class.getSimpleName());
            }
        }
    }

    public final void a() {
        if (this.q != null) {
            int[] b;
            pln pln = this.b;
            PendingIntent pendingIntent = null;
            Bitmap bitmap = pln != null ? pln.b : null;
            qg qgVar = new qg(this, "cast_media_notification");
            qgVar.a(bitmap);
            qgVar.a(this.e.f);
            qgVar.a(this.q.d);
            qgVar.b(this.o.getString(this.e.t, new Object[]{this.q.e}));
            qgVar.a(true);
            qgVar.j = false;
            qgVar.c();
            if (this.h != null) {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", this.h);
                intent.setAction(this.h.flattenToString());
                pendingIntent = PendingIntent.getBroadcast(this, 1, intent, 134217728);
            }
            if (pendingIntent != null) {
                qgVar.f = pendingIntent;
            }
            String str = "Unable to call %s on %s.";
            if (this.k != null) {
                a.e("mActionsProvider != null", new Object[0]);
                try {
                    List<plt> a = this.k.a();
                    b = this.k.b();
                    if (a == null || a.isEmpty()) {
                        a.d(plv.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
                        return;
                    } else if (a.size() > 5) {
                        a.d(plv.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
                        return;
                    } else {
                        int size = a.size();
                        if (b != null) {
                            int length = b.length;
                            if (length != 0) {
                                int i = 0;
                                while (i < length) {
                                    int i2 = b[i];
                                    if (i2 >= 0 && i2 < size) {
                                        i++;
                                    } else {
                                        a.d(plv.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                                        return;
                                    }
                                }
                                b = (int[]) b.clone();
                                for (plt plt : a) {
                                    pls pls = new pls();
                                    if (TextUtils.isEmpty(plt.a)) {
                                        throw new IllegalArgumentException("action cannot be null or an empty string.");
                                    }
                                    String str2 = plt.a;
                                    if (str2.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || str2.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") || str2.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") || str2.equals("com.google.android.gms.cast.framework.action.FORWARD") || str2.equals("com.google.android.gms.cast.framework.action.REWIND") || str2.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                                        a(qgVar, plt.a);
                                    } else {
                                        Intent intent2 = new Intent(plt.a);
                                        intent2.setComponent(this.g);
                                        qgVar.a(new qf(plt.b, plt.c, PendingIntent.getBroadcast(this, 0, intent2, 0)).a());
                                    }
                                }
                            }
                        }
                        a.d(plv.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
                        return;
                    }
                } catch (RemoteException e) {
                    a.a(e, str, "getNotificationActions", pmw.class.getSimpleName());
                    return;
                }
            }
            for (String a2 : this.i) {
                a(qgVar, a2);
            }
            b = this.j;
            if (VERSION.SDK_INT >= 21) {
                qj vuVar = new vu();
                vuVar.a = b;
                vuVar.f = this.q.a;
                qgVar.a(vuVar);
            }
            this.c = qgVar.e();
            pkp pkp = this.d;
            pzr.b("Must be called from the main thread.");
            try {
                if (pkp.b.a()) {
                    stopForeground(true);
                    return;
                }
            } catch (RemoteException unused) {
                pkp.a.b(str, "isApplicationVisible", pnu.class.getSimpleName());
            }
            startForeground(1, this.c);
        }
    }

    private final void a(defpackage.qg r19, java.lang.String r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r20.hashCode();
        r4 = 2;
        r6 = "com.google.android.gms.cast.framework.action.FORWARD";
        r7 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
        r8 = "com.google.android.gms.cast.framework.action.STOP_CASTING";
        r9 = "com.google.android.gms.cast.framework.action.SKIP_PREV";
        r10 = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
        r11 = "com.google.android.gms.cast.framework.action.REWIND";
        r12 = 0;
        switch(r3) {
            case -1699820260: goto L_0x004e;
            case -945151566: goto L_0x0046;
            case -945080078: goto L_0x003e;
            case -668151673: goto L_0x0036;
            case -124479363: goto L_0x002c;
            case 235550565: goto L_0x0024;
            case 1362116196: goto L_0x001c;
            default: goto L_0x001b;
        };
    L_0x001b:
        goto L_0x0056;
    L_0x001c:
        r3 = r2.equals(r6);
        if (r3 == 0) goto L_0x0056;
    L_0x0022:
        r3 = 3;
        goto L_0x0057;
    L_0x0024:
        r3 = r2.equals(r7);
        if (r3 == 0) goto L_0x0056;
    L_0x002a:
        r3 = 0;
        goto L_0x0057;
    L_0x002c:
        r3 = "com.google.android.gms.cast.framework.action.DISCONNECT";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x0056;
    L_0x0034:
        r3 = 6;
        goto L_0x0057;
    L_0x0036:
        r3 = r2.equals(r8);
        if (r3 == 0) goto L_0x0056;
    L_0x003c:
        r3 = 5;
        goto L_0x0057;
    L_0x003e:
        r3 = r2.equals(r9);
        if (r3 == 0) goto L_0x0056;
    L_0x0044:
        r3 = 2;
        goto L_0x0057;
    L_0x0046:
        r3 = r2.equals(r10);
        if (r3 == 0) goto L_0x0056;
    L_0x004c:
        r3 = 1;
        goto L_0x0057;
    L_0x004e:
        r3 = r2.equals(r11);
        if (r3 == 0) goto L_0x0056;
    L_0x0054:
        r3 = 4;
        goto L_0x0057;
    L_0x0056:
        r3 = -1;
    L_0x0057:
        r13 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r16 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r15 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r5 = "googlecast-extra_skip_step_ms";
        switch(r3) {
            case 0: goto L_0x0170;
            case 1: goto L_0x0141;
            case 2: goto L_0x0112;
            case 3: goto L_0x00d4;
            case 4: goto L_0x0096;
            case 5: goto L_0x006f;
            case 6: goto L_0x006f;
            default: goto L_0x0062;
        };
    L_0x0062:
        r1 = a;
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r3[r12] = r2;
        r2 = "Action: %s is not a pre-defined action.";
        r1.d(r2, r3);
        return;
    L_0x006f:
        r2 = new android.content.Intent;
        r2.<init>(r8);
        r3 = r0.g;
        r2.setComponent(r3);
        r2 = android.app.PendingIntent.getBroadcast(r0, r12, r2, r12);
        r3 = new qf;
        r4 = r0.e;
        r5 = r4.r;
        r6 = r0.o;
        r4 = r4.F;
        r4 = r6.getString(r4);
        r3.<init>(r5, r4, r2);
        r2 = r3.a();
        r1.a(r2);
        return;
    L_0x0096:
        r2 = r0.l;
        r4 = new android.content.Intent;
        r4.<init>(r11);
        r6 = r0.g;
        r4.setComponent(r6);
        r4.putExtra(r5, r2);
        r4 = android.app.PendingIntent.getBroadcast(r0, r12, r4, r15);
        r5 = r0.e;
        r6 = r5.o;
        r7 = r5.C;
        r8 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r8 != 0) goto L_0x00b8;
    L_0x00b3:
        r6 = r5.p;
        r7 = r5.D;
        goto L_0x00c1;
    L_0x00b8:
        r8 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r8 == 0) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00c1;
    L_0x00bd:
        r6 = r5.q;
        r7 = r5.E;
    L_0x00c1:
        r2 = new qf;
        r3 = r0.o;
        r3 = r3.getString(r7);
        r2.<init>(r6, r3, r4);
        r2 = r2.a();
        r1.a(r2);
        return;
    L_0x00d4:
        r2 = r0.l;
        r4 = new android.content.Intent;
        r4.<init>(r6);
        r6 = r0.g;
        r4.setComponent(r6);
        r4.putExtra(r5, r2);
        r4 = android.app.PendingIntent.getBroadcast(r0, r12, r4, r15);
        r5 = r0.e;
        r6 = r5.l;
        r7 = r5.z;
        r8 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r8 != 0) goto L_0x00f6;
    L_0x00f1:
        r6 = r5.m;
        r7 = r5.A;
        goto L_0x00ff;
    L_0x00f6:
        r8 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r8 == 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x00ff;
    L_0x00fb:
        r6 = r5.n;
        r7 = r5.B;
    L_0x00ff:
        r2 = new qf;
        r3 = r0.o;
        r3 = r3.getString(r7);
        r2.<init>(r6, r3, r4);
        r2 = r2.a();
        r1.a(r2);
        return;
    L_0x0112:
        r2 = r0.q;
        r2 = r2.g;
        if (r2 == 0) goto L_0x0127;
    L_0x0118:
        r2 = new android.content.Intent;
        r2.<init>(r9);
        r3 = r0.g;
        r2.setComponent(r3);
        r15 = android.app.PendingIntent.getBroadcast(r0, r12, r2, r12);
        goto L_0x0128;
    L_0x0127:
        r15 = 0;
    L_0x0128:
        r2 = new qf;
        r3 = r0.e;
        r4 = r3.k;
        r5 = r0.o;
        r3 = r3.y;
        r3 = r5.getString(r3);
        r2.<init>(r4, r3, r15);
        r2 = r2.a();
        r1.a(r2);
        return;
    L_0x0141:
        r2 = r0.q;
        r2 = r2.f;
        if (r2 == 0) goto L_0x0156;
    L_0x0147:
        r2 = new android.content.Intent;
        r2.<init>(r10);
        r3 = r0.g;
        r2.setComponent(r3);
        r15 = android.app.PendingIntent.getBroadcast(r0, r12, r2, r12);
        goto L_0x0157;
    L_0x0156:
        r15 = 0;
    L_0x0157:
        r2 = new qf;
        r3 = r0.e;
        r4 = r3.j;
        r5 = r0.o;
        r3 = r3.x;
        r3 = r5.getString(r3);
        r2.<init>(r4, r3, r15);
        r2 = r2.a();
        r1.a(r2);
        return;
    L_0x0170:
        r2 = r0.q;
        r3 = r2.c;
        r2 = r2.b;
        if (r3 != r4) goto L_0x017f;
    L_0x0178:
        r3 = r0.e;
        r4 = r3.g;
        r3 = r3.u;
        goto L_0x0185;
    L_0x017f:
        r3 = r0.e;
        r4 = r3.h;
        r3 = r3.v;
    L_0x0185:
        if (r2 == 0) goto L_0x0188;
    L_0x0187:
        goto L_0x018c;
    L_0x0188:
        r4 = r0.e;
        r4 = r4.i;
    L_0x018c:
        if (r2 != 0) goto L_0x0192;
    L_0x018e:
        r2 = r0.e;
        r3 = r2.w;
    L_0x0192:
        r2 = new android.content.Intent;
        r2.<init>(r7);
        r5 = r0.g;
        r2.setComponent(r5);
        r2 = android.app.PendingIntent.getBroadcast(r0, r12, r2, r12);
        r5 = new qf;
        r6 = r0.o;
        r3 = r6.getString(r3);
        r5.<init>(r4, r3, r2);
        r2 = r5.a();
        r1.a(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.a(qg, java.lang.String):void");
    }
}
