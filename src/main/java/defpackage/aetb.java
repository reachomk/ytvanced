package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;

/* renamed from: aetb */
public final class aetb extends aanf {
    private final afmi a;
    private final afqa b;
    private final Context g;
    private final xua h;
    private final afsa[] i;
    private final aang j;

    public aetb(afpu afpu, afmi afmi, aamd aamd, aamf aamf, xhf xhf, Context context, afqa afqa, xua xua, afsa... afsaArr) {
        super(aamd, (afpu) amqw.a((Object) afpu), xhf);
        this.a = (afmi) amqw.a((Object) afmi);
        this.b = afqa;
        this.g = context;
        this.h = xua;
        this.i = (afsa[]) amqw.a((Object) afsaArr);
        this.j = a(asmc.h, aamf, aeta.a, aetd.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051 A:{RETURN} */
    public static int a(java.lang.String r6) {
        /*
        r0 = r6.hashCode();
        r1 = 2300; // 0x8fc float:3.223E-42 double:1.1364E-320;
        r2 = 0;
        r3 = 3;
        r4 = 2;
        r5 = 1;
        if (r0 == r1) goto L_0x0039;
    L_0x000c:
        r1 = 2641; // 0xa51 float:3.701E-42 double:1.305E-320;
        if (r0 == r1) goto L_0x002f;
    L_0x0010:
        r1 = 2603584; // 0x27ba40 float:3.648398E-39 double:1.2863414E-317;
        if (r0 == r1) goto L_0x0025;
    L_0x0015:
        r1 = 62628790; // 0x3bba3b6 float:1.1028458E-36 double:3.09427336E-316;
        if (r0 == r1) goto L_0x001b;
    L_0x001a:
        goto L_0x0043;
    L_0x001b:
        r0 = "AUDIO";
        r6 = r6.equals(r0);
        if (r6 == 0) goto L_0x0043;
    L_0x0023:
        r6 = 0;
        goto L_0x0044;
    L_0x0025:
        r0 = "UHD1";
        r6 = r6.equals(r0);
        if (r6 == 0) goto L_0x0043;
    L_0x002d:
        r6 = 3;
        goto L_0x0044;
    L_0x002f:
        r0 = "SD";
        r6 = r6.equals(r0);
        if (r6 == 0) goto L_0x0043;
    L_0x0037:
        r6 = 1;
        goto L_0x0044;
    L_0x0039:
        r0 = "HD";
        r6 = r6.equals(r0);
        if (r6 == 0) goto L_0x0043;
    L_0x0041:
        r6 = 2;
        goto L_0x0044;
    L_0x0043:
        r6 = -1;
    L_0x0044:
        if (r6 == 0) goto L_0x0051;
    L_0x0046:
        if (r6 == r5) goto L_0x0050;
    L_0x0048:
        if (r6 == r4) goto L_0x004f;
    L_0x004a:
        if (r6 == r3) goto L_0x004d;
    L_0x004c:
        return r2;
    L_0x004d:
        r6 = 4;
        return r6;
    L_0x004f:
        return r3;
    L_0x0050:
        return r4;
    L_0x0051:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetb.a(java.lang.String):int");
    }

    /* Access modifiers changed, original: final */
    public final aetl a(Uri uri, byte[] bArr, String str, String str2, String str3, String str4, Integer num) {
        String str5 = str3;
        if (uri != null) {
            xak.b();
            xvo a = xvo.a(uri);
            this.a.a(a);
            a.b("cpn", str2);
            if (!str5.equals("")) {
                a.b("session_id", str5);
            }
            Uri a2 = a.a();
            afsx a3 = afsx.a();
            aeth aeth = new aeth(this.g, a2.toString(), bArr, this.i, this.d.c(), this.b, a3);
            aeth.i = false;
            this.e.b(aeth);
            try {
                return (aetl) a3.get();
            } catch (InterruptedException e) {
                throw new aeti(e);
            } catch (ExecutionException e2) {
                if (e2.getCause() instanceof aeti) {
                    throw ((aeti) e2.getCause());
                }
                throw new aeti(e2.getCause());
            }
        }
        String str6 = str2;
        xak.b();
        if (TextUtils.isEmpty(str3)) {
            str5 = this.h.a();
        }
        try {
            aetl aetc = new aetc((asmc) this.j.b(new aetf(this.c, this.d, bArr, str, str2, str5, str4, num)));
            if (aetc.c()) {
                return aetc;
            }
            throw new aeti(aetc);
        } catch (aanq e3) {
            throw new aeti(e3);
        }
    }

    /* Access modifiers changed, original: final */
    public final byte[] a(Uri uri, byte[] bArr, String str) {
        xak.b();
        xvo a = xvo.a(uri);
        a.b("signedRequest", new String(bArr));
        a.b("cpn", str);
        this.a.a(a);
        uri = a.a();
        afsx a2 = afsx.a();
        this.e.b(new aete(uri.toString(), a2));
        try {
            return (byte[]) a2.get();
        } catch (InterruptedException e) {
            throw new aeti(e, true);
        } catch (ExecutionException e2) {
            throw new aeti(e2.getCause(), true);
        }
    }
}
