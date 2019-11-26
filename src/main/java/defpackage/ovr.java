package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: ovr */
public final class ovr extends ouz implements ovx {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference b = new AtomicReference();
    private final boolean c;
    private final int d;
    private final int e;
    private final String f;
    private final ozc g;
    private final owg h;
    private final owg j;
    private ovm k;
    private HttpURLConnection l;
    private InputStream m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;

    public ovr(String str) {
        this(str, null, 8000, 8000, null);
    }

    public ovr(String str, ozc ozc, int i, int i2, owg owg) {
        super(true);
        this.f = oxz.a(str);
        this.g = ozc;
        this.j = new owg();
        this.d = i;
        this.e = i2;
        this.c = false;
        this.h = owg;
    }

    public final Uri b() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection != null ? Uri.parse(httpURLConnection.getURL().toString()) : null;
    }

    public final Map c() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection != null ? httpURLConnection.getHeaderFields() : Collections.emptyMap();
    }

    public final void a(String str, String str2) {
        oxz.a((Object) str);
        oxz.a((Object) str2);
        this.j.a(str, str2);
    }

    public final void d() {
        this.j.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARNING: Missing block: B:17:0x0073, code skipped:
            if (r10 != r18) goto L_0x0078;
     */
    public final long a(defpackage.ovm r21) {
        /*
        r20 = this;
        r12 = r20;
        r13 = r21;
        r14 = "Unable to connect to ";
        r12.k = r13;
        r10 = 0;
        r12.r = r10;
        r12.q = r10;
        r20.b(r21);
        r2 = new java.net.URL;	 Catch:{ IOException -> 0x01bd }
        r0 = r13.a;	 Catch:{ IOException -> 0x01bd }
        r0 = r0.toString();	 Catch:{ IOException -> 0x01bd }
        r2.<init>(r0);	 Catch:{ IOException -> 0x01bd }
        r3 = r13.b;	 Catch:{ IOException -> 0x01bd }
        r4 = r13.c;	 Catch:{ IOException -> 0x01bd }
        r5 = r13.e;	 Catch:{ IOException -> 0x01bd }
        r7 = r13.f;	 Catch:{ IOException -> 0x01bd }
        r15 = 1;
        r9 = r13.a(r15);	 Catch:{ IOException -> 0x01bd }
        r0 = 2;
        r16 = r13.a(r0);	 Catch:{ IOException -> 0x01bd }
        r17 = 1;
        r1 = r20;
        r18 = r10;
        r10 = r16;
        r11 = r17;
        r1 = r1.a(r2, r3, r4, r5, r7, r9, r10, r11);	 Catch:{ IOException -> 0x01bd }
        r12.l = r1;	 Catch:{ IOException -> 0x01bd }
        r1 = r12.l;	 Catch:{ IOException -> 0x0199 }
        r1 = r1.getResponseCode();	 Catch:{ IOException -> 0x0199 }
        r2 = r12.l;	 Catch:{ IOException -> 0x0199 }
        r2.getResponseMessage();	 Catch:{ IOException -> 0x0199 }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 >= r2) goto L_0x004f;
    L_0x004d:
        goto L_0x017f;
    L_0x004f:
        r3 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r1 > r3) goto L_0x017f;
    L_0x0053:
        r3 = r12.l;
        r3 = r3.getContentType();
        r4 = r12.g;
        if (r4 == 0) goto L_0x006d;
    L_0x005d:
        r4 = r4.a(r3);
        if (r4 == 0) goto L_0x0064;
    L_0x0063:
        goto L_0x006d;
    L_0x0064:
        r20.e();
        r0 = new owe;
        r0.<init>(r3, r13);
        throw r0;
    L_0x006d:
        if (r1 != r2) goto L_0x0076;
    L_0x006f:
        r10 = r13.e;
        r1 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1));
        if (r1 == 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0078;
    L_0x0076:
        r10 = r18;
    L_0x0078:
        r12.o = r10;
        r1 = r13.a(r15);
        if (r1 != 0) goto L_0x0161;
    L_0x0080:
        r1 = r13.f;
        r3 = -1;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x008c;
    L_0x0088:
        r12.p = r1;
        goto L_0x0165;
    L_0x008c:
        r1 = r12.l;
        r2 = "Content-Length";
        r2 = r1.getHeaderField(r2);
        r5 = android.text.TextUtils.isEmpty(r2);
        r6 = "DefaultHttpDataSource";
        r7 = "]";
        if (r5 != 0) goto L_0x00c4;
    L_0x009e:
        r8 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x00a3 }
        goto L_0x00c5;
    L_0x00a3:
        r5 = java.lang.String.valueOf(r2);
        r5 = r5.length();
        r8 = new java.lang.StringBuilder;
        r5 = r5 + 28;
        r8.<init>(r5);
        r5 = "Unexpected Content-Length [";
        r8.append(r5);
        r8.append(r2);
        r8.append(r7);
        r5 = r8.toString();
        defpackage.oyp.b(r6, r5);
    L_0x00c4:
        r8 = r3;
    L_0x00c5:
        r5 = "Content-Range";
        r1 = r1.getHeaderField(r5);
        r5 = android.text.TextUtils.isEmpty(r1);
        if (r5 != 0) goto L_0x0156;
    L_0x00d1:
        r5 = a;
        r5 = r5.matcher(r1);
        r10 = r5.find();
        if (r10 == 0) goto L_0x0156;
    L_0x00dd:
        r0 = r5.group(r0);	 Catch:{ NumberFormatException -> 0x0135 }
        r10 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = r5.group(r15);	 Catch:{ NumberFormatException -> 0x0135 }
        r16 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0135 }
        r10 = r10 - r16;
        r16 = 1;
        r10 = r10 + r16;
        r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1));
        if (r0 < 0) goto L_0x0133;
    L_0x00f7:
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 == 0) goto L_0x0156;
    L_0x00fb:
        r0 = java.lang.String.valueOf(r2);	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = r0.length();	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = r0 + 26;
        r5 = java.lang.String.valueOf(r1);	 Catch:{ NumberFormatException -> 0x0135 }
        r5 = r5.length();	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = r0 + r5;
        r5 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0135 }
        r5.<init>(r0);	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = "Inconsistent headers [";
        r5.append(r0);	 Catch:{ NumberFormatException -> 0x0135 }
        r5.append(r2);	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = "] [";
        r5.append(r0);	 Catch:{ NumberFormatException -> 0x0135 }
        r5.append(r1);	 Catch:{ NumberFormatException -> 0x0135 }
        r5.append(r7);	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = r5.toString();	 Catch:{ NumberFormatException -> 0x0135 }
        defpackage.oyp.a(r6, r0);	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = java.lang.Math.max(r8, r10);	 Catch:{ NumberFormatException -> 0x0135 }
        r8 = r0;
        goto L_0x0156;
    L_0x0133:
        r8 = r10;
        goto L_0x0156;
    L_0x0135:
        r0 = java.lang.String.valueOf(r1);
        r0 = r0.length();
        r2 = new java.lang.StringBuilder;
        r0 = r0 + 27;
        r2.<init>(r0);
        r0 = "Unexpected Content-Range [";
        r2.append(r0);
        r2.append(r1);
        r2.append(r7);
        r0 = r2.toString();
        defpackage.oyp.b(r6, r0);
    L_0x0156:
        r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r0 == 0) goto L_0x015e;
    L_0x015a:
        r0 = r12.o;
        r3 = r8 - r0;
    L_0x015e:
        r12.p = r3;
        goto L_0x0165;
    L_0x0161:
        r0 = r13.f;
        r12.p = r0;
    L_0x0165:
        r0 = r12.l;	 Catch:{ IOException -> 0x0175 }
        r0 = r0.getInputStream();	 Catch:{ IOException -> 0x0175 }
        r12.m = r0;	 Catch:{ IOException -> 0x0175 }
        r12.n = r15;
        r20.c(r21);
        r0 = r12.p;
        return r0;
    L_0x0175:
        r0 = move-exception;
        r20.e();
        r1 = new owb;
        r1.<init>(r0, r13, r15);
        throw r1;
    L_0x017f:
        r0 = r12.l;
        r0.getHeaderFields();
        r20.e();
        r0 = new owd;
        r0.<init>(r1, r13);
        r2 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        if (r1 != r2) goto L_0x0198;
    L_0x0190:
        r1 = new ovk;
        r1.<init>();
        r0.initCause(r1);
    L_0x0198:
        throw r0;
    L_0x0199:
        r0 = move-exception;
        r20.e();
        r1 = new owb;
        r2 = r13.a;
        r2 = r2.toString();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 != 0) goto L_0x01b5;
    L_0x01af:
        r2 = new java.lang.String;
        r2.<init>(r14);
        goto L_0x01b9;
    L_0x01b5:
        r2 = r14.concat(r2);
    L_0x01b9:
        r1.<init>(r2, r0, r13);
        throw r1;
    L_0x01bd:
        r0 = move-exception;
        r1 = new owb;
        r2 = r13.a;
        r2 = r2.toString();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 != 0) goto L_0x01d6;
    L_0x01d0:
        r2 = new java.lang.String;
        r2.<init>(r14);
        goto L_0x01da;
    L_0x01d6:
        r2 = r14.concat(r2);
    L_0x01da:
        r1.<init>(r2, r0, r13);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovr.a(ovm):long");
    }

    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.q != this.o) {
                byte[] bArr2 = (byte[]) b.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.q;
                    long j2 = this.o;
                    if (j == j2) {
                        b.set(bArr2);
                        break;
                    }
                    int read = this.m.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.q += (long) read;
                        a(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.p;
            if (j3 != -1) {
                j3 -= this.r;
                if (j3 != 0) {
                    i2 = (int) Math.min((long) i2, j3);
                }
                return -1;
            }
            int read2 = this.m.read(bArr, i, i2);
            if (read2 != -1) {
                this.r += (long) read2;
                a(read2);
                return read2;
            } else if (this.p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new owb(e, this.k, 2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0067 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)|7|(5:12|13|(2:15|(1:17))(2:18|(1:20))|21|(1:25))|26|27) */
    public final void a() {
        /*
        r9 = this;
        r0 = 0;
        r1 = 0;
        r2 = r9.m;	 Catch:{ all -> 0x0086 }
        if (r2 == 0) goto L_0x0077;
    L_0x0006:
        r2 = r9.l;	 Catch:{ all -> 0x0086 }
        r3 = r9.p;	 Catch:{ all -> 0x0086 }
        r5 = -1;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0013;
    L_0x0010:
        r7 = r9.r;	 Catch:{ all -> 0x0086 }
        r3 = r3 - r7;
    L_0x0013:
        r7 = defpackage.ozp.a;	 Catch:{ all -> 0x0086 }
        r8 = 19;
        if (r7 == r8) goto L_0x001f;
    L_0x0019:
        r7 = defpackage.ozp.a;	 Catch:{ all -> 0x0086 }
        r8 = 20;
        if (r7 != r8) goto L_0x0067;
    L_0x001f:
        r2 = r2.getInputStream();	 Catch:{ Exception -> 0x0067 }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x002e;
    L_0x0027:
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0067;
    L_0x002d:
        goto L_0x0036;
    L_0x002e:
        r3 = r2.read();	 Catch:{ Exception -> 0x0067 }
        r4 = -1;
        if (r3 != r4) goto L_0x0036;
    L_0x0035:
        goto L_0x0067;
    L_0x0036:
        r3 = r2.getClass();	 Catch:{ Exception -> 0x0067 }
        r3 = r3.getName();	 Catch:{ Exception -> 0x0067 }
        r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream";
        r4 = r4.equals(r3);	 Catch:{ Exception -> 0x0067 }
        if (r4 != 0) goto L_0x004e;
    L_0x0046:
        r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream";
        r3 = r4.equals(r3);	 Catch:{ Exception -> 0x0067 }
        if (r3 == 0) goto L_0x0067;
    L_0x004e:
        r3 = r2.getClass();	 Catch:{ Exception -> 0x0067 }
        r3 = r3.getSuperclass();	 Catch:{ Exception -> 0x0067 }
        r4 = "unexpectedEndOfInput";
        r5 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0067 }
        r3 = r3.getDeclaredMethod(r4, r5);	 Catch:{ Exception -> 0x0067 }
        r4 = 1;
        r3.setAccessible(r4);	 Catch:{ Exception -> 0x0067 }
        r4 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0067 }
        r3.invoke(r2, r4);	 Catch:{ Exception -> 0x0067 }
    L_0x0067:
        r2 = r9.m;	 Catch:{ IOException -> 0x006d }
        r2.close();	 Catch:{ IOException -> 0x006d }
        goto L_0x0077;
    L_0x006d:
        r2 = move-exception;
        r3 = new owb;	 Catch:{ all -> 0x0086 }
        r4 = r9.k;	 Catch:{ all -> 0x0086 }
        r5 = 3;
        r3.<init>(r2, r4, r5);	 Catch:{ all -> 0x0086 }
        throw r3;	 Catch:{ all -> 0x0086 }
    L_0x0077:
        r9.m = r0;
        r9.e();
        r0 = r9.n;
        if (r0 == 0) goto L_0x0085;
    L_0x0080:
        r9.n = r1;
        r9.f();
    L_0x0085:
        return;
    L_0x0086:
        r2 = move-exception;
        r9.m = r0;
        r9.e();
        r0 = r9.n;
        if (r0 == 0) goto L_0x0095;
    L_0x0090:
        r9.n = r1;
        r9.f();
    L_0x0095:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovr.a():void");
    }

    private final HttpURLConnection a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, boolean z3) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.d);
        httpURLConnection.setReadTimeout(this.e);
        owg owg = this.h;
        if (owg != null) {
            for (Entry entry : owg.b().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Entry entry2 : this.j.b().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder stringBuilder = new StringBuilder(27);
            stringBuilder.append("bytes=");
            stringBuilder.append(j);
            stringBuilder.append("-");
            String stringBuilder2 = stringBuilder.toString();
            if (j2 != -1) {
                stringBuilder2 = String.valueOf(stringBuilder2);
                StringBuilder stringBuilder3 = new StringBuilder(stringBuilder2.length() + 20);
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append((j + j2) - 1);
                stringBuilder2 = stringBuilder3.toString();
            }
            httpURLConnection.setRequestProperty("Range", stringBuilder2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        if (z2) {
            httpURLConnection.setRequestProperty("Icy-MetaData", "1");
        }
        boolean z4 = true;
        httpURLConnection.setInstanceFollowRedirects(true);
        if (bArr == null) {
            z4 = false;
        }
        httpURLConnection.setDoOutput(z4);
        httpURLConnection.setRequestMethod(ovm.b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    private final void e() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                oyp.b("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.l = null;
        }
    }
}
