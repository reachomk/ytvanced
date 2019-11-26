package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yj */
public final class yj {
    public static final zq a = new zq(16);
    public static final Object b = new Object();
    public static final aac c = new aac();
    private static final yr d = new yr("fonts");
    private static final Comparator e = new yn();

    static yo a(Context context, yg ygVar, int i) {
        try {
            ym a = yj.a(context, null, ygVar);
            int i2 = a.a;
            int i3 = -3;
            if (i2 == 0) {
                Typeface a2 = sj.a(context, null, a.b, i);
                if (a2 != null) {
                    i3 = 0;
                }
                return new yo(a2, i3);
            }
            if (i2 == 1) {
                i3 = -2;
            }
            return new yo(null, i3);
        } catch (NameNotFoundException unused) {
            return new yo(null, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x009a A:{SYNTHETIC, EDGE_INSN: B:61:0x009a->B:35:0x009a ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A:{Catch:{ all -> 0x00a6, InterruptedException -> 0x00ab }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0085 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|(2:30|(1:32)(3:62|33|34))(1:61)) */
    /* JADX WARNING: Missing block: B:35:0x009a, code skipped:
            r9 = r13.get();
     */
    /* JADX WARNING: Missing block: B:37:?, code skipped:
            r10.unlock();
     */
    public static android.graphics.Typeface a(android.content.Context r8, defpackage.yg r9, defpackage.ry r10, boolean r11, int r12, int r13) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r9.f;
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0.append(r13);
        r0 = r0.toString();
        r1 = a;
        r1 = r1.a(r0);
        r1 = (android.graphics.Typeface) r1;
        if (r1 == 0) goto L_0x0024;
    L_0x0020:
        r10.a(r1);
        return r1;
    L_0x0024:
        if (r11 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x003e;
    L_0x0027:
        r1 = -1;
        if (r12 != r1) goto L_0x003e;
    L_0x002a:
        r8 = defpackage.yj.a(r8, r9, r13);
        r9 = r8.b;
        if (r9 != 0) goto L_0x0038;
    L_0x0032:
        r9 = r8.a;
        r10.b(r9);
        goto L_0x003b;
    L_0x0038:
        r10.a(r9);
    L_0x003b:
        r8 = r8.a;
        return r8;
    L_0x003e:
        r2 = new yi;
        r2.<init>(r8, r9, r13, r0);
        r8 = 0;
        if (r11 == 0) goto L_0x00ac;
    L_0x0046:
        r9 = d;	 Catch:{ InterruptedException -> 0x00ab }
        r10 = new java.util.concurrent.locks.ReentrantLock;	 Catch:{ InterruptedException -> 0x00ab }
        r10.<init>();	 Catch:{ InterruptedException -> 0x00ab }
        r11 = r10.newCondition();	 Catch:{ InterruptedException -> 0x00ab }
        r13 = new java.util.concurrent.atomic.AtomicReference;	 Catch:{ InterruptedException -> 0x00ab }
        r13.<init>();	 Catch:{ InterruptedException -> 0x00ab }
        r6 = new java.util.concurrent.atomic.AtomicBoolean;	 Catch:{ InterruptedException -> 0x00ab }
        r0 = 1;
        r6.<init>(r0);	 Catch:{ InterruptedException -> 0x00ab }
        r7 = new yv;	 Catch:{ InterruptedException -> 0x00ab }
        r0 = r7;
        r1 = r13;
        r3 = r10;
        r4 = r6;
        r5 = r11;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ InterruptedException -> 0x00ab }
        r9.a(r7);	 Catch:{ InterruptedException -> 0x00ab }
        r10.lock();	 Catch:{ InterruptedException -> 0x00ab }
        r9 = r6.get();	 Catch:{ all -> 0x00a6 }
        if (r9 != 0) goto L_0x007a;
    L_0x0072:
        r9 = r13.get();	 Catch:{ all -> 0x00a6 }
        r10.unlock();	 Catch:{ InterruptedException -> 0x00ab }
        goto L_0x00a1;
    L_0x007a:
        r9 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00a6 }
        r0 = (long) r12;	 Catch:{ all -> 0x00a6 }
        r0 = r9.toNanos(r0);	 Catch:{ all -> 0x00a6 }
    L_0x0081:
        r0 = r11.awaitNanos(r0);	 Catch:{ InterruptedException -> 0x0085 }
    L_0x0085:
        r9 = r6.get();	 Catch:{ all -> 0x00a6 }
        if (r9 == 0) goto L_0x009a;
    L_0x008b:
        r2 = 0;
        r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r9 <= 0) goto L_0x0092;
    L_0x0091:
        goto L_0x0081;
    L_0x0092:
        r9 = new java.lang.InterruptedException;	 Catch:{ all -> 0x00a6 }
        r11 = "timeout";
        r9.<init>(r11);	 Catch:{ all -> 0x00a6 }
        throw r9;	 Catch:{ all -> 0x00a6 }
    L_0x009a:
        r9 = r13.get();	 Catch:{ all -> 0x00a6 }
        r10.unlock();	 Catch:{ InterruptedException -> 0x00ab }
    L_0x00a1:
        r9 = (defpackage.yo) r9;	 Catch:{ InterruptedException -> 0x00ab }
        r8 = r9.a;	 Catch:{ InterruptedException -> 0x00ab }
        return r8;
    L_0x00a6:
        r9 = move-exception;
        r10.unlock();	 Catch:{ InterruptedException -> 0x00ab }
        throw r9;	 Catch:{ InterruptedException -> 0x00ab }
    L_0x00ab:
        return r8;
    L_0x00ac:
        r9 = new yl;
        r9.<init>(r10);
        r10 = b;
        monitor-enter(r10);
        r11 = c;	 Catch:{ all -> 0x00e6 }
        r11 = r11.get(r0);	 Catch:{ all -> 0x00e6 }
        r11 = (java.util.ArrayList) r11;	 Catch:{ all -> 0x00e6 }
        if (r11 == 0) goto L_0x00c3;
    L_0x00be:
        r11.add(r9);	 Catch:{ all -> 0x00e6 }
        monitor-exit(r10);	 Catch:{ all -> 0x00e6 }
        return r8;
    L_0x00c3:
        r11 = new java.util.ArrayList;	 Catch:{ all -> 0x00e6 }
        r11.<init>();	 Catch:{ all -> 0x00e6 }
        r11.add(r9);	 Catch:{ all -> 0x00e6 }
        r9 = c;	 Catch:{ all -> 0x00e6 }
        r9.put(r0, r11);	 Catch:{ all -> 0x00e6 }
        monitor-exit(r10);	 Catch:{ all -> 0x00e6 }
        r9 = d;
        r10 = new yk;
        r10.<init>(r0);
        r11 = new android.os.Handler;
        r11.<init>();
        r12 = new yt;
        r12.<init>(r2, r11, r10);
        r9.a(r12);
        return r8;
    L_0x00e6:
        r8 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x00e6 }
        goto L_0x00ea;
    L_0x00e9:
        throw r8;
    L_0x00ea:
        goto L_0x00e9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.a(android.content.Context, yg, ry, boolean, int, int):android.graphics.Typeface");
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, yp[] ypVarArr) {
        return sj.a(context, cancellationSignal, ypVarArr, 0);
    }

