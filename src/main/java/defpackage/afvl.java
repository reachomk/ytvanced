package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: afvl */
public final class afvl implements wxx {
    private final Context a;
    private final zzl b;
    private final bcaa c;
    private final wya d;
    private final bcaa e;
    private final bcaa f;
    private final afve g;
    private final xsc h;
    private final Map i;
    private final Set j;
    private final acum k;
    private final afvn l;
    private final afvq m;

    public static void a(zzl zzl, wya wya, xsc xsc, int i, boolean z) {
        avlw a = afvl.a(zzl);
        aorh c = afvl.c(zzl);
        if ((afvl.b(zzl) && a != null) || (c != null && afvl.d(zzl))) {
            boolean z2 = !a.l ? z : true;
            if (z2) {
                wya.a("device_context_task");
            } else {
                wya wya2 = wya;
            }
            if (afvl.f(zzl) || afvl.g(zzl)) {
                wya.a("device_context_task", (long) i, a.c, z2, afvl.e(zzl), false, afvl.a(xsc, i), null, true, false);
            } else {
                long j;
                long j2 = 0;
                if (afvl.b(zzl)) {
                    j = afvl.a(zzl).b;
                    j = afvl.a(zzl).b;
                } else if (afvl.d(zzl)) {
                    j = afvl.c(zzl).b;
                    j = afvl.c(zzl).b;
                } else {
                    j = 0;
                }
                if (afvl.b(zzl)) {
                    j2 = afvl.a(zzl).c;
                } else if (afvl.d(zzl)) {
                    j2 = afvl.c(zzl).c;
                }
                wya.a("device_context_task", j, j2, z2, afvl.e(zzl), false, afvl.a(xsc, i), null, true);
            }
        }
    }

    private static Bundle a(xsc xsc, int i) {
        Bundle bundle = new Bundle();
        bundle.putLong("device_context_task_scheduled", xsc.a() + TimeUnit.SECONDS.toMillis((long) i));
        return bundle;
    }

    private static boolean b(zzl zzl) {
        arvt b = zzl.b();
        if (b != null) {
            avmc avmc = b.q;
            if (avmc == null) {
                avmc = avmc.m;
            }
            if (avmc.d && afvl.a(zzl) != null) {
                return true;
            }
        }
        return false;
    }

    private static aorh c(zzl zzl) {
        arvt b = zzl.b();
        if (b == null) {
            return null;
        }
        avmc avmc = b.q;
        if (avmc == null) {
            avmc = avmc.m;
        }
        aorh aorh = avmc.g;
        if (aorh == null) {
            aorh = aorh.g;
        }
        return aorh;
    }

    private static boolean d(zzl zzl) {
        aorh c = afvl.c(zzl);
        if (c == null || c.b <= 0 || c.c <= 0) {
            return false;
        }
        return true;
    }

    private static int e(zzl zzl) {
        avlw a = afvl.a(zzl);
        return (a == null || (a.a & 8) == 0 || a.e) ? 2 : 0;
    }

    public static avlw a(zzl zzl) {
        arvt b = zzl.b();
        if (b != null) {
            avmc avmc = b.q;
            if (avmc == null) {
                avmc = avmc.m;
            }
            if ((avmc.a & 64) != 0) {
                avmc avmc2 = b.q;
                if (avmc2 == null) {
                    avmc2 = avmc.m;
                }
                avlw avlw = avmc2.f;
                if (avlw == null) {
                    avlw = avlw.A;
                }
                return avlw;
            }
        }
        return null;
    }

    private static boolean f(zzl zzl) {
        avlw a = afvl.a(zzl);
        return a != null && a.g;
    }

    private static boolean g(zzl zzl) {
        avlw a = afvl.a(zzl);
        return a.s || a.v;
    }

