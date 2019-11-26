package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.anlf;
import defpackage.anlq;
import defpackage.anpk;
import defpackage.anpq;
import defpackage.anqt;
import defpackage.anqu;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends anpq {
    private static final Queue a = new ArrayDeque(10);

    public void a(anqt anqt) {
    }

    /* Access modifiers changed, original: protected|final */
    public final Intent a() {
        return (Intent) anpk.a().d.poll();
    }

    public final boolean c(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        String str = "FirebaseMessaging";
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException unused) {
                Log.e(str, "Notification pending intent canceled");
            }
        }
        if (a(intent.getExtras())) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                anlq anlq = (anlq) anlf.c().a(anlq.class);
                if (anlq != null) {
                    str = intent.getStringExtra("google.c.a.c_id");
                    anlq.b();
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", str);
                    anlq.a();
                } else {
                    Log.w(str, "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            }
            anqu.a(intent);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04db  */
    public final void a(android.content.Intent r18) {
        /*
        r17 = this;
        r0 = r18;
        r1 = r18.getAction();
        r2 = "com.google.android.c2dm.intent.RECEIVE";
        r2 = r2.equals(r1);
        r3 = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        if (r2 == 0) goto L_0x0522;
    L_0x0010:
        r1 = "google.message_id";
        r2 = r0.getStringExtra(r1);
        r4 = android.text.TextUtils.isEmpty(r2);
        if (r4 == 0) goto L_0x0021;
    L_0x001c:
        r4 = defpackage.rym.a();
        goto L_0x003a;
    L_0x0021:
        r4 = new android.os.Bundle;
        r4.<init>();
        r4.putString(r1, r2);
        r5 = defpackage.anqn.a(r17);
        r6 = new anoy;
        r7 = r5.a();
        r6.<init>(r7, r4);
        r4 = r5.a(r6);
    L_0x003a:
        r5 = android.text.TextUtils.isEmpty(r2);
        r6 = "FirebaseMessaging";
        if (r5 != 0) goto L_0x0063;
    L_0x0042:
        r5 = a;
        r5 = r5.contains(r2);
        if (r5 != 0) goto L_0x005f;
    L_0x004a:
        r5 = a;
        r5 = r5.size();
        r7 = 10;
        if (r5 < r7) goto L_0x0059;
    L_0x0054:
        r5 = a;
        r5.remove();
    L_0x0059:
        r5 = a;
        r5.add(r2);
        goto L_0x0063;
    L_0x005f:
        r13 = r17;
        goto L_0x04f6;
    L_0x0063:
        r2 = "message_type";
        r2 = r0.getStringExtra(r2);
        r5 = "gcm";
        if (r2 != 0) goto L_0x006e;
    L_0x006d:
        r2 = r5;
    L_0x006e:
        r7 = r2.hashCode();
        r8 = 3;
        r10 = 2;
        r11 = 0;
        r12 = 1;
        switch(r7) {
            case -2062414158: goto L_0x0096;
            case 102161: goto L_0x008e;
            case 814694033: goto L_0x0084;
            case 814800675: goto L_0x007a;
            default: goto L_0x0079;
        };
    L_0x0079:
        goto L_0x00a0;
    L_0x007a:
        r5 = "send_event";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00a0;
    L_0x0082:
        r5 = 2;
        goto L_0x00a1;
    L_0x0084:
        r5 = "send_error";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00a0;
    L_0x008c:
        r5 = 3;
        goto L_0x00a1;
    L_0x008e:
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00a0;
    L_0x0094:
        r5 = 0;
        goto L_0x00a1;
    L_0x0096:
        r5 = "deleted_messages";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00a0;
    L_0x009e:
        r5 = 1;
        goto L_0x00a1;
    L_0x00a0:
        r5 = -1;
    L_0x00a1:
        if (r5 == 0) goto L_0x00da;
    L_0x00a3:
        if (r5 == r12) goto L_0x005f;
    L_0x00a5:
        if (r5 == r10) goto L_0x00d6;
    L_0x00a7:
        if (r5 == r8) goto L_0x00bf;
    L_0x00a9:
        r0 = "Received message with unknown type: ";
        r1 = r2.length();
        if (r1 != 0) goto L_0x00b7;
    L_0x00b1:
        r1 = new java.lang.String;
        r1.<init>(r0);
        goto L_0x00bb;
    L_0x00b7:
        r1 = r0.concat(r2);
    L_0x00bb:
        android.util.Log.w(r6, r1);
        goto L_0x005f;
    L_0x00bf:
        r1 = r0.getStringExtra(r1);
        if (r1 != 0) goto L_0x00ca;
    L_0x00c5:
        r1 = "message_id";
        r0.getStringExtra(r1);
    L_0x00ca:
        r1 = new anqs;
        r2 = "error";
        r0 = r0.getStringExtra(r2);
        r1.<init>(r0);
        goto L_0x005f;
    L_0x00d6:
        r0.getStringExtra(r1);
        goto L_0x005f;
    L_0x00da:
        r1 = r18.getExtras();
        r1 = a(r1);
        if (r1 != 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00e8;
    L_0x00e5:
        defpackage.anqu.a(r18);
    L_0x00e8:
        r1 = r18.getExtras();
        if (r1 != 0) goto L_0x00f3;
    L_0x00ee:
        r1 = new android.os.Bundle;
        r1.<init>();
    L_0x00f3:
        r2 = "androidx.contentpager.content.wakelockid";
        r1.remove(r2);
        r2 = "gcm.n.e";
        r2 = defpackage.anqv.a(r1, r2);
        r5 = "1";
        r2 = r5.equals(r2);
        r7 = "gcm.n.icon";
        if (r2 != 0) goto L_0x010e;
    L_0x0108:
        r2 = defpackage.anqv.a(r1, r7);
        if (r2 == 0) goto L_0x0172;
    L_0x010e:
        r2 = defpackage.anqv.a(r17);
        r8 = "gcm.n.noui";
        r8 = defpackage.anqv.a(r1, r8);
        r5 = r5.equals(r8);
        if (r5 != 0) goto L_0x005f;
    L_0x011e:
        r5 = r2.a;
        r8 = "keyguard";
        r5 = r5.getSystemService(r8);
        r5 = (android.app.KeyguardManager) r5;
        r5 = r5.inKeyguardRestrictedInputMode();
        if (r5 != 0) goto L_0x0181;
    L_0x012e:
        r5 = defpackage.qbf.b();
        if (r5 != 0) goto L_0x0139;
    L_0x0134:
        r13 = 10;
        android.os.SystemClock.sleep(r13);
    L_0x0139:
        r5 = android.os.Process.myPid();
        r8 = r2.a;
        r13 = "activity";
        r8 = r8.getSystemService(r13);
        r8 = (android.app.ActivityManager) r8;
        r8 = r8.getRunningAppProcesses();
        if (r8 == 0) goto L_0x0181;
    L_0x014d:
        r8 = r8.iterator();
    L_0x0151:
        r13 = r8.hasNext();
        if (r13 == 0) goto L_0x0181;
    L_0x0157:
        r13 = r8.next();
        r13 = (android.app.ActivityManager.RunningAppProcessInfo) r13;
        r14 = r13.pid;
        if (r14 != r5) goto L_0x017e;
    L_0x0161:
        r5 = r13.importance;
        r8 = 100;
        if (r5 == r8) goto L_0x0168;
    L_0x0167:
        goto L_0x0181;
    L_0x0168:
        r2 = a(r1);
        if (r2 != 0) goto L_0x016f;
    L_0x016e:
        goto L_0x0172;
    L_0x016f:
        defpackage.anqu.a(r18);
    L_0x0172:
        r0 = new anqt;
        r0.<init>(r1);
        r13 = r17;
        r13.a(r0);
        goto L_0x04f6;
    L_0x017e:
        r13 = r17;
        goto L_0x0151;
    L_0x0181:
        r13 = r17;
        r0 = "gcm.n.title";
        r0 = r2.b(r1, r0);
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 == 0) goto L_0x019f;
    L_0x018f:
        r0 = r2.a;
        r0 = r0.getApplicationInfo();
        r5 = r2.a;
        r5 = r5.getPackageManager();
        r0 = r0.loadLabel(r5);
    L_0x019f:
        r5 = "gcm.n.body";
        r5 = r2.b(r1, r5);
        r7 = defpackage.anqv.a(r1, r7);
        r8 = android.text.TextUtils.isEmpty(r7);
        if (r8 != 0) goto L_0x0200;
    L_0x01af:
        r8 = r2.a;
        r8 = r8.getResources();
        r15 = r2.a;
        r15 = r15.getPackageName();
        r14 = "drawable";
        r14 = r8.getIdentifier(r7, r14, r15);
        if (r14 == 0) goto L_0x01c9;
    L_0x01c3:
        r15 = r2.a(r14);
        if (r15 != 0) goto L_0x0227;
    L_0x01c9:
        r14 = r2.a;
        r14 = r14.getPackageName();
        r15 = "mipmap";
        r14 = r8.getIdentifier(r7, r15, r14);
        if (r14 == 0) goto L_0x01dd;
    L_0x01d7:
        r8 = r2.a(r14);
        if (r8 != 0) goto L_0x0227;
    L_0x01dd:
        r8 = java.lang.String.valueOf(r7);
        r8 = r8.length();
        r14 = new java.lang.StringBuilder;
        r8 = r8 + 61;
        r14.<init>(r8);
        r8 = "Icon resource ";
        r14.append(r8);
        r14.append(r7);
        r7 = " not found. Notification will use default icon.";
        r14.append(r7);
        r7 = r14.toString();
        android.util.Log.w(r6, r7);
    L_0x0200:
        r7 = r2.a();
        r8 = "com.google.firebase.messaging.default_notification_icon";
        r7 = r7.getInt(r8, r11);
        if (r7 == 0) goto L_0x0212;
    L_0x020c:
        r8 = r2.a(r7);
        if (r8 != 0) goto L_0x021a;
    L_0x0212:
        r7 = r2.a;
        r7 = r7.getApplicationInfo();
        r7 = r7.icon;
    L_0x021a:
        r14 = r7;
        if (r14 == 0) goto L_0x0224;
    L_0x021d:
        r7 = r2.a(r14);
        if (r7 == 0) goto L_0x0224;
    L_0x0223:
        goto L_0x0227;
    L_0x0224:
        r14 = 17301651; // 0x1080093 float:2.4979667E-38 double:8.5481514E-317;
    L_0x0227:
        r7 = "gcm.n.color";
        r7 = defpackage.anqv.a(r1, r7);
        r7 = r2.b(r7);
        r8 = "gcm.n.sound2";
        r8 = defpackage.anqv.a(r1, r8);
        r15 = android.text.TextUtils.isEmpty(r8);
        if (r15 == 0) goto L_0x0243;
    L_0x023d:
        r8 = "gcm.n.sound";
        r8 = defpackage.anqv.a(r1, r8);
    L_0x0243:
        r15 = android.text.TextUtils.isEmpty(r8);
        r16 = 0;
        if (r15 != 0) goto L_0x02a3;
    L_0x024b:
        r15 = "default";
        r15 = r15.equals(r8);
        if (r15 != 0) goto L_0x029e;
    L_0x0253:
        r15 = r2.a;
        r15 = r15.getResources();
        r9 = r2.a;
        r9 = r9.getPackageName();
        r11 = "raw";
        r9 = r15.getIdentifier(r8, r11, r9);
        if (r9 == 0) goto L_0x029e;
    L_0x0267:
        r9 = r2.a;
        r9 = r9.getPackageName();
        r10 = java.lang.String.valueOf(r9);
        r10 = r10.length();
        r11 = java.lang.String.valueOf(r8);
        r11 = r11.length();
        r15 = new java.lang.StringBuilder;
        r10 = r10 + 24;
        r10 = r10 + r11;
        r15.<init>(r10);
        r10 = "android.resource://";
        r15.append(r10);
        r15.append(r9);
        r9 = "/raw/";
        r15.append(r9);
        r15.append(r8);
        r8 = r15.toString();
        r8 = android.net.Uri.parse(r8);
        goto L_0x02a5;
    L_0x029e:
        r8 = android.media.RingtoneManager.getDefaultUri(r10);
        goto L_0x02a5;
    L_0x02a3:
        r8 = r16;
    L_0x02a5:
        r9 = "gcm.n.click_action";
        r9 = defpackage.anqv.a(r1, r9);
        r10 = android.text.TextUtils.isEmpty(r9);
        if (r10 != 0) goto L_0x02c5;
    L_0x02b1:
        r10 = new android.content.Intent;
        r10.<init>(r9);
        r9 = r2.a;
        r9 = r9.getPackageName();
        r10.setPackage(r9);
        r9 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r10.setFlags(r9);
        goto L_0x0311;
    L_0x02c5:
        r9 = "gcm.n.link_android";
        r9 = defpackage.anqv.a(r1, r9);
        r10 = android.text.TextUtils.isEmpty(r9);
        if (r10 == 0) goto L_0x02d7;
    L_0x02d1:
        r9 = "gcm.n.link";
        r9 = defpackage.anqv.a(r1, r9);
    L_0x02d7:
        r10 = android.text.TextUtils.isEmpty(r9);
        if (r10 != 0) goto L_0x02e2;
    L_0x02dd:
        r9 = android.net.Uri.parse(r9);
        goto L_0x02e4;
    L_0x02e2:
        r9 = r16;
    L_0x02e4:
        if (r9 == 0) goto L_0x02fa;
    L_0x02e6:
        r10 = new android.content.Intent;
        r11 = "android.intent.action.VIEW";
        r10.<init>(r11);
        r11 = r2.a;
        r11 = r11.getPackageName();
        r10.setPackage(r11);
        r10.setData(r9);
        goto L_0x0311;
    L_0x02fa:
        r9 = r2.a;
        r9 = r9.getPackageManager();
        r10 = r2.a;
        r10 = r10.getPackageName();
        r10 = r9.getLaunchIntentForPackage(r10);
        if (r10 != 0) goto L_0x0311;
    L_0x030c:
        r9 = "No activity found to launch app";
        android.util.Log.w(r6, r9);
    L_0x0311:
        if (r10 == 0) goto L_0x037a;
    L_0x0313:
        r9 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r10.addFlags(r9);
        r9 = new android.os.Bundle;
        r9.<init>(r1);
        r11 = r9.keySet();
        r11 = r11.iterator();
    L_0x0325:
        r15 = r11.hasNext();
        if (r15 == 0) goto L_0x0340;
    L_0x032b:
        r15 = r11.next();
        r15 = (java.lang.String) r15;
        if (r15 == 0) goto L_0x0325;
    L_0x0333:
        r12 = "google.c.";
        r12 = r15.startsWith(r12);
        if (r12 == 0) goto L_0x033e;
    L_0x033b:
        r11.remove();
    L_0x033e:
        r12 = 1;
        goto L_0x0325;
    L_0x0340:
        r10.putExtras(r9);
        r9 = r9.keySet();
        r9 = r9.iterator();
    L_0x034b:
        r11 = r9.hasNext();
        if (r11 == 0) goto L_0x036b;
    L_0x0351:
        r11 = r9.next();
        r11 = (java.lang.String) r11;
        r12 = "gcm.n.";
        r12 = r11.startsWith(r12);
        if (r12 != 0) goto L_0x0367;
    L_0x035f:
        r12 = "gcm.notification.";
        r12 = r11.startsWith(r12);
        if (r12 == 0) goto L_0x034b;
    L_0x0367:
        r10.removeExtra(r11);
        goto L_0x034b;
    L_0x036b:
        r9 = r2.a;
        r11 = r2.c;
        r11 = r11.incrementAndGet();
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = android.app.PendingIntent.getActivity(r9, r11, r10, r12);
        goto L_0x037c;
    L_0x037a:
        r9 = r16;
    L_0x037c:
        r10 = a(r1);
        if (r10 == 0) goto L_0x03b1;
    L_0x0382:
        r10 = new android.content.Intent;
        r11 = "com.google.firebase.messaging.NOTIFICATION_OPEN";
        r10.<init>(r11);
        defpackage.anqv.a(r10, r1);
        r11 = "pending_intent";
        r10.putExtra(r11, r9);
        r9 = r2.a;
        r11 = r2.c;
        r11 = r11.incrementAndGet();
        r9 = defpackage.anpk.a(r9, r11, r10);
        r10 = new android.content.Intent;
        r10.<init>(r3);
        defpackage.anqv.a(r10, r1);
        r3 = r2.a;
        r11 = r2.c;
        r11 = r11.incrementAndGet();
        r16 = defpackage.anpk.a(r3, r11, r10);
    L_0x03b1:
        r3 = r16;
        r10 = defpackage.qbf.c();
        if (r10 == 0) goto L_0x045b;
    L_0x03b9:
        r10 = r2.a;
        r10 = r10.getApplicationInfo();
        r10 = r10.targetSdkVersion;
        r11 = 25;
        if (r10 <= r11) goto L_0x045b;
    L_0x03c5:
        r10 = "gcm.n.android_channel_id";
        r10 = defpackage.anqv.a(r1, r10);
        r10 = r2.c(r10);
        r11 = new android.app.Notification$Builder;
        r12 = r2.a;
        r11.<init>(r12);
        r12 = 1;
        r11 = r11.setAutoCancel(r12);
        r11 = r11.setSmallIcon(r14);
        r12 = android.text.TextUtils.isEmpty(r0);
        if (r12 != 0) goto L_0x03e8;
    L_0x03e5:
        r11.setContentTitle(r0);
    L_0x03e8:
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 != 0) goto L_0x03fd;
    L_0x03ee:
        r11.setContentText(r5);
        r0 = new android.app.Notification$BigTextStyle;
        r0.<init>();
        r0 = r0.bigText(r5);
        r11.setStyle(r0);
    L_0x03fd:
        if (r7 == 0) goto L_0x0406;
    L_0x03ff:
        r0 = r7.intValue();
        r11.setColor(r0);
    L_0x0406:
        if (r8 == 0) goto L_0x040b;
    L_0x0408:
        r11.setSound(r8);
    L_0x040b:
        if (r9 == 0) goto L_0x0410;
    L_0x040d:
        r11.setContentIntent(r9);
    L_0x0410:
        if (r3 == 0) goto L_0x0415;
    L_0x0412:
        r11.setDeleteIntent(r3);
    L_0x0415:
        if (r10 == 0) goto L_0x0456;
    L_0x0417:
        r0 = r2.b;
        if (r0 != 0) goto L_0x0423;
    L_0x041b:
        r0 = "setChannelId";
        r0 = defpackage.anqv.a(r0);
        r2.b = r0;
    L_0x0423:
        r0 = r2.b;
        if (r0 != 0) goto L_0x042f;
    L_0x0427:
        r0 = "setChannel";
        r0 = defpackage.anqv.a(r0);
        r2.b = r0;
    L_0x042f:
        r0 = r2.b;
        r3 = "Error while setting the notification channel";
        if (r0 != 0) goto L_0x0439;
    L_0x0435:
        android.util.Log.e(r6, r3);
        goto L_0x0456;
    L_0x0439:
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ IllegalAccessException -> 0x0452, InvocationTargetException -> 0x044d, SecurityException -> 0x0448, IllegalArgumentException -> 0x0443 }
        r7 = 0;
        r5[r7] = r10;	 Catch:{ IllegalAccessException -> 0x0452, InvocationTargetException -> 0x044d, SecurityException -> 0x0448, IllegalArgumentException -> 0x0443 }
        r0.invoke(r11, r5);	 Catch:{ IllegalAccessException -> 0x0452, InvocationTargetException -> 0x044d, SecurityException -> 0x0448, IllegalArgumentException -> 0x0443 }
        goto L_0x0456;
    L_0x0443:
        r0 = move-exception;
        android.util.Log.e(r6, r3, r0);
        goto L_0x0456;
    L_0x0448:
        r0 = move-exception;
        android.util.Log.e(r6, r3, r0);
        goto L_0x0456;
    L_0x044d:
        r0 = move-exception;
        android.util.Log.e(r6, r3, r0);
        goto L_0x0456;
    L_0x0452:
        r0 = move-exception;
        android.util.Log.e(r6, r3, r0);
    L_0x0456:
        r0 = r11.build();
        goto L_0x04c5;
    L_0x045b:
        r10 = new qg;
        r11 = r2.a;
        r10.<init>(r11);
        r11 = 1;
        r10.b(r11);
        r10.a(r14);
        r11 = android.text.TextUtils.isEmpty(r0);
        if (r11 != 0) goto L_0x0472;
    L_0x046f:
        r10.a(r0);
    L_0x0472:
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 != 0) goto L_0x0486;
    L_0x0478:
        r10.b(r5);
        r0 = new qh;
        r0.<init>();
        r0.a(r5);
        r10.a(r0);
    L_0x0486:
        if (r7 == 0) goto L_0x048e;
    L_0x0488:
        r0 = r7.intValue();
        r10.t = r0;
    L_0x048e:
        if (r8 != 0) goto L_0x0491;
    L_0x0490:
        goto L_0x04b7;
    L_0x0491:
        r0 = r10.A;
        r0.sound = r8;
        r0 = r10.A;
        r5 = -1;
        r0.audioStreamType = r5;
        r0 = android.os.Build.VERSION.SDK_INT;
        r5 = 21;
        if (r0 < r5) goto L_0x04b7;
    L_0x04a0:
        r0 = r10.A;
        r5 = new android.media.AudioAttributes$Builder;
        r5.<init>();
        r7 = 4;
        r5 = r5.setContentType(r7);
        r7 = 5;
        r5 = r5.setUsage(r7);
        r5 = r5.build();
        r0.audioAttributes = r5;
    L_0x04b7:
        if (r9 == 0) goto L_0x04bb;
    L_0x04b9:
        r10.f = r9;
    L_0x04bb:
        if (r3 != 0) goto L_0x04be;
    L_0x04bd:
        goto L_0x04c1;
    L_0x04be:
        r10.a(r3);
    L_0x04c1:
        r0 = r10.e();
    L_0x04c5:
        r3 = "gcm.n.tag";
        r1 = defpackage.anqv.a(r1, r3);
        r2 = r2.a;
        r3 = "notification";
        r2 = r2.getSystemService(r3);
        r2 = (android.app.NotificationManager) r2;
        r3 = android.text.TextUtils.isEmpty(r1);
        if (r3 == 0) goto L_0x04f2;
    L_0x04db:
        r7 = android.os.SystemClock.uptimeMillis();
        r1 = new java.lang.StringBuilder;
        r3 = 37;
        r1.<init>(r3);
        r3 = "FCM-Notification:";
        r1.append(r3);
        r1.append(r7);
        r1 = r1.toString();
    L_0x04f2:
        r3 = 0;
        r2.notify(r1, r3, r0);
    L_0x04f6:
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ ExecutionException -> 0x0502, InterruptedException -> 0x0500, InterruptedException | ExecutionException | TimeoutException -> 0x04fe }
        r1 = 1;
        defpackage.rym.a(r4, r1, r0);	 Catch:{ ExecutionException -> 0x0502, InterruptedException -> 0x0500, InterruptedException | ExecutionException | TimeoutException -> 0x04fe }
        return;
    L_0x04fe:
        r0 = move-exception;
        goto L_0x0503;
    L_0x0500:
        r0 = move-exception;
        goto L_0x0503;
    L_0x0502:
        r0 = move-exception;
    L_0x0503:
        r0 = java.lang.String.valueOf(r0);
        r1 = r0.length();
        r2 = new java.lang.StringBuilder;
        r1 = r1 + 20;
        r2.<init>(r1);
        r1 = "Message ack failed: ";
        r2.append(r1);
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.w(r6, r0);
        return;
    L_0x0522:
        r13 = r17;
        r2 = r3.equals(r1);
        if (r2 == 0) goto L_0x0538;
    L_0x052a:
        r1 = r18.getExtras();
        r1 = a(r1);
        if (r1 == 0) goto L_0x0537;
    L_0x0534:
        defpackage.anqu.a(r18);
    L_0x0537:
        return;
    L_0x0538:
        r2 = "com.google.firebase.messaging.NEW_TOKEN";
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x0546;
    L_0x0540:
        r1 = "token";
        r0.getStringExtra(r1);
        return;
    L_0x0546:
        r0 = r18.getAction();
        r0 = java.lang.String.valueOf(r0);
        r1 = "Unknown intent action: ";
        r2 = r0.length();
        if (r2 != 0) goto L_0x055c;
    L_0x0556:
        r0 = new java.lang.String;
        r0.<init>(r1);
        return;
    L_0x055c:
        r1.concat(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.a(android.content.Intent):void");
    }

    private static boolean a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }
}
