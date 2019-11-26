package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: scy */
public final class scy extends Service {
    public static final String a = sdf.a(scy.class);
    private static final long k = TimeUnit.SECONDS.toMillis(10);
    private static final long l = TimeUnit.SECONDS.toMillis(30);
    public Bitmap b;
    public boolean c;
    public Notification d;
    public boolean e;
    public sap f;
    public sdc g;
    public int h;
    public boolean i;
    public boolean j;
    private Class m;
    private int n = -1;
    private sbr o;
    private List p;
    private int[] q;
    private long r;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.h = sdh.a((Context) this, getResources().getDimension(R.dimen.ccl_notification_image_size));
        this.f = sap.o();
        sal sal = this.f.a;
        this.m = null;
        if (this.m == null) {
            this.m = sap.s;
        }
        if (!(this.f.h() || this.f.i())) {
            this.f.k();
        }
        sam sam = this.f.x;
        if (sam != null) {
            int b = sam.b();
            boolean z = true;
            this.i = b < sam.a() + -1;
            if (b <= 0) {
                z = false;
            }
            this.j = z;
        }
        this.o = new sdb(this);
        this.f.a(this.o);
        sal = this.f.a;
        this.p = sal.a;
        List list = sal.b;
        if (list != null) {
            this.q = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                this.q[i] = ((Integer) list.get(i)).intValue();
            }
        }
        this.r = TimeUnit.SECONDS.toMillis((long) this.f.a.k);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            if ("com.google.android.libraries.cast.companionlibrary.action.notificationvisibility".equals(intent.getAction())) {
                this.e = intent.getBooleanExtra("visible", false);
                a(this.f.E);
                if (this.d == null) {
                    try {
                        a(this.f.v());
                    } catch (sbt | sbv e) {
                        sdf.a(a, "onStartCommand() failed to get media", e);
                    }
                }
                if (this.e) {
                    Notification notification = this.d;
                    if (notification != null) {
                        startForeground(1, notification);
                    }
                }
                stopForeground(true);
            }
        }
        return 1;
    }

    private final void a(MediaInfo mediaInfo) {
        if (mediaInfo != null) {
            sdc sdc = this.g;
            if (sdc != null) {
                sdc.cancel(false);
            }
            Uri uri = null;
            try {
                if (mediaInfo.d.a()) {
                    uri = ((pyb) mediaInfo.d.a.get(0)).a;
                    this.g = new sda(this, mediaInfo);
                    this.g.a(uri);
                } else {
                    a(mediaInfo, null, this.c);
                }
            } catch (sbq e) {
                sdf.a(a, "Failed to build notification", e);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:26:0x0050, code skipped:
            if (r5 != 2) goto L_0x0052;
     */
    public final void a(int r7) {
        /*
        r6 = this;
        r0 = r6.n;
        if (r0 == r7) goto L_0x007a;
    L_0x0004:
        r6.n = r7;
        r0 = 0;
        r1 = 1;
        if (r7 == 0) goto L_0x006a;
    L_0x000a:
        r2 = 4;
        r3 = 3;
        r4 = 2;
        if (r7 == r1) goto L_0x003a;
    L_0x000f:
        if (r7 == r4) goto L_0x002e;
    L_0x0011:
        if (r7 == r3) goto L_0x0022;
    L_0x0013:
        if (r7 == r2) goto L_0x0016;
    L_0x0015:
        return;
    L_0x0016:
        r6.c = r0;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r7 = r6.f;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r7 = r7.v();	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r6.a(r7);	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        return;
    L_0x0022:
        r6.c = r0;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r7 = r6.f;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r7 = r7.v();	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r6.a(r7);	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        return;
    L_0x002e:
        r6.c = r1;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r7 = r6.f;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r7 = r7.v();	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r6.a(r7);	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        return;
    L_0x003a:
        r6.c = r0;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r0 = r6.f;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r5 = r0.F;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        if (r7 == r1) goto L_0x0049;
    L_0x0042:
        if (r7 == r4) goto L_0x0060;
    L_0x0044:
        if (r7 == r3) goto L_0x0060;
    L_0x0046:
        if (r7 == r2) goto L_0x0060;
    L_0x0048:
        goto L_0x005c;
    L_0x0049:
        r7 = r0.s();	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        if (r7 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0052;
    L_0x0050:
        if (r5 == r4) goto L_0x0060;
    L_0x0052:
        r7 = r0.y;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        if (r7 != 0) goto L_0x0057;
    L_0x0056:
        goto L_0x005c;
    L_0x0057:
        r7 = r7.k;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        if (r7 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0060;
    L_0x005c:
        r6.stopForeground(r1);	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        return;
    L_0x0060:
        r7 = r6.f;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r7 = r7.v();	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r6.a(r7);	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        return;
    L_0x006a:
        r6.c = r0;	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        r6.stopForeground(r1);	 Catch:{ sbv -> 0x0072, sbt | sbv -> 0x0070 }
        return;
    L_0x0070:
        r7 = move-exception;
        goto L_0x0073;
    L_0x0072:
        r7 = move-exception;
    L_0x0073:
        r0 = a;
        r1 = "Failed to update the playback status due to network issues";
        defpackage.sdf.a(r0, r1, r7);
    L_0x007a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scy.a(int):void");
    }

    public final void onDestroy() {
        sdc sdc = this.g;
        if (sdc != null) {
            sdc.cancel(false);
        }
        ((NotificationManager) getSystemService("notification")).cancel(1);
        sap sap = this.f;
        if (sap != null) {
            sbo sbo = this.o;
            if (sbo != null) {
                sap.b(sbo);
                this.f = null;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaInfo mediaInfo, Bitmap bitmap, boolean z) {
        pjw pjw = mediaInfo.d;
        CharSequence string = getResources().getString(R.string.ccl_casting_to_device, new Object[]{this.f.h});
        qg qgVar = new qg(this);
        qgVar.a((int) R.drawable.ic_stat_action_notification);
        qgVar.a(pjw.a("com.google.android.gms.cast.metadata.TITLE"));
        qgVar.b(string);
        Bundle a = sdh.a(mediaInfo);
        Intent intent = new Intent(this, this.m);
        String str = "media";
        intent.putExtra(str, a);
        qw a2 = qw.a((Context) this);
        a2.a(new ComponentName(a2.b, this.m));
        a2.a(intent);
        if (a2.a.size() > 1) {
            ((Intent) a2.a.get(1)).putExtra(str, a);
        }
        qgVar.f = a2.a();
        qgVar.a(bitmap);
        qj vuVar = new vu();
        vuVar.a = this.q;
        wq wqVar = this.f.D;
        vuVar.f = wqVar != null ? wqVar.d() : null;
        qgVar.a(vuVar);
        qgVar.a(true);
        qgVar.j = false;
        qgVar.c();
        for (Integer intValue : this.p) {
            str = "ccl_extra_forward_step_ms";
            int i;
            Intent intent2;
            PendingIntent broadcast;
            long j;
            switch (intValue.intValue()) {
                case 1:
                    int i2 = mediaInfo.b == 2 ? R.drawable.ic_notification_stop_48dp : R.drawable.ic_notification_pause_48dp;
                    i = !z ? R.string.ccl_play : R.string.ccl_pause;
                    if (!z) {
                        i2 = R.drawable.ic_notification_play_48dp;
                    }
                    Intent intent3 = new Intent("com.google.android.libraries.cast.companionlibrary.action.toggleplayback");
                    intent3.setPackage(getPackageName());
                    qgVar.a(new qf(i2, getString(i), PendingIntent.getBroadcast(this, 0, intent3, 0)).a());
                    break;
                case 2:
                    if (this.i) {
                        intent2 = new Intent("com.google.android.libraries.cast.companionlibrary.action.playnext");
                        intent2.setPackage(getPackageName());
                        broadcast = PendingIntent.getBroadcast(this, 0, intent2, 0);
                        i = R.drawable.ic_notification_skip_next_48dp;
                    } else {
                        i = R.drawable.ic_notification_skip_next_semi_48dp;
                        broadcast = null;
                    }
                    qgVar.a(new qf(i, getString(R.string.ccl_skip_next), broadcast).a());
                    break;
                case 3:
                    if (this.j) {
                        intent2 = new Intent("com.google.android.libraries.cast.companionlibrary.action.playprev");
                        intent2.setPackage(getPackageName());
                        broadcast = PendingIntent.getBroadcast(this, 0, intent2, 0);
                        i = R.drawable.ic_notification_skip_prev_48dp;
                    } else {
                        i = R.drawable.ic_notification_skip_prev_semi_48dp;
                        broadcast = null;
                    }
                    qgVar.a(new qf(i, getString(R.string.ccl_skip_previous), broadcast).a());
                    break;
                case 4:
                    intent2 = new Intent("com.google.android.libraries.cast.companionlibrary.action.stop");
                    intent2.setPackage(getPackageName());
                    qgVar.a(new qf(R.drawable.ic_notification_disconnect_24dp, getString(R.string.ccl_disconnect), PendingIntent.getBroadcast(this, 0, intent2, 0)).a());
                    break;
                case 5:
                    j = this.r;
                    intent2 = new Intent("com.google.android.libraries.cast.companionlibrary.action.rewind");
                    intent2.setPackage(getPackageName());
                    intent2.putExtra(str, (int) (-j));
                    broadcast = PendingIntent.getBroadcast(this, 0, intent2, 134217728);
                    i = j != k ? j != l ? R.drawable.ic_notification_rewind_48dp : R.drawable.ic_notification_rewind30_48dp : R.drawable.ic_notification_rewind10_48dp;
                    qgVar.a(new qf(i, getString(R.string.ccl_rewind), broadcast).a());
                    break;
                case 6:
                    j = this.r;
                    intent2 = new Intent("com.google.android.libraries.cast.companionlibrary.action.forward");
                    intent2.setPackage(getPackageName());
                    intent2.putExtra(str, (int) j);
                    broadcast = PendingIntent.getBroadcast(this, 0, intent2, 134217728);
                    i = j != k ? j != l ? R.drawable.ic_notification_forward_48dp : R.drawable.ic_notification_forward30_48dp : R.drawable.ic_notification_forward10_48dp;
                    qgVar.a(new qf(i, getString(R.string.ccl_forward), broadcast).a());
                    break;
                default:
                    break;
            }
        }
        this.d = qgVar.e();
    }
}
