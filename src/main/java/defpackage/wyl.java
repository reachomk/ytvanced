package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wyl */
public final class wyl implements Closeable {
    public final File a;
    public final int b;
    public Writer c;
    public int d;
    private final File e;
    private final File f;
    private final int g;
    private final long h;
    private long i = 0;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    private long k = 0;
    private final ExecutorService l = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable m = new wyk(this);

    private static String a(InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read != 10) {
                stringBuilder.append((char) read);
            } else {
                int length = stringBuilder.length();
                if (length > 0) {
                    length--;
                    if (stringBuilder.charAt(length) == 13) {
                        stringBuilder.setLength(length);
                    }
                }
                return stringBuilder.toString();
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void a(File file) {
        File[] listFiles = file.listFiles();
        StringBuilder stringBuilder;
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    wyl.a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    String valueOf = String.valueOf(file2);
                    stringBuilder = new StringBuilder(valueOf.length() + 23);
                    stringBuilder.append("failed to delete file: ");
                    stringBuilder.append(valueOf);
                    throw new IOException(stringBuilder.toString());
                }
            }
            return;
        }
        String valueOf2 = String.valueOf(file);
        stringBuilder = new StringBuilder(valueOf2.length() + 17);
        stringBuilder.append("not a directory: ");
        stringBuilder.append(valueOf2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private wyl(File file, long j) {
        File file2 = file;
        this.a = file2;
        this.g = 538181937;
        this.e = new File(file2, "journal");
        this.f = new File(file2, "journal.tmp");
        this.b = 1;
        this.h = j;
    }

    public static wyl a(File file, long j) {
        if (j > 0) {
            wyl wyl = new wyl(file, j);
            if (wyl.e.exists()) {
                try {
                    wyl.e();
                    wyl.b(wyl.f);
                    Iterator it = wyl.j.values().iterator();
                    while (it.hasNext()) {
                        wyp wyp = (wyp) it.next();
                        int i = 0;
                        if (wyp.d != null) {
                            wyp.d = null;
                            while (i < wyl.b) {
                                wyl.b(wyp.a(i));
                                wyl.b(wyp.b(i));
                                i++;
                            }
                            it.remove();
                        } else {
                            while (i < wyl.b) {
                                wyl.i += wyp.b[i];
                                i++;
                            }
                        }
                    }
                    wyl.c = new BufferedWriter(new FileWriter(wyl.e, true), 8192);
                    return wyl;
                } catch (IOException e) {
                    xtl.b("Disk cache journal is corrupt", e);
                    wyl.d();
                }
            }
            file.mkdirs();
            wyl = new wyl(file, j);
            wyl.a();
            return wyl;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00ea */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:18:0x006a, code skipped:
            if (r0.length() != 0) goto L_0x0072;
     */
    /* JADX WARNING: Missing block: B:19:0x006c, code skipped:
            r0 = new java.lang.String(r4);
     */
    /* JADX WARNING: Missing block: B:20:0x0072, code skipped:
            r0 = r4.concat(r0);
     */
    /* JADX WARNING: Missing block: B:22:0x0079, code skipped:
            throw new java.io.IOException(r0);
     */
    /* JADX WARNING: Missing block: B:44:0x00ee, code skipped:
            throw defpackage.wyp.a(r3);
     */
    private final void e() {
        /*
        r10 = this;
        r0 = ", ";
        r1 = new java.io.BufferedInputStream;
        r2 = new java.io.FileInputStream;
        r3 = r10.e;
        r2.<init>(r3);
        r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r1.<init>(r2, r3);
        r2 = defpackage.wyl.a(r1);	 Catch:{ all -> 0x0186 }
        r3 = defpackage.wyl.a(r1);	 Catch:{ all -> 0x0186 }
        r4 = defpackage.wyl.a(r1);	 Catch:{ all -> 0x0186 }
        r5 = defpackage.wyl.a(r1);	 Catch:{ all -> 0x0186 }
        r6 = defpackage.wyl.a(r1);	 Catch:{ all -> 0x0186 }
        r7 = "com.google.android.libraries.youtube.common.cache";
        r7 = r7.equals(r2);	 Catch:{ all -> 0x0186 }
        if (r7 == 0) goto L_0x0133;
    L_0x002c:
        r7 = "1";
        r7 = r7.equals(r3);	 Catch:{ all -> 0x0186 }
        if (r7 == 0) goto L_0x0133;
    L_0x0034:
        r7 = r10.g;	 Catch:{ all -> 0x0186 }
        r7 = java.lang.Integer.toString(r7);	 Catch:{ all -> 0x0186 }
        r4 = r7.equals(r4);	 Catch:{ all -> 0x0186 }
        if (r4 == 0) goto L_0x0133;
    L_0x0040:
        r4 = r10.b;	 Catch:{ all -> 0x0186 }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ all -> 0x0186 }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x0186 }
        if (r4 == 0) goto L_0x0133;
    L_0x004c:
        r4 = "";
        r4 = r4.equals(r6);	 Catch:{ all -> 0x0186 }
        if (r4 == 0) goto L_0x0133;
    L_0x0054:
        r0 = defpackage.wyl.a(r1);	 Catch:{ EOFException -> 0x012f }
        r2 = " ";
        r2 = r0.split(r2);	 Catch:{ EOFException -> 0x012f }
        r3 = r2.length;	 Catch:{ EOFException -> 0x012f }
        r4 = "unexpected journal line: ";
        r5 = 2;
        if (r3 >= r5) goto L_0x007a;
    L_0x0064:
        r2 = new java.io.IOException;	 Catch:{ EOFException -> 0x012f }
        r3 = r0.length();	 Catch:{ EOFException -> 0x012f }
        if (r3 != 0) goto L_0x0072;
    L_0x006c:
        r0 = new java.lang.String;	 Catch:{ EOFException -> 0x012f }
        r0.<init>(r4);	 Catch:{ EOFException -> 0x012f }
        goto L_0x0076;
    L_0x0072:
        r0 = r4.concat(r0);	 Catch:{ EOFException -> 0x012f }
    L_0x0076:
        r2.<init>(r0);	 Catch:{ EOFException -> 0x012f }
        throw r2;	 Catch:{ EOFException -> 0x012f }
    L_0x007a:
        r6 = 1;
        r6 = r2[r6];	 Catch:{ EOFException -> 0x012f }
        r7 = 0;
        r8 = r2[r7];	 Catch:{ EOFException -> 0x012f }
        r9 = "REMOVE";
        r8 = r8.equals(r9);	 Catch:{ EOFException -> 0x012f }
        if (r8 != 0) goto L_0x0089;
    L_0x0088:
        goto L_0x0091;
    L_0x0089:
        if (r3 != r5) goto L_0x0091;
    L_0x008b:
        r0 = r10.j;	 Catch:{ EOFException -> 0x012f }
        r0.remove(r6);	 Catch:{ EOFException -> 0x012f }
        goto L_0x0054;
    L_0x0091:
        r8 = r10.j;	 Catch:{ EOFException -> 0x012f }
        r8 = r8.get(r6);	 Catch:{ EOFException -> 0x012f }
        r8 = (defpackage.wyp) r8;	 Catch:{ EOFException -> 0x012f }
        if (r8 != 0) goto L_0x00a5;
    L_0x009b:
        r8 = new wyp;	 Catch:{ EOFException -> 0x012f }
        r8.<init>(r10, r6);	 Catch:{ EOFException -> 0x012f }
        r9 = r10.j;	 Catch:{ EOFException -> 0x012f }
        r9.put(r6, r8);	 Catch:{ EOFException -> 0x012f }
    L_0x00a5:
        r6 = r2[r7];	 Catch:{ EOFException -> 0x012f }
        r9 = "CLEAN";
        r6 = r6.equals(r9);	 Catch:{ EOFException -> 0x012f }
        if (r6 == 0) goto L_0x00f4;
    L_0x00af:
        r6 = r10.b;	 Catch:{ EOFException -> 0x012f }
        r6 = r6 + r5;
        if (r3 != r6) goto L_0x00f4;
    L_0x00b4:
        r8.c = true;	 Catch:{ EOFException -> 0x012f }
        r0 = 0;
        r8.d = r0;	 Catch:{ EOFException -> 0x012f }
        r3 = r3 + -2;
        r0 = java.lang.Math.min(r3, r3);	 Catch:{ EOFException -> 0x012f }
        r4 = r2.getClass();	 Catch:{ EOFException -> 0x012f }
        r4 = r4.getComponentType();	 Catch:{ EOFException -> 0x012f }
        r3 = java.lang.reflect.Array.newInstance(r4, r3);	 Catch:{ EOFException -> 0x012f }
        r3 = (java.lang.Object[]) r3;	 Catch:{ EOFException -> 0x012f }
        java.lang.System.arraycopy(r2, r5, r3, r7, r0);	 Catch:{ EOFException -> 0x012f }
        r3 = (java.lang.String[]) r3;	 Catch:{ EOFException -> 0x012f }
        r0 = r3.length;	 Catch:{ EOFException -> 0x012f }
        r2 = r8.f;	 Catch:{ EOFException -> 0x012f }
        r2 = r2.b;	 Catch:{ EOFException -> 0x012f }
        if (r0 != r2) goto L_0x00ef;
    L_0x00da:
        r0 = r3.length;	 Catch:{ NumberFormatException -> 0x00ea }
        if (r7 >= r0) goto L_0x0054;
    L_0x00dd:
        r0 = r8.b;	 Catch:{ NumberFormatException -> 0x00ea }
        r2 = r3[r7];	 Catch:{ NumberFormatException -> 0x00ea }
        r4 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x00ea }
        r0[r7] = r4;	 Catch:{ NumberFormatException -> 0x00ea }
        r7 = r7 + 1;
        goto L_0x00da;
    L_0x00ea:
        r0 = defpackage.wyp.a(r3);	 Catch:{ EOFException -> 0x012f }
        throw r0;	 Catch:{ EOFException -> 0x012f }
    L_0x00ef:
        r0 = defpackage.wyp.a(r3);	 Catch:{ EOFException -> 0x012f }
        throw r0;	 Catch:{ EOFException -> 0x012f }
    L_0x00f4:
        r6 = r2[r7];	 Catch:{ EOFException -> 0x012f }
        r9 = "DIRTY";
        r6 = r6.equals(r9);	 Catch:{ EOFException -> 0x012f }
        if (r6 != 0) goto L_0x00ff;
    L_0x00fe:
        goto L_0x010a;
    L_0x00ff:
        if (r3 != r5) goto L_0x010a;
    L_0x0101:
        r0 = new wyn;	 Catch:{ EOFException -> 0x012f }
        r0.<init>(r10, r8);	 Catch:{ EOFException -> 0x012f }
        r8.d = r0;	 Catch:{ EOFException -> 0x012f }
        goto L_0x0054;
    L_0x010a:
        r2 = r2[r7];	 Catch:{ EOFException -> 0x012f }
        r6 = "READ";
        r2 = r2.equals(r6);	 Catch:{ EOFException -> 0x012f }
        if (r2 != 0) goto L_0x0115;
    L_0x0114:
        goto L_0x0119;
    L_0x0115:
        if (r3 != r5) goto L_0x0119;
    L_0x0117:
        goto L_0x0054;
    L_0x0119:
        r2 = new java.io.IOException;	 Catch:{ EOFException -> 0x012f }
        r3 = r0.length();	 Catch:{ EOFException -> 0x012f }
        if (r3 != 0) goto L_0x0127;
    L_0x0121:
        r0 = new java.lang.String;	 Catch:{ EOFException -> 0x012f }
        r0.<init>(r4);	 Catch:{ EOFException -> 0x012f }
        goto L_0x012b;
    L_0x0127:
        r0 = r4.concat(r0);	 Catch:{ EOFException -> 0x012f }
    L_0x012b:
        r2.<init>(r0);	 Catch:{ EOFException -> 0x012f }
        throw r2;	 Catch:{ EOFException -> 0x012f }
    L_0x012f:
        defpackage.wyl.a(r1);
        return;
    L_0x0133:
        r4 = new java.io.IOException;	 Catch:{ all -> 0x0186 }
        r7 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0186 }
        r7 = r7.length();	 Catch:{ all -> 0x0186 }
        r7 = r7 + 35;
        r8 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0186 }
        r8 = r8.length();	 Catch:{ all -> 0x0186 }
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x0186 }
        r8 = r8.length();	 Catch:{ all -> 0x0186 }
        r7 = r7 + r8;
        r8 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0186 }
        r8 = r8.length();	 Catch:{ all -> 0x0186 }
        r7 = r7 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0186 }
        r8.<init>(r7);	 Catch:{ all -> 0x0186 }
        r7 = "unexpected journal header: [";
        r8.append(r7);	 Catch:{ all -> 0x0186 }
        r8.append(r2);	 Catch:{ all -> 0x0186 }
        r8.append(r0);	 Catch:{ all -> 0x0186 }
        r8.append(r3);	 Catch:{ all -> 0x0186 }
        r8.append(r0);	 Catch:{ all -> 0x0186 }
        r8.append(r5);	 Catch:{ all -> 0x0186 }
        r8.append(r0);	 Catch:{ all -> 0x0186 }
        r8.append(r6);	 Catch:{ all -> 0x0186 }
        r0 = "]";
        r8.append(r0);	 Catch:{ all -> 0x0186 }
        r0 = r8.toString();	 Catch:{ all -> 0x0186 }
        r4.<init>(r0);	 Catch:{ all -> 0x0186 }
        throw r4;	 Catch:{ all -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        defpackage.wyl.a(r1);
        goto L_0x018c;
    L_0x018b:
        throw r0;
    L_0x018c:
        goto L_0x018b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyl.e():void");
    }

    public final synchronized void a() {
        Writer writer = this.c;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f), 8192);
        bufferedWriter.write("com.google.android.libraries.youtube.common.cache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.g));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.b));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (wyp wyp : this.j.values()) {
            String a;
            if (wyp.d == null) {
                String str = wyp.a;
                a = wyp.a();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(a).length());
                stringBuilder.append("CLEAN ");
                stringBuilder.append(str);
                stringBuilder.append(a);
                stringBuilder.append(10);
                bufferedWriter.write(stringBuilder.toString());
            } else {
                a = wyp.a;
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 7);
                stringBuilder2.append("DIRTY ");
                stringBuilder2.append(a);
                stringBuilder2.append(10);
                bufferedWriter.write(stringBuilder2.toString());
            }
        }
        bufferedWriter.close();
        this.f.renameTo(this.e);
        this.c = new BufferedWriter(new FileWriter(this.e, true), 8192);
    }

    private static void b(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final synchronized wyo a(String str) {
        f();
        wyl.d(str);
        wyp wyp = (wyp) this.j.get(str);
        if (wyp == null) {
            return null;
        }
        if (!wyp.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.b];
        int i = 0;
        while (i < this.b) {
            try {
                inputStreamArr[i] = new FileInputStream(wyp.a(i));
                i++;
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.d++;
        Writer writer = this.c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 6);
        stringBuilder.append("READ ");
        stringBuilder.append(str);
        stringBuilder.append(10);
        writer.append(stringBuilder.toString());
        if (b()) {
            this.l.submit(this.m);
        }
        return new wyo(inputStreamArr);
    }

    public final synchronized wyn b(String str) {
        f();
        wyl.d(str);
        wyp wyp = (wyp) this.j.get(str);
        if (wyp == null) {
            wyp = new wyp(this, str);
            this.j.put(str, wyp);
        } else if (wyp.d != null) {
            return null;
        }
        wyn wyn = new wyn(this, wyp);
        wyp.d = wyn;
        Writer writer = this.c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
        stringBuilder.append("DIRTY ");
        stringBuilder.append(str);
        stringBuilder.append(10);
        writer.write(stringBuilder.toString());
        this.c.flush();
        return wyn;
    }

    public final synchronized void a(wyn wyn, boolean z) {
        wyp wyp = wyn.a;
        if (wyp.d == wyn) {
            int i = 0;
            if (z) {
                if (!wyp.c) {
                    int i2 = 0;
                    while (i2 < this.b) {
                        if (wyp.b(i2).exists()) {
                            i2++;
                        } else {
                            wyn.a();
                            StringBuilder stringBuilder = new StringBuilder(35);
                            stringBuilder.append("edit didn't create file ");
                            stringBuilder.append(i2);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                }
            }
            while (i < this.b) {
                File b = wyp.b(i);
                if (!z) {
                    wyl.b(b);
                } else if (b.exists()) {
                    File a = wyp.a(i);
                    b.renameTo(a);
                    long j = wyp.b[i];
                    long length = a.length();
                    wyp.b[i] = length;
                    this.i = (this.i - j) + length;
                }
                i++;
            }
            this.d++;
            wyp.d = null;
            Writer writer;
            if (wyp.c || z) {
                wyp.c = true;
                writer = this.c;
                String str = wyp.a;
                String a2 = wyp.a();
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(a2).length());
                stringBuilder2.append("CLEAN ");
                stringBuilder2.append(str);
                stringBuilder2.append(a2);
                stringBuilder2.append(10);
                writer.write(stringBuilder2.toString());
                if (z) {
                    long j2 = this.k;
                    this.k = 1 + j2;
                    wyp.e = j2;
                }
            } else {
                this.j.remove(wyp.a);
                writer = this.c;
                String str2 = wyp.a;
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 8);
                stringBuilder3.append("REMOVE ");
                stringBuilder3.append(str2);
                stringBuilder3.append(10);
                writer.write(stringBuilder3.toString());
            }
            g();
            if (this.i > this.h || b()) {
                this.l.submit(this.m);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final boolean b() {
        int i = this.d;
        return i >= 2000 && i >= this.j.size();
    }

    /* JADX WARNING: Missing block: B:18:0x0095, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:20:0x0097, code skipped:
            return false;
     */
    public final synchronized boolean c(java.lang.String r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r7.f();	 Catch:{ all -> 0x0098 }
        defpackage.wyl.d(r8);	 Catch:{ all -> 0x0098 }
        r0 = r7.j;	 Catch:{ all -> 0x0098 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0098 }
        r0 = (defpackage.wyp) r0;	 Catch:{ all -> 0x0098 }
        r1 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0012:
        goto L_0x0096;
    L_0x0014:
        r2 = r0.d;	 Catch:{ all -> 0x0098 }
        if (r2 != 0) goto L_0x0096;
    L_0x0018:
        r2 = r7.b;	 Catch:{ all -> 0x0098 }
        if (r1 >= r2) goto L_0x0057;
    L_0x001c:
        r2 = r0.a(r1);	 Catch:{ all -> 0x0098 }
        r3 = r2.delete();	 Catch:{ all -> 0x0098 }
        if (r3 == 0) goto L_0x0036;
    L_0x0026:
        r2 = r7.i;	 Catch:{ all -> 0x0098 }
        r4 = r0.b;	 Catch:{ all -> 0x0098 }
        r5 = r4[r1];	 Catch:{ all -> 0x0098 }
        r2 = r2 - r5;
        r7.i = r2;	 Catch:{ all -> 0x0098 }
        r2 = 0;
        r4[r1] = r2;	 Catch:{ all -> 0x0098 }
        r1 = r1 + 1;
        goto L_0x0018;
    L_0x0036:
        r8 = new java.io.IOException;	 Catch:{ all -> 0x0098 }
        r0 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0098 }
        r1 = r0.length();	 Catch:{ all -> 0x0098 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0098 }
        r1 = r1 + 17;
        r2.<init>(r1);	 Catch:{ all -> 0x0098 }
        r1 = "failed to delete ";
        r2.append(r1);	 Catch:{ all -> 0x0098 }
        r2.append(r0);	 Catch:{ all -> 0x0098 }
        r0 = r2.toString();	 Catch:{ all -> 0x0098 }
        r8.<init>(r0);	 Catch:{ all -> 0x0098 }
        throw r8;	 Catch:{ all -> 0x0098 }
    L_0x0057:
        r0 = r7.d;	 Catch:{ all -> 0x0098 }
        r1 = 1;
        r0 = r0 + r1;
        r7.d = r0;	 Catch:{ all -> 0x0098 }
        r0 = r7.c;	 Catch:{ all -> 0x0098 }
        r2 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0098 }
        r2 = r2.length();	 Catch:{ all -> 0x0098 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0098 }
        r2 = r2 + 8;
        r3.<init>(r2);	 Catch:{ all -> 0x0098 }
        r2 = "REMOVE ";
        r3.append(r2);	 Catch:{ all -> 0x0098 }
        r3.append(r8);	 Catch:{ all -> 0x0098 }
        r2 = 10;
        r3.append(r2);	 Catch:{ all -> 0x0098 }
        r2 = r3.toString();	 Catch:{ all -> 0x0098 }
        r0.append(r2);	 Catch:{ all -> 0x0098 }
        r0 = r7.j;	 Catch:{ all -> 0x0098 }
        r0.remove(r8);	 Catch:{ all -> 0x0098 }
        r8 = r7.b();	 Catch:{ all -> 0x0098 }
        if (r8 == 0) goto L_0x0094;
    L_0x008d:
        r8 = r7.l;	 Catch:{ all -> 0x0098 }
        r0 = r7.m;	 Catch:{ all -> 0x0098 }
        r8.submit(r0);	 Catch:{ all -> 0x0098 }
    L_0x0094:
        monitor-exit(r7);
        return r1;
    L_0x0096:
        monitor-exit(r7);
        return r1;
    L_0x0098:
        r8 = move-exception;
        monitor-exit(r7);
        goto L_0x009c;
    L_0x009b:
        throw r8;
    L_0x009c:
        goto L_0x009b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyl.c(java.lang.String):boolean");
    }

    private final void f() {
        if (this.c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final synchronized void g() {
        f();
        c();
        this.c.flush();
    }

    public final synchronized void close() {
        if (this.c != null) {
            ArrayList arrayList = new ArrayList(this.j.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                wyn wyn = ((wyp) arrayList.get(i)).d;
                if (wyn != null) {
                    wyn.a();
                }
            }
            c();
            this.c.close();
            this.c = null;
        }
    }

    public final void c() {
        while (this.i > this.h) {
            c((String) ((Entry) this.j.entrySet().iterator().next()).getKey());
        }
    }

    public final void d() {
        close();
        wyl.a(this.a);
    }

    private static void d(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder stringBuilder = new StringBuilder(str.length() + 44);
            stringBuilder.append("keys must not contain spaces or newlines: \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    static {
        Charset.forName("UTF-8");
    }
}
