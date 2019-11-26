package defpackage;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: brs */
public final class brs implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final int d;
    public long e = 0;
    public Writer f;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    public int h;
    private final File i;
    private final int j;
    private final long k;
    private long l = 0;
    private final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bru());
    private final Callable n = new brr(this);

    public brs(File file, long j) {
        File file2 = file;
        this.a = file2;
        this.j = 1;
        this.b = new File(file2, "journal");
        this.c = new File(file2, "journal.tmp");
        this.i = new File(file2, "journal.bkp");
        this.d = 1;
        this.k = j;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x0130=Splitter:B:75:0x0130, B:82:0x015b=Splitter:B:82:0x015b} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0130 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00d2 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:75|76|(1:78)(1:79)|80|81) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:44|45|46) */
    /* JADX WARNING: Missing block: B:46:0x00d6, code skipped:
            throw defpackage.brw.a(r4);
     */
    /* JADX WARNING: Missing block: B:76:?, code skipped:
            r11.h = r2 - r11.g.size();
     */
    /* JADX WARNING: Missing block: B:77:0x013b, code skipped:
            if (r1.b == -1) goto L_0x013d;
     */
    /* JADX WARNING: Missing block: B:78:0x013d, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:79:0x0141, code skipped:
            r11.f = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r11.b, true), defpackage.bsa.a));
     */
    /* JADX WARNING: Missing block: B:80:0x0157, code skipped:
            defpackage.bsa.a(r1);
     */
    /* JADX WARNING: Missing block: B:81:0x015a, code skipped:
            return;
     */
    public final void a() {
        /*
        r11 = this;
        r0 = ", ";
        r1 = new bry;
        r2 = new java.io.FileInputStream;
        r3 = r11.b;
        r2.<init>(r3);
        r3 = defpackage.bsa.a;
        r1.<init>(r2, r3);
        r2 = r1.a();	 Catch:{ all -> 0x01ae }
        r3 = r1.a();	 Catch:{ all -> 0x01ae }
        r4 = r1.a();	 Catch:{ all -> 0x01ae }
        r5 = r1.a();	 Catch:{ all -> 0x01ae }
        r6 = r1.a();	 Catch:{ all -> 0x01ae }
        r7 = "libcore.io.DiskLruCache";
        r7 = r7.equals(r2);	 Catch:{ all -> 0x01ae }
        if (r7 == 0) goto L_0x015b;
    L_0x002c:
        r7 = "1";
        r7 = r7.equals(r3);	 Catch:{ all -> 0x01ae }
        if (r7 == 0) goto L_0x015b;
    L_0x0034:
        r7 = r11.j;	 Catch:{ all -> 0x01ae }
        r7 = java.lang.Integer.toString(r7);	 Catch:{ all -> 0x01ae }
        r4 = r7.equals(r4);	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x015b;
    L_0x0040:
        r4 = r11.d;	 Catch:{ all -> 0x01ae }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ all -> 0x01ae }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x015b;
    L_0x004c:
        r4 = "";
        r4 = r4.equals(r6);	 Catch:{ all -> 0x01ae }
        if (r4 == 0) goto L_0x015b;
    L_0x0054:
        r0 = 0;
        r2 = 0;
    L_0x0056:
        r3 = -1;
        r4 = r1.a();	 Catch:{ EOFException -> 0x0130 }
        r5 = 32;
        r6 = r4.indexOf(r5);	 Catch:{ EOFException -> 0x0130 }
        r7 = "unexpected journal line: ";
        if (r6 == r3) goto L_0x011a;
    L_0x0065:
        r8 = r6 + 1;
        r5 = r4.indexOf(r5, r8);	 Catch:{ EOFException -> 0x0130 }
        if (r5 != r3) goto L_0x0083;
    L_0x006d:
        r8 = r4.substring(r8);	 Catch:{ EOFException -> 0x0130 }
        r9 = 6;
        if (r6 != r9) goto L_0x0087;
    L_0x0074:
        r9 = "REMOVE";
        r9 = r4.startsWith(r9);	 Catch:{ EOFException -> 0x0130 }
        if (r9 == 0) goto L_0x0087;
    L_0x007c:
        r4 = r11.g;	 Catch:{ EOFException -> 0x0130 }
        r4.remove(r8);	 Catch:{ EOFException -> 0x0130 }
        goto L_0x0100;
    L_0x0083:
        r8 = r4.substring(r8, r5);	 Catch:{ EOFException -> 0x0130 }
    L_0x0087:
        r9 = r11.g;	 Catch:{ EOFException -> 0x0130 }
        r9 = r9.get(r8);	 Catch:{ EOFException -> 0x0130 }
        r9 = (defpackage.brw) r9;	 Catch:{ EOFException -> 0x0130 }
        if (r9 != 0) goto L_0x009b;
    L_0x0091:
        r9 = new brw;	 Catch:{ EOFException -> 0x0130 }
        r9.<init>(r11, r8);	 Catch:{ EOFException -> 0x0130 }
        r10 = r11.g;	 Catch:{ EOFException -> 0x0130 }
        r10.put(r8, r9);	 Catch:{ EOFException -> 0x0130 }
    L_0x009b:
        r8 = 5;
        if (r5 == r3) goto L_0x00dc;
    L_0x009e:
        if (r6 != r8) goto L_0x00dc;
    L_0x00a0:
        r10 = "CLEAN";
        r10 = r4.startsWith(r10);	 Catch:{ EOFException -> 0x0130 }
        if (r10 == 0) goto L_0x00dc;
    L_0x00a8:
        r5 = r5 + 1;
        r4 = r4.substring(r5);	 Catch:{ EOFException -> 0x0130 }
        r5 = " ";
        r4 = r4.split(r5);	 Catch:{ EOFException -> 0x0130 }
        r9.d = true;	 Catch:{ EOFException -> 0x0130 }
        r5 = 0;
        r9.e = r5;	 Catch:{ EOFException -> 0x0130 }
        r5 = r4.length;	 Catch:{ EOFException -> 0x0130 }
        r6 = r9.g;	 Catch:{ EOFException -> 0x0130 }
        r6 = r6.d;	 Catch:{ EOFException -> 0x0130 }
        if (r5 != r6) goto L_0x00d7;
    L_0x00c1:
        r5 = 0;
    L_0x00c2:
        r6 = r4.length;	 Catch:{ NumberFormatException -> 0x00d2 }
        if (r5 >= r6) goto L_0x0100;
    L_0x00c5:
        r6 = r9.b;	 Catch:{ NumberFormatException -> 0x00d2 }
        r7 = r4[r5];	 Catch:{ NumberFormatException -> 0x00d2 }
        r7 = java.lang.Long.parseLong(r7);	 Catch:{ NumberFormatException -> 0x00d2 }
        r6[r5] = r7;	 Catch:{ NumberFormatException -> 0x00d2 }
        r5 = r5 + 1;
        goto L_0x00c2;
    L_0x00d2:
        r0 = defpackage.brw.a(r4);	 Catch:{ EOFException -> 0x0130 }
        throw r0;	 Catch:{ EOFException -> 0x0130 }
    L_0x00d7:
        r0 = defpackage.brw.a(r4);	 Catch:{ EOFException -> 0x0130 }
        throw r0;	 Catch:{ EOFException -> 0x0130 }
    L_0x00dc:
        if (r5 != r3) goto L_0x00f1;
    L_0x00de:
        if (r6 == r8) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00f1;
    L_0x00e1:
        r8 = "DIRTY";
        r8 = r4.startsWith(r8);	 Catch:{ EOFException -> 0x0130 }
        if (r8 == 0) goto L_0x00f1;
    L_0x00e9:
        r4 = new brt;	 Catch:{ EOFException -> 0x0130 }
        r4.<init>(r11, r9);	 Catch:{ EOFException -> 0x0130 }
        r9.e = r4;	 Catch:{ EOFException -> 0x0130 }
        goto L_0x0100;
    L_0x00f1:
        if (r5 != r3) goto L_0x0104;
    L_0x00f3:
        r5 = 4;
        if (r6 == r5) goto L_0x00f7;
    L_0x00f6:
        goto L_0x0104;
    L_0x00f7:
        r5 = "READ";
        r5 = r4.startsWith(r5);	 Catch:{ EOFException -> 0x0130 }
        if (r5 != 0) goto L_0x0100;
    L_0x00ff:
        goto L_0x0104;
    L_0x0100:
        r2 = r2 + 1;
        goto L_0x0056;
    L_0x0104:
        r0 = new java.io.IOException;	 Catch:{ EOFException -> 0x0130 }
        r5 = r4.length();	 Catch:{ EOFException -> 0x0130 }
        if (r5 != 0) goto L_0x0112;
    L_0x010c:
        r4 = new java.lang.String;	 Catch:{ EOFException -> 0x0130 }
        r4.<init>(r7);	 Catch:{ EOFException -> 0x0130 }
        goto L_0x0116;
    L_0x0112:
        r4 = r7.concat(r4);	 Catch:{ EOFException -> 0x0130 }
    L_0x0116:
        r0.<init>(r4);	 Catch:{ EOFException -> 0x0130 }
        throw r0;	 Catch:{ EOFException -> 0x0130 }
    L_0x011a:
        r0 = new java.io.IOException;	 Catch:{ EOFException -> 0x0130 }
        r5 = r4.length();	 Catch:{ EOFException -> 0x0130 }
        if (r5 != 0) goto L_0x0128;
    L_0x0122:
        r4 = new java.lang.String;	 Catch:{ EOFException -> 0x0130 }
        r4.<init>(r7);	 Catch:{ EOFException -> 0x0130 }
        goto L_0x012c;
    L_0x0128:
        r4 = r7.concat(r4);	 Catch:{ EOFException -> 0x0130 }
    L_0x012c:
        r0.<init>(r4);	 Catch:{ EOFException -> 0x0130 }
        throw r0;	 Catch:{ EOFException -> 0x0130 }
    L_0x0130:
        r0 = r11.g;	 Catch:{ all -> 0x01ae }
        r0 = r0.size();	 Catch:{ all -> 0x01ae }
        r2 = r2 - r0;
        r11.h = r2;	 Catch:{ all -> 0x01ae }
        r0 = r1.b;	 Catch:{ all -> 0x01ae }
        if (r0 != r3) goto L_0x0141;
    L_0x013d:
        r11.b();	 Catch:{ all -> 0x01ae }
        goto L_0x0157;
    L_0x0141:
        r0 = new java.io.BufferedWriter;	 Catch:{ all -> 0x01ae }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x01ae }
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x01ae }
        r4 = r11.b;	 Catch:{ all -> 0x01ae }
        r5 = 1;
        r3.<init>(r4, r5);	 Catch:{ all -> 0x01ae }
        r4 = defpackage.bsa.a;	 Catch:{ all -> 0x01ae }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x01ae }
        r0.<init>(r2);	 Catch:{ all -> 0x01ae }
        r11.f = r0;	 Catch:{ all -> 0x01ae }
    L_0x0157:
        defpackage.bsa.a(r1);
        return;
    L_0x015b:
        r4 = new java.io.IOException;	 Catch:{ all -> 0x01ae }
        r7 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x01ae }
        r7 = r7.length();	 Catch:{ all -> 0x01ae }
        r7 = r7 + 35;
        r8 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x01ae }
        r8 = r8.length();	 Catch:{ all -> 0x01ae }
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x01ae }
        r8 = r8.length();	 Catch:{ all -> 0x01ae }
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x01ae }
        r8 = r8.length();	 Catch:{ all -> 0x01ae }
        r7 = r7 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ae }
        r8.<init>(r7);	 Catch:{ all -> 0x01ae }
        r7 = "unexpected journal header: [";
        r8.append(r7);	 Catch:{ all -> 0x01ae }
        r8.append(r2);	 Catch:{ all -> 0x01ae }
        r8.append(r0);	 Catch:{ all -> 0x01ae }
        r8.append(r3);	 Catch:{ all -> 0x01ae }
        r8.append(r0);	 Catch:{ all -> 0x01ae }
        r8.append(r5);	 Catch:{ all -> 0x01ae }
        r8.append(r0);	 Catch:{ all -> 0x01ae }
        r8.append(r6);	 Catch:{ all -> 0x01ae }
        r0 = "]";
        r8.append(r0);	 Catch:{ all -> 0x01ae }
        r0 = r8.toString();	 Catch:{ all -> 0x01ae }
        r4.<init>(r0);	 Catch:{ all -> 0x01ae }
        throw r4;	 Catch:{ all -> 0x01ae }
    L_0x01ae:
        r0 = move-exception;
        defpackage.bsa.a(r1);
        goto L_0x01b4;
    L_0x01b3:
        throw r0;
    L_0x01b4:
        goto L_0x01b3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brs.a():void");
    }

    public final synchronized void b() {
        Writer writer = this.f;
        if (writer != null) {
            brs.a(writer);
        }
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), bsa.a));
        try {
            writer.write("libcore.io.DiskLruCache");
            writer.write("\n");
            writer.write("1");
            writer.write("\n");
            writer.write(Integer.toString(this.j));
            writer.write("\n");
            writer.write(Integer.toString(this.d));
            writer.write("\n");
            writer.write("\n");
            for (brw brw : this.g.values()) {
                String a;
                if (brw.e == null) {
                    String str = brw.a;
                    a = brw.a();
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(a).length());
                    stringBuilder.append("CLEAN ");
                    stringBuilder.append(str);
                    stringBuilder.append(a);
                    stringBuilder.append(10);
                    writer.write(stringBuilder.toString());
                } else {
                    a = brw.a;
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 7);
                    stringBuilder2.append("DIRTY ");
                    stringBuilder2.append(a);
                    stringBuilder2.append(10);
                    writer.write(stringBuilder2.toString());
                }
            }
            if (this.b.exists()) {
                brs.a(this.b, this.i, true);
            }
            brs.a(this.c, this.b, false);
            this.i.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), bsa.a));
        } finally {
            brs.a(writer);
        }
    }

    public static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void a(File file, File file2, boolean z) {
        if (z) {
            brs.a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized brv a(String str) {
        e();
        brw brw = (brw) this.g.get(str);
        if (brw == null) {
            return null;
        }
        if (!brw.d) {
            return null;
        }
        for (File exists : brw.c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.h++;
        this.f.append("READ");
        this.f.append(' ');
        this.f.append(str);
        this.f.append(10);
        if (c()) {
            this.m.submit(this.n);
        }
        return new brv(brw.c);
    }

    public final synchronized brt b(String str) {
        e();
        brw brw = (brw) this.g.get(str);
        if (brw == null) {
            brw = new brw(this, str);
            this.g.put(str, brw);
        } else if (brw.e != null) {
            return null;
        }
        brt brt = new brt(this, brw);
        brw.e = brt;
        this.f.append("DIRTY");
        this.f.append(' ');
        this.f.append(str);
        this.f.append(10);
        brs.b(this.f);
        return brt;
    }

    /* JADX WARNING: Missing block: B:45:0x00f5, code skipped:
            return;
     */
    public final synchronized void a(defpackage.brt r10, boolean r11) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r10.a;	 Catch:{ all -> 0x00fc }
        r1 = r0.e;	 Catch:{ all -> 0x00fc }
        if (r1 != r10) goto L_0x00f6;
    L_0x0007:
        r1 = 0;
        if (r11 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0049;
    L_0x000b:
        r2 = r0.d;	 Catch:{ all -> 0x00fc }
        if (r2 != 0) goto L_0x0049;
    L_0x000f:
        r2 = 0;
    L_0x0010:
        r3 = r9.d;	 Catch:{ all -> 0x00fc }
        if (r2 < r3) goto L_0x0015;
    L_0x0014:
        goto L_0x0049;
    L_0x0015:
        r3 = r10.b;	 Catch:{ all -> 0x00fc }
        r3 = r3[r2];	 Catch:{ all -> 0x00fc }
        if (r3 == 0) goto L_0x002d;
    L_0x001b:
        r3 = r0.b(r2);	 Catch:{ all -> 0x00fc }
        r3 = r3.exists();	 Catch:{ all -> 0x00fc }
        if (r3 == 0) goto L_0x0028;
    L_0x0025:
        r2 = r2 + 1;
        goto L_0x0010;
    L_0x0028:
        r10.a();	 Catch:{ all -> 0x00fc }
        monitor-exit(r9);
        return;
    L_0x002d:
        r10.a();	 Catch:{ all -> 0x00fc }
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00fc }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fc }
        r0 = 61;
        r11.<init>(r0);	 Catch:{ all -> 0x00fc }
        r0 = "Newly created entry didn't create value for index ";
        r11.append(r0);	 Catch:{ all -> 0x00fc }
        r11.append(r2);	 Catch:{ all -> 0x00fc }
        r11 = r11.toString();	 Catch:{ all -> 0x00fc }
        r10.<init>(r11);	 Catch:{ all -> 0x00fc }
        throw r10;	 Catch:{ all -> 0x00fc }
    L_0x0049:
        r10 = r9.d;	 Catch:{ all -> 0x00fc }
        if (r1 >= r10) goto L_0x0079;
    L_0x004d:
        r10 = r0.b(r1);	 Catch:{ all -> 0x00fc }
        if (r11 == 0) goto L_0x0073;
    L_0x0053:
        r2 = r10.exists();	 Catch:{ all -> 0x00fc }
        if (r2 == 0) goto L_0x0076;
    L_0x0059:
        r2 = r0.a(r1);	 Catch:{ all -> 0x00fc }
        r10.renameTo(r2);	 Catch:{ all -> 0x00fc }
        r10 = r0.b;	 Catch:{ all -> 0x00fc }
        r3 = r10[r1];	 Catch:{ all -> 0x00fc }
        r5 = r2.length();	 Catch:{ all -> 0x00fc }
        r10 = r0.b;	 Catch:{ all -> 0x00fc }
        r10[r1] = r5;	 Catch:{ all -> 0x00fc }
        r7 = r9.e;	 Catch:{ all -> 0x00fc }
        r7 = r7 - r3;
        r7 = r7 + r5;
        r9.e = r7;	 Catch:{ all -> 0x00fc }
        goto L_0x0076;
    L_0x0073:
        defpackage.brs.a(r10);	 Catch:{ all -> 0x00fc }
    L_0x0076:
        r1 = r1 + 1;
        goto L_0x0049;
    L_0x0079:
        r10 = r9.h;	 Catch:{ all -> 0x00fc }
        r10 = r10 + 1;
        r9.h = r10;	 Catch:{ all -> 0x00fc }
        r10 = 0;
        r0.e = r10;	 Catch:{ all -> 0x00fc }
        r10 = r0.d;	 Catch:{ all -> 0x00fc }
        r10 = r10 | r11;
        r1 = 10;
        r2 = 32;
        if (r10 != 0) goto L_0x00ab;
    L_0x008b:
        r10 = r9.g;	 Catch:{ all -> 0x00fc }
        r11 = r0.a;	 Catch:{ all -> 0x00fc }
        r10.remove(r11);	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r11 = "REMOVE";
        r10.append(r11);	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r10.append(r2);	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r11 = r0.a;	 Catch:{ all -> 0x00fc }
        r10.append(r11);	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r10.append(r1);	 Catch:{ all -> 0x00fc }
        goto L_0x00da;
    L_0x00ab:
        r0.d = true;	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r3 = "CLEAN";
        r10.append(r3);	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r10.append(r2);	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r2 = r0.a;	 Catch:{ all -> 0x00fc }
        r10.append(r2);	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r2 = r0.a();	 Catch:{ all -> 0x00fc }
        r10.append(r2);	 Catch:{ all -> 0x00fc }
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        r10.append(r1);	 Catch:{ all -> 0x00fc }
        if (r11 == 0) goto L_0x00da;
    L_0x00d1:
        r10 = r9.l;	 Catch:{ all -> 0x00fc }
        r1 = 1;
        r1 = r1 + r10;
        r9.l = r1;	 Catch:{ all -> 0x00fc }
        r0.f = r10;	 Catch:{ all -> 0x00fc }
    L_0x00da:
        r10 = r9.f;	 Catch:{ all -> 0x00fc }
        defpackage.brs.b(r10);	 Catch:{ all -> 0x00fc }
        r10 = r9.e;	 Catch:{ all -> 0x00fc }
        r0 = r9.k;	 Catch:{ all -> 0x00fc }
        r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x00ed;
    L_0x00e7:
        r10 = r9.c();	 Catch:{ all -> 0x00fc }
        if (r10 == 0) goto L_0x00f4;
    L_0x00ed:
        r10 = r9.m;	 Catch:{ all -> 0x00fc }
        r11 = r9.n;	 Catch:{ all -> 0x00fc }
        r10.submit(r11);	 Catch:{ all -> 0x00fc }
    L_0x00f4:
        monitor-exit(r9);
        return;
    L_0x00f6:
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00fc }
        r10.<init>();	 Catch:{ all -> 0x00fc }
        throw r10;	 Catch:{ all -> 0x00fc }
    L_0x00fc:
        r10 = move-exception;
        monitor-exit(r9);
        goto L_0x0100;
    L_0x00ff:
        throw r10;
    L_0x0100:
        goto L_0x00ff;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brs.a(brt, boolean):void");
    }

    public final boolean c() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    /* JADX WARNING: Missing block: B:21:0x008e, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:23:0x0090, code skipped:
            return false;
     */
    private final synchronized boolean c(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r7.e();	 Catch:{ all -> 0x0091 }
        r0 = r7.g;	 Catch:{ all -> 0x0091 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0091 }
        r0 = (defpackage.brw) r0;	 Catch:{ all -> 0x0091 }
        r1 = 0;
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        goto L_0x008f;
    L_0x0011:
        r2 = r0.e;	 Catch:{ all -> 0x0091 }
        if (r2 != 0) goto L_0x008f;
    L_0x0015:
        r2 = r7.d;	 Catch:{ all -> 0x0091 }
        if (r1 >= r2) goto L_0x005b;
    L_0x0019:
        r2 = r0.a(r1);	 Catch:{ all -> 0x0091 }
        r3 = r2.exists();	 Catch:{ all -> 0x0091 }
        if (r3 == 0) goto L_0x004b;
    L_0x0023:
        r3 = r2.delete();	 Catch:{ all -> 0x0091 }
        if (r3 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x004b;
    L_0x002a:
        r8 = new java.io.IOException;	 Catch:{ all -> 0x0091 }
        r0 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0091 }
        r1 = r0.length();	 Catch:{ all -> 0x0091 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0091 }
        r1 = r1 + 17;
        r2.<init>(r1);	 Catch:{ all -> 0x0091 }
        r1 = "failed to delete ";
        r2.append(r1);	 Catch:{ all -> 0x0091 }
        r2.append(r0);	 Catch:{ all -> 0x0091 }
        r0 = r2.toString();	 Catch:{ all -> 0x0091 }
        r8.<init>(r0);	 Catch:{ all -> 0x0091 }
        throw r8;	 Catch:{ all -> 0x0091 }
    L_0x004b:
        r2 = r7.e;	 Catch:{ all -> 0x0091 }
        r4 = r0.b;	 Catch:{ all -> 0x0091 }
        r5 = r4[r1];	 Catch:{ all -> 0x0091 }
        r2 = r2 - r5;
        r7.e = r2;	 Catch:{ all -> 0x0091 }
        r2 = 0;
        r4[r1] = r2;	 Catch:{ all -> 0x0091 }
        r1 = r1 + 1;
        goto L_0x0015;
    L_0x005b:
        r0 = r7.h;	 Catch:{ all -> 0x0091 }
        r1 = 1;
        r0 = r0 + r1;
        r7.h = r0;	 Catch:{ all -> 0x0091 }
        r0 = r7.f;	 Catch:{ all -> 0x0091 }
        r2 = "REMOVE";
        r0.append(r2);	 Catch:{ all -> 0x0091 }
        r0 = r7.f;	 Catch:{ all -> 0x0091 }
        r2 = 32;
        r0.append(r2);	 Catch:{ all -> 0x0091 }
        r0 = r7.f;	 Catch:{ all -> 0x0091 }
        r0.append(r8);	 Catch:{ all -> 0x0091 }
        r0 = r7.f;	 Catch:{ all -> 0x0091 }
        r2 = 10;
        r0.append(r2);	 Catch:{ all -> 0x0091 }
        r0 = r7.g;	 Catch:{ all -> 0x0091 }
        r0.remove(r8);	 Catch:{ all -> 0x0091 }
        r8 = r7.c();	 Catch:{ all -> 0x0091 }
        if (r8 == 0) goto L_0x008d;
    L_0x0086:
        r8 = r7.m;	 Catch:{ all -> 0x0091 }
        r0 = r7.n;	 Catch:{ all -> 0x0091 }
        r8.submit(r0);	 Catch:{ all -> 0x0091 }
    L_0x008d:
        monitor-exit(r7);
        return r1;
    L_0x008f:
        monitor-exit(r7);
        return r1;
    L_0x0091:
        r8 = move-exception;
        monitor-exit(r7);
        goto L_0x0095;
    L_0x0094:
        throw r8;
    L_0x0095:
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brs.c(java.lang.String):boolean");
    }

    private final void e() {
        if (this.f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void close() {
        if (this.f != null) {
            ArrayList arrayList = new ArrayList(this.g.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                brt brt = ((brw) arrayList.get(i)).e;
                if (brt != null) {
                    brt.a();
                }
            }
            d();
            brs.a(this.f);
            this.f = null;
        }
    }

    public final void d() {
        while (this.e > this.k) {
            c((String) ((Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    private static void a(Writer writer) {
        if (VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void b(Writer writer) {
        if (VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
