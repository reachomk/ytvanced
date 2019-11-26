package defpackage;

import android.content.Context;

/* renamed from: qqn */
public final class qqn implements Runnable {
    private final Context a;
    private final qdu b;
    private final long c;

    public qqn(Context context, qdu qdu, long j) {
        this.a = context;
        this.b = qdu;
        this.c = j;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)|5|6|7|8|9|12|13) */
    public final void run() {
        /*
        r5 = this;
        r0 = "gms:feedback:async_feedback_psd_collection_time_ms";
        r1 = new qed;	 Catch:{ Exception -> 0x003e }
        r1.<init>();	 Catch:{ Exception -> 0x003e }
        r1.a();	 Catch:{ Exception -> 0x003e }
        r2 = r5.b;	 Catch:{ Exception -> 0x003e }
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
        r1 = "gF_GetAsyncFeedbackPsd";
        r2 = "Failed to get async Feedback psd.";
        android.util.Log.w(r1, r2, r0);
        r0 = "gms:feedback:async_feedback_psd_failure";
        r1 = "exception";
        r0 = android.util.Pair.create(r0, r1);
        r2 = java.util.Collections.singletonList(r0);
    L_0x0052:
        r0 = r5.a;
        r0 = defpackage.qdw.a(r0);
        r1 = defpackage.qee.a(r2);
        r2 = r5.c;
        r0 = r0.f;
        r0 = defpackage.qdw.a(r0, r1, r2);
        defpackage.pzl.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqn.run():void");
    }
}
