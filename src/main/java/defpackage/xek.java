package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.gcm.Task;
import com.google.android.libraries.youtube.common.gcore.gcoreclient.gcm.impl.GcmTaskServiceDelegator;

/* renamed from: xek */
public final class xek implements xdr {
    private final qey a;

    public final void a(xdy xdy) {
        Task a = ((xet) xdy).a();
        if (TextUtils.equals(a.a, GcmTaskServiceDelegator.class.getName())) {
            this.a.a(a);
            return;
        }
        String valueOf = String.valueOf(a.a);
        String str = "Using gcore wrapper of TaskService incorrectly.  You must use the TaskServiceDelegator class as your TaskService, not ";
        throw new IllegalStateException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    /* JADX WARNING: Missing block: B:13:0x003f, code skipped:
            defpackage.qey.a(r7, r1);
     */
    public final void a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = r6.a;
        r1 = com.google.android.libraries.youtube.common.gcore.gcoreclient.gcm.impl.GcmTaskServiceDelegator.class;
        r2 = new android.content.ComponentName;
        r3 = r0.a;
        r2.<init>(r3, r1);
        r1 = new qfs;
        r3 = java.lang.String.valueOf(r7);
        r4 = r3.length();
        r5 = "nts:client:cancel:";
        if (r4 != 0) goto L_0x001f;
    L_0x0019:
        r3 = new java.lang.String;
        r3.<init>(r5);
        goto L_0x0023;
    L_0x001f:
        r3 = r5.concat(r3);
    L_0x0023:
        r1.<init>(r3);
        defpackage.qey.a(r7);	 Catch:{ all -> 0x003c }
        r3 = r2.getClassName();	 Catch:{ all -> 0x003c }
        r0.b(r3);	 Catch:{ all -> 0x003c }
        r0 = r0.a();	 Catch:{ all -> 0x003c }
        r0.a(r2, r7);	 Catch:{ all -> 0x003c }
        r7 = 0;
        defpackage.qey.a(r7, r1);
        return;
    L_0x003c:
        r7 = move-exception;
        throw r7;	 Catch:{ all -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        defpackage.qey.a(r7, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xek.a(java.lang.String):void");
    }

    /* synthetic */ xek(Context context) {
        this.a = qey.a(context);
    }
}
