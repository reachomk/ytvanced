package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
import java.util.Arrays;

/* renamed from: afxv */
public final class afxv {
    private static final SparseIntArray a = new afxx();
    private static final SparseIntArray b = new afya();
    private final int c;
    private final String d;
    private final int e;
    private final Notification f;
    private final Notification g;
    private final int h;
    private final String i;
    private final auko j;

    private afxv(String str, int i, Notification notification, int i2, Notification notification2, String str2, int i3, auko auko) {
        this.d = str;
        this.e = i;
        this.f = notification;
        this.c = i2;
        this.g = notification2;
        this.h = i3;
        this.i = str2;
        this.j = auko;
    }

    public final void a(Context context, wya wya, bcaa bcaa, zzl zzl, acvx acvx) {
        acvx acvx2 = acvx;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (!(this.g == null || this.h == -1 || TextUtils.isEmpty(this.i))) {
            try {
                notificationManager.notify(this.i, this.h, this.g);
            } catch (RuntimeException e) {
                afpc.a(1, afpf.notification, e.getMessage());
            }
            String.valueOf(this.i).length();
        }
        try {
            notificationManager.notify(this.d, this.e, this.f);
        } catch (RuntimeException e2) {
            afpc.a(1, afpf.notification, e2.getMessage());
        }
        String.valueOf(this.d).length();
        afxh.b(bcaa, "POSTED", zzl);
        if (acvx2 != null) {
            auko auko = this.j;
            if (!(auko == null || (auko.a & 1) == 0)) {
                acxf acvs = new acvs(auko.b);
                acvx2.a(acvs);
                acvx2.a(acvs, null);
            }
        }
        if (wya != null && this.c != 0) {
            Bundle bundle = new Bundle();
            bundle.putInt("notification_id", this.e);
            bundle.putString("notification_tag", this.d);
            wya wya2 = wya;
            wya2.a("notification_timeout_task", (long) (this.c / 1000), 2, false, 0, false, bundle, null, false, true);
        }
    }

    public static void a(Context context, Intent intent) {
        String str = "notification_id";
        if (intent.hasExtra(str)) {
            afxv.a(context, intent.getStringExtra("notification_tag"), intent.getIntExtra(str, 0));
        }
    }

    public static void a(Context context, String str, int i) {
        ((NotificationManager) context.getSystemService("notification")).cancel(str, i);
    }

    public static void a(Context context) {
        ((NotificationManager) context.getSystemService("notification")).cancelAll();
    }

    public static apxu a(Intent intent) {
        String str = "record_interactions_endpoint";
        return intent.hasExtra(str) ? aabc.b(intent.getByteArrayExtra(str)) : null;
    }

    public static apxu b(Intent intent) {
        String str = "service_endpoint";
        if (intent.hasExtra(str)) {
            return aabc.b(intent.getExtras().getByteArray(str));
        }
        return null;
    }

    public static aofq c(Intent intent) {
        String str = "identity_token";
        if (intent.hasExtra(str)) {
            try {
                return (aofq) anxl.parseFrom(aofq.i, intent.getExtras().getByteArray(str), anxa.c());
            } catch (anyg unused) {
            }
        }
        return null;
    }

    private static void a(Intent intent, String str, int i) {
        intent.putExtra("notification_id", i);
        intent.putExtra("notification_tag", str);
    }

    private static void a(apxu apxu, Intent intent, acvx acvx, boolean z) {
        anvf apxu2;
        if (!(acvx == null || apxu2 == null || !z)) {
            avjh avjh = (avjh) avjf.h.createBuilder();
            avjh.a(acvx.d());
            apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
            apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
            apxu2 = (apxu) ((anxl) apxx.build());
        }
        if (apxu2 != null) {
            intent.putExtra("navigation_endpoint", apxu2.toByteArray());
        }
    }