    public afvl(Context context, zzl zzl, bcaa bcaa, bcaa bcaa2, wya wya, bcaa bcaa3, afve afve, xsc xsc, Map map, Set set, acum acum, afvq afvq) {
        afvn afvn = afvo.a;
        this.a = context;
        this.b = zzl;
        this.c = bcaa;
        this.e = bcaa2;
        this.d = wya;
        this.f = bcaa3;
        this.g = afve;
        this.h = xsc;
        this.i = map;
        this.j = set;
        this.k = acum;
        this.m = afvq;
        this.l = afvn;
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x031e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x039d  */
    /* JADX WARNING: Missing block: B:46:0x00d9, code skipped:
            if (r3.d != false) goto L_0x0028;
     */
    public final int a(android.os.Bundle r22) {
        /*
        r21 = this;
        r1 = r21;
        r2 = r22;
        r0 = r1.b;
        r0 = defpackage.afvl.d(r0);
        r3 = "display";
        r4 = "device_context_task";
        r5 = 2;
        r6 = 1;
        r7 = 0;
        if (r0 != 0) goto L_0x0428;
    L_0x0013:
        r0 = r1.b;
        r0 = defpackage.afvl.b(r0);
        if (r0 == 0) goto L_0x0421;
    L_0x001b:
        r0 = r1.b;
        r0 = defpackage.afvl.b(r0);
        if (r0 != 0) goto L_0x002b;
    L_0x0023:
        r0 = r1.d;
        r0.a(r4);
    L_0x0028:
        r2 = 0;
        goto L_0x041a;
    L_0x002b:
        r0 = r1.b;
        r4 = defpackage.afvl.a(r0);
        r0 = r1.b;
        r0 = defpackage.afvl.f(r0);
        r8 = 0;
        if (r0 != 0) goto L_0x0043;
    L_0x003b:
        r0 = r1.b;
        r0 = defpackage.afvl.g(r0);
        if (r0 == 0) goto L_0x0046;
    L_0x0043:
        r1.a(r4, r8);
    L_0x0046:
        r0 = r1.b;
        r0 = defpackage.afvl.a(r0);
        if (r0 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0054;
    L_0x004f:
        r0 = r0.q;
        if (r0 == 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0028;
    L_0x0054:
        r0 = android.os.Build.VERSION.SDK_INT;
        r10 = 19;
        if (r0 <= r10) goto L_0x006e;
    L_0x005a:
        r0 = r1.a;
        r0 = r0.getSystemService(r3);
        r0 = (android.hardware.display.DisplayManager) r0;
        r0 = r0.getDisplay(r7);
        r0 = r0.getState();
        if (r0 != r5) goto L_0x006e;
    L_0x006c:
        r0 = 1;
        goto L_0x006f;
    L_0x006e:
        r0 = 0;
    L_0x006f:
        r3 = r1.b;
        r3 = defpackage.afvl.e(r3);
        r10 = r1.b;
        r10 = defpackage.afvl.a(r10);
        r10 = r10.y;
        r11 = r1.a;
        r11 = r11.getApplicationContext();
        r12 = "wifi";
        r11 = r11.getSystemService(r12);
        r11 = (android.net.wifi.WifiManager) r11;
        r11 = r11.getConnectionInfo();
        if (r11 == 0) goto L_0x00aa;
    L_0x0091:
        r12 = r11.getSSID();
        r12 = android.text.TextUtils.isEmpty(r12);
        if (r12 != 0) goto L_0x00aa;
    L_0x009b:
        r12 = r11.getSSID();
        r13 = "<unknown ssid>";
        r12 = r12.equals(r13);
        if (r12 == 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00aa;
    L_0x00a8:
        r12 = 1;
        goto L_0x00ab;
    L_0x00aa:
        r12 = 0;
    L_0x00ab:
        r13 = r1.f;
        r13 = r13.get();
        r13 = (defpackage.xhv) r13;
        r14 = r13.c();
        if (r14 == 0) goto L_0x00c2;
    L_0x00b9:
        r13 = r13.e();
        if (r13 != 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00c2;
    L_0x00c0:
        r13 = 1;
        goto L_0x00c3;
    L_0x00c2:
        r13 = 0;
    L_0x00c3:
        if (r3 != r5) goto L_0x00cd;
    L_0x00c5:
        if (r10 == 0) goto L_0x00c9;
    L_0x00c7:
        if (r13 == 0) goto L_0x0028;
    L_0x00c9:
        if (r10 != 0) goto L_0x00cd;
    L_0x00cb:
        if (r12 == 0) goto L_0x0028;
    L_0x00cd:
        if (r0 != 0) goto L_0x00db;
    L_0x00cf:
        r3 = r1.b;
        r3 = defpackage.afvl.a(r3);
        if (r3 == 0) goto L_0x00db;
    L_0x00d7:
        r3 = r3.d;
        if (r3 != 0) goto L_0x0028;
    L_0x00db:
        r3 = r4.z;
        if (r3 != 0) goto L_0x03a7;
    L_0x00df:
        r3 = r1.c;
        r3 = r3.get();
        r3 = (defpackage.abeq) r3;
        r14 = new aber;
        r15 = r3.c;
        r7 = r3.d;
        r7 = r7.c();
        r14.<init>(r15, r7);
        r14.b = r0;
        if (r12 == 0) goto L_0x00fa;
    L_0x00f8:
        r0 = 1;
        goto L_0x0100;
    L_0x00fa:
        if (r10 == 0) goto L_0x00ff;
    L_0x00fc:
        if (r13 == 0) goto L_0x00ff;
    L_0x00fe:
        goto L_0x00f8;
    L_0x00ff:
        r0 = 0;
    L_0x0100:
        r14.a = r0;
        r0 = r1.a;
        r7 = r1.g;
        r0 = defpackage.afxw.a(r0, r7);
        r14.s = r0;
        r0 = r1.b;
        r0 = defpackage.afvl.a(r0);
        if (r0 != 0) goto L_0x0115;
    L_0x0114:
        goto L_0x011b;
    L_0x0115:
        r0 = r0.f;
        if (r0 == 0) goto L_0x011b;
    L_0x0119:
        r14.d = r6;
    L_0x011b:
        r0 = r1.b;
        r0 = r0.b();
        if (r0 != 0) goto L_0x0129;
    L_0x0123:
        r18 = r3;
        r17 = r4;
        goto L_0x02d2;
    L_0x0129:
        r0 = r0.q;
        if (r0 != 0) goto L_0x012f;
    L_0x012d:
        r0 = defpackage.avmc.m;
    L_0x012f:
        r0 = r0.e;
        if (r0 == 0) goto L_0x0123;
    L_0x0133:
        r0 = r11.getSSID();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0123;
    L_0x013d:
        r0 = r11.getSSID();
        r10 = "_nomap";
        r0 = r0.endsWith(r10);
        if (r0 != 0) goto L_0x0123;
    L_0x0149:
        r10 = r11.getSSID();
        r0 = r1.h;
        r11 = r0.a();
        r0 = java.util.concurrent.TimeUnit.DAYS;
        r13 = r1.b;
        r13 = defpackage.afvl.a(r13);
        r15 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        if (r13 == 0) goto L_0x0164;
    L_0x015f:
        r13 = r13.k;
        if (r13 <= 0) goto L_0x0164;
    L_0x0163:
        r15 = r13;
    L_0x0164:
        r7 = (long) r15;
        r7 = r0.toMillis(r7);
        r11 = r11 + r7;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r8 = new java.io.File;
        r0 = r1.a;
        r0 = r0.getFilesDir();
        r13 = "client_notif_store_file";
        r8.<init>(r0, r13);
        r0 = defpackage.anbk.a(r8);	 Catch:{ FileNotFoundException | IOException -> 0x01b3, FileNotFoundException | IOException -> 0x01b3 }
        r0 = r0.a();	 Catch:{ FileNotFoundException | IOException -> 0x01b3, FileNotFoundException | IOException -> 0x01b3 }
        r13 = r0 instanceof java.io.BufferedInputStream;	 Catch:{ FileNotFoundException | IOException -> 0x01b3, FileNotFoundException | IOException -> 0x01b3 }
        if (r13 == 0) goto L_0x018c;
    L_0x0188:
        r0 = (java.io.BufferedInputStream) r0;	 Catch:{ FileNotFoundException | IOException -> 0x01b3, FileNotFoundException | IOException -> 0x01b3 }
        r13 = r0;
        goto L_0x0191;
    L_0x018c:
        r13 = new java.io.BufferedInputStream;	 Catch:{ FileNotFoundException | IOException -> 0x01b3, FileNotFoundException | IOException -> 0x01b3 }
        r13.<init>(r0);	 Catch:{ FileNotFoundException | IOException -> 0x01b3, FileNotFoundException | IOException -> 0x01b3 }
    L_0x0191:
        r0 = defpackage.aocp.c;	 Catch:{ all -> 0x01a1 }
        r0 = defpackage.anxl.parseFrom(r0, r13);	 Catch:{ all -> 0x01a1 }
        r0 = (defpackage.aocp) r0;	 Catch:{ all -> 0x01a1 }
        if (r13 == 0) goto L_0x01b4;
    L_0x019b:
        r13.close();	 Catch:{ FileNotFoundException | IOException -> 0x019f, FileNotFoundException | IOException -> 0x019f }
        goto L_0x01b4;
        goto L_0x01b4;
    L_0x01a1:
        r0 = move-exception;
        r15 = r0;
        throw r15;	 Catch:{ all -> 0x01a4 }
    L_0x01a4:
        r0 = move-exception;
        r16 = r0;
        if (r13 == 0) goto L_0x01b2;
    L_0x01a9:
        r13.close();	 Catch:{ all -> 0x01ad }
        goto L_0x01b2;
    L_0x01ad:
        r0 = move-exception;
        r13 = r0;
        defpackage.ankx.a(r15, r13);	 Catch:{ FileNotFoundException | IOException -> 0x01b3, FileNotFoundException | IOException -> 0x01b3 }
    L_0x01b2:
        throw r16;	 Catch:{ FileNotFoundException | IOException -> 0x01b3, FileNotFoundException | IOException -> 0x01b3 }
    L_0x01b3:
        r0 = 0;
    L_0x01b4:
        if (r0 == 0) goto L_0x023f;
    L_0x01b6:
        r13 = r0.a;
        r13 = r13 & r6;
        if (r13 == 0) goto L_0x023f;
    L_0x01bb:
        r13 = r0.b;
        if (r13 != 0) goto L_0x01c1;
    L_0x01bf:
        r13 = defpackage.aoct.d;
    L_0x01c1:
        r13 = r13.b;
        r0 = r0.b;
        if (r0 != 0) goto L_0x01c9;
    L_0x01c7:
        r0 = defpackage.aoct.d;
    L_0x01c9:
        r0 = r0.c;
        r0 = r0.iterator();
        r15 = 0;
    L_0x01d0:
        r16 = r0.hasNext();
        if (r16 == 0) goto L_0x023a;
    L_0x01d6:
        r16 = r0.next();
        r9 = r16;
        r9 = (defpackage.aocr) r9;
        r5 = r9.b;
        r5 = r5.equals(r10);
        r6 = r9.e;
        if (r5 != 0) goto L_0x01ef;
    L_0x01e8:
        r18 = r3;
        r17 = r4;
        r3 = r9.d;
        goto L_0x01f4;
    L_0x01ef:
        r18 = r3;
        r17 = r4;
        r3 = r11;
    L_0x01f4:
        if (r5 == 0) goto L_0x01fa;
    L_0x01f6:
        r15 = r9.c;
        r6 = r6 + 1;
    L_0x01fa:
        r5 = r1.h;
        r19 = r5.a();
        r5 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1));
        if (r5 > 0) goto L_0x0207;
    L_0x0204:
        r19 = r0;
        goto L_0x0231;
    L_0x0207:
        r5 = defpackage.aocr.f;
        r5 = r5.createBuilder();
        r5 = (defpackage.aocu) r5;
        r19 = r0;
        r0 = r9.b;
        r5.a(r0);
        r0 = r9.c;
        r5.a(r0);
        r5.a(r3);
        r5.b(r6);
        r0 = r5.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aocr) r0;
        r7.add(r0);
        r0 = r9.c;
        r14.a(r0, r6);
    L_0x0231:
        r4 = r17;
        r3 = r18;
        r0 = r19;
        r5 = 2;
        r6 = 1;
        goto L_0x01d0;
    L_0x023a:
        r18 = r3;
        r17 = r4;
        goto L_0x0245;
    L_0x023f:
        r18 = r3;
        r17 = r4;
        r13 = 1;
        r15 = 0;
    L_0x0245:
        if (r15 != 0) goto L_0x026e;
    L_0x0247:
        r0 = r13 + 1;
        r3 = defpackage.aocr.f;
        r3 = r3.createBuilder();
        r3 = (defpackage.aocu) r3;
        r3.a(r10);
        r3.a(r13);
        r3.a(r11);
        r4 = 1;
        r3.b(r4);
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.aocr) r3;
        r7.add(r3);
        r14.a(r13, r4);
        r15 = r13;
        goto L_0x026f;
    L_0x026e:
        r0 = r13;
    L_0x026f:
        r3 = defpackage.aocp.c;	 Catch:{ IOException -> 0x02d0 }
        r3 = r3.createBuilder();	 Catch:{ IOException -> 0x02d0 }
        r3 = (defpackage.aocs) r3;	 Catch:{ IOException -> 0x02d0 }
        r4 = defpackage.aoct.d;	 Catch:{ IOException -> 0x02d0 }
        r4 = r4.createBuilder();	 Catch:{ IOException -> 0x02d0 }
        r4 = (defpackage.aocw) r4;	 Catch:{ IOException -> 0x02d0 }
        r4.copyOnWrite();	 Catch:{ IOException -> 0x02d0 }
        r5 = r4.instance;	 Catch:{ IOException -> 0x02d0 }
        r5 = (defpackage.aoct) r5;	 Catch:{ IOException -> 0x02d0 }
        r6 = r5.a;	 Catch:{ IOException -> 0x02d0 }
        r9 = 1;
        r6 = r6 | r9;
        r5.a = r6;	 Catch:{ IOException -> 0x02d0 }
        r5.b = r0;	 Catch:{ IOException -> 0x02d0 }
        r4.copyOnWrite();	 Catch:{ IOException -> 0x02d0 }
        r0 = r4.instance;	 Catch:{ IOException -> 0x02d0 }
        r0 = (defpackage.aoct) r0;	 Catch:{ IOException -> 0x02d0 }
        r5 = r0.c;	 Catch:{ IOException -> 0x02d0 }
        r5 = r5.a();	 Catch:{ IOException -> 0x02d0 }
        if (r5 != 0) goto L_0x02a5;
    L_0x029d:
        r5 = r0.c;	 Catch:{ IOException -> 0x02d0 }
        r5 = defpackage.anxl.mutableCopy(r5);	 Catch:{ IOException -> 0x02d0 }
        r0.c = r5;	 Catch:{ IOException -> 0x02d0 }
    L_0x02a5:
        r0 = r0.c;	 Catch:{ IOException -> 0x02d0 }
        defpackage.anvf.addAll(r7, r0);	 Catch:{ IOException -> 0x02d0 }
        r3.copyOnWrite();	 Catch:{ IOException -> 0x02d0 }
        r0 = r3.instance;	 Catch:{ IOException -> 0x02d0 }
        r0 = (defpackage.aocp) r0;	 Catch:{ IOException -> 0x02d0 }
        r4 = r4.build();	 Catch:{ IOException -> 0x02d0 }
        r4 = (defpackage.anxl) r4;	 Catch:{ IOException -> 0x02d0 }
        r4 = (defpackage.aoct) r4;	 Catch:{ IOException -> 0x02d0 }
        r0.b = r4;	 Catch:{ IOException -> 0x02d0 }
        r4 = r0.a;	 Catch:{ IOException -> 0x02d0 }
        r5 = 1;
        r4 = r4 | r5;
        r0.a = r4;	 Catch:{ IOException -> 0x02d0 }
        r0 = r3.build();	 Catch:{ IOException -> 0x02d0 }
        r0 = (defpackage.anxl) r0;	 Catch:{ IOException -> 0x02d0 }
        r0 = (defpackage.aocp) r0;	 Catch:{ IOException -> 0x02d0 }
        r0 = r0.toByteArray();	 Catch:{ IOException -> 0x02d0 }
        defpackage.anbk.a(r0, r8);	 Catch:{ IOException -> 0x02d0 }
    L_0x02d0:
        r14.c = r15;
    L_0x02d2:
        r0 = r1.b;
        r0 = defpackage.afvl.a(r0);
        r7 = -1;
        if (r0 != 0) goto L_0x02dc;
    L_0x02db:
        goto L_0x0339;
    L_0x02dc:
        r0 = r0.h;
        if (r0 == 0) goto L_0x0339;
    L_0x02e0:
        r0 = r1.b;
        r0 = defpackage.afvl.a(r0);
        if (r0 != 0) goto L_0x02ea;
    L_0x02e8:
        r0 = 0;
        goto L_0x02f0;
    L_0x02ea:
        r0 = r0.i;
        r0 = defpackage.anhe.a(r0);
    L_0x02f0:
        r3 = r1.m;
        r3 = r3.b();
        r5 = 0;
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r8 > 0) goto L_0x02fe;
    L_0x02fc:
        r3 = -1;
        goto L_0x031f;
    L_0x02fe:
        if (r0 == 0) goto L_0x02fc;
    L_0x0300:
        r5 = r1.h;
        r5 = r5.a();
        r5 = r5 - r3;
        java.util.Arrays.sort(r0);
        r3 = 0;
    L_0x030b:
        r4 = r0.length;
        if (r3 >= r4) goto L_0x031e;
    L_0x030e:
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r8 = r4.toHours(r5);
        r4 = r0[r3];
        r10 = (long) r4;
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 < 0) goto L_0x031f;
    L_0x031b:
        r3 = r3 + 1;
        goto L_0x030b;
    L_0x031e:
        r3 = r4;
    L_0x031f:
        r14.e = r3;
        if (r0 != 0) goto L_0x0324;
    L_0x0323:
        goto L_0x0336;
    L_0x0324:
        if (r3 >= 0) goto L_0x0327;
    L_0x0326:
        goto L_0x0336;
    L_0x0327:
        r4 = r0.length;
        if (r3 > r4) goto L_0x0336;
    L_0x032a:
        if (r4 == 0) goto L_0x0335;
    L_0x032c:
        if (r3 == r4) goto L_0x0331;
    L_0x032e:
        r7 = r0[r3];
        goto L_0x0336;
    L_0x0331:
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x0336;
    L_0x0335:
        r7 = 0;
    L_0x0336:
        r14.p = r7;
        goto L_0x033d;
    L_0x0339:
        r14.e = r7;
        r14.p = r7;
    L_0x033d:
        r0 = r1.b;
        r0 = defpackage.afvl.a(r0);
        if (r0 != 0) goto L_0x0348;
    L_0x0345:
        r3 = r18;
        goto L_0x0365;
    L_0x0348:
        r0 = r0.r;
        if (r0 == 0) goto L_0x0345;
    L_0x034c:
        if (r2 == 0) goto L_0x0345;
    L_0x034e:
        r0 = "device_context_task_scheduled";
        r3 = 0;
        r5 = r2.getLong(r0, r3);
        r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r0 == 0) goto L_0x0345;
    L_0x035a:
        r14.r = r5;
        r0 = r1.h;
        r2 = r0.a();
        r14.q = r2;
        goto L_0x0345;
    L_0x0365:
        r0 = r3.a;	 Catch:{ aanq -> 0x036f }
        r0 = r0.b(r14);	 Catch:{ aanq -> 0x036f }
        r7 = r0;
        r7 = (defpackage.aslo) r7;	 Catch:{ aanq -> 0x036f }
        goto L_0x0376;
    L_0x036f:
        r0 = move-exception;
        r2 = "Error in sending SendDeviceContextRequest.";
        defpackage.xtl.a(r2, r0);
        r7 = 0;
    L_0x0376:
        r0 = r1.b;
        r0 = defpackage.afvl.f(r0);
        if (r0 == 0) goto L_0x03f3;
    L_0x037e:
        if (r7 != 0) goto L_0x0381;
    L_0x0380:
        goto L_0x03f3;
    L_0x0381:
        r0 = r7.a;
        r2 = 2;
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x03f3;
    L_0x0387:
        r2 = 1;
        r0 = new java.lang.Object[r2];
        r2 = r7.c;
        if (r2 != 0) goto L_0x0390;
    L_0x038e:
        r2 = defpackage.aslq.c;
    L_0x0390:
        r2 = r2.b;
        r2 = java.lang.Long.valueOf(r2);
        r3 = 0;
        r0[r3] = r2;
        r0 = r7.c;
        if (r0 != 0) goto L_0x039f;
    L_0x039d:
        r0 = defpackage.aslq.c;
    L_0x039f:
        r2 = r0.b;
        r4 = r17;
        r1.a(r4, r2);
        goto L_0x03f3;
    L_0x03a7:
        r2 = r1.k;
        r3 = defpackage.asmw.f;
        r3 = r3.createBuilder();
        r3 = (defpackage.asmz) r3;
        r4 = defpackage.aqvv.f;
        r4 = r4.createBuilder();
        r4 = (defpackage.aqvu) r4;
        r5 = defpackage.aqvx.c;
        r5 = r5.createBuilder();
        r5 = (defpackage.aqvw) r5;
        r5.a(r0);
        r0 = r5.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqvx) r0;
        r4.copyOnWrite();
        r5 = r4.instance;
        r5 = (defpackage.aqvv) r5;
        if (r0 == 0) goto L_0x041b;
    L_0x03d5:
        r5.d = r0;
        r0 = r5.a;
        r0 = r0 | 4;
        r5.a = r0;
        r0 = r4.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqvv) r0;
        r3.a(r0);
        r0 = r3.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.asmw) r0;
        r2.a(r0);
    L_0x03f3:
        r0 = r1.b;
        r0 = defpackage.afvl.a(r0);
        if (r0 == 0) goto L_0x0028;
    L_0x03fb:
        r0 = r0.j;
        if (r0 == 0) goto L_0x0028;
    L_0x03ff:
        r0 = r1.e;
        r0 = r0.get();
        r0 = (defpackage.afxq) r0;
        r2 = r1.f;
        r2 = r2.get();
        r2 = (defpackage.xhv) r2;
        r2 = r2.c();
        r3 = r1.h;
        r0.a(r2, r3);
        goto L_0x0028;
    L_0x041a:
        return r2;
    L_0x041b:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0421:
        r2 = 0;
        r0 = r1.d;
        r0.a(r4);
        return r2;
    L_0x0428:
        r0 = r1.b;
        r0 = defpackage.afvl.d(r0);
        if (r0 != 0) goto L_0x0438;
    L_0x0430:
        r0 = r1.d;
        r0.a(r4);
    L_0x0435:
        r2 = 0;
        goto L_0x061a;
    L_0x0438:
        r0 = r1.b;
        r0 = defpackage.afvl.c(r0);
        r2 = defpackage.aqvv.f;
        r2 = r2.createBuilder();
        r2 = (defpackage.aqvu) r2;
        r4 = r2.instance;
        r4 = (defpackage.aqvv) r4;
        r4 = r4.c;
        if (r4 != 0) goto L_0x0450;
    L_0x044e:
        r4 = defpackage.aqvz.f;
    L_0x0450:
        r4 = r4.toBuilder();
        r4 = (defpackage.anxo) r4;
        r4 = (defpackage.aqvy) r4;
        r5 = r2.instance;
        r5 = (defpackage.aqvv) r5;
        r5 = r5.d;
        if (r5 != 0) goto L_0x0462;
    L_0x0460:
        r5 = defpackage.aqvx.c;
    L_0x0462:
        r5 = r5.toBuilder();
        r5 = (defpackage.anxo) r5;
        r5 = (defpackage.aqvw) r5;
        r6 = r2.instance;
        r6 = (defpackage.aqvv) r6;
        r6 = r6.b;
        if (r6 != 0) goto L_0x0474;
    L_0x0472:
        r6 = defpackage.aqwd.c;
    L_0x0474:
        r6 = r6.toBuilder();
        r6 = (defpackage.anxo) r6;
        r6 = (defpackage.aqwc) r6;
        r7 = r1.i;
        r8 = defpackage.aorj.class;
        r7 = r7.get(r8);
        r7 = (defpackage.afvf) r7;
        if (r7 != 0) goto L_0x048a;
    L_0x0488:
        goto L_0x0544;
    L_0x048a:
        r8 = r0.d;
        if (r8 != 0) goto L_0x0490;
    L_0x048e:
        r8 = defpackage.aorj.f;
    L_0x0490:
        r9 = r8.b;
        r10 = 23;
        r11 = 21;
        if (r9 != 0) goto L_0x04ad;
    L_0x0498:
        r9 = r8.c;
        if (r9 != 0) goto L_0x04ad;
    L_0x049c:
        r9 = r8.d;
        if (r9 != 0) goto L_0x04a1;
    L_0x04a0:
        goto L_0x04a5;
    L_0x04a1:
        r9 = android.os.Build.VERSION.SDK_INT;
        if (r9 >= r11) goto L_0x04ad;
    L_0x04a5:
        r8 = r8.e;
        if (r8 == 0) goto L_0x0544;
    L_0x04a9:
        r8 = android.os.Build.VERSION.SDK_INT;
        if (r8 < r10) goto L_0x0544;
    L_0x04ad:
        r8 = r0.d;
        if (r8 != 0) goto L_0x04b3;
    L_0x04b1:
        r8 = defpackage.aorj.f;
    L_0x04b3:
        r9 = r8.b;
        if (r9 != 0) goto L_0x04b8;
    L_0x04b7:
        goto L_0x04cd;
    L_0x04b8:
        r9 = r7.a;
        r9 = r9.b();
        r4.copyOnWrite();
        r12 = r4.instance;
        r12 = (defpackage.aqvz) r12;
        r13 = r12.a;
        r14 = 1;
        r13 = r13 | r14;
        r12.a = r13;
        r12.b = r9;
    L_0x04cd:
        r9 = r8.c;
        if (r9 != 0) goto L_0x04d2;
    L_0x04d1:
        goto L_0x04ec;
    L_0x04d2:
        r9 = r7.a;
        r9 = r9.a();
        r4.copyOnWrite();
        r12 = r4.instance;
        r12 = (defpackage.aqvz) r12;
        r13 = r12.a;
        r14 = 2;
        r13 = r13 | r14;
        r12.a = r13;
        r13 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r9 = r9 * r13;
        r9 = (int) r9;
        r12.c = r9;
    L_0x04ec:
        r9 = r8.d;
        if (r9 != 0) goto L_0x04f1;
    L_0x04f0:
        goto L_0x050d;
    L_0x04f1:
        r9 = android.os.Build.VERSION.SDK_INT;
        if (r9 < r11) goto L_0x050d;
    L_0x04f5:
        r7.a();
        r9 = r7.b;
        r9 = r9.isPowerSaveMode();
        r4.copyOnWrite();
        r11 = r4.instance;
        r11 = (defpackage.aqvz) r11;
        r12 = r11.a;
        r12 = r12 | 4;
        r11.a = r12;
        r11.d = r9;
    L_0x050d:
        r8 = r8.e;
        if (r8 == 0) goto L_0x052d;
    L_0x0511:
        r8 = android.os.Build.VERSION.SDK_INT;
        if (r8 < r10) goto L_0x052d;
    L_0x0515:
        r7.a();
        r7 = r7.b;
        r7 = r7.isDeviceIdleMode();
        r4.copyOnWrite();
        r8 = r4.instance;
        r8 = (defpackage.aqvz) r8;
        r9 = r8.a;
        r9 = r9 | 8;
        r8.a = r9;
        r8.e = r7;
    L_0x052d:
        r2.copyOnWrite();
        r7 = r2.instance;
        r7 = (defpackage.aqvv) r7;
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.aqvz) r4;
        r7.c = r4;
        r4 = r7.a;
        r8 = 2;
        r4 = r4 | r8;
        r7.a = r4;
    L_0x0544:
        r4 = r1.i;
        r7 = defpackage.aorl.class;
        r4 = r4.get(r7);
        r4 = (defpackage.afvj) r4;
        if (r4 != 0) goto L_0x0551;
    L_0x0550:
        goto L_0x0599;
    L_0x0551:
        r7 = r0.e;
        if (r7 == 0) goto L_0x0556;
    L_0x0555:
        goto L_0x0558;
    L_0x0556:
        r7 = defpackage.aorl.c;
    L_0x0558:
        r8 = android.os.Build.VERSION.SDK_INT;
        r9 = 20;
        if (r8 < r9) goto L_0x0599;
    L_0x055e:
        r7 = r7.b;
        if (r7 == 0) goto L_0x0599;
    L_0x0562:
        r7 = r0.e;
        r7 = android.os.Build.VERSION.SDK_INT;
        if (r7 < r9) goto L_0x0582;
    L_0x0568:
        r4 = r4.a;
        r3 = r4.getSystemService(r3);
        r3 = (android.hardware.display.DisplayManager) r3;
        r4 = 0;
        r3 = r3.getDisplay(r4);
        r3 = r3.getState();
        r4 = 2;
        if (r3 != r4) goto L_0x057e;
    L_0x057c:
        r3 = 1;
        goto L_0x057f;
    L_0x057e:
        r3 = 0;
    L_0x057f:
        r5.a(r3);
    L_0x0582:
        r2.copyOnWrite();
        r3 = r2.instance;
        r3 = (defpackage.aqvv) r3;
        r4 = r5.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.aqvx) r4;
        r3.d = r4;
        r4 = r3.a;
        r4 = r4 | 4;
        r3.a = r4;
    L_0x0599:
        r3 = r1.i;
        r4 = defpackage.aorn.class;
        r3 = r3.get(r4);
        r3 = (defpackage.afvr) r3;
        if (r3 != 0) goto L_0x05a6;
    L_0x05a5:
        goto L_0x05f9;
    L_0x05a6:
        r4 = r0.f;
        if (r4 != 0) goto L_0x05ac;
    L_0x05aa:
        r4 = defpackage.aorn.c;
    L_0x05ac:
        r4 = r4.b;
        if (r4 == 0) goto L_0x05f9;
    L_0x05b0:
        r0 = r0.f;
        if (r0 != 0) goto L_0x05b6;
    L_0x05b4:
        r0 = defpackage.aorn.c;
    L_0x05b6:
        r0 = r0.b;
        if (r0 != 0) goto L_0x05bb;
    L_0x05ba:
        goto L_0x05e2;
    L_0x05bb:
        r0 = r3.a;
        r0 = r0.get();
        r0 = (defpackage.xhv) r0;
        r3 = r0.c();
        if (r3 == 0) goto L_0x05d2;
    L_0x05c9:
        r0 = r0.e();
        if (r0 != 0) goto L_0x05d0;
    L_0x05cf:
        goto L_0x05d2;
    L_0x05d0:
        r0 = 1;
        goto L_0x05d3;
    L_0x05d2:
        r0 = 0;
    L_0x05d3:
        r6.copyOnWrite();
        r3 = r6.instance;
        r3 = (defpackage.aqwd) r3;
        r4 = r3.a;
        r5 = 1;
        r4 = r4 | r5;
        r3.a = r4;
        r3.b = r0;
    L_0x05e2:
        r2.copyOnWrite();
        r0 = r2.instance;
        r0 = (defpackage.aqvv) r0;
        r3 = r6.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.aqwd) r3;
        r0.b = r3;
        r3 = r0.a;
        r4 = 1;
        r3 = r3 | r4;
        r0.a = r3;
    L_0x05f9:
        r0 = r2.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqvv) r0;
        r2 = r1.j;
        r2 = r2.iterator();
    L_0x0607:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0435;
    L_0x060d:
        r3 = r2.next();
        r3 = (defpackage.afvk) r3;
        r3.a();
        r3.a(r0);
        goto L_0x0607;
    L_0x061a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afvl.a(android.os.Bundle):int");
    }

    private final void a(avlw avlw, long j) {
        avlw avlw2 = avlw;
        long a = this.h.a() / 1000;
        a = (j == 0 || j <= a) ? avlw2.b : j - a;
        if (avlw2.s) {
            if (TimeUnit.MILLISECONDS.toHours(this.h.a() - this.m.b()) > ((long) avlw2.t)) {
                a = TimeUnit.HOURS.toSeconds((long) avlw2.u);
            }
        }
        if (avlw2.v) {
            long toSeconds;
            int a2 = this.l.a() + ((int) TimeUnit.SECONDS.toHours(a));
            if (a2 < avlw2.w) {
                toSeconds = TimeUnit.HOURS.toSeconds((long) (avlw2.w - a2));
            } else if (a2 > avlw2.x) {
                toSeconds = TimeUnit.HOURS.toSeconds((long) (avlw2.w + (24 - a2)));
            }
            a += toSeconds;
        }
        long j2 = a;
        if (avlw2.m) {
            this.d.a("device_context_task");
        }
        this.d.a("device_context_task", j2, avlw2.c, true, 2, false, afvl.a(this.h, (int) j2), null, true, false);
    }
}
