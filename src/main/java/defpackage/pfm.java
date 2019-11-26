package defpackage;

/* renamed from: pfm */
public final class pfm extends pgb {
    public static pfm a;

    public pfm(pgd pgd) {
        super(pgd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        synchronized (pfm.class) {
            a = this;
        }
    }

    public final void a(pff pff, String str) {
        Object pff2 = pff == null ? "no hit data" : pff.toString();
        str = String.valueOf(str);
        String str2 = "Discarding hit. ";
        c(str.length() == 0 ? new String(str2) : str2.concat(str), pff2);
    }

    /* JADX WARNING: Missing block: B:74:0x017e, code skipped:
            return;
     */
    public final synchronized void a(int r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
        r6 = this;
        monitor-enter(r6);
        defpackage.pzr.a(r8);	 Catch:{ all -> 0x017f }
        r0 = r6.k();	 Catch:{ all -> 0x017f }
        r1 = r0.b;	 Catch:{ all -> 0x017f }
        r2 = 0;
        if (r1 != 0) goto L_0x0064;
    L_0x000d:
        monitor-enter(r0);	 Catch:{ all -> 0x017f }
        r1 = r0.b;	 Catch:{ all -> 0x0061 }
        if (r1 != 0) goto L_0x005f;
    L_0x0012:
        r1 = r0.a;	 Catch:{ all -> 0x0061 }
        r1 = r1.a;	 Catch:{ all -> 0x0061 }
        r1 = r1.getApplicationInfo();	 Catch:{ all -> 0x0061 }
        r3 = defpackage.qbi.a();	 Catch:{ all -> 0x0061 }
        if (r1 == 0) goto L_0x0034;
    L_0x0020:
        r1 = r1.processName;	 Catch:{ all -> 0x0061 }
        if (r1 == 0) goto L_0x002d;
    L_0x0024:
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0061 }
        if (r1 != 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002d;
    L_0x002b:
        r1 = 1;
        goto L_0x002e;
    L_0x002d:
        r1 = 0;
    L_0x002e:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x0061 }
        r0.b = r1;	 Catch:{ all -> 0x0061 }
    L_0x0034:
        r1 = r0.b;	 Catch:{ all -> 0x0061 }
        if (r1 == 0) goto L_0x0040;
    L_0x0038:
        r1 = r0.b;	 Catch:{ all -> 0x0061 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0061 }
        if (r1 != 0) goto L_0x004c;
    L_0x0040:
        r1 = "com.google.android.gms.analytics";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0061 }
        if (r1 == 0) goto L_0x004c;
    L_0x0048:
        r1 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x0061 }
        r0.b = r1;	 Catch:{ all -> 0x0061 }
    L_0x004c:
        r1 = r0.b;	 Catch:{ all -> 0x0061 }
        if (r1 != 0) goto L_0x005f;
    L_0x0050:
        r1 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x0061 }
        r0.b = r1;	 Catch:{ all -> 0x0061 }
        r1 = r0.a;	 Catch:{ all -> 0x0061 }
        r1 = r1.a();	 Catch:{ all -> 0x0061 }
        r3 = "My process not in the list of running processes";
        r1.c(r3);	 Catch:{ all -> 0x0061 }
    L_0x005f:
        monitor-exit(r0);	 Catch:{ all -> 0x0061 }
        goto L_0x0064;
    L_0x0061:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0061 }
        throw r7;	 Catch:{ all -> 0x017f }
    L_0x0064:
        r0 = r0.b;	 Catch:{ all -> 0x017f }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x017f }
        if (r0 != 0) goto L_0x006f;
    L_0x006c:
        r0 = 99;
        goto L_0x0071;
    L_0x006f:
        r0 = 67;
    L_0x0071:
        r1 = "01VDIWEA?";
        r7 = r1.charAt(r7);	 Catch:{ all -> 0x017f }
        r1 = defpackage.pge.a;	 Catch:{ all -> 0x017f }
        r9 = defpackage.pfm.a(r9);	 Catch:{ all -> 0x017f }
        r10 = defpackage.pfm.a(r10);	 Catch:{ all -> 0x017f }
        r11 = defpackage.pfm.a(r11);	 Catch:{ all -> 0x017f }
        r8 = defpackage.pgc.a(r8, r9, r10, r11);	 Catch:{ all -> 0x017f }
        r9 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x017f }
        r9 = r9.length();	 Catch:{ all -> 0x017f }
        r10 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x017f }
        r10 = r10.length();	 Catch:{ all -> 0x017f }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x017f }
        r9 = r9 + 4;
        r9 = r9 + r10;
        r11.<init>(r9);	 Catch:{ all -> 0x017f }
        r9 = "3";
        r11.append(r9);	 Catch:{ all -> 0x017f }
        r11.append(r7);	 Catch:{ all -> 0x017f }
        r11.append(r0);	 Catch:{ all -> 0x017f }
        r11.append(r1);	 Catch:{ all -> 0x017f }
        r7 = ":";
        r11.append(r7);	 Catch:{ all -> 0x017f }
        r11.append(r8);	 Catch:{ all -> 0x017f }
        r7 = r11.toString();	 Catch:{ all -> 0x017f }
        r8 = r7.length();	 Catch:{ all -> 0x017f }
        r9 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r8 > r9) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c8;
    L_0x00c4:
        r7 = r7.substring(r2, r9);	 Catch:{ all -> 0x017f }
    L_0x00c8:
        r8 = r6.g;	 Catch:{ all -> 0x017f }
        r9 = r8.g;	 Catch:{ all -> 0x017f }
        r10 = 0;
        if (r9 == 0) goto L_0x00d7;
    L_0x00cf:
        r9 = r9.e();	 Catch:{ all -> 0x017f }
        if (r9 == 0) goto L_0x00d7;
    L_0x00d5:
        r10 = r8.g;	 Catch:{ all -> 0x017f }
    L_0x00d7:
        if (r10 == 0) goto L_0x017d;
    L_0x00d9:
        r8 = r10.c;	 Catch:{ all -> 0x017f }
        r9 = r8.a;	 Catch:{ all -> 0x017f }
        r9 = r9.a;	 Catch:{ all -> 0x017f }
        r10 = r8.a();	 Catch:{ all -> 0x017f }
        r0 = 0;
        r9 = r9.getLong(r10, r0);	 Catch:{ all -> 0x017f }
        r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r11 == 0) goto L_0x00ee;
    L_0x00ed:
        goto L_0x0118;
    L_0x00ee:
        r9 = r8.a;	 Catch:{ all -> 0x017f }
        r9 = r9.h();	 Catch:{ all -> 0x017f }
        r9 = r9.a();	 Catch:{ all -> 0x017f }
        r11 = r8.a;	 Catch:{ all -> 0x017f }
        r11 = r11.a;	 Catch:{ all -> 0x017f }
        r11 = r11.edit();	 Catch:{ all -> 0x017f }
        r2 = r8.b();	 Catch:{ all -> 0x017f }
        r11.remove(r2);	 Catch:{ all -> 0x017f }
        r2 = r8.c();	 Catch:{ all -> 0x017f }
        r11.remove(r2);	 Catch:{ all -> 0x017f }
        r2 = r8.a();	 Catch:{ all -> 0x017f }
        r11.putLong(r2, r9);	 Catch:{ all -> 0x017f }
        r11.commit();	 Catch:{ all -> 0x017f }
    L_0x0118:
        if (r7 != 0) goto L_0x011c;
    L_0x011a:
        r7 = "";
    L_0x011c:
        monitor-enter(r8);	 Catch:{ all -> 0x017f }
        r9 = r8.a;	 Catch:{ all -> 0x017a }
        r9 = r9.a;	 Catch:{ all -> 0x017a }
        r10 = r8.b();	 Catch:{ all -> 0x017a }
        r9 = r9.getLong(r10, r0);	 Catch:{ all -> 0x017a }
        r2 = 1;
        r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r11 > 0) goto L_0x014b;
    L_0x012f:
        r9 = r8.a;	 Catch:{ all -> 0x017a }
        r9 = r9.a;	 Catch:{ all -> 0x017a }
        r9 = r9.edit();	 Catch:{ all -> 0x017a }
        r10 = r8.c();	 Catch:{ all -> 0x017a }
        r9.putString(r10, r7);	 Catch:{ all -> 0x017a }
        r7 = r8.b();	 Catch:{ all -> 0x017a }
        r9.putLong(r7, r2);	 Catch:{ all -> 0x017a }
        r9.apply();	 Catch:{ all -> 0x017a }
        monitor-exit(r8);	 Catch:{ all -> 0x017a }
        monitor-exit(r6);
        return;
    L_0x014b:
        r11 = java.util.UUID.randomUUID();	 Catch:{ all -> 0x017a }
        r0 = r11.getLeastSignificantBits();	 Catch:{ all -> 0x017a }
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = r0 & r4;
        r9 = r9 + r2;
        r4 = r4 / r9;
        r11 = r8.a;	 Catch:{ all -> 0x017a }
        r11 = r11.a;	 Catch:{ all -> 0x017a }
        r11 = r11.edit();	 Catch:{ all -> 0x017a }
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x016e;
    L_0x0167:
        r0 = r8.c();	 Catch:{ all -> 0x017a }
        r11.putString(r0, r7);	 Catch:{ all -> 0x017a }
    L_0x016e:
        r7 = r8.b();	 Catch:{ all -> 0x017a }
        r11.putLong(r7, r9);	 Catch:{ all -> 0x017a }
        r11.apply();	 Catch:{ all -> 0x017a }
        monitor-exit(r8);	 Catch:{ all -> 0x017a }
        goto L_0x017d;
    L_0x017a:
        r7 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x017a }
        throw r7;	 Catch:{ all -> 0x017f }
    L_0x017d:
        monitor-exit(r6);
        return;
    L_0x017f:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfm.a(int, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    private static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d));
            return stringBuilder.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
    }
}