    private static void a(apxu apxu, Intent intent) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                intent.putExtra("record_interactions_endpoint", apxu.toByteArray());
                return;
            }
        }
        xtl.e("Notification clickTrackingEndpoint was not set or did not contain a RecordNotificationInteractionsEndpoint.");
    }

    private static void b(apxu apxu, Intent intent) {
        if (apxu != null) {
            intent.putExtra("service_endpoint", apxu.toByteArray());
        }
    }

    private static void a(aofq aofq, Intent intent) {
        if (aofq != null) {
            intent.putExtra("identity_token", aofq.toByteArray());
        }
    }

    private static void a(String str, Intent intent, avmc avmc) {
        if (avmc != null && avmc.k && !TextUtils.isEmpty(str)) {
            intent.putExtra("push_notification_clientstreamz_logging", str);
        }
    }

    private static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getActivity(context, (int) (Math.random() * 2.147483647E9d), intent, 1073741824);
    }

    private static PendingIntent d(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, (int) (Math.random() * 2.147483647E9d), intent, 1073741824);
    }

    public static boolean a(aouo aouo) {
        if (aouo != null) {
            int i = aouo.a;
            if (!(((i & 2) == 0 && (i & 4) == 0) || (i & 1) == 0)) {
                arml arml;
                aour aour = aouo.d;
                if (aour == null) {
                    aour = aour.t;
                }
                if ((aour.a & 16) != 0) {
                    arml = aour.f;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                if (!TextUtils.isEmpty(ajqy.a(arml))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(aouo aouo, akvp akvp) {
        if ((aouo.a & 1) != 0) {
            arml arml;
            aour aour = aouo.d;
            if (aour == null) {
                aour = aour.t;
            }
            if ((aour.a & 8) != 0) {
                arml = aour.e;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            if (!TextUtils.isEmpty(ajqy.a(arml))) {
                AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer d = afxv.d(aouo);
                if (!(d == null || d.a.size() == 0)) {
                    for (axak axak : d.a) {
                        anxr access$000 = anxl.checkIsLite(AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.iconSurveyOptionRenderer);
                        axak.a(access$000);
                        Object b = axak.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer) b;
                        if (androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer == null || (androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.a & 1) == 0) {
                            return false;
                        }
                        arwf arwf = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b;
                        if (arwf == null) {
                            arwf = arwf.c;
                        }
                        arwh a = arwh.a(arwf.b);
                        if (a == null) {
                            a = arwh.UNKNOWN;
                        }
                        if (akvp.a(a) == 0) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(aouo aouo) {
        return (aouo == null || aouo.l.size() == 0) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:282:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x05bb  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x07b1  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x07b1  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x07b1  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x07e9  */
    public static defpackage.afxv a(android.content.Context r28, defpackage.aouo r29, android.content.Intent r30, android.content.Intent r31, int r32, int r33, int r34, defpackage.akvp r35, android.content.SharedPreferences r36, defpackage.akkq r37, defpackage.xsc r38, defpackage.bcaa r39, defpackage.avmc r40, defpackage.acvx r41) {
        /*
        r0 = r28;
        r1 = r29;
        r2 = r30;
        r3 = r31;
        r4 = r32;
        r5 = r34;
        r6 = r35;
        r7 = r39;
        r8 = r40;
        r9 = r41;
        r10 = defpackage.afxv.a(r29);
        r11 = 0;
        if (r10 != 0) goto L_0x0023;
    L_0x001b:
        r10 = defpackage.afxv.a(r1, r6);
        if (r10 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0023;
    L_0x0022:
        return r11;
    L_0x0023:
        r10 = r1.d;
        if (r10 != 0) goto L_0x0029;
    L_0x0027:
        r10 = defpackage.aour.t;
    L_0x0029:
        r12 = r28.getResources();
        r13 = r10.n;
        if (r13 != 0) goto L_0x0033;
    L_0x0031:
        r13 = 0;
        goto L_0x0034;
    L_0x0033:
        r13 = 4;
    L_0x0034:
        r11 = r10.m;
        r15 = 1;
        if (r11 == 0) goto L_0x0045;
    L_0x0039:
        r11 = "com.google.android.libraries.youtube.notification.pref.notification_sound_enabled";
        r14 = r36;
        r11 = r14.getBoolean(r11, r15);
        if (r11 == 0) goto L_0x0045;
    L_0x0043:
        r13 = r13 | 1;
    L_0x0045:
        r11 = r10.o;
        if (r11 != 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0054;
    L_0x004a:
        r11 = r1.m;
        r11 = r11.size();
        if (r11 != 0) goto L_0x0054;
    L_0x0052:
        r13 = r13 | 2;
    L_0x0054:
        r11 = new qg;
        r11.<init>(r0);
        r11.b(r15);
        r14 = r10.a;
        r15 = 8;
        r14 = r14 & r15;
        if (r14 == 0) goto L_0x006a;
    L_0x0063:
        r14 = r10.e;
        if (r14 != 0) goto L_0x006b;
    L_0x0067:
        r14 = defpackage.arml.f;
        goto L_0x006b;
    L_0x006a:
        r14 = 0;
    L_0x006b:
        r14 = defpackage.ajqy.a(r14);
        r11.a(r14);
        r14 = r10.a;
        r14 = r14 & 16;
        if (r14 == 0) goto L_0x007f;
    L_0x0078:
        r14 = r10.f;
        if (r14 != 0) goto L_0x0080;
    L_0x007c:
        r14 = defpackage.arml.f;
        goto L_0x0080;
    L_0x007f:
        r14 = 0;
    L_0x0080:
        r14 = defpackage.ajqy.a(r14);
        r11.b(r14);
        r14 = r10.a;
        r14 = r14 & 64;
        if (r14 == 0) goto L_0x0094;
    L_0x008d:
        r14 = r10.h;
        if (r14 != 0) goto L_0x0095;
    L_0x0091:
        r14 = defpackage.arml.f;
        goto L_0x0095;
    L_0x0094:
        r14 = 0;
    L_0x0095:
        r14 = defpackage.ajqy.a(r14);
        r11.d(r14);
        r14 = r10.a;
        r14 = r14 & 32;
        if (r14 == 0) goto L_0x00a9;
    L_0x00a2:
        r14 = r10.g;
        if (r14 != 0) goto L_0x00aa;
    L_0x00a6:
        r14 = defpackage.arml.f;
        goto L_0x00aa;
    L_0x00a9:
        r14 = 0;
    L_0x00aa:
        r14 = defpackage.ajqy.a(r14);
        r11.c(r14);
        r11.a(r4);
        r14 = 2131559452; // 0x7f0d041c float:1.8744248E38 double:1.0531302973E-314;
        r12 = r12.getColor(r14);
        r11.t = r12;
        r12 = new qh;
        r12.<init>();
        r14 = r10.a;
        r14 = r14 & 16;
        if (r14 == 0) goto L_0x00cf;
    L_0x00c8:
        r14 = r10.f;
        if (r14 != 0) goto L_0x00d0;
    L_0x00cc:
        r14 = defpackage.arml.f;
        goto L_0x00d0;
    L_0x00cf:
        r14 = 0;
    L_0x00d0:
        r14 = defpackage.ajqy.a(r14);
        r12.a(r14);
        r14 = r10.a;
        r14 = r14 & r15;
        if (r14 == 0) goto L_0x00e3;
    L_0x00dc:
        r14 = r10.e;
        if (r14 != 0) goto L_0x00e4;
    L_0x00e0:
        r14 = defpackage.arml.f;
        goto L_0x00e4;
    L_0x00e3:
        r14 = 0;
    L_0x00e4:
        r14 = defpackage.ajqy.a(r14);
        r14 = defpackage.qg.f(r14);
        r12.c = r14;
        r11.a(r12);
        r12 = r11.A;
        r12.defaults = r13;
        r12 = 4;
        r13 = r13 & r12;
        if (r13 == 0) goto L_0x0101;
    L_0x00f9:
        r12 = r11.A;
        r13 = r12.flags;
        r14 = 1;
        r13 = r13 | r14;
        r12.flags = r13;
    L_0x0101:
        r12 = r10.d;
        r11.i = r12;
        r12 = r1.a;
        r13 = 2;
        r12 = r12 & r13;
        if (r12 != 0) goto L_0x0116;
    L_0x010b:
        r12 = defpackage.afxv.a(r1, r3, r8, r9);
        r12 = defpackage.afxv.d(r0, r12);
        r11.f = r12;
        goto L_0x0120;
    L_0x0116:
        r12 = defpackage.afxv.a(r1, r2, r8, r9);
        r12 = defpackage.afxv.c(r0, r12);
        r11.f = r12;
    L_0x0120:
        r12 = r10.k;
        if (r12 == 0) goto L_0x0125;
    L_0x0124:
        goto L_0x012d;
    L_0x0125:
        r12 = r10.j;
        r12 = r12.isEmpty();
        if (r12 != 0) goto L_0x0135;
    L_0x012d:
        r12 = r10.j;
        r11.o = r12;
        r12 = r10.l;
        r11.p = r12;
    L_0x0135:
        r12 = r10.d;
        r14 = -1;
        if (r12 != r14) goto L_0x013d;
    L_0x013a:
        r11.a();
    L_0x013d:
        r10 = r10.s;
        if (r10 == 0) goto L_0x0144;
    L_0x0141:
        r13 = (long) r10;
        r11.y = r13;
    L_0x0144:
        defpackage.afxv.a(r1, r0, r11);
        r10 = new java.util.HashSet;
        r10.<init>();
        r13 = r1.d;
        if (r13 != 0) goto L_0x0152;
    L_0x0150:
        r13 = defpackage.aour.t;
    L_0x0152:
        r14 = defpackage.afxv.c(r29);
        if (r14 != 0) goto L_0x015a;
    L_0x0158:
        r12 = 0;
        goto L_0x0178;
    L_0x015a:
        if (r5 != 0) goto L_0x015d;
    L_0x015c:
        goto L_0x0158;
    L_0x015d:
        r12 = r14.e;
        r12 = defpackage.avkm.a(r12);
        if (r12 == 0) goto L_0x0166;
    L_0x0165:
        goto L_0x0167;
    L_0x0166:
        r12 = 1;
    L_0x0167:
        r12 = defpackage.afxv.a(r12);
        if (r12 != 0) goto L_0x016e;
    L_0x016d:
        goto L_0x0158;
    L_0x016e:
        r12 = r14.d;
        if (r12 != 0) goto L_0x0174;
    L_0x0172:
        r12 = defpackage.aygk.f;
    L_0x0174:
        r12 = defpackage.aklb.d(r12);
    L_0x0178:
        if (r12 == 0) goto L_0x017d;
    L_0x017a:
        r10.add(r12);
    L_0x017d:
        r14 = r13.i;
        if (r14 != 0) goto L_0x0183;
    L_0x0181:
        r14 = defpackage.aygk.f;
    L_0x0183:
        r14 = defpackage.aklb.d(r14);
        if (r14 == 0) goto L_0x018c;
    L_0x0189:
        r10.add(r14);
    L_0x018c:
        r15 = r1.b;
        r3 = 17;
        if (r15 != r3) goto L_0x01a6;
    L_0x0192:
        r3 = r1.c;
        r3 = (defpackage.aout) r3;
        r3 = r3.b;
        if (r3 != 0) goto L_0x019c;
    L_0x019a:
        r3 = defpackage.aygk.f;
    L_0x019c:
        r3 = defpackage.aklb.d(r3);
        if (r3 == 0) goto L_0x01a7;
    L_0x01a2:
        r10.add(r3);
        goto L_0x01a7;
    L_0x01a6:
        r3 = 0;
    L_0x01a7:
        r15 = "STEP_BITMAP_FETCH_START";
        defpackage.afxh.a(r7, r15, r8);
        r15 = new java.util.HashMap;
        r9 = r10.size();
        r15.<init>(r9);
        r9 = r10.isEmpty();
        if (r9 != 0) goto L_0x0213;
    L_0x01bb:
        r9 = new java.util.concurrent.CountDownLatch;
        r2 = r10.size();
        r9.<init>(r2);
        r2 = r10.iterator();
    L_0x01c8:
        r10 = r2.hasNext();
        if (r10 == 0) goto L_0x0207;
    L_0x01ce:
        r10 = r2.next();
        r10 = (android.net.Uri) r10;
        r20 = defpackage.xvt.e(r10);
        if (r20 != 0) goto L_0x01e3;
    L_0x01da:
        r10 = "Insecure URL used for notification image, ignoring";
        defpackage.xtl.c(r10);
        r9.countDown();
        goto L_0x01c8;
    L_0x01e3:
        r26 = r2;
        r2 = new afxz;
        r2.<init>(r15, r10, r9);
        r27 = r3;
        r3 = new afyc;
        r20 = r3;
        r21 = r15;
        r22 = r10;
        r23 = r9;
        r24 = r37;
        r25 = r2;
        r20.<init>(r21, r22, r23, r24, r25);
        r2 = r37;
        r2.b(r10, r3);
        r2 = r26;
        r3 = r27;
        goto L_0x01c8;
    L_0x0207:
        r27 = r3;
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0211 }
        r0 = 60;
        r9.await(r0, r2);	 Catch:{ InterruptedException -> 0x0211 }
        goto L_0x0215;
        goto L_0x0215;
    L_0x0213:
        r27 = r3;
    L_0x0215:
        r0 = "STEP_BITMAP_FETCH_FINISH";
        defpackage.afxh.a(r7, r0, r8);
        r0 = r28.getResources();
        if (r14 == 0) goto L_0x0227;
    L_0x0220:
        r1 = r15.get(r14);
        r1 = (android.graphics.Bitmap) r1;
        goto L_0x0228;
    L_0x0227:
        r1 = 0;
    L_0x0228:
        if (r12 == 0) goto L_0x03c4;
    L_0x022a:
        r3 = r15.get(r12);
        r3 = (android.graphics.Bitmap) r3;
        r7 = defpackage.afxv.c(r29);
        r7 = r7.e;
        r7 = defpackage.avkm.a(r7);
        if (r7 == 0) goto L_0x023d;
    L_0x023c:
        goto L_0x023e;
    L_0x023d:
        r7 = 1;
    L_0x023e:
        r9 = defpackage.afxv.c(r29);
        r10 = r9.b;
        r14 = 3;
        if (r10 != r14) goto L_0x0250;
    L_0x0247:
        r9 = r9.c;
        r9 = (java.lang.Integer) r9;
        r9 = r9.intValue();
        goto L_0x0251;
    L_0x0250:
        r9 = 0;
    L_0x0251:
        r9 = (long) r9;
        r12 = defpackage.afxv.c(r29);
        r14 = r12.b;
        r2 = 6;
        if (r14 != r2) goto L_0x0264;
    L_0x025b:
        r2 = r12.c;
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        goto L_0x0265;
    L_0x0264:
        r2 = 0;
    L_0x0265:
        r12 = defpackage.afxv.c(r29);
        r14 = r12.b;
        r8 = 7;
        if (r14 != r8) goto L_0x0277;
    L_0x026e:
        r8 = r12.c;
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        goto L_0x0278;
    L_0x0277:
        r8 = 0;
    L_0x0278:
        r12 = defpackage.afxv.c(r29);
        r12 = r12.g;
        r12 = defpackage.avko.a(r12);
        if (r12 == 0) goto L_0x0286;
    L_0x0284:
        r14 = r12;
        goto L_0x0287;
    L_0x0286:
        r14 = 1;
    L_0x0287:
        r12 = defpackage.afxv.c(r29);
        r12 = r12.f;
        if (r5 == 0) goto L_0x03bc;
    L_0x028f:
        r20 = r15;
        r15 = r28.getResources();
        r21 = r0;
        r0 = defpackage.afxv.a(r7);
        r22 = r1;
        if (r0 == 0) goto L_0x04cc;
    L_0x029f:
        r1 = new android.widget.RemoteViews;
        r6 = r28.getPackageName();
        r1.<init>(r6, r0);
        if (r3 == 0) goto L_0x02b0;
    L_0x02aa:
        r0 = 2131756354; // 0x7f100542 float:1.9143613E38 double:1.05322758E-314;
        r1.setImageViewBitmap(r0, r3);
    L_0x02b0:
        r0 = r13.a;
        r3 = 8;
        r0 = r0 & r3;
        if (r0 == 0) goto L_0x02be;
    L_0x02b7:
        r0 = r13.e;
        if (r0 != 0) goto L_0x02bf;
    L_0x02bb:
        r0 = defpackage.arml.f;
        goto L_0x02bf;
    L_0x02be:
        r0 = 0;
    L_0x02bf:
        r0 = defpackage.ajqy.a(r0);
        r3 = 2131756357; // 0x7f100545 float:1.914362E38 double:1.0532275813E-314;
        r1.setTextViewText(r3, r0);
        r0 = r13.a;
        r0 = r0 & 16;
        if (r0 == 0) goto L_0x02d6;
    L_0x02cf:
        r0 = r13.f;
        if (r0 != 0) goto L_0x02d7;
    L_0x02d3:
        r0 = defpackage.arml.f;
        goto L_0x02d7;
    L_0x02d6:
        r0 = 0;
    L_0x02d7:
        r0 = defpackage.ajqy.a(r0);
        r3 = 2131756359; // 0x7f100547 float:1.9143623E38 double:1.0532275823E-314;
        r1.setTextViewText(r3, r0);
        r0 = 2131756355; // 0x7f100543 float:1.9143615E38 double:1.0532275803E-314;
        r1.setImageViewResource(r0, r4);
        r0 = 8;
        if (r7 == r0) goto L_0x02ec;
    L_0x02eb:
        goto L_0x02ef;
    L_0x02ec:
        if (r12 != 0) goto L_0x02ef;
    L_0x02ee:
        goto L_0x030c;
    L_0x02ef:
        r0 = new java.text.SimpleDateFormat;
        r6 = java.util.Locale.getDefault();
        r12 = "h:mm aa";
        r0.<init>(r12, r6);
        r6 = 2131756358; // 0x7f100546 float:1.9143621E38 double:1.053227582E-314;
        r23 = r38.a();
        r12 = java.lang.Long.valueOf(r23);
        r0 = r0.format(r12);
        r1.setTextViewText(r6, r0);
    L_0x030c:
        r0 = -1;
        r7 = r7 + r0;
        r0 = 1;
        if (r7 == r0) goto L_0x0324;
    L_0x0311:
        r0 = 2;
        if (r7 == r0) goto L_0x0324;
    L_0x0314:
        r0 = 3;
        if (r7 == r0) goto L_0x0324;
    L_0x0317:
        r0 = 4;
        if (r7 == r0) goto L_0x0324;
    L_0x031a:
        r0 = 10;
        if (r7 == r0) goto L_0x0324;
    L_0x031e:
        r0 = 11;
        if (r7 == r0) goto L_0x0324;
    L_0x0322:
        r0 = 2;
        goto L_0x034d;
    L_0x0324:
        r0 = 1;
        if (r7 == r0) goto L_0x0333;
    L_0x0327:
        r0 = 2;
        if (r7 == r0) goto L_0x0333;
    L_0x032a:
        r0 = 10;
        if (r7 == r0) goto L_0x0333;
    L_0x032e:
        r0 = 11;
        if (r7 == r0) goto L_0x0333;
    L_0x0332:
        goto L_0x0342;
    L_0x0333:
        r0 = 2131756355; // 0x7f100543 float:1.9143615E38 double:1.0532275803E-314;
        r6 = 2131559452; // 0x7f0d041c float:1.8744248E38 double:1.0531302973E-314;
        r7 = r15.getColor(r6);
        r6 = "setColorFilter";
        r1.setInt(r0, r6, r7);
    L_0x0342:
        r0 = 2131756361; // 0x7f100549 float:1.9143627E38 double:1.0532275833E-314;
        r5 = r15.getString(r5);
        r1.setTextViewText(r0, r5);
        goto L_0x0322;
    L_0x034d:
        if (r14 != r0) goto L_0x0373;
    L_0x034f:
        r0 = 2131559551; // 0x7f0d047f float:1.874445E38 double:1.053130346E-314;
        r0 = r15.getColor(r0);
        r5 = 2131756357; // 0x7f100545 float:1.914362E38 double:1.0532275813E-314;
        r1.setTextColor(r5, r0);
        r0 = 2131756358; // 0x7f100546 float:1.9143621E38 double:1.053227582E-314;
        r5 = 2131559550; // 0x7f0d047e float:1.8744447E38 double:1.0531303457E-314;
        r5 = r15.getColor(r5);
        r1.setTextColor(r0, r5);
        r0 = 2131559550; // 0x7f0d047e float:1.8744447E38 double:1.0531303457E-314;
        r0 = r15.getColor(r0);
        r1.setTextColor(r3, r0);
    L_0x0373:
        r5 = 0;
        r0 = 2131756364; // 0x7f10054c float:1.9143633E38 double:1.053227585E-314;
        r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r3 == 0) goto L_0x038a;
    L_0x037c:
        r3 = 0;
        r1.setViewVisibility(r0, r3);
        r3 = android.text.format.DateUtils.formatElapsedTime(r9);
        r1.setTextViewText(r0, r3);
        r3 = 8;
        goto L_0x038f;
    L_0x038a:
        r3 = 8;
        r1.setViewVisibility(r0, r3);
    L_0x038f:
        r0 = 2131756365; // 0x7f10054d float:1.9143635E38 double:1.0532275852E-314;
        if (r2 == 0) goto L_0x0396;
    L_0x0394:
        r3 = 0;
        goto L_0x039c;
    L_0x0396:
        if (r8 != 0) goto L_0x0394;
    L_0x0398:
        r1.setViewVisibility(r0, r3);
        goto L_0x03b6;
    L_0x039c:
        r1.setViewVisibility(r0, r3);
        if (r2 == 0) goto L_0x03ac;
    L_0x03a1:
        r2 = 2131952200; // 0x7f130248 float:1.9540836E38 double:1.0533243406E-314;
        r2 = r15.getString(r2);
        r1.setTextViewText(r0, r2);
        goto L_0x03b6;
    L_0x03ac:
        r2 = 2131952201; // 0x7f130249 float:1.9540838E38 double:1.053324341E-314;
        r2 = r15.getString(r2);
        r1.setTextViewText(r0, r2);
    L_0x03b6:
        r0 = r11.A;
        r0.contentView = r1;
        goto L_0x04cc;
    L_0x03bc:
        r21 = r0;
        r22 = r1;
        r20 = r15;
        goto L_0x04cc;
    L_0x03c4:
        r21 = r0;
        r22 = r1;
        r20 = r15;
        r0 = defpackage.afxv.d(r29);
        if (r0 == 0) goto L_0x04cc;
    L_0x03d0:
        r0 = defpackage.afxv.d(r29);
        r1 = new android.widget.RemoteViews;
        r2 = r28.getPackageName();
        r3 = 2131035014; // 0x7f050386 float:1.7680562E38 double:1.0528711905E-314;
        r1.<init>(r2, r3);
        r2 = r29;
        r3 = r2.d;
        if (r3 != 0) goto L_0x03e8;
    L_0x03e6:
        r3 = defpackage.aour.t;
    L_0x03e8:
        r3 = r3.a;
        r5 = 8;
        r3 = r3 & r5;
        if (r3 != 0) goto L_0x03f1;
    L_0x03ef:
        r3 = 0;
        goto L_0x03fd;
    L_0x03f1:
        r3 = r2.d;
        if (r3 != 0) goto L_0x03f7;
    L_0x03f5:
        r3 = defpackage.aour.t;
    L_0x03f7:
        r3 = r3.e;
        if (r3 != 0) goto L_0x03fd;
    L_0x03fb:
        r3 = defpackage.arml.f;
    L_0x03fd:
        r3 = defpackage.ajqy.a(r3);
        r5 = 2131756357; // 0x7f100545 float:1.914362E38 double:1.0532275813E-314;
        r1.setTextViewText(r5, r3);
        r3 = 0;
    L_0x0408:
        r5 = r0.a;
        r5 = r5.size();
        if (r3 >= r5) goto L_0x04c5;
    L_0x0410:
        r5 = r0.a;
        r5 = r5.get(r3);
        r5 = (defpackage.axak) r5;
        r6 = a;
        r7 = 0;
        r6 = r6.get(r3, r7);
        r8 = b;
        r8 = r8.get(r3, r7);
        if (r6 == 0) goto L_0x04bd;
    L_0x0427:
        r7 = com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.iconSurveyOptionRenderer;
        r7 = defpackage.anxl.checkIsLite(r7);
        r5.a(r7);
        r5 = r5.h;
        r9 = r7.d;
        r5 = r5.b(r9);
        if (r5 != 0) goto L_0x043d;
    L_0x043a:
        r5 = r7.b;
        goto L_0x0441;
    L_0x043d:
        r5 = r7.a(r5);
    L_0x0441:
        r5 = (com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer) r5;
        r7 = r5.b;
        if (r7 != 0) goto L_0x0449;
    L_0x0447:
        r7 = defpackage.arwf.c;
    L_0x0449:
        r7 = r7.b;
        r7 = defpackage.arwh.a(r7);
        if (r7 != 0) goto L_0x0453;
    L_0x0451:
        r7 = defpackage.arwh.UNKNOWN;
    L_0x0453:
        r9 = r7;
        r7 = r35;
        r9 = r7.a(r9);
        r1.setImageViewResource(r6, r9);
        r6 = r5.a;
        r9 = r6 & 4;
        if (r9 != 0) goto L_0x046a;
    L_0x0463:
        r9 = r6 & 2;
        if (r9 != 0) goto L_0x046a;
    L_0x0467:
        r5 = r28;
        goto L_0x04c1;
    L_0x046a:
        r6 = r6 & 2;
        if (r6 != 0) goto L_0x0471;
    L_0x046e:
        r6 = r31;
        goto L_0x0473;
    L_0x0471:
        r6 = r30;
    L_0x0473:
        r9 = new android.content.Intent;
        r9.<init>(r6);
        r6 = r2.d;
        if (r6 != 0) goto L_0x047e;
    L_0x047c:
        r6 = defpackage.aour.t;
    L_0x047e:
        r10 = r6.b;
        r6 = r6.c;
        defpackage.afxv.a(r9, r10, r6);
        r6 = r5.c;
        if (r6 != 0) goto L_0x048b;
    L_0x0489:
        r6 = defpackage.apxu.d;
    L_0x048b:
        r10 = 0;
        r14 = 0;
        defpackage.afxv.a(r6, r9, r14, r10);
        r6 = r5.d;
        if (r6 != 0) goto L_0x0496;
    L_0x0494:
        r6 = defpackage.apxu.d;
    L_0x0496:
        defpackage.afxv.b(r6, r9);
        r6 = r2.n;
        if (r6 != 0) goto L_0x049f;
    L_0x049d:
        r6 = defpackage.aofq.i;
    L_0x049f:
        defpackage.afxv.a(r6, r9);
        r5 = r5.a;
        r6 = 2;
        r5 = r5 & r6;
        if (r5 != 0) goto L_0x04af;
    L_0x04a8:
        r5 = r28;
        r6 = defpackage.afxv.d(r5, r9);
        goto L_0x04b5;
    L_0x04af:
        r5 = r28;
        r6 = defpackage.afxv.c(r5, r9);
    L_0x04b5:
        r1.setOnClickPendingIntent(r8, r6);
        r6 = 0;
        r1.setViewVisibility(r8, r6);
        goto L_0x04c1;
    L_0x04bd:
        r5 = r28;
        r7 = r35;
    L_0x04c1:
        r3 = r3 + 1;
        goto L_0x0408;
    L_0x04c5:
        r5 = r28;
        r7 = r35;
        r11.w = r1;
        goto L_0x04d2;
    L_0x04cc:
        r5 = r28;
        r2 = r29;
        r7 = r35;
    L_0x04d2:
        if (r22 == 0) goto L_0x053f;
    L_0x04d4:
        r0 = 17104901; // 0x1050005 float:2.4428256E-38 double:8.450944E-317;
        r1 = r21;
        r0 = r1.getDimension(r0);
        r0 = (int) r0;
        r3 = 17104902; // 0x1050006 float:2.442826E-38 double:8.4509445E-317;
        r1 = r1.getDimension(r3);
        r1 = (int) r1;
        r3 = r2.o;
        r15 = defpackage.aouw.a(r3);
        if (r15 == 0) goto L_0x04f0;
    L_0x04ee:
        r3 = -1;
        goto L_0x04f2;
    L_0x04f0:
        r3 = -1;
        r15 = 1;
    L_0x04f2:
        r15 = r15 + r3;
        r6 = 2;
        if (r15 == r6) goto L_0x04fe;
    L_0x04f6:
        r8 = r22;
        r9 = 1;
        r0 = android.graphics.Bitmap.createScaledBitmap(r8, r0, r1, r9);
        goto L_0x053b;
    L_0x04fe:
        r8 = r22;
        r0 = r8.getWidth();
        r1 = r8.getHeight();
        if (r0 < r1) goto L_0x0523;
    L_0x050a:
        r0 = r8.getWidth();
        r0 = r0 / r6;
        r1 = r8.getHeight();
        r1 = r1 / r6;
        r0 = r0 - r1;
        r1 = r8.getHeight();
        r9 = r8.getHeight();
        r10 = 0;
        r0 = android.graphics.Bitmap.createBitmap(r8, r0, r10, r1, r9);
        goto L_0x053b;
    L_0x0523:
        r10 = 0;
        r0 = r8.getHeight();
        r0 = r0 / r6;
        r1 = r8.getWidth();
        r1 = r1 / r6;
        r0 = r0 - r1;
        r1 = r8.getWidth();
        r6 = r8.getWidth();
        r0 = android.graphics.Bitmap.createBitmap(r8, r10, r0, r1, r6);
    L_0x053b:
        r11.a(r0);
        goto L_0x054b;
    L_0x053f:
        r0 = r33;
        r1 = r21;
        r3 = -1;
        r0 = android.graphics.BitmapFactory.decodeResource(r1, r0);
        r11.a(r0);
    L_0x054b:
        if (r27 == 0) goto L_0x058e;
    L_0x054d:
        r0 = r20;
        r1 = r27;
        r0 = r0.get(r1);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x058e;
    L_0x0559:
        r1 = new qe;
        r1.<init>();
        r1.a = r0;
        r0 = r13.a;
        r6 = 8;
        r0 = r0 & r6;
        if (r0 == 0) goto L_0x056e;
    L_0x0567:
        r0 = r13.e;
        if (r0 != 0) goto L_0x056f;
    L_0x056b:
        r0 = defpackage.arml.f;
        goto L_0x056f;
    L_0x056e:
        r0 = 0;
    L_0x056f:
        r0 = defpackage.ajqy.a(r0);
        r1.a(r0);
        r0 = r13.a;
        r0 = r0 & 16;
        if (r0 == 0) goto L_0x0583;
    L_0x057c:
        r0 = r13.f;
        if (r0 != 0) goto L_0x0584;
    L_0x0580:
        r0 = defpackage.arml.f;
        goto L_0x0584;
    L_0x0583:
        r0 = 0;
    L_0x0584:
        r0 = defpackage.ajqy.a(r0);
        r1.b(r0);
        r11.a(r1);
    L_0x058e:
        r0 = r2.d;
        if (r0 != 0) goto L_0x0594;
    L_0x0592:
        r0 = defpackage.aour.t;
    L_0x0594:
        r0 = r0.j;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x05a0;
    L_0x059c:
        r4 = r30;
        r1 = 0;
        goto L_0x0604;
    L_0x05a0:
        r0 = r2.a;
        r0 = r0 & 2048;
        if (r0 != 0) goto L_0x05a7;
    L_0x05a6:
        goto L_0x059c;
    L_0x05a7:
        r0 = r28.getResources();
        r1 = new qg;
        r1.<init>(r5);
        r6 = 1;
        r1.b(r6);
        r1.a(r4);
        r4 = r2.d;
        if (r4 != 0) goto L_0x05bd;
    L_0x05bb:
        r4 = defpackage.aour.t;
    L_0x05bd:
        r4 = r4.j;
        r1.o = r4;
        r1.p = r6;
        r4 = 2131559452; // 0x7f0d041c float:1.8744248E38 double:1.0531302973E-314;
        r0 = r0.getColor(r4);
        r1.t = r0;
        r0 = r2.q;
        if (r0 != 0) goto L_0x05d2;
    L_0x05d0:
        r0 = defpackage.aouu.e;
    L_0x05d2:
        r0 = r0.a;
        r4 = 4;
        r0 = r0 & r4;
        if (r0 != 0) goto L_0x05dd;
    L_0x05d8:
        r4 = r30;
        r0 = 0;
        r9 = 0;
        goto L_0x05f5;
    L_0x05dd:
        r0 = new android.content.Intent;
        r4 = r30;
        r0.<init>(r4);
        r6 = r2.q;
        if (r6 != 0) goto L_0x05ea;
    L_0x05e8:
        r6 = defpackage.aouu.e;
    L_0x05ea:
        r6 = r6.d;
        if (r6 != 0) goto L_0x05f0;
    L_0x05ee:
        r6 = defpackage.apxu.d;
    L_0x05f0:
        r8 = 0;
        r9 = 0;
        defpackage.afxv.a(r6, r0, r9, r8);
    L_0x05f5:
        if (r0 != 0) goto L_0x05fb;
    L_0x05f7:
        r0 = defpackage.afxv.a(r2, r4, r9, r9);
    L_0x05fb:
        r0 = defpackage.afxv.c(r5, r0);
        r1.f = r0;
        defpackage.afxv.a(r2, r5, r1);
    L_0x0604:
        if (r1 == 0) goto L_0x060b;
    L_0x0606:
        r0 = r1.e();
        goto L_0x060c;
    L_0x060b:
        r0 = 0;
    L_0x060c:
        r1 = r2.a;
        r1 = r1 & 2048;
        if (r1 == 0) goto L_0x0624;
    L_0x0612:
        r1 = r2.q;
        if (r1 != 0) goto L_0x0618;
    L_0x0616:
        r1 = defpackage.aouu.e;
    L_0x0618:
        r14 = r1.c;
        r1 = r2.q;
        if (r1 != 0) goto L_0x0620;
    L_0x061e:
        r1 = defpackage.aouu.e;
    L_0x0620:
        r1 = r1.b;
        r3 = r14;
        goto L_0x0625;
    L_0x0624:
        r1 = 0;
    L_0x0625:
        r6 = r2.d;
        if (r6 != 0) goto L_0x062b;
    L_0x0629:
        r6 = defpackage.aour.t;
    L_0x062b:
        r8 = r6.a;
        r9 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r8 = r8 & r9;
        if (r8 == 0) goto L_0x0636;
    L_0x0632:
        r8 = r6.q;
        r11.r = r8;
    L_0x0636:
        r8 = r2.m;
        r8 = r8.size();
        if (r8 <= 0) goto L_0x066d;
    L_0x063e:
        r8 = r2.m;
        r9 = r8 instanceof defpackage.anhf;
        if (r9 != 0) goto L_0x0662;
    L_0x0644:
        r8 = r8.toArray();
        r9 = r8.length;
        r10 = new long[r9];
        r13 = 0;
    L_0x064c:
        if (r13 >= r9) goto L_0x065f;
    L_0x064e:
        r14 = r8[r13];
        r14 = defpackage.amqw.a(r14);
        r14 = (java.lang.Number) r14;
        r14 = r14.longValue();
        r10[r13] = r14;
        r13 = r13 + 1;
        goto L_0x064c;
    L_0x065f:
        r14 = 0;
        r15 = 0;
        goto L_0x0668;
    L_0x0662:
        r14 = 0;
        r15 = 0;
        r10 = java.util.Arrays.copyOfRange(r14, r15, r15);
    L_0x0668:
        r8 = r11.A;
        r8.vibrate = r10;
        goto L_0x066f;
    L_0x066d:
        r14 = 0;
        r15 = 0;
    L_0x066f:
        r8 = r2.j;
        r8 = r8.size();
        if (r8 == 0) goto L_0x0796;
    L_0x0677:
        r8 = r2.j;
        r8 = r8.iterator();
        r9 = 0;
    L_0x067e:
        r10 = r8.hasNext();
        if (r10 == 0) goto L_0x0796;
    L_0x0684:
        r10 = r8.next();
        r10 = (defpackage.aouy) r10;
        if (r10 != 0) goto L_0x068d;
    L_0x068c:
        goto L_0x067e;
    L_0x068d:
        r13 = r10.a;
        r16 = r13 & 4;
        if (r16 != 0) goto L_0x069d;
    L_0x0693:
        r13 = r13 & 16;
        if (r13 != 0) goto L_0x069d;
    L_0x0697:
        r10 = "No endpoint for action.";
        defpackage.xtl.e(r10);
        goto L_0x067e;
    L_0x069d:
        if (r16 == 0) goto L_0x06a3;
    L_0x069f:
        r13 = 1;
        r19 = 1;
        goto L_0x06a6;
    L_0x06a3:
        r13 = 1;
        r19 = 0;
    L_0x06a6:
        r17 = r19 ^ 1;
        if (r16 == 0) goto L_0x06ac;
    L_0x06aa:
        r13 = r4;
        goto L_0x06ae;
    L_0x06ac:
        r13 = r31;
    L_0x06ae:
        r12 = new android.content.Intent;
        r12.<init>(r13);
        r13 = r2.d;
        if (r13 != 0) goto L_0x06b9;
    L_0x06b7:
        r13 = defpackage.aour.t;
    L_0x06b9:
        r14 = r13.b;
        r13 = r13.c;
        defpackage.afxv.a(r12, r14, r13);
        r13 = r10.d;
        if (r13 != 0) goto L_0x06c6;
    L_0x06c4:
        r13 = defpackage.apxu.d;
    L_0x06c6:
        r14 = r2.a;
        r18 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r14 = r14 & r18;
        if (r14 == 0) goto L_0x06d2;
    L_0x06ce:
        r14 = r41;
        r15 = 1;
        goto L_0x06d4;
    L_0x06d2:
        r14 = r41;
    L_0x06d4:
        defpackage.afxv.a(r13, r12, r14, r15);
        r13 = r10.e;
        if (r13 != 0) goto L_0x06dd;
    L_0x06db:
        r13 = defpackage.apxu.d;
    L_0x06dd:
        defpackage.afxv.a(r13, r12);
        r13 = r10.f;
        if (r13 != 0) goto L_0x06e6;
    L_0x06e4:
        r13 = defpackage.apxu.d;
    L_0x06e6:
        defpackage.afxv.b(r13, r12);
        r13 = r2.n;
        if (r13 != 0) goto L_0x06ef;
    L_0x06ed:
        r13 = defpackage.aofq.i;
    L_0x06ef:
        defpackage.afxv.a(r13, r12);
        r13 = defpackage.afxh.a;
        r13 = r13.length;
        if (r9 >= r13) goto L_0x0701;
    L_0x06f7:
        r13 = defpackage.afxh.a;
        r13 = r13[r9];
        r15 = r40;
        defpackage.afxv.a(r13, r12, r15);
        goto L_0x0703;
    L_0x0701:
        r15 = r40;
    L_0x0703:
        if (r17 == 0) goto L_0x0716;
    L_0x0705:
        r13 = r10.h;
        if (r13 != 0) goto L_0x070b;
    L_0x0709:
        r13 = defpackage.auko.f;
    L_0x070b:
        if (r13 == 0) goto L_0x0716;
    L_0x070d:
        r13 = r13.toByteArray();
        r4 = "logging_directive";
        r12.putExtra(r4, r13);
    L_0x0716:
        r4 = r2.a;
        r13 = r4 & 2048;
        if (r13 == 0) goto L_0x0747;
    L_0x071c:
        r4 = r4 & 1;
        if (r4 == 0) goto L_0x0747;
    L_0x0720:
        r4 = r2.q;
        if (r4 != 0) goto L_0x0726;
    L_0x0724:
        r4 = defpackage.aouu.e;
    L_0x0726:
        r4 = r4.b;
        r13 = "group_summary_tag";
        r12.putExtra(r13, r4);
        r4 = r2.q;
        if (r4 != 0) goto L_0x0733;
    L_0x0731:
        r4 = defpackage.aouu.e;
    L_0x0733:
        r4 = r4.c;
        r13 = "group_summary_id";
        r12.putExtra(r13, r4);
        r4 = r2.d;
        if (r4 != 0) goto L_0x0740;
    L_0x073e:
        r4 = defpackage.aour.t;
    L_0x0740:
        r4 = r4.j;
        r13 = "group_summary_key";
        r12.putExtra(r13, r4);
    L_0x0747:
        if (r17 == 0) goto L_0x074e;
    L_0x0749:
        r4 = defpackage.afxv.d(r5, r12);
        goto L_0x0752;
    L_0x074e:
        r4 = defpackage.afxv.c(r5, r12);
    L_0x0752:
        r12 = new qc;
        r13 = r10.a;
        r17 = 1;
        r13 = r13 & 1;
        if (r13 == 0) goto L_0x0771;
    L_0x075c:
        r13 = r10.b;
        if (r13 != 0) goto L_0x0762;
    L_0x0760:
        r13 = defpackage.arwf.c;
    L_0x0762:
        r13 = r13.b;
        r13 = defpackage.arwh.a(r13);
        if (r13 != 0) goto L_0x076c;
    L_0x076a:
        r13 = defpackage.arwh.UNKNOWN;
    L_0x076c:
        r13 = r7.a(r13);
        goto L_0x0772;
    L_0x0771:
        r13 = 0;
    L_0x0772:
        r7 = r10.a;
        r19 = 2;
        r7 = r7 & 2;
        if (r7 == 0) goto L_0x0781;
    L_0x077a:
        r7 = r10.c;
        if (r7 != 0) goto L_0x0782;
    L_0x077e:
        r7 = defpackage.arml.f;
        goto L_0x0782;
    L_0x0781:
        r7 = 0;
    L_0x0782:
        r7 = defpackage.ajqy.a(r7);
        r12.<init>(r13, r7, r4);
        r11.a(r12);
        r9 = r9 + 1;
        r4 = r30;
        r7 = r35;
        r14 = 0;
        r15 = 0;
        goto L_0x067e;
    L_0x0796:
        r15 = r40;
        r4 = r2.h;
        if (r4 != 0) goto L_0x079e;
    L_0x079c:
        r4 = defpackage.apxu.d;
    L_0x079e:
        r7 = com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint;
        r7 = defpackage.anxl.checkIsLite(r7);
        r4.a(r7);
        r4 = r4.h;
        r7 = r7.d;
        r4 = r4.a(r7);
        if (r4 == 0) goto L_0x07d4;
    L_0x07b1:
        r4 = new android.content.Intent;
        r7 = r31;
        r4.<init>(r7);
        r7 = r2.h;
        if (r7 != 0) goto L_0x07be;
    L_0x07bc:
        r7 = defpackage.apxu.d;
    L_0x07be:
        r7 = r7.toByteArray();
        r8 = "record_interactions_endpoint";
        r4.putExtra(r8, r7);
        r7 = "DISMISSED";
        defpackage.afxv.a(r7, r4, r15);
        r4 = defpackage.afxv.d(r5, r4);
        r11.a(r4);
        goto L_0x07d9;
    L_0x07d4:
        r4 = "Notification dismissalTrackingEndpoint was not set or did not contain a RecordNotificationInteractionsEndpoint.";
        defpackage.xtl.d(r4);
    L_0x07d9:
        r4 = new afxv;
        r5 = r6.b;
        r7 = r6.c;
        r8 = r11.e();
        r6 = r6.s;
        r2 = r2.t;
        if (r2 != 0) goto L_0x07eb;
    L_0x07e9:
        r2 = defpackage.auko.f;
    L_0x07eb:
        r28 = r4;
        r29 = r5;
        r30 = r7;
        r31 = r8;
        r32 = r6;
        r33 = r0;
        r34 = r1;
        r35 = r3;
        r36 = r2;
        r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxv.a(android.content.Context, aouo, android.content.Intent, android.content.Intent, int, int, int, akvp, android.content.SharedPreferences, akkq, xsc, bcaa, avmc, acvx):afxv");
    }

    public static afxv a(Context context, String str, int i, axub axub, int i2) {
        arml arml = null;
        if (axub == null || (axub.a & 1) == 0) {
            return null;
        }
        arml arml2;
        qg qgVar = new qg(context);
        if ((axub.a & 2) != 0) {
            arml2 = axub.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        qgVar.a(ajqy.a(arml2));
        qgVar.a(i2);
        if ((axub.a & 1) != 0) {
            arml = axub.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        qgVar.b(ajqy.a(arml));
        return new afxv(str, i, qgVar.e(), 0, null, null, -1, null);
    }

    public static void a(Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        int length = activeNotifications.length - i;
        if (length > 0) {
            Arrays.sort(activeNotifications, afxy.a);
            for (i = 0; i < length; i++) {
                StatusBarNotification statusBarNotification = activeNotifications[i];
                notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
            }
        }
    }

    public static void b(Context context, Intent intent) {
        if (context != null) {
            String str = "group_summary_tag";
            if (intent.hasExtra(str)) {
                String str2 = "group_summary_id";
                if (intent.hasExtra(str2)) {
                    String str3 = "group_summary_key";
                    if (intent.hasExtra(str3)) {
                        String str4 = "";
                        str3 = intent.getExtras().getString(str3, str4);
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                        int length = activeNotifications.length;
                        int i = 0;
                        while (i < length) {
                            StatusBarNotification statusBarNotification = activeNotifications[i];
                            if (!TextUtils.equals(statusBarNotification.getNotification().getGroup(), str3) || (statusBarNotification.getNotification().flags & 512) != 0) {
                                i++;
                            } else {
                                return;
                            }
                        }
                        notificationManager.cancel(intent.getExtras().getString(str, str4), (intent.hasExtra(str2) ? Integer.valueOf(intent.getExtras().getInt(str2)) : null).intValue());
                    }
                }
            }
        }
    }

    private static void a(aouo aouo, Context context, qg qgVar) {
        if (VERSION.SDK_INT >= 26) {
            aour aour;
            aour aour2 = aouo.d;
            if (aour2 == null) {
                aour2 = aour.t;
            }
            int a = avkq.a(aour2.r);
            if (!(a == 0 || a == 1)) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                aour2 = aouo.d;
                if (aour2 == null) {
                    aour2 = aour.t;
                }
                a = avkq.a(aour2.r);
                if (a == 0) {
                    a = 1;
                }
                String num = Integer.toString(a - 1);
                if (notificationManager.getNotificationChannel(num) != null) {
                    qgVar.x = num;
                    aour = aouo.d;
                    if (aour == null) {
                        aour = aour.t;
                    }
                    if (aour.p) {
                        qgVar.d();
                    }
                    return;
                }
            }
            xlr.a(qgVar);
            aour = aouo.d;
            if (aour == null) {
                aour = aour.t;
            }
            if (!aour.m) {
                qgVar.d();
            }
        }
    }

    private static AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer c(aouo aouo) {
        if ((aouo.a & 8192) == 0) {
            return null;
        }
        anxp anxp = aouo.s;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer) b;
    }

    private static AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer d(aouo aouo) {
        if ((aouo.a & 8192) == 0) {
            return null;
        }
        anxp anxp = aouo.s;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.notificationSurveyCustomStyleRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer) b;
    }

    private static Intent a(aouo aouo, Intent intent, avmc avmc, acvx acvx) {
        Intent intent2 = new Intent(intent);
        apxu apxu = aouo.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        afxv.a(apxu, intent2, acvx, (aouo.a & 131072) != 0);
        apxu = aouo.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        afxv.b(apxu, intent2);
        afxv.a("CLICKED", intent2, avmc);
        apxu = aouo.g;
        if (apxu == null) {
            apxu = apxu.d;
        }
        afxv.a(apxu, intent2);
        aofq aofq = aouo.n;
        if (aofq == null) {
            aofq = aofq.i;
        }
        afxv.a(aofq, intent2);
        aypp aypp = aouo.p;
        if (aypp == null) {
            aypp = aypp.c;
        }
        if (aypp != null && aypp.b > 0) {
            intent2.putExtra("com.google.android.apps.youtube.unplugged.unplugged_notification_params_extra", aypp.toByteArray());
        }
        return intent2;
    }

    private static int a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 1:
                    return R.layout.custom_notification_large_thumbnail_end;
                case 2:
                    return R.layout.custom_notification_medium_thumbnail_end;
                case 3:
                    return R.layout.custom_notification_large_thumbnail_end_gray;
                case 4:
                    return R.layout.custom_notification_medium_thumbnail_end_gray;
                case 7:
                    return R.layout.custom_notification_basic_thumbnail_start;
                case 8:
                    return R.layout.custom_notification_basic_thumbnail_start_multiline_title;
                case 9:
                    return R.layout.custom_notification_basic_thumbnail_start_multiline_text;
                case 10:
                    return R.layout.custom_notification_large_thumbnail_end_multiline_title;
                case 11:
                    return R.layout.custom_notification_large_thumbnail_end_multiline_text;
                default:
                    return 0;
            }
        }
        throw null;
    }
}
