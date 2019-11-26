package defpackage;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: nvs */
public final class nvs implements nwb {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference b = new AtomicReference();
    private final int c = 8000;
    private final int d = 8000;
    private final String e;
    private final HashMap f = new HashMap();
    private HttpURLConnection g;
    private InputStream h;
    private boolean i;
    private long j;
    private long k;
    private long l;
    private long m;

    public nvs(String str) {
        this.e = nwf.a(str);
    }

    public final String a() {
        HttpURLConnection httpURLConnection = this.g;
        return httpURLConnection != null ? httpURLConnection.getURL().toString() : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARNING: Missing block: B:43:0x00fa, code skipped:
            if (r3 != 0) goto L_0x00ff;
     */
    public final long a(defpackage.nvq r17) {
        /*
        r16 = this;
        r1 = r16;
        r2 = r17;
        r3 = 0;
        r1.m = r3;
        r1.l = r3;
        r0 = new java.net.URL;	 Catch:{ IOException -> 0x023f }
        r5 = r2.a;	 Catch:{ IOException -> 0x023f }
        r5 = r5.toString();	 Catch:{ IOException -> 0x023f }
        r0.<init>(r5);	 Catch:{ IOException -> 0x023f }
        r5 = r2.b;	 Catch:{ IOException -> 0x023f }
        r6 = r2.d;	 Catch:{ IOException -> 0x023f }
        r8 = r2.e;	 Catch:{ IOException -> 0x023f }
        r10 = r2.g;	 Catch:{ IOException -> 0x023f }
        r11 = 1;
        r10 = r10 & r11;
        r0 = r0.openConnection();	 Catch:{ IOException -> 0x023f }
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x023f }
        r12 = r1.c;	 Catch:{ IOException -> 0x023f }
        r0.setConnectTimeout(r12);	 Catch:{ IOException -> 0x023f }
        r12 = r1.d;	 Catch:{ IOException -> 0x023f }
        r0.setReadTimeout(r12);	 Catch:{ IOException -> 0x023f }
        r12 = r1.f;	 Catch:{ IOException -> 0x023f }
        monitor-enter(r12);	 Catch:{ IOException -> 0x023f }
        r13 = r1.f;	 Catch:{ all -> 0x023c }
        r13 = r13.entrySet();	 Catch:{ all -> 0x023c }
        r13 = r13.iterator();	 Catch:{ all -> 0x023c }
    L_0x003c:
        r14 = r13.hasNext();	 Catch:{ all -> 0x023c }
        if (r14 == 0) goto L_0x0058;
    L_0x0042:
        r14 = r13.next();	 Catch:{ all -> 0x023c }
        r14 = (java.util.Map.Entry) r14;	 Catch:{ all -> 0x023c }
        r15 = r14.getKey();	 Catch:{ all -> 0x023c }
        r15 = (java.lang.String) r15;	 Catch:{ all -> 0x023c }
        r14 = r14.getValue();	 Catch:{ all -> 0x023c }
        r14 = (java.lang.String) r14;	 Catch:{ all -> 0x023c }
        r0.setRequestProperty(r15, r14);	 Catch:{ all -> 0x023c }
        goto L_0x003c;
    L_0x0058:
        monitor-exit(r12);	 Catch:{ all -> 0x023c }
        r12 = 27;
        r13 = -1;
        r15 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r15 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x0066;
    L_0x0062:
        r15 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r15 == 0) goto L_0x00a0;
    L_0x0066:
        r15 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x023f }
        r15.<init>(r12);	 Catch:{ IOException -> 0x023f }
        r12 = "bytes=";
        r15.append(r12);	 Catch:{ IOException -> 0x023f }
        r15.append(r6);	 Catch:{ IOException -> 0x023f }
        r12 = "-";
        r15.append(r12);	 Catch:{ IOException -> 0x023f }
        r12 = r15.toString();	 Catch:{ IOException -> 0x023f }
        r15 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r15 == 0) goto L_0x009b;
    L_0x0080:
        r12 = java.lang.String.valueOf(r12);	 Catch:{ IOException -> 0x023f }
        r15 = r12.length();	 Catch:{ IOException -> 0x023f }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x023f }
        r15 = r15 + 20;
        r3.<init>(r15);	 Catch:{ IOException -> 0x023f }
        r3.append(r12);	 Catch:{ IOException -> 0x023f }
        r6 = r6 + r8;
        r6 = r6 + r13;
        r3.append(r6);	 Catch:{ IOException -> 0x023f }
        r12 = r3.toString();	 Catch:{ IOException -> 0x023f }
    L_0x009b:
        r3 = "Range";
        r0.setRequestProperty(r3, r12);	 Catch:{ IOException -> 0x023f }
    L_0x00a0:
        r3 = "User-Agent";
        r4 = r1.e;	 Catch:{ IOException -> 0x023f }
        r0.setRequestProperty(r3, r4);	 Catch:{ IOException -> 0x023f }
        if (r10 != 0) goto L_0x00b0;
    L_0x00a9:
        r3 = "Accept-Encoding";
        r4 = "identity";
        r0.setRequestProperty(r3, r4);	 Catch:{ IOException -> 0x023f }
    L_0x00b0:
        r0.setInstanceFollowRedirects(r11);	 Catch:{ IOException -> 0x023f }
        if (r5 == 0) goto L_0x00b7;
    L_0x00b5:
        r3 = 1;
        goto L_0x00b8;
    L_0x00b7:
        r3 = 0;
    L_0x00b8:
        r0.setDoOutput(r3);	 Catch:{ IOException -> 0x023f }
        if (r5 == 0) goto L_0x00da;
    L_0x00bd:
        r3 = "POST";
        r0.setRequestMethod(r3);	 Catch:{ IOException -> 0x023f }
        r3 = r5.length;	 Catch:{ IOException -> 0x023f }
        if (r3 != 0) goto L_0x00c9;
    L_0x00c5:
        r0.connect();	 Catch:{ IOException -> 0x023f }
        goto L_0x00dd;
    L_0x00c9:
        r0.setFixedLengthStreamingMode(r3);	 Catch:{ IOException -> 0x023f }
        r0.connect();	 Catch:{ IOException -> 0x023f }
        r3 = r0.getOutputStream();	 Catch:{ IOException -> 0x023f }
        r3.write(r5);	 Catch:{ IOException -> 0x023f }
        r3.close();	 Catch:{ IOException -> 0x023f }
        goto L_0x00dd;
    L_0x00da:
        r0.connect();	 Catch:{ IOException -> 0x023f }
    L_0x00dd:
        r1.g = r0;	 Catch:{ IOException -> 0x023f }
        r0 = r1.g;	 Catch:{ IOException -> 0x0216 }
        r0 = r0.getResponseCode();	 Catch:{ IOException -> 0x0216 }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 < r3) goto L_0x0208;
    L_0x00e9:
        r4 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r0 > r4) goto L_0x0208;
    L_0x00ed:
        r4 = r1.g;
        r4.getContentType();
        if (r0 != r3) goto L_0x00fd;
    L_0x00f4:
        r3 = r2.d;
        r5 = 0;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 == 0) goto L_0x00fd;
    L_0x00fc:
        goto L_0x00ff;
    L_0x00fd:
        r3 = 0;
    L_0x00ff:
        r1.j = r3;
        r0 = r2.g;
        r0 = r0 & r11;
        if (r0 != 0) goto L_0x01ed;
    L_0x0106:
        r0 = r1.g;
        r3 = "Content-Length";
        r3 = r0.getHeaderField(r3);
        r4 = android.text.TextUtils.isEmpty(r3);
        if (r4 != 0) goto L_0x013e;
    L_0x0114:
        r4 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0119 }
        goto L_0x013f;
    L_0x0119:
        r4 = java.lang.String.valueOf(r3);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 28;
        r5.<init>(r4);
        r4 = "Unexpected Content-Length [";
        r5.append(r4);
        r5.append(r3);
        r4 = "]";
        r5.append(r4);
        r4 = r5.toString();
        r5 = "DefaultHttpDataSource";
        android.util.Log.e(r5, r4);
    L_0x013e:
        r4 = r13;
    L_0x013f:
        r6 = "Content-Range";
        r0 = r0.getHeaderField(r6);
        r6 = android.text.TextUtils.isEmpty(r0);
        if (r6 != 0) goto L_0x01da;
    L_0x014b:
        r6 = a;
        r6 = r6.matcher(r0);
        r7 = r6.find();
        if (r7 == 0) goto L_0x01da;
    L_0x0157:
        r7 = 2;
        r7 = r6.group(r7);	 Catch:{ NumberFormatException -> 0x01b4 }
        r7 = java.lang.Long.parseLong(r7);	 Catch:{ NumberFormatException -> 0x01b4 }
        r6 = r6.group(r11);	 Catch:{ NumberFormatException -> 0x01b4 }
        r9 = java.lang.Long.parseLong(r6);	 Catch:{ NumberFormatException -> 0x01b4 }
        r7 = r7 - r9;
        r9 = 1;
        r7 = r7 + r9;
        r9 = 0;
        r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r6 < 0) goto L_0x01b2;
    L_0x0172:
        r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r6 == 0) goto L_0x01da;
    L_0x0176:
        r6 = "DefaultHttpDataSource";
        r9 = java.lang.String.valueOf(r3);	 Catch:{ NumberFormatException -> 0x01b4 }
        r9 = r9.length();	 Catch:{ NumberFormatException -> 0x01b4 }
        r9 = r9 + 26;
        r10 = java.lang.String.valueOf(r0);	 Catch:{ NumberFormatException -> 0x01b4 }
        r10 = r10.length();	 Catch:{ NumberFormatException -> 0x01b4 }
        r9 = r9 + r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x01b4 }
        r10.<init>(r9);	 Catch:{ NumberFormatException -> 0x01b4 }
        r9 = "Inconsistent headers [";
        r10.append(r9);	 Catch:{ NumberFormatException -> 0x01b4 }
        r10.append(r3);	 Catch:{ NumberFormatException -> 0x01b4 }
        r3 = "] [";
        r10.append(r3);	 Catch:{ NumberFormatException -> 0x01b4 }
        r10.append(r0);	 Catch:{ NumberFormatException -> 0x01b4 }
        r3 = "]";
        r10.append(r3);	 Catch:{ NumberFormatException -> 0x01b4 }
        r3 = r10.toString();	 Catch:{ NumberFormatException -> 0x01b4 }
        android.util.Log.w(r6, r3);	 Catch:{ NumberFormatException -> 0x01b4 }
        r3 = java.lang.Math.max(r4, r7);	 Catch:{ NumberFormatException -> 0x01b4 }
        r4 = r3;
        goto L_0x01da;
    L_0x01b2:
        r4 = r7;
        goto L_0x01da;
    L_0x01b4:
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r6 = new java.lang.StringBuilder;
        r7 = 27;
        r3 = r3 + r7;
        r6.<init>(r3);
        r3 = "Unexpected Content-Range [";
        r6.append(r3);
        r6.append(r0);
        r0 = "]";
        r6.append(r0);
        r0 = r6.toString();
        r3 = "DefaultHttpDataSource";
        android.util.Log.e(r3, r0);
    L_0x01da:
        r2 = r2.e;
        r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r0 != 0) goto L_0x01e9;
    L_0x01e0:
        r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r0 == 0) goto L_0x01ea;
    L_0x01e4:
        r2 = r1.j;
        r13 = r4 - r2;
        goto L_0x01ea;
    L_0x01e9:
        r13 = r2;
    L_0x01ea:
        r1.k = r13;
        goto L_0x01f1;
    L_0x01ed:
        r2 = r2.e;
        r1.k = r2;
    L_0x01f1:
        r0 = r1.g;	 Catch:{ IOException -> 0x01fe }
        r0 = r0.getInputStream();	 Catch:{ IOException -> 0x01fe }
        r1.h = r0;	 Catch:{ IOException -> 0x01fe }
        r1.i = r11;
        r2 = r1.k;
        return r2;
    L_0x01fe:
        r0 = move-exception;
        r16.c();
        r2 = new nvw;
        r2.<init>(r0, r11);
        throw r2;
    L_0x0208:
        r2 = r1.g;
        r2.getHeaderFields();
        r16.c();
        r2 = new nvv;
        r2.<init>(r0);
        throw r2;
    L_0x0216:
        r0 = move-exception;
        r16.c();
        r3 = new nvw;
        r2 = r2.a;
        r2 = r2.toString();
        r2 = java.lang.String.valueOf(r2);
        r4 = "Unable to connect to ";
        r5 = r2.length();
        if (r5 != 0) goto L_0x0234;
    L_0x022e:
        r2 = new java.lang.String;
        r2.<init>(r4);
        goto L_0x0238;
    L_0x0234:
        r2 = r4.concat(r2);
    L_0x0238:
        r3.<init>(r2, r0);
        throw r3;
    L_0x023c:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x023c }
        throw r0;	 Catch:{ IOException -> 0x023f }
    L_0x023f:
        r0 = move-exception;
        r3 = new nvw;
        r2 = r2.a;
        r2 = r2.toString();
        r2 = java.lang.String.valueOf(r2);
        r4 = "Unable to connect to ";
        r5 = r2.length();
        if (r5 != 0) goto L_0x025a;
    L_0x0254:
        r2 = new java.lang.String;
        r2.<init>(r4);
        goto L_0x025e;
    L_0x025a:
        r2 = r4.concat(r2);
    L_0x025e:
        r3.<init>(r2, r0);
        goto L_0x0263;
    L_0x0262:
        throw r3;
    L_0x0263:
        goto L_0x0262;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvs.a(nvq):long");
    }

    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.l != this.j) {
                byte[] bArr2 = (byte[]) b.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.l;
                    long j2 = this.j;
                    if (j == j2) {
                        b.set(bArr2);
                        break;
                    }
                    int read = this.h.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.l += (long) read;
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            int read2 = this.h.read(bArr, i, i2);
            if (read2 == -1) {
                long j3 = this.k;
                if (j3 != -1) {
                    if (j3 != this.m) {
                        throw new EOFException();
                    }
                }
                return -1;
            }
            this.m += (long) read2;
            return read2;
        } catch (IOException e) {
            throw new nvw(e, 2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0067 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)|7|(5:12|13|(2:15|(1:17))(2:18|(1:20))|21|(1:25))|26|27) */
    public final void b() {
        /*
        r9 = this;
        r0 = 0;
        r1 = 0;
        r2 = r9.h;	 Catch:{ all -> 0x0081 }
        if (r2 == 0) goto L_0x0075;
    L_0x0006:
        r2 = r9.g;	 Catch:{ all -> 0x0081 }
        r3 = r9.k;	 Catch:{ all -> 0x0081 }
        r5 = -1;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0013;
    L_0x0010:
        r7 = r9.m;	 Catch:{ all -> 0x0081 }
        r3 = r3 - r7;
    L_0x0013:
        r7 = defpackage.nxf.a;	 Catch:{ all -> 0x0081 }
        r8 = 19;
        if (r7 == r8) goto L_0x001f;
    L_0x0019:
        r7 = defpackage.nxf.a;	 Catch:{ all -> 0x0081 }
        r8 = 20;
        if (r7 != r8) goto L_0x0067;
    L_0x001f:
        r2 = r2.getInputStream();	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x002e;
    L_0x0027:
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0067;
    L_0x002d:
        goto L_0x0036;
    L_0x002e:
        r3 = r2.read();	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r4 = -1;
        if (r3 != r4) goto L_0x0036;
    L_0x0035:
        goto L_0x0067;
    L_0x0036:
        r3 = r2.getClass();	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r3 = r3.getName();	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream";
        r4 = r3.equals(r4);	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        if (r4 != 0) goto L_0x004e;
    L_0x0046:
        r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream";
        r3 = r3.equals(r4);	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        if (r3 == 0) goto L_0x0067;
    L_0x004e:
        r3 = r2.getClass();	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r3 = r3.getSuperclass();	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r4 = "unexpectedEndOfInput";
        r5 = new java.lang.Class[r1];	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r3 = r3.getDeclaredMethod(r4, r5);	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r4 = 1;
        r3.setAccessible(r4);	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r4 = new java.lang.Object[r1];	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
        r3.invoke(r2, r4);	 Catch:{ IOException | Exception -> 0x0067, IOException | Exception -> 0x0067 }
    L_0x0067:
        r2 = r9.h;	 Catch:{ IOException -> 0x006d }
        r2.close();	 Catch:{ IOException -> 0x006d }
        goto L_0x0075;
    L_0x006d:
        r2 = move-exception;
        r3 = new nvw;	 Catch:{ all -> 0x0081 }
        r4 = 3;
        r3.<init>(r2, r4);	 Catch:{ all -> 0x0081 }
        throw r3;	 Catch:{ all -> 0x0081 }
    L_0x0075:
        r9.h = r0;
        r9.c();
        r0 = r9.i;
        if (r0 == 0) goto L_0x0080;
    L_0x007e:
        r9.i = r1;
    L_0x0080:
        return;
    L_0x0081:
        r2 = move-exception;
        r9.h = r0;
        r9.c();
        r0 = r9.i;
        if (r0 == 0) goto L_0x008d;
    L_0x008b:
        r9.i = r1;
    L_0x008d:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvs.b():void");
    }

    private final void c() {
        HttpURLConnection httpURLConnection = this.g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.g = null;
        }
    }
}
