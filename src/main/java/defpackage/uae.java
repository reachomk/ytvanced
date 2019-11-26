package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* renamed from: uae */
public final class uae {
    private static final Pattern a = Pattern.compile("^(\\*[a-z]+\\*).*");
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    private static String a(String str) {
        String[] split = str.split("/");
        if (split != null && split.length == 3) {
            return split[0];
        }
        tyv.b("HashingNameSanitizer", "malformed sync name: %s", str);
        return "MALFORMED";
    }

    uae() {
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6  */
    public final defpackage.bcar a(defpackage.uad r14, defpackage.bcar r15) {
        /*
        r13 = this;
        r0 = r15.d;
        if (r0 != 0) goto L_0x0006;
    L_0x0004:
        r0 = defpackage.bcah.d;
    L_0x0006:
        r0 = r0.a;
        r1 = 2;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x00ed;
    L_0x000c:
        r0 = r15.d;
        if (r0 != 0) goto L_0x0012;
    L_0x0010:
        r0 = defpackage.bcah.d;
    L_0x0012:
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.bcak) r0;
        r15 = r15.toBuilder();
        r15 = (defpackage.anxo) r15;
        r15 = (defpackage.bcau) r15;
        r2 = r0.instance;
        r2 = (defpackage.bcah) r2;
        r2 = r2.c;
        r3 = defpackage.tuz.a(r2);
        r3 = defpackage.uhy.a(r3);
        r3 = (java.lang.Long) r3;
        r3 = r3.longValue();
        r5 = r13.b;
        r6 = java.lang.Long.valueOf(r3);
        r5 = r5.containsKey(r6);
        if (r5 == 0) goto L_0x0044;
    L_0x0042:
        goto L_0x00cb;
    L_0x0044:
        r5 = r14.ordinal();
        r7 = "HashingNameSanitizer";
        r8 = 0;
        r9 = 1;
        if (r5 == 0) goto L_0x005b;
    L_0x004e:
        if (r5 == r9) goto L_0x0056;
    L_0x0050:
        if (r5 == r1) goto L_0x0053;
    L_0x0052:
        goto L_0x00a4;
    L_0x0053:
        r5 = "--";
        goto L_0x00a5;
    L_0x0056:
        r5 = defpackage.uae.a(r2);
        goto L_0x00a5;
    L_0x005b:
        r5 = a;
        r5 = r5.matcher(r2);
        r10 = r5.matches();
        if (r10 == 0) goto L_0x009b;
    L_0x0067:
        r10 = "*sync*/";
        r11 = r2.startsWith(r10);
        if (r11 == 0) goto L_0x008d;
    L_0x006f:
        r5 = 7;
        r5 = r2.substring(r5);
        r5 = defpackage.uae.a(r5);
        r5 = java.lang.String.valueOf(r5);
        r11 = r5.length();
        if (r11 != 0) goto L_0x0088;
    L_0x0082:
        r5 = new java.lang.String;
        r5.<init>(r10);
        goto L_0x00a5;
    L_0x0088:
        r5 = r10.concat(r5);
        goto L_0x00a5;
    L_0x008d:
        r5 = r5.group(r9);
        r10 = new java.lang.String[r9];
        r10[r8] = r5;
        r11 = "non-sync system task wakelock: %s";
        defpackage.tyv.b(r7, r11, r10);
        goto L_0x00a5;
    L_0x009b:
        r5 = new java.lang.String[r9];
        r5[r8] = r2;
        r10 = "wakelock: %s";
        defpackage.tyv.b(r7, r10, r5);
    L_0x00a4:
        r5 = r2;
    L_0x00a5:
        r10 = defpackage.tuz.a(r5);
        r11 = 3;
        r12 = new java.io.Serializable[r11];
        r12[r8] = r14;
        r12[r9] = r5;
        r12[r1] = r10;
        r5 = "Sanitized Hash: [%s] %s -> %s";
        defpackage.tyv.b(r7, r5, r12);
        r5 = new java.io.Serializable[r11];
        r5[r8] = r14;
        r5[r9] = r2;
        r5[r1] = r6;
        r14 = "Raw Hash: [%s] %s -> %s";
        defpackage.tyv.a(r7, r14, r5);
        if (r10 == 0) goto L_0x00cb;
    L_0x00c6:
        r14 = r13.b;
        r14.putIfAbsent(r6, r10);
    L_0x00cb:
        r0.a(r3);
        r0.copyOnWrite();
        r14 = r0.instance;
        r14 = (defpackage.bcah) r14;
        r1 = r14.a;
        r1 = r1 & -3;
        r14.a = r1;
        r1 = defpackage.bcah.d;
        r1 = r1.c;
        r14.c = r1;
        r15.a(r0);
        r14 = r15.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.bcar) r14;
        return r14;
    L_0x00ed:
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uae.a(uad, bcar):bcar");
    }

    public final bcar a(bcar bcar) {
        bcah bcah = bcar.d;
        if (bcah == null) {
            bcah = bcah.d;
        }
        if ((bcah.a & 1) == 0) {
            return bcar;
        }
        anxl anxl = bcar.d;
        if (anxl == null) {
            anxl = bcah.d;
        }
        bcak bcak = (bcak) ((anxo) anxl.toBuilder());
        bcau bcau = (bcau) ((anxo) bcar.toBuilder());
        bcak.a(((Long) uhy.a((Long) this.b.get(Long.valueOf(((bcah) bcak.instance).b)))).longValue());
        bcau.a(bcak);
        return (bcar) ((anxl) bcau.build());
    }
}
