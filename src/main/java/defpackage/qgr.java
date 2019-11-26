package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qgr */
public final class qgr implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final qdu c;
    private final long d;

    public qgr(Context context, GoogleHelp googleHelp, qdu qdu, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = qdu;
        this.d = j;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)|5|6|7|8|9|12|13) */
    public final void run() {
        /*
        r9 = this;
        r0 = "gms:feedback:async_feedback_psd_collection_time_ms";
        r1 = new qed;	 Catch:{ Exception -> 0x003e }
        r1.<init>();	 Catch:{ Exception -> 0x003e }
        r1.a();	 Catch:{ Exception -> 0x003e }
        r2 = r9.c;	 Catch:{ Exception -> 0x003e }
        r2 = r2.a();	 Catch:{ Exception -> 0x003e }
        if (r2 != 0) goto L_0x0018;
    L_0x0012:
        r2 = new java.util.ArrayList;	 Catch:{ Exception -> 0x003e }
        r3 = 1;
        r2.<init>(r3);	 Catch:{ Exception -> 0x003e }
    L_0x0018:
        r3 = r1.b();	 Catch:{ UnsupportedOperationException -> 0x0028 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ UnsupportedOperationException -> 0x0028 }
        r3 = android.util.Pair.create(r0, r3);	 Catch:{ UnsupportedOperationException -> 0x0028 }
        r2.add(r3);	 Catch:{ UnsupportedOperationException -> 0x0028 }
        goto L_0x0052;
    L_0x0028:
        r3 = new java.util.ArrayList;	 Catch:{ Exception -> 0x003e }
        r3.<init>(r2);	 Catch:{ Exception -> 0x003e }
        r1 = r1.b();	 Catch:{ Exception -> 0x003e }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Exception -> 0x003e }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ Exception -> 0x003e }
        r3.add(r0);	 Catch:{ Exception -> 0x003e }
        r2 = r3;
        goto L_0x0052;
    L_0x003e:
        r0 = move-exception;
        r1 = "gH_GetAsyncFeedbackPsd";
        r2 = "Failed to get async Feedback psd.";
        android.util.Log.w(r1, r2, r0);
        r0 = "gms:feedback:async_feedback_psd_failure";
        r1 = "exception";
        r0 = android.util.Pair.create(r0, r1);
        r2 = java.util.Collections.singletonList(r0);
    L_0x0052:
        r0 = r9.a;
        r0 = defpackage.qhf.a(r0);
        r5 = r9.b;
        r6 = defpackage.qee.a(r2);
        r7 = r9.d;
        r3 = defpackage.qgf.h;
        r4 = r0.f;
        r0 = r3.b(r4, r5, r6, r7);
        defpackage.pzl.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgr.run():void");
    }
}
