package defpackage;

import android.content.Context;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.Result;

/* renamed from: uh */
class uh extends MediaBrowserService {
    private final /* synthetic */ uc a;

    uh(uc ucVar, Context context) {
        this.a = ucVar;
        attachBaseContext(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    public final android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r12, int r13, android.os.Bundle r14) {
        /*
        r11 = this;
        defpackage.wq.a(r14);
        r0 = r11.a;
        r1 = 0;
        if (r14 == 0) goto L_0x000e;
    L_0x0008:
        r2 = new android.os.Bundle;
        r2.<init>(r14);
        goto L_0x000f;
    L_0x000e:
        r2 = r1;
    L_0x000f:
        r14 = -1;
        if (r2 == 0) goto L_0x0065;
    L_0x0012:
        r3 = 0;
        r4 = "extra_client_version";
        r3 = r2.getInt(r4, r3);
        if (r3 == 0) goto L_0x0065;
    L_0x001b:
        r2.remove(r4);
        r3 = new android.os.Messenger;
        r4 = r0.d;
        r4 = r4.f;
        r3.<init>(r4);
        r0.c = r3;
        r3 = new android.os.Bundle;
        r3.<init>();
        r4 = 2;
        r5 = "extra_service_version";
        r3.putInt(r5, r4);
        r4 = r0.c;
        r4 = r4.getBinder();
        r5 = "extra_messenger";
        r3.putBinder(r5, r4);
        r4 = r0.d;
        r4 = r4.g;
        if (r4 != 0) goto L_0x004b;
    L_0x0045:
        r4 = r0.a;
        r4.add(r3);
        goto L_0x005a;
    L_0x004b:
        r4 = r4.b;
        if (r4 == 0) goto L_0x0054;
    L_0x004f:
        r4 = r4.asBinder();
        goto L_0x0055;
    L_0x0054:
        r4 = r1;
    L_0x0055:
        r5 = "extra_session_binder";
        r3.putBinder(r5, r4);
    L_0x005a:
        r4 = "extra_calling_pid";
        r14 = r2.getInt(r4, r14);
        r2.remove(r4);
        r8 = r14;
        goto L_0x0067;
    L_0x0065:
        r3 = r1;
        r8 = -1;
    L_0x0067:
        r14 = new ub;
        r6 = r0.d;
        r10 = 0;
        r5 = r14;
        r7 = r12;
        r9 = r13;
        r5.<init>(r6, r7, r8, r9, r10);
        r12 = r0.d;
        r12.e = r14;
        r12 = r12.a();
        r13 = r0.d;
        r13.e = r1;
        if (r12 == 0) goto L_0x009e;
    L_0x0080:
        r0 = r0.c;
        if (r0 == 0) goto L_0x0089;
    L_0x0084:
        r13 = r13.c;
        r13.add(r14);
    L_0x0089:
        if (r3 != 0) goto L_0x008e;
    L_0x008b:
        r3 = r12.b;
        goto L_0x0096;
    L_0x008e:
        r13 = r12.b;
        if (r13 != 0) goto L_0x0093;
    L_0x0092:
        goto L_0x0096;
    L_0x0093:
        r3.putAll(r13);
    L_0x0096:
        r13 = new ty;
        r12 = r12.a;
        r13.<init>(r12, r3);
        goto L_0x009f;
    L_0x009e:
        r13 = r1;
    L_0x009f:
        if (r13 == 0) goto L_0x00ab;
    L_0x00a1:
        r12 = new android.service.media.MediaBrowserService$BrowserRoot;
        r14 = r13.a;
        r13 = r13.b;
        r12.<init>(r14, r13);
        return r12;
    L_0x00ab:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh.onGetRoot(java.lang.String, int, android.os.Bundle):android.service.media.MediaBrowserService$BrowserRoot");
    }

    public final void onLoadChildren(String str, Result result) {
        uc ucVar = this.a;
        ue ueVar = new ue(str, new uq(result));
        tv tvVar = ucVar.d;
        tvVar.e = tvVar.b;
        tvVar.a(ueVar);
        ucVar.d.e = null;
    }
}
