package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qgt */
public final class qgt implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;

    public qgt(Context context, GoogleHelp googleHelp, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = j;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0020 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|10|11) */
    public final void run() {
        /*
        r9 = this;
        r0 = "gms:googlehelp:async_help_psd_collection_time_ms";
        r1 = new qed;	 Catch:{ Exception -> 0x0036 }
        r1.<init>();	 Catch:{ Exception -> 0x0036 }
        r1.a();	 Catch:{ Exception -> 0x0036 }
        r2 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0036 }
        r3 = 1;
        r2.<init>(r3);	 Catch:{ Exception -> 0x0036 }
        r3 = r1.b();	 Catch:{ UnsupportedOperationException -> 0x0020 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ UnsupportedOperationException -> 0x0020 }
        r3 = android.util.Pair.create(r0, r3);	 Catch:{ UnsupportedOperationException -> 0x0020 }
        r2.add(r3);	 Catch:{ UnsupportedOperationException -> 0x0020 }
        goto L_0x004a;
    L_0x0020:
        r3 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0036 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x0036 }
        r1 = r1.b();	 Catch:{ Exception -> 0x0036 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Exception -> 0x0036 }
        r0 = android.util.Pair.create(r0, r1);	 Catch:{ Exception -> 0x0036 }
        r3.add(r0);	 Catch:{ Exception -> 0x0036 }
        r2 = r3;
        goto L_0x004a;
    L_0x0036:
        r0 = move-exception;
        r1 = "gH_GetAsyncHelpPsd";
        r2 = "Failed to get async help psd.";
        android.util.Log.w(r1, r2, r0);
        r0 = "gms:googlehelp:async_help_psd_failure";
        r1 = "exception";
        r0 = android.util.Pair.create(r0, r1);
        r2 = java.util.Collections.singletonList(r0);
    L_0x004a:
        r0 = r9.a;
        r0 = defpackage.qhf.a(r0);
        r5 = r9.b;
        r6 = defpackage.qee.a(r2);
        r7 = r9.c;
        r3 = defpackage.qgf.h;
        r4 = r0.f;
        r0 = r3.a(r4, r5, r6, r7);
        defpackage.pzl.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgt.run():void");
    }
}