    public static Map a(Context context, yp[] ypVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (yp ypVar : ypVarArr) {
            if (ypVar.e == 0) {
                Uri uri = ypVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, sq.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0195  */
    public static defpackage.ym a(android.content.Context r25, android.os.CancellationSignal r26, defpackage.yg r27) {
        /*
        r0 = r27;
        r1 = "result_code";
        r2 = "font_italic";
        r3 = "font_weight";
        r4 = "font_ttc_index";
        r5 = "file_id";
        r6 = "_id";
        r7 = r25.getPackageManager();
        r8 = r25.getResources();
        r9 = r0.a;
        r10 = 0;
        r11 = r7.resolveContentProvider(r9, r10);
        if (r11 == 0) goto L_0x01c1;
    L_0x001f:
        r12 = r11.packageName;
        r13 = r0.b;
        r12 = r12.equals(r13);
        if (r12 == 0) goto L_0x01a0;
    L_0x0029:
        r9 = r11.packageName;
        r12 = 64;
        r7 = r7.getPackageInfo(r9, r12);
        r7 = r7.signatures;
        r9 = new java.util.ArrayList;
        r9.<init>();
        r12 = 0;
    L_0x0039:
        r13 = r7.length;
        if (r12 >= r13) goto L_0x0048;
    L_0x003c:
        r13 = r7[r12];
        r13 = r13.toByteArray();
        r9.add(r13);
        r12 = r12 + 1;
        goto L_0x0039;
    L_0x0048:
        r7 = e;
        java.util.Collections.sort(r9, r7);
        r7 = r0.d;
        if (r7 != 0) goto L_0x0057;
    L_0x0051:
        r7 = r0.e;
        r7 = defpackage.rr.a(r8, r7);
    L_0x0057:
        r8 = 0;
    L_0x0058:
        r12 = r7.size();
        if (r8 >= r12) goto L_0x009a;
    L_0x005e:
        r12 = new java.util.ArrayList;
        r14 = r7.get(r8);
        r14 = (java.util.Collection) r14;
        r12.<init>(r14);
        r14 = e;
        java.util.Collections.sort(r12, r14);
        r14 = r9.size();
        r15 = r12.size();
        if (r14 == r15) goto L_0x0079;
    L_0x0078:
        goto L_0x0097;
    L_0x0079:
        r14 = 0;
    L_0x007a:
        r15 = r9.size();
        if (r14 >= r15) goto L_0x009b;
    L_0x0080:
        r15 = r9.get(r14);
        r15 = (byte[]) r15;
        r16 = r12.get(r14);
        r13 = r16;
        r13 = (byte[]) r13;
        r13 = java.util.Arrays.equals(r15, r13);
        if (r13 == 0) goto L_0x0097;
    L_0x0094:
        r14 = r14 + 1;
        goto L_0x007a;
    L_0x0097:
        r8 = r8 + 1;
        goto L_0x0058;
    L_0x009a:
        r11 = 0;
    L_0x009b:
        r7 = 1;
        if (r11 == 0) goto L_0x0199;
    L_0x009e:
        r8 = r11.authority;
        r9 = new java.util.ArrayList;
        r9.<init>();
        r11 = new android.net.Uri$Builder;
        r11.<init>();
        r12 = "content";
        r11 = r11.scheme(r12);
        r11 = r11.authority(r8);
        r11 = r11.build();
        r13 = new android.net.Uri$Builder;
        r13.<init>();
        r12 = r13.scheme(r12);
        r8 = r12.authority(r8);
        r12 = "file";
        r8 = r8.appendPath(r12);
        r8 = r8.build();
        r18 = r25.getContentResolver();	 Catch:{ all -> 0x0191 }
        r12 = 7;
        r12 = new java.lang.String[r12];	 Catch:{ all -> 0x0191 }
        r12[r10] = r6;	 Catch:{ all -> 0x0191 }
        r12[r7] = r5;	 Catch:{ all -> 0x0191 }
        r13 = 2;
        r12[r13] = r4;	 Catch:{ all -> 0x0191 }
        r13 = "font_variation_settings";
        r14 = 3;
        r12[r14] = r13;	 Catch:{ all -> 0x0191 }
        r13 = 4;
        r12[r13] = r3;	 Catch:{ all -> 0x0191 }
        r13 = 5;
        r12[r13] = r2;	 Catch:{ all -> 0x0191 }
        r13 = 6;
        r12[r13] = r1;	 Catch:{ all -> 0x0191 }
        r21 = "query = ?";
        r13 = new java.lang.String[r7];	 Catch:{ all -> 0x0191 }
        r0 = r0.c;	 Catch:{ all -> 0x0191 }
        r13[r10] = r0;	 Catch:{ all -> 0x0191 }
        r23 = 0;
        r19 = r11;
        r20 = r12;
        r22 = r13;
        r24 = r26;
        r13 = r18.query(r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x0191 }
        if (r13 == 0) goto L_0x017e;
    L_0x0103:
        r0 = r13.getCount();	 Catch:{ all -> 0x017c }
        if (r0 <= 0) goto L_0x017e;
    L_0x0109:
        r0 = r13.getColumnIndex(r1);	 Catch:{ all -> 0x017c }
        r9 = new java.util.ArrayList;	 Catch:{ all -> 0x017c }
        r9.<init>();	 Catch:{ all -> 0x017c }
        r1 = r13.getColumnIndex(r6);	 Catch:{ all -> 0x017c }
        r5 = r13.getColumnIndex(r5);	 Catch:{ all -> 0x017c }
        r4 = r13.getColumnIndex(r4);	 Catch:{ all -> 0x017c }
        r3 = r13.getColumnIndex(r3);	 Catch:{ all -> 0x017c }
        r2 = r13.getColumnIndex(r2);	 Catch:{ all -> 0x017c }
    L_0x0126:
        r6 = r13.moveToNext();	 Catch:{ all -> 0x017c }
        if (r6 == 0) goto L_0x017e;
    L_0x012c:
        r6 = -1;
        if (r0 == r6) goto L_0x0136;
    L_0x012f:
        r12 = r13.getInt(r0);	 Catch:{ all -> 0x017c }
        r19 = r12;
        goto L_0x0138;
    L_0x0136:
        r19 = 0;
    L_0x0138:
        if (r4 == r6) goto L_0x0141;
    L_0x013a:
        r12 = r13.getInt(r4);	 Catch:{ all -> 0x017c }
        r16 = r12;
        goto L_0x0143;
    L_0x0141:
        r16 = 0;
    L_0x0143:
        if (r5 != r6) goto L_0x014e;
    L_0x0145:
        r14 = r13.getLong(r1);	 Catch:{ all -> 0x017c }
        r12 = android.content.ContentUris.withAppendedId(r11, r14);	 Catch:{ all -> 0x017c }
        goto L_0x0156;
    L_0x014e:
        r14 = r13.getLong(r5);	 Catch:{ all -> 0x017c }
        r12 = android.content.ContentUris.withAppendedId(r8, r14);	 Catch:{ all -> 0x017c }
    L_0x0156:
        r15 = r12;
        if (r3 == r6) goto L_0x0160;
    L_0x0159:
        r12 = r13.getInt(r3);	 Catch:{ all -> 0x017c }
        r17 = r12;
        goto L_0x0164;
    L_0x0160:
        r12 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r17 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
    L_0x0164:
        if (r2 == r6) goto L_0x0170;
    L_0x0166:
        r6 = r13.getInt(r2);	 Catch:{ all -> 0x017c }
        if (r6 == r7) goto L_0x016d;
    L_0x016c:
        goto L_0x0170;
    L_0x016d:
        r18 = 1;
        goto L_0x0172;
    L_0x0170:
        r18 = 0;
    L_0x0172:
        r6 = new yp;	 Catch:{ all -> 0x017c }
        r14 = r6;
        r14.<init>(r15, r16, r17, r18, r19);	 Catch:{ all -> 0x017c }
        r9.add(r6);	 Catch:{ all -> 0x017c }
        goto L_0x0126;
    L_0x017c:
        r0 = move-exception;
        goto L_0x0193;
    L_0x017e:
        if (r13 == 0) goto L_0x0183;
    L_0x0180:
        r13.close();
    L_0x0183:
        r0 = new defpackage.yp[r10];
        r0 = r9.toArray(r0);
        r0 = (defpackage.yp[]) r0;
        r1 = new ym;
        r1.<init>(r10, r0);
        return r1;
    L_0x0191:
        r0 = move-exception;
        r13 = 0;
    L_0x0193:
        if (r13 == 0) goto L_0x0198;
    L_0x0195:
        r13.close();
    L_0x0198:
        throw r0;
    L_0x0199:
        r0 = new ym;
        r1 = 0;
        r0.<init>(r7, r1);
        return r0;
    L_0x01a0:
        r1 = new android.content.pm.PackageManager$NameNotFoundException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Found content provider ";
        r2.append(r3);
        r2.append(r9);
        r3 = ", but package was not ";
        r2.append(r3);
        r0 = r0.b;
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x01c1:
        r0 = new android.content.pm.PackageManager$NameNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "No package found for authority: ";
        r1.append(r2);
        r1.append(r9);
        r1 = r1.toString();
        r0.<init>(r1);
        goto L_0x01d9;
    L_0x01d8:
        throw r0;
    L_0x01d9:
        goto L_0x01d8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.a(android.content.Context, android.os.CancellationSignal, yg):ym");
    }
}
