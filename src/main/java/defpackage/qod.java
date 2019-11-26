package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.media.AudioManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: qod */
public final class qod implements ply {
    public final Context a;
    public final qnu b;
    public final qnt c;
    public final qnt d;
    public plw e;
    public CastDevice f;
    public wq g;
    public wv h;
    public boolean i;
    private final pko j;
    private final ComponentName k;

    public qod(Context context, pko pko, qnu qnu) {
        this.a = context;
        this.j = pko;
        this.b = qnu;
        plh plh = this.j.c;
        if (plh == null || TextUtils.isEmpty(plh.b)) {
            this.k = null;
        } else {
            this.k = new ComponentName(this.a, this.j.c.b);
        }
        this.c = new qnt(this.a);
        this.c.a = new qog(this);
        this.d = new qnt(this.a);
        this.d.a = new qof(this);
    }

    public final void e() {
    }

    public final void a(plw plw, CastDevice castDevice) {
        if (!this.i) {
            pko pko = this.j;
            if (pko != null && pko.c != null && plw != null && castDevice != null) {
                this.e = plw;
                plw = this.e;
                pzr.b("Must be called from the main thread.");
                plw.f.add(this);
                this.f = castDevice;
                if (!qbf.b()) {
                    ((AudioManager) this.a.getSystemService("audio")).requestAudioFocus(null, 3, 3);
                }
                ComponentName componentName = new ComponentName(this.a, this.j.c.a);
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                this.g = new wq(this.a, "CastMediaSession", componentName, PendingIntent.getBroadcast(this.a, 0, intent, 0));
                this.g.a();
                a(0, null);
                CastDevice castDevice2 = this.f;
                if (!(castDevice2 == null || TextUtils.isEmpty(castDevice2.c))) {
                    wq wqVar = this.g;
                    vl vlVar = new vl();
                    String str = "android.media.metadata.ALBUM_ARTIST";
                    vlVar.a(str, this.a.getResources().getString(R.string.cast_casting_to_device, new Object[]{this.f.c}));
                    wqVar.a(vlVar.a());
                }
                this.h = new qoi(this);
                this.g.a(this.h);
                this.g.a(true);
                bbb.a(this.g);
                this.i = true;
                i();
            }
        }
    }

    public final void c() {
        i();
    }

    public final void a() {
        i();
    }

    public final void b() {
        i();
    }

    public final void d() {
        i();
    }

