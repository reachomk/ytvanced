package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: uzt */
public final class uzt implements aaop {
    private final uzs a;
    private final aaas b;
    private atfx c = atfx.CODE_DELIVERY_METHOD_UNKNOWN;
    private String d;
    private String e;
    private apxu f;
    private boolean g;

    public uzt(uzs uzs, aaas aaas) {
        this.b = (aaas) amqw.a((Object) aaas);
        this.a = uzs;
        this.g = false;
    }

    public final boolean a(atfx atfx, String str, String str2, apxu apxu) {
        if (this.g) {
            return false;
        }
        this.f = (apxu) amqw.a((Object) apxu);
        this.c = atfx;
        this.d = str;
        this.e = str2;
        this.g = true;
        atfx atfx2 = this.c;
        str2 = this.d;
        String str3 = this.e;
        Map hashMap = new HashMap();
        hashMap.put("KEY_CODE_DELIVERY_METHOD", atfx2);
        hashMap.put("KEY_COUNTRY_CODE", str2);
        hashMap.put("KEY_PHONE_NUMBER", str3);
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.b.a(this.f, hashMap);
        return true;
    }

    /* JADX WARNING: Missing block: B:23:0x0063, code skipped:
            if ((((com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1).a & 1) == 0) goto L_0x00bc;
     */
    public final void a(defpackage.atgd r7) {
        /*
        r6 = this;
        r0 = 0;
        r6.g = r0;
        r1 = r6.a;
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        goto L_0x00bb;
    L_0x0009:
        r1 = r7.a;
        r2 = r1 & 2;
        r3 = "RequestVerificationCodeResponse contains an unexpected null value.";
        if (r2 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x001f;
    L_0x0012:
        r2 = r1 & 4;
        if (r2 != 0) goto L_0x001f;
    L_0x0016:
        defpackage.xtl.c(r3);
        r7 = r6.a;
        r7.b();
        return;
    L_0x001f:
        r1 = r1 & 4;
        r2 = 1;
        if (r1 != 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0066;
    L_0x0025:
        r1 = r7.d;
        if (r1 != 0) goto L_0x002b;
    L_0x0029:
        r1 = defpackage.apxu.d;
    L_0x002b:
        r4 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r1.a(r4);
        r1 = r1.h;
        r4 = r4.d;
        r1 = r1.a(r4);
        if (r1 == 0) goto L_0x00bc;
    L_0x003e:
        r1 = r7.d;
        if (r1 != 0) goto L_0x0044;
    L_0x0042:
        r1 = defpackage.apxu.d;
    L_0x0044:
        r4 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r1.a(r4);
        r1 = r1.h;
        r5 = r4.d;
        r1 = r1.b(r5);
        if (r1 != 0) goto L_0x005a;
    L_0x0057:
        r1 = r4.b;
        goto L_0x005e;
    L_0x005a:
        r1 = r4.a(r1);
    L_0x005e:
        r1 = (com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1;
        r1 = r1.a;
        r1 = r1 & r2;
        if (r1 != 0) goto L_0x0066;
    L_0x0065:
        goto L_0x00bc;
    L_0x0066:
        r1 = r7.a;
        r3 = r1 & 4;
        if (r3 != 0) goto L_0x0086;
    L_0x006c:
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0071;
    L_0x0070:
        r0 = 1;
    L_0x0071:
        defpackage.amqw.b(r0);
        r0 = r6.a;
        r7 = r7.c;
        if (r7 != 0) goto L_0x007c;
    L_0x007a:
        r7 = defpackage.atfz.c;
    L_0x007c:
        r7 = r7.b;
        if (r7 != 0) goto L_0x0082;
    L_0x0080:
        r7 = defpackage.avxo.i;
    L_0x0082:
        r0.a(r7);
        return;
    L_0x0086:
        r0 = r6.a;
        r1 = r7.d;
        if (r1 != 0) goto L_0x008e;
    L_0x008c:
        r1 = defpackage.apxu.d;
    L_0x008e:
        r2 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r3 = r2.d;
        r1 = r1.b(r3);
        if (r1 != 0) goto L_0x00a4;
    L_0x00a1:
        r1 = r2.b;
        goto L_0x00a8;
    L_0x00a4:
        r1 = r2.a(r1);
    L_0x00a8:
        r1 = (com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00b0;
    L_0x00ae:
        r1 = defpackage.avxd.c;
    L_0x00b0:
        r1 = r1.b;
        if (r1 != 0) goto L_0x00b6;
    L_0x00b4:
        r1 = defpackage.avxf.d;
    L_0x00b6:
        r2 = r7.e;
        r0.a(r1, r2);
    L_0x00bb:
        return;
    L_0x00bc:
        defpackage.xtl.c(r3);
        r7 = r6.a;
        r7.b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzt.a(atgd):void");
    }

    public final void a(bqn bqn) {
        xtl.a("Request verification code failed.", (Throwable) bqn);
        this.g = false;
        uzs uzs = this.a;
        if (uzs != null) {
            uzs.b();
        }
    }
}
