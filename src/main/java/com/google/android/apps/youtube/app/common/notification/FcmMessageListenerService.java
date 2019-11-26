package com.google.android.apps.youtube.app.common.notification;

import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.bapu;
import defpackage.bcaa;
import defpackage.ejg;
import defpackage.xse;
import defpackage.zzl;

public class FcmMessageListenerService extends FirebaseMessagingService {
    public zzl a;
    public bapu b;
    public bcaa c;

    public final void onCreate() {
        super.onCreate();
        ((ejg) xse.a(getApplication())).a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d9 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A:{Splitter:B:34:0x00d2, ExcHandler: anyg (r2_4 'e' java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:36:0x00d7, code skipped:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:42:0x00ef, code skipped:
            defpackage.xtl.b(r0, r2);
     */
    /* JADX WARNING: Missing block: B:83:0x0199, code skipped:
            if (r4.equals(r3.b) == false) goto L_0x019b;
     */
    public final void a(defpackage.anqt r11) {
        /*
        r10 = this;
        r0 = "Could not convert base64-encoded byte stream into PushNotificationSupportedRenderers proto: ";
        r1 = r10.getApplication();
        r2 = r10.c;
        r3 = r10.a;
        r4 = "GCM_DATA_RECEIVED";
        defpackage.afxh.a(r2, r4, r3);
        r2 = new android.os.Bundle;
        r2.<init>();
        r3 = r11.b;
        r4 = "from";
        if (r3 != 0) goto L_0x006f;
    L_0x001a:
        r3 = new zj;
        r3.<init>();
        r11.b = r3;
        r3 = r11.a;
        r3 = r3.keySet();
        r3 = r3.iterator();
    L_0x002b:
        r5 = r3.hasNext();
        if (r5 == 0) goto L_0x006f;
    L_0x0031:
        r5 = r3.next();
        r5 = (java.lang.String) r5;
        r6 = r11.a;
        r6 = r6.get(r5);
        r7 = r6 instanceof java.lang.String;
        if (r7 == 0) goto L_0x002b;
    L_0x0041:
        r6 = (java.lang.String) r6;
        r7 = "google.";
        r7 = r5.startsWith(r7);
        if (r7 != 0) goto L_0x002b;
    L_0x004b:
        r7 = "gcm.";
        r7 = r5.startsWith(r7);
        if (r7 != 0) goto L_0x002b;
    L_0x0053:
        r7 = r5.equals(r4);
        if (r7 != 0) goto L_0x002b;
    L_0x0059:
        r7 = "message_type";
        r7 = r5.equals(r7);
        if (r7 != 0) goto L_0x002b;
    L_0x0061:
        r7 = "collapse_key";
        r7 = r5.equals(r7);
        if (r7 != 0) goto L_0x002b;
    L_0x0069:
        r7 = r11.b;
        r7.put(r5, r6);
        goto L_0x002b;
    L_0x006f:
        r3 = r11.b;
        r3 = r3.entrySet();
        r3 = r3.iterator();
    L_0x0079:
        r5 = r3.hasNext();
        if (r5 == 0) goto L_0x0095;
    L_0x007f:
        r5 = r3.next();
        r5 = (java.util.Map.Entry) r5;
        r6 = r5.getKey();
        r6 = (java.lang.String) r6;
        r5 = r5.getValue();
        r5 = (java.lang.String) r5;
        r2.putString(r6, r5);
        goto L_0x0079;
    L_0x0095:
        r11 = r11.a;
        r11 = r11.getString(r4);
        if (r11 == 0) goto L_0x00a0;
    L_0x009d:
        r2.putString(r4, r11);
    L_0x00a0:
        r11 = r10.b;
        r11 = r11.get();
        r11 = (defpackage.ejl) r11;
        r3 = r2.getString(r4);
        r4 = android.text.TextUtils.isEmpty(r3);
        r5 = 0;
        if (r4 != 0) goto L_0x00c2;
    L_0x00b3:
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 != 0) goto L_0x00c2;
    L_0x00b9:
        r4 = "/topic";
        r4 = r3.startsWith(r4);
        if (r4 == 0) goto L_0x00c2;
    L_0x00c1:
        goto L_0x00c3;
    L_0x00c2:
        r3 = r5;
    L_0x00c3:
        r4 = "r";
        r2 = r2.getString(r4);
        r4 = android.text.TextUtils.isEmpty(r2);
        r6 = 8;
        r7 = 0;
        if (r4 != 0) goto L_0x00f2;
    L_0x00d2:
        r2 = android.util.Base64.decode(r2, r7);	 Catch:{ IllegalArgumentException -> 0x00d9, anyg -> 0x00d7 }
        goto L_0x00dd;
    L_0x00d7:
        r2 = move-exception;
        goto L_0x00ef;
    L_0x00d9:
        r2 = android.util.Base64.decode(r2, r6);	 Catch:{ anyg -> 0x00d7, IllegalArgumentException -> 0x00ea }
    L_0x00dd:
        r4 = defpackage.anxa.c();	 Catch:{ anyg -> 0x00d7, IllegalArgumentException -> 0x00ea }
        r8 = defpackage.awtj.c;	 Catch:{ anyg -> 0x00d7, IllegalArgumentException -> 0x00ea }
        r2 = defpackage.anxl.parseFrom(r8, r2, r4);	 Catch:{ anyg -> 0x00d7, IllegalArgumentException -> 0x00ea }
        r2 = (defpackage.awtj) r2;	 Catch:{ anyg -> 0x00d7, IllegalArgumentException -> 0x00ea }
        goto L_0x00f3;
    L_0x00ea:
        r2 = move-exception;
        defpackage.xtl.b(r0, r2);
        goto L_0x00f2;
    L_0x00ef:
        defpackage.xtl.b(r0, r2);
    L_0x00f2:
        r2 = r5;
    L_0x00f3:
        r0 = 109268428; // 0x6834dcc float:4.9391035E-35 double:5.39857764E-316;
        if (r2 == 0) goto L_0x0112;
    L_0x00f8:
        r4 = r2.a;
        if (r4 != r0) goto L_0x0112;
    L_0x00fc:
        r4 = r2.b;
        r4 = (defpackage.atuv) r4;
        r4 = r4.b;
        if (r4 != 0) goto L_0x0106;
    L_0x0104:
        r4 = defpackage.atup.d;
    L_0x0106:
        r8 = r4.a;
        r8 = r8 & 2;
        if (r8 == 0) goto L_0x0112;
    L_0x010c:
        r5 = r4.c;
        if (r5 != 0) goto L_0x0112;
    L_0x0110:
        r5 = defpackage.atur.c;
    L_0x0112:
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 != 0) goto L_0x0128;
    L_0x0118:
        r0 = r11.f;
        r1 = r11.g;
        r2 = "GCM_TOPIC_RECEIVED";
        defpackage.afxh.a(r0, r2, r1);
        r11 = r11.b;
        r11.a(r3, r5);
        goto L_0x02f2;
    L_0x0128:
        if (r2 == 0) goto L_0x02f2;
    L_0x012a:
        r3 = r2.a;
        r4 = "RECEIVED";
        r5 = 77819057; // 0x4a36cb1 float:3.8420933E-36 double:3.84477227E-316;
        r8 = 1;
        if (r3 != r5) goto L_0x02ac;
    L_0x0134:
        r0 = r11.f;
        r3 = r11.g;
        defpackage.afxh.b(r0, r4, r3);
        r0 = r2.a;
        if (r0 != r5) goto L_0x0144;
    L_0x013f:
        r0 = r2.b;
        r0 = (defpackage.aouo) r0;
        goto L_0x0146;
    L_0x0144:
        r0 = defpackage.aouo.u;
    L_0x0146:
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.aouv) r0;
        r3 = r0.instance;
        r3 = (defpackage.aouo) r3;
        r4 = r3.a;
        r4 = r4 & 64;
        if (r4 != 0) goto L_0x016b;
    L_0x0158:
        r3 = r11.a;
        r3 = r3.a();
        if (r3 == 0) goto L_0x01b0;
    L_0x0160:
        r1 = r11.f;
        r11 = r11.g;
        r3 = "FAIL_NO_IDENTITY";
        defpackage.afxh.b(r1, r3, r11);
        goto L_0x028f;
    L_0x016b:
        r4 = r11.a;
        r3 = r3.n;
        if (r3 != 0) goto L_0x0173;
    L_0x0171:
        r3 = defpackage.aofq.i;
    L_0x0173:
        defpackage.amqw.a(r4);
        defpackage.amqw.a(r3);
        r9 = r3.c;
        if (r9 != 0) goto L_0x017f;
    L_0x017d:
        r9 = defpackage.aofu.c;
    L_0x017f:
        r9 = r9.a;
        r9 = r9 & r8;
        if (r9 != 0) goto L_0x0185;
    L_0x0184:
        goto L_0x019b;
    L_0x0185:
        r4 = r4.c();
        r4 = r4.a();
        r3 = r3.c;
        if (r3 != 0) goto L_0x0193;
    L_0x0191:
        r3 = defpackage.aofu.c;
    L_0x0193:
        r3 = r3.b;
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x01b0;
    L_0x019b:
        r1 = "Notification does not match current logged-in user";
        defpackage.xtl.e(r1);
        r1 = r11.f;
        r3 = r11.g;
        r4 = "FAIL_IDENTITY_MISMATCH";
        defpackage.afxh.b(r1, r4, r3);
        r11 = r11.c;
        defpackage.afxw.a(r11);
        goto L_0x028f;
    L_0x01b0:
        r3 = r0.instance;
        r3 = (defpackage.aouo) r3;
        r3 = r3.e;
        if (r3 != 0) goto L_0x01ba;
    L_0x01b8:
        r3 = defpackage.apxu.d;
    L_0x01ba:
        r4 = com.google.protos.youtube.api.innertube.SignOutEndpointOuterClass.signOutEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r4 = r4.d;
        r3 = r3.a(r4);
        if (r3 != 0) goto L_0x027f;
    L_0x01cd:
        r3 = r11.c;
        r3 = defpackage.ejr.a(r3);
        if (r3 != 0) goto L_0x01e0;
    L_0x01d5:
        r1 = r11.f;
        r11 = r11.g;
        r3 = "FAIL_DISABLED";
        defpackage.afxh.b(r1, r3, r11);
        goto L_0x028f;
    L_0x01e0:
        r3 = r0.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.aouo) r3;
        r4 = defpackage.afxv.a(r3);
        if (r4 == 0) goto L_0x0258;
    L_0x01ee:
        r1 = r1.getResources();
        r3 = r0.instance;
        r3 = (defpackage.aouo) r3;
        r4 = r3.a;
        r4 = r4 & r8;
        if (r4 == 0) goto L_0x020a;
    L_0x01fb:
        r3 = r3.d;
        if (r3 != 0) goto L_0x0201;
    L_0x01ff:
        r3 = defpackage.aour.t;
    L_0x0201:
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.aouq) r3;
        goto L_0x0212;
    L_0x020a:
        r3 = defpackage.aour.t;
        r3 = r3.createBuilder();
        r3 = (defpackage.aouq) r3;
    L_0x0212:
        r4 = r3.instance;
        r4 = (defpackage.aour) r4;
        r4 = r4.a;
        r4 = r4 & r6;
        if (r4 != 0) goto L_0x0241;
    L_0x021b:
        r4 = new java.lang.String[r8];
        r9 = 2131953851; // 0x7f1308bb float:1.9544185E38 double:1.0533251563E-314;
        r1 = r1.getString(r9);
        r4[r7] = r1;
        r1 = defpackage.ajqy.a(r4);
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.aour) r4;
        if (r1 == 0) goto L_0x023b;
    L_0x0233:
        r4.e = r1;
        r1 = r4.a;
        r1 = r1 | r6;
        r4.a = r1;
        goto L_0x0241;
    L_0x023b:
        r11 = new java.lang.NullPointerException;
        r11.<init>();
        throw r11;
    L_0x0241:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.aouo) r1;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.aour) r3;
        r1.d = r3;
        r3 = r1.a;
        r3 = r3 | r8;
        r1.a = r3;
        goto L_0x0275;
    L_0x0258:
        r1 = defpackage.afxv.b(r3);
        if (r1 != 0) goto L_0x0275;
    L_0x025e:
        r1 = r11.e;
        r1 = defpackage.afxv.a(r3, r1);
        if (r1 != 0) goto L_0x0275;
    L_0x0266:
        r1 = "Notification is not valid for display or processing.";
        defpackage.xtl.d(r1);
        r1 = r11.f;
        r11 = r11.g;
        r3 = "INVALID_1";
        defpackage.afxh.b(r1, r3, r11);
        goto L_0x028f;
    L_0x0275:
        r1 = r0.build();
        r1 = (defpackage.anxl) r1;
        r11.a(r1);
        goto L_0x028f;
    L_0x027f:
        r1 = r11.f;
        r3 = r11.g;
        r4 = "FAIL_SIGNING_OUT";
        defpackage.afxh.b(r1, r4, r3);
        r11 = r11.d;
        r1 = "Sign out notification received";
        r11.a(r1);
    L_0x028f:
        r11 = r2.toBuilder();
        r11 = (defpackage.anxo) r11;
        r11 = (defpackage.awtl) r11;
        r11.copyOnWrite();
        r1 = r11.instance;
        r1 = (defpackage.awtj) r1;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r1.b = r0;
        r1.a = r5;
        r11.build();
        return;
    L_0x02ac:
        r1 = 100987577; // 0x604f2b9 float:2.5004765E-35 double:4.98944925E-316;
        if (r3 == r1) goto L_0x02c5;
    L_0x02b1:
        if (r3 != r0) goto L_0x02bb;
    L_0x02b3:
        r0 = r2.b;
        r0 = (defpackage.atuv) r0;
        r11.a(r0);
        return;
    L_0x02bb:
        r0 = r11.f;
        r11 = r11.g;
        r1 = "UNKNOWN_RENDERER";
        defpackage.afxh.b(r0, r1, r11);
        return;
    L_0x02c5:
        r0 = r11.f;
        r3 = r11.g;
        r3 = defpackage.afxh.a(r3, r0);
        if (r3 == 0) goto L_0x02e4;
    L_0x02cf:
        r0 = r0.get();
        r0 = (defpackage.alwu) r0;
        r0 = r0.i;
        r0 = r0.get();
        r0 = (defpackage.uib) r0;
        r3 = new java.lang.Object[r8];
        r3[r7] = r4;
        r0.a(r3);
    L_0x02e4:
        r0 = r2.a;
        if (r0 != r1) goto L_0x02ed;
    L_0x02e8:
        r0 = r2.b;
        r0 = (defpackage.apaa) r0;
        goto L_0x02ef;
    L_0x02ed:
        r0 = defpackage.apaa.d;
    L_0x02ef:
        r11.a(r0);
    L_0x02f2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.common.notification.FcmMessageListenerService.a(anqt):void");
    }
}