    public final void f() {
        i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARNING: Missing block: B:66:0x00f1, code skipped:
            if (r2.intValue() >= (r1.n.size() - 1)) goto L_0x00da;
     */
    private final void i() {
        /*
        r11 = this;
        r0 = r11.e;
        if (r0 == 0) goto L_0x0123;
    L_0x0004:
        r0 = r0.g();
        r1 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r2 = r0.a;
        goto L_0x000f;
    L_0x000e:
        r2 = r1;
    L_0x000f:
        if (r2 == 0) goto L_0x0014;
    L_0x0011:
        r3 = r2.d;
        goto L_0x0015;
    L_0x0014:
        r3 = r1;
    L_0x0015:
        r4 = 6;
        r5 = 3;
        r6 = 2;
        r7 = 1;
        r8 = 0;
        if (r0 != 0) goto L_0x001f;
    L_0x001c:
        r3 = 0;
    L_0x001d:
        r4 = 0;
        goto L_0x0062;
    L_0x001f:
        if (r2 == 0) goto L_0x001c;
    L_0x0021:
        if (r3 != 0) goto L_0x0024;
    L_0x0023:
        goto L_0x001c;
    L_0x0024:
        r3 = r11.e;
        r3 = r3.i();
        if (r3 == r7) goto L_0x003c;
    L_0x002c:
        if (r3 == r6) goto L_0x0039;
    L_0x002e:
        if (r3 == r5) goto L_0x0036;
    L_0x0030:
        r0 = 4;
        if (r3 == r0) goto L_0x0034;
    L_0x0033:
        goto L_0x001c;
    L_0x0034:
        r3 = 0;
        goto L_0x0062;
    L_0x0036:
        r3 = 0;
    L_0x0037:
        r4 = 2;
        goto L_0x0062;
    L_0x0039:
        r3 = 0;
        r4 = 3;
        goto L_0x0062;
    L_0x003c:
        r3 = r0.f;
        r9 = r11.e;
        r9 = r9.j();
        if (r9 != 0) goto L_0x0048;
    L_0x0046:
        r9 = 0;
        goto L_0x004b;
    L_0x0048:
        if (r3 != r6) goto L_0x0046;
    L_0x004a:
        r9 = 1;
    L_0x004b:
        r10 = r0.k;
        if (r10 != 0) goto L_0x0051;
    L_0x004f:
        r3 = 0;
        goto L_0x0057;
    L_0x0051:
        if (r3 == r7) goto L_0x0056;
    L_0x0053:
        if (r3 == r5) goto L_0x0056;
    L_0x0055:
        goto L_0x004f;
    L_0x0056:
        r3 = 1;
    L_0x0057:
        if (r9 != 0) goto L_0x0037;
    L_0x0059:
        r0 = r0.a(r10);
        if (r0 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x001d;
    L_0x0060:
        r2 = r0.a;
    L_0x0062:
        r11.a(r4, r2);
        if (r4 != 0) goto L_0x006e;
    L_0x0067:
        r11.g();
        r11.h();
        return;
    L_0x006e:
        r0 = r11.j;
        r0 = r0.c;
        r0 = r0.c;
        if (r0 == 0) goto L_0x0104;
    L_0x0076:
        r0 = r11.e;
        if (r0 == 0) goto L_0x0104;
    L_0x007a:
        r0 = new android.content.Intent;
        r2 = r11.a;
        r4 = com.google.android.gms.cast.framework.media.MediaNotificationService.class;
        r0.<init>(r2, r4);
        r2 = "extra_media_notification_force_update";
        r0.putExtra(r2, r8);
        r2 = r11.a;
        r2 = r2.getPackageName();
        r0.setPackage(r2);
        r2 = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION";
        r0.setAction(r2);
        r2 = r11.e;
        r2 = r2.h();
        r4 = "extra_media_info";
        r0.putExtra(r4, r2);
        r2 = r11.e;
        r2 = r2.i();
        r4 = "extra_remote_media_client_player_state";
        r0.putExtra(r4, r2);
        r2 = r11.f;
        r4 = "extra_cast_device";
        r0.putExtra(r4, r2);
        r2 = r11.g;
        if (r2 == 0) goto L_0x00bb;
    L_0x00b7:
        r1 = r2.d();
    L_0x00bb:
        r2 = "extra_media_session_token";
        r0.putExtra(r2, r1);
        r1 = r11.e;
        r1 = r1.g();
        if (r1 != 0) goto L_0x00c9;
    L_0x00c8:
        goto L_0x00ff;
    L_0x00c9:
        r2 = r1.m;
        if (r2 == r7) goto L_0x00f4;
    L_0x00cd:
        if (r2 == r6) goto L_0x00f4;
    L_0x00cf:
        if (r2 == r5) goto L_0x00f4;
    L_0x00d1:
        r2 = r1.c;
        r2 = r1.b(r2);
        if (r2 != 0) goto L_0x00dc;
    L_0x00d9:
        r4 = 0;
    L_0x00da:
        r7 = 0;
        goto L_0x00f5;
    L_0x00dc:
        r4 = r2.intValue();
        if (r4 > 0) goto L_0x00e4;
    L_0x00e2:
        r4 = 0;
        goto L_0x00e5;
    L_0x00e4:
        r4 = 1;
    L_0x00e5:
        r2 = r2.intValue();
        r1 = r1.n;
        r1 = r1.size();
        r1 = r1 + -1;
        if (r2 < r1) goto L_0x00f5;
    L_0x00f3:
        goto L_0x00da;
    L_0x00f4:
        r4 = 1;
    L_0x00f5:
        r1 = "extra_can_skip_next";
        r0.putExtra(r1, r7);
        r1 = "extra_can_skip_prev";
        r0.putExtra(r1, r4);
    L_0x00ff:
        r1 = r11.a;
        r1.startService(r0);
    L_0x0104:
        if (r3 != 0) goto L_0x0123;
    L_0x0106:
        r0 = r11.j;
        r0 = r0.d;
        if (r0 == 0) goto L_0x0123;
    L_0x010c:
        r0 = new android.content.Intent;
        r1 = r11.a;
        r2 = com.google.android.gms.cast.framework.ReconnectionService.class;
        r0.<init>(r1, r2);
        r1 = r11.a;
        r1 = r1.getPackageName();
        r0.setPackage(r1);
        r1 = r11.a;
        r1.startService(r0);
    L_0x0123:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qod.i():void");
    }

    public final void a(int i, MediaInfo mediaInfo) {
        wq wqVar;
        if (i == 0) {
            wqVar = this.g;
            xu xuVar = new xu();
            xuVar.a(0, 0);
            wqVar.a(xuVar.a());
            this.g.a(new vl().a());
            return;
        }
        PendingIntent activity;
        long j = mediaInfo.b == 2 ? 5 : 512;
        wq wqVar2 = this.g;
        xu xuVar2 = new xu();
        xuVar2.a(i, 0);
        xuVar2.b = j;
        wqVar2.a(xuVar2.a());
        wqVar = this.g;
        if (this.k != null) {
            Intent intent = new Intent();
            intent.setComponent(this.k);
            activity = PendingIntent.getActivity(this.a, 0, intent, 134217728);
        } else {
            activity = null;
        }
        wqVar.a(activity);
        pjw pjw = mediaInfo.d;
        vl j2 = j();
        String str = "com.google.android.gms.cast.metadata.TITLE";
        j2.a("android.media.metadata.TITLE", pjw.a(str));
        j2.a("android.media.metadata.DISPLAY_TITLE", pjw.a(str));
        j2.a("android.media.metadata.DISPLAY_SUBTITLE", pjw.a("com.google.android.gms.cast.metadata.SUBTITLE"));
        j2.a("android.media.metadata.DURATION", mediaInfo.e);
        this.g.a(j2.a());
        Uri a = a(pjw);
        if (a != null) {
            this.c.a(a);
        } else {
            a(null, 0);
        }
        Uri a2 = a(pjw);
        if (a2 != null) {
            this.d.a(a2);
        } else {
            a(null, 3);
        }
    }

    public final void a(Bitmap bitmap, int i) {
        if (i != 0) {
            if (i == 3) {
                wq wqVar = this.g;
                vl j = j();
                j.a("android.media.metadata.ALBUM_ART", bitmap);
                wqVar.a(j.a());
            }
            return;
        }
        String str = "android.media.metadata.DISPLAY_ICON";
        wq wqVar2;
        vl j2;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
            bitmap.eraseColor(0);
            wqVar2 = this.g;
            j2 = j();
            j2.a(str, bitmap);
            wqVar2.a(j2.a());
            return;
        }
        wqVar2 = this.g;
        j2 = j();
        j2.a(str, bitmap);
        wqVar2.a(j2.a());
    }

    private final Uri a(pjw pjw) {
        pyb a;
        if (this.j.c.a() != null) {
            this.j.c.a();
            a = pli.a(pjw);
        } else if (pjw.a()) {
            a = (pyb) pjw.a.get(0);
        } else {
            a = null;
        }
        if (a != null) {
            return a.a;
        }
        return null;
    }

    private final vl j() {
        vj b = this.g.b.b();
        if (b == null) {
            return new vl();
        }
        return new vl(b);
    }

    public final void g() {
        if (this.j.c.c != null) {
            Intent intent = new Intent(this.a, MediaNotificationService.class);
            intent.setPackage(this.a.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            this.a.stopService(intent);
        }
    }

    public final void h() {
        if (this.j.d) {
            Intent intent = new Intent(this.a, ReconnectionService.class);
            intent.setPackage(this.a.getPackageName());
            this.a.stopService(intent);
        }
    }
}
