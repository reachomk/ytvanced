package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: sim */
public final class sim {
    public static final List a = Arrays.asList(new String[]{"state", "client_id", "redirect_uri"});
    private static final List b = Arrays.asList(new String[]{"scope", "response_type", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "response_mode"});

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0148 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0182 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:38|39|40|41|42|43|(4:45|46|47|(2:49|50))|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:56|57|65|58) */
    /* JADX WARNING: Missing block: B:57:?, code skipped:
            r11.setResult(6000, new android.content.Intent().putExtra("TOKEN_RESPONSE", new defpackage.sfq(101, new java.lang.IllegalStateException("No browser installed on device"))));
            r11.finish();
     */
    /* JADX WARNING: Missing block: B:58:0x01a6, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:59:0x01a7, code skipped:
            r1.a();
     */
    public static void a(android.app.Activity r11, defpackage.sgz r12) {
        /*
        r0 = r12.e;
        r1 = new bcfx;
        r2 = r0.b;
        r2 = android.net.Uri.parse(r2);
        r3 = r0.c;
        r3 = android.net.Uri.parse(r3);
        r4 = 0;
        r1.<init>(r2, r3, r4);
        r2 = r0.g;
        r2 = android.net.Uri.parse(r2);
        r3 = new java.util.HashMap;
        r3.<init>();
        r5 = r2.getQueryParameterNames();
        r5 = r5.iterator();
    L_0x0027:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x004b;
    L_0x002d:
        r6 = r5.next();
        r6 = (java.lang.String) r6;
        r7 = a;
        r7 = r7.contains(r6);
        if (r7 != 0) goto L_0x0027;
    L_0x003b:
        r7 = b;
        r7 = r7.contains(r6);
        if (r7 != 0) goto L_0x0027;
    L_0x0043:
        r7 = r2.getQueryParameter(r6);
        r3.put(r6, r7);
        goto L_0x0027;
    L_0x004b:
        r5 = new bcft;
        r6 = r0.a;
        r7 = r0.f;
        r7 = android.net.Uri.parse(r7);
        r8 = "code";
        r5.<init>(r1, r6, r8, r7);
        r1 = r0.d;
        r5.e(r1);
        r0 = r0.e;
        r1 = android.text.TextUtils.isEmpty(r0);
        r6 = 0;
        if (r1 == 0) goto L_0x006b;
    L_0x0068:
        r5.a = r4;
        goto L_0x007c;
    L_0x006b:
        r1 = " +";
        r0 = r0.split(r1);
        if (r0 != 0) goto L_0x0075;
    L_0x0073:
        r0 = new java.lang.String[r6];
    L_0x0075:
        r0 = java.util.Arrays.asList(r0);
        r5.a(r0);
    L_0x007c:
        r5.a(r3);
        r5.f(r4);
        r0 = "response_type";
        r1 = r2.getQueryParameter(r0);
        if (r1 == 0) goto L_0x0091;
    L_0x008a:
        r0 = r2.getQueryParameter(r0);
        r5.d(r0);
    L_0x0091:
        r0 = "login_hint";
        r1 = r2.getQueryParameter(r0);
        if (r1 == 0) goto L_0x00a0;
    L_0x0099:
        r0 = r2.getQueryParameter(r0);
        r5.b(r0);
    L_0x00a0:
        r0 = "display";
        r1 = r2.getQueryParameter(r0);
        if (r1 == 0) goto L_0x00af;
    L_0x00a8:
        r0 = r2.getQueryParameter(r0);
        r5.a(r0);
    L_0x00af:
        r0 = "prompt";
        r1 = r2.getQueryParameter(r0);
        if (r1 == 0) goto L_0x00be;
    L_0x00b7:
        r0 = r2.getQueryParameter(r0);
        r5.c(r0);
    L_0x00be:
        r0 = "response_mode";
        r1 = r2.getQueryParameter(r0);
        if (r1 == 0) goto L_0x00cd;
    L_0x00c6:
        r0 = r2.getQueryParameter(r0);
        r5.g(r0);
    L_0x00cd:
        r0 = r5.a();
        r1 = new bcfu;
        r1.<init>(r11);
        r2 = com.google.android.libraries.deepauth.appauth.AppAuthReceiverActivity.a(r11, r12);
        r3 = new android.os.Bundle;
        r3.<init>();
        r5 = "EXTRA_FLOW_CONFIG";
        r3.putParcelable(r5, r12);
        r5 = new android.content.Intent;
        r7 = com.google.android.libraries.deepauth.appauth.AppAuthCancellationReceiverActivity.class;
        r5.<init>(r11, r7);
        r7 = "EXTRA_BUNDLE";
        r3 = r5.putExtra(r7, r3);
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r3 = android.app.PendingIntent.getActivity(r11, r6, r3, r5);
        r5 = r12.b();	 Catch:{ ActivityNotFoundException -> 0x0182 }
        if (r5 == 0) goto L_0x0137;
    L_0x00fd:
        r12 = r12.b();	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r4 = new auc;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r4.<init>();	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r5 = r12.a;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r4.a(r5);	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r5 = r12.b;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r6 = r4.a;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r7 = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
        r6.putExtra(r7, r5);	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r5 = r12.c;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r4.a(r5);	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r5 = r12.d;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r4.c = r5;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r5 = r12.e;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r4.a(r5);	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r5 = r12.f;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        if (r5 == 0) goto L_0x012f;
    L_0x0126:
        r6 = r12.g;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r7 = r12.h;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r12 = r12.i;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r4.a(r5, r6, r7, r12);	 Catch:{ ActivityNotFoundException -> 0x0182 }
    L_0x012f:
        r12 = r4.a();	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r1.a(r0, r2, r3, r12);	 Catch:{ ActivityNotFoundException -> 0x0182 }
        goto L_0x017c;
    L_0x0137:
        r1.b();	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r12 = r1.a;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r5 = new auc;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r7 = r12.b;	 Catch:{ InterruptedException -> 0x0148 }
        r8 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0148 }
        r9 = 1;
        r7.await(r9, r8);	 Catch:{ InterruptedException -> 0x0148 }
        goto L_0x0154;
    L_0x0148:
        r7 = "Interrupted while waiting for browser connection";
        r6 = new java.lang.Object[r6];	 Catch:{ ActivityNotFoundException -> 0x0182 }
        defpackage.bcgn.b(r7, r6);	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r6 = r12.b;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r6.countDown();	 Catch:{ ActivityNotFoundException -> 0x0182 }
    L_0x0154:
        r12 = r12.a;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r12 = r12.get();	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r12 = (defpackage.aub) r12;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        if (r12 == 0) goto L_0x0172;
    L_0x015e:
        r6 = new aua;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r6.<init>();	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r7 = r12.a;	 Catch:{ RemoteException -> 0x0172 }
        r7 = r7.a(r6);	 Catch:{ RemoteException -> 0x0172 }
        if (r7 == 0) goto L_0x0172;
    L_0x016b:
        r4 = new auh;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r12 = r12.b;	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r4.<init>(r6, r12);	 Catch:{ ActivityNotFoundException -> 0x0182 }
    L_0x0172:
        r5.<init>(r4);	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r12 = r5.a();	 Catch:{ ActivityNotFoundException -> 0x0182 }
        r1.a(r0, r2, r3, r12);	 Catch:{ ActivityNotFoundException -> 0x0182 }
    L_0x017c:
        r1.a();
        return;
    L_0x0180:
        r11 = move-exception;
        goto L_0x01a7;
    L_0x0182:
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0180 }
        r0 = "No browser installed on device";
        r12.<init>(r0);	 Catch:{ all -> 0x0180 }
        r0 = new android.content.Intent;	 Catch:{ all -> 0x0180 }
        r0.<init>();	 Catch:{ all -> 0x0180 }
        r2 = "TOKEN_RESPONSE";
        r3 = new sfq;	 Catch:{ all -> 0x0180 }
        r4 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r3.<init>(r4, r12);	 Catch:{ all -> 0x0180 }
        r12 = r0.putExtra(r2, r3);	 Catch:{ all -> 0x0180 }
        r0 = 6000; // 0x1770 float:8.408E-42 double:2.9644E-320;
        r11.setResult(r0, r12);	 Catch:{ all -> 0x0180 }
        r11.finish();	 Catch:{ all -> 0x0180 }
        r1.a();
        return;
    L_0x01a7:
        r1.a();
        goto L_0x01ac;
    L_0x01ab:
        throw r11;
    L_0x01ac:
        goto L_0x01ab;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sim.a(android.app.Activity, sgz):void");
    }
}
