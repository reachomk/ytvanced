package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import java.util.concurrent.CancellationException;

/* renamed from: ahch */
public final class ahch extends AsyncTask {
    private final /* synthetic */ Context a;
    private final /* synthetic */ boolean b = true;
    private final /* synthetic */ ProgressDialog c;
    private final /* synthetic */ wxg d;
    private final /* synthetic */ ahcj e;
    private final /* synthetic */ ahci f;

    public ahch(ahci ahci, Context context, ProgressDialog progressDialog, wxg wxg, ahcj ahcj) {
        this.f = ahci;
        this.a = context;
        this.c = progressDialog;
        this.d = wxg;
        this.e = ahcj;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onCancelled(Object obj) {
        if (this.b) {
            ProgressDialog progressDialog = this.c;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.c.dismiss();
            }
        }
        this.d.a(this.e, new CancellationException());
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        obj = (ahcm) obj;
        if (this.b) {
            ProgressDialog progressDialog = this.c;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.c.dismiss();
            }
        }
        if (obj != null) {
            Exception exception = obj.c;
            if (exception != null) {
                this.d.a(this.e, exception);
                return;
            }
        }
        if (obj == null || obj.a.isEmpty()) {
            this.d.a(this.e, new ahck(null, false));
        } else {
            this.d.a(this.e, obj);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0116 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0116 A:{SYNTHETIC} */
    public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r26) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r26;
        r1 = (defpackage.ahcj[]) r1;
        r2 = r0.f;
        r3 = r0.a;
        r3 = r3.getResources();
        r4 = 0;
        r1 = r1[r4];
        r6 = r2.b;	 Catch:{ aanq -> 0x017b }
        r7 = r1.b;	 Catch:{ aanq -> 0x017b }
        r12 = r1.a;	 Catch:{ aanq -> 0x017b }
        r8 = 0;
        r9 = 2;
        r10 = 1;
        r11 = -1;
        r6 = r6.a(r7, r8, r9, r10, r11, r12);	 Catch:{ aanq -> 0x017b }
        r7 = defpackage.ahcz.a(r6);
        if (r7 == 0) goto L_0x012f;
    L_0x0025:
        r7 = defpackage.ahcz.b(r6);
        if (r7 != 0) goto L_0x002d;
    L_0x002b:
        goto L_0x012f;
    L_0x002d:
        r7 = r6.c;
        r15 = new java.util.ArrayList;
        r15.<init>();
        r14 = new java.util.HashSet;
        r14.<init>();
        r8 = r1.c;
        r16 = r8.iterator();
    L_0x003f:
        r8 = r16.hasNext();
        if (r8 == 0) goto L_0x011c;
    L_0x0045:
        r8 = r16.next();
        r13 = r8;
        r13 = (defpackage.agqa) r13;
        r8 = r1.c;
        r12 = r8.indexOf(r13);
        r8 = r1.c;
        r8 = r8.size();
        r9 = -1;
        r11 = r8 + -1;
        r10 = r13.e;
        r8 = r2.a;
        r17 = r8.b(r10);
        r18 = defpackage.ahdl.a(r10, r9);
        if (r18 < 0) goto L_0x010e;
    L_0x0069:
        r19 = defpackage.ahcz.a(r18);
        r8 = r2.b;
        r20 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r21 = 1;
        r22 = r6.n();
        r9 = r18;
        r5 = r10;
        r10 = r20;
        r4 = r11;
        r11 = r17;
        r23 = r12;
        r12 = r7;
        r24 = r13;
        r13 = r21;
        r0 = r14;
        r14 = r22;
        r21 = r8.a(r9, r10, r11, r12, r13, r14);
        if (r21 != 0) goto L_0x0094;
    L_0x0090:
        r4 = 0;
        r9 = 0;
        goto L_0x0111;
    L_0x0094:
        if (r19 != 0) goto L_0x00b4;
    L_0x0096:
        r8 = r2.b;
        r9 = r23;
        if (r9 == r4) goto L_0x009f;
    L_0x009c:
        r10 = r18;
        goto L_0x00a5;
    L_0x009f:
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r10 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x00a5:
        r13 = 0;
        r14 = r6.n();
        r9 = r18;
        r11 = r17;
        r12 = r7;
        r4 = r8.a(r9, r10, r11, r12, r13, r14);
        goto L_0x00b5;
    L_0x00b4:
        r4 = 0;
    L_0x00b5:
        if (r19 != 0) goto L_0x00b9;
    L_0x00b7:
        if (r4 == 0) goto L_0x0090;
    L_0x00b9:
        if (r4 != 0) goto L_0x00c8;
    L_0x00bb:
        r8 = new android.util.Pair;
        r9 = 0;
        r10 = java.lang.Integer.valueOf(r9);
        r11 = "";
        r8.<init>(r10, r11);
        goto L_0x00da;
    L_0x00c8:
        r9 = 0;
        r8 = new android.util.Pair;
        r10 = r4.b();
        r10 = java.lang.Integer.valueOf(r10);
        r11 = r4.t();
        r8.<init>(r10, r11);
    L_0x00da:
        r10 = r0.contains(r8);
        if (r10 != 0) goto L_0x0110;
    L_0x00e0:
        r0.add(r8);
        r10 = r21.c();
        r12 = 0;
        if (r4 == 0) goto L_0x00f0;
    L_0x00eb:
        r17 = r4.c();
        goto L_0x00f2;
    L_0x00f0:
        r17 = r12;
    L_0x00f2:
        r10 = r10 + r17;
        r4 = new agqa;
        r8 = r24;
        r14 = r8.f;
        r17 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r17 > 0) goto L_0x0101;
    L_0x00fe:
        r8 = r8.g;
        goto L_0x010a;
    L_0x0101:
        r8 = new android.text.SpannedString;
        r10 = defpackage.xvd.a(r3, r10);
        r8.<init>(r10);
    L_0x010a:
        r4.<init>(r5, r14, r8);
        goto L_0x0111;
    L_0x010e:
        r0 = r14;
        r9 = 0;
    L_0x0110:
        r4 = 0;
    L_0x0111:
        if (r4 == 0) goto L_0x0116;
    L_0x0113:
        r15.add(r4);
    L_0x0116:
        r4 = 0;
        r14 = r0;
        r0 = r25;
        goto L_0x003f;
    L_0x011c:
        r0 = r2.a;
        r0 = r0.b();
        java.util.Collections.sort(r15, r0);
        r5 = new ahcm;
        r0 = r6.x();
        r5.<init>(r15, r0);
        goto L_0x0194;
    L_0x012f:
        r9 = 0;
        r0 = r1.b;
        r0 = java.lang.String.valueOf(r0);
        r1 = "Invalid offline player response for ";
        r2 = r0.length();
        if (r2 != 0) goto L_0x0144;
    L_0x013e:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x0147;
    L_0x0144:
        r1.concat(r0);
    L_0x0147:
        r5 = new ahcm;
        r0 = java.util.Collections.emptyList();
        r1 = r6.x();
        r2 = new ahck;
        r3 = r6.l();
        if (r3 == 0) goto L_0x0164;
    L_0x0159:
        r4 = r3.c;
        r4 = defpackage.amqu.a(r4);
        if (r4 != 0) goto L_0x0164;
    L_0x0161:
        r3 = r3.c;
        goto L_0x0165;
    L_0x0164:
        r3 = 0;
    L_0x0165:
        r4 = r6.l();
        if (r4 == 0) goto L_0x0174;
    L_0x016b:
        r4 = defpackage.aiqr.c(r4);
        if (r4 != 0) goto L_0x0172;
    L_0x0171:
        goto L_0x0174;
    L_0x0172:
        r4 = 1;
        r9 = 1;
    L_0x0174:
        r2.<init>(r3, r9);
        r5.<init>(r0, r1, r2);
        goto L_0x0194;
        r0 = r1.b;
        r0 = java.lang.String.valueOf(r0);
        r1 = "Failed to get offline player response for stream selection for ";
        r2 = r0.length();
        if (r2 != 0) goto L_0x0190;
    L_0x018a:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x0193;
    L_0x0190:
        r1.concat(r0);
    L_0x0193:
        r5 = 0;
    L_0x0194:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahch.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
