package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: baqy */
public class baqy implements Closeable {
    public final baqz a;
    public final Map b = new HashMap();
    public baqv c;
    public boolean d;
    public boolean e;
    private final String f;
    private final InputStream g;
    private final long h;
    private final Map i = new baqx(this);
    private boolean j;

    protected baqy(baqz baqz, String str, InputStream inputStream, long j) {
        this.a = baqz;
        this.f = str;
        if (inputStream == null) {
            this.g = new ByteArrayInputStream(new byte[0]);
            this.h = 0;
        } else {
            this.g = inputStream;
            this.h = j;
        }
        this.j = false;
        this.e = true;
    }

    public final void close() {
        InputStream inputStream = this.g;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void a(String str, String str2) {
        this.i.put(str, str2);
    }

    public final String a(String str) {
        return (String) this.b.get(str.toLowerCase());
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd A:{Catch:{ IOException -> 0x0136 }} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7 A:{Catch:{ IOException -> 0x0136 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00bd */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:36|37|38|39|(1:41)(1:42)|43) */
    public void a(java.io.OutputStream r9) {
        /*
        r8 = this;
        r0 = "content-length";
        r1 = new java.text.SimpleDateFormat;
        r2 = java.util.Locale.US;
        r3 = "E, d MMM yyyy HH:mm:ss 'GMT'";
        r1.<init>(r3, r2);
        r2 = "GMT";
        r2 = java.util.TimeZone.getTimeZone(r2);
        r1.setTimeZone(r2);
        r2 = r8.a;	 Catch:{ IOException -> 0x0136 }
        if (r2 == 0) goto L_0x012e;
    L_0x0018:
        r2 = new java.io.PrintWriter;	 Catch:{ IOException -> 0x0136 }
        r3 = new java.io.BufferedWriter;	 Catch:{ IOException -> 0x0136 }
        r4 = new java.io.OutputStreamWriter;	 Catch:{ IOException -> 0x0136 }
        r5 = new baql;	 Catch:{ IOException -> 0x0136 }
        r6 = r8.f;	 Catch:{ IOException -> 0x0136 }
        r5.<init>(r6);	 Catch:{ IOException -> 0x0136 }
        r5 = r5.a();	 Catch:{ IOException -> 0x0136 }
        r4.<init>(r9, r5);	 Catch:{ IOException -> 0x0136 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0136 }
        r4 = 0;
        r2.<init>(r3, r4);	 Catch:{ IOException -> 0x0136 }
        r3 = "HTTP/1.1 ";
        r3 = r2.append(r3);	 Catch:{ IOException -> 0x0136 }
        r5 = r8.a;	 Catch:{ IOException -> 0x0136 }
        r5 = r5.a();	 Catch:{ IOException -> 0x0136 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0136 }
        r5 = " \r\n";
        r3.append(r5);	 Catch:{ IOException -> 0x0136 }
        r3 = r8.f;	 Catch:{ IOException -> 0x0136 }
        if (r3 == 0) goto L_0x0051;
    L_0x004c:
        r5 = "Content-Type";
        defpackage.baqy.a(r2, r5, r3);	 Catch:{ IOException -> 0x0136 }
    L_0x0051:
        r3 = "date";
        r3 = r8.a(r3);	 Catch:{ IOException -> 0x0136 }
        if (r3 != 0) goto L_0x0067;
    L_0x0059:
        r3 = "Date";
        r5 = new java.util.Date;	 Catch:{ IOException -> 0x0136 }
        r5.<init>();	 Catch:{ IOException -> 0x0136 }
        r1 = r1.format(r5);	 Catch:{ IOException -> 0x0136 }
        defpackage.baqy.a(r2, r3, r1);	 Catch:{ IOException -> 0x0136 }
    L_0x0067:
        r1 = r8.i;	 Catch:{ IOException -> 0x0136 }
        r1 = r1.entrySet();	 Catch:{ IOException -> 0x0136 }
        r1 = r1.iterator();	 Catch:{ IOException -> 0x0136 }
    L_0x0071:
        r3 = r1.hasNext();	 Catch:{ IOException -> 0x0136 }
        if (r3 != 0) goto L_0x0117;
    L_0x0077:
        r1 = "connection";
        r1 = r8.a(r1);	 Catch:{ IOException -> 0x0136 }
        if (r1 != 0) goto L_0x008d;
    L_0x007f:
        r1 = "Connection";
        r3 = r8.e;	 Catch:{ IOException -> 0x0136 }
        if (r3 != 0) goto L_0x0088;
    L_0x0085:
        r3 = "close";
        goto L_0x008a;
    L_0x0088:
        r3 = "keep-alive";
    L_0x008a:
        defpackage.baqy.a(r2, r1, r3);	 Catch:{ IOException -> 0x0136 }
    L_0x008d:
        r1 = r8.a(r0);	 Catch:{ IOException -> 0x0136 }
        if (r1 == 0) goto L_0x0095;
    L_0x0093:
        r8.d = r4;	 Catch:{ IOException -> 0x0136 }
    L_0x0095:
        r1 = r8.g;	 Catch:{ IOException -> 0x0136 }
        if (r1 == 0) goto L_0x009c;
    L_0x0099:
        r3 = r8.h;	 Catch:{ IOException -> 0x0136 }
        goto L_0x009e;
    L_0x009c:
        r3 = 0;
    L_0x009e:
        r1 = r8.c;	 Catch:{ IOException -> 0x0136 }
        r5 = defpackage.baqv.HEAD;	 Catch:{ IOException -> 0x0136 }
        r6 = "\r\n";
        if (r1 == r5) goto L_0x00b2;
    L_0x00a6:
        r1 = r8.j;	 Catch:{ IOException -> 0x0136 }
        if (r1 == 0) goto L_0x00b2;
    L_0x00aa:
        r0 = "Transfer-Encoding";
        r1 = "chunked";
        defpackage.baqy.a(r2, r0, r1);	 Catch:{ IOException -> 0x0136 }
        goto L_0x00ed;
    L_0x00b2:
        r0 = r8.a(r0);	 Catch:{ IOException -> 0x0136 }
        if (r0 == 0) goto L_0x00d4;
    L_0x00b8:
        r3 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x00bd }
        goto L_0x00d4;
    L_0x00bd:
        r1 = defpackage.baqk.d;	 Catch:{ IOException -> 0x0136 }
        r5 = "content-length was no number ";
        r7 = r0.length();	 Catch:{ IOException -> 0x0136 }
        if (r7 != 0) goto L_0x00cd;
    L_0x00c7:
        r0 = new java.lang.String;	 Catch:{ IOException -> 0x0136 }
        r0.<init>(r5);	 Catch:{ IOException -> 0x0136 }
        goto L_0x00d1;
    L_0x00cd:
        r0 = r5.concat(r0);	 Catch:{ IOException -> 0x0136 }
    L_0x00d1:
        r1.severe(r0);	 Catch:{ IOException -> 0x0136 }
    L_0x00d4:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0136 }
        r1 = 38;
        r0.<init>(r1);	 Catch:{ IOException -> 0x0136 }
        r1 = "Content-Length: ";
        r0.append(r1);	 Catch:{ IOException -> 0x0136 }
        r0.append(r3);	 Catch:{ IOException -> 0x0136 }
        r0.append(r6);	 Catch:{ IOException -> 0x0136 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0136 }
        r2.print(r0);	 Catch:{ IOException -> 0x0136 }
    L_0x00ed:
        r2.append(r6);	 Catch:{ IOException -> 0x0136 }
        r2.flush();	 Catch:{ IOException -> 0x0136 }
        r0 = r8.c;	 Catch:{ IOException -> 0x0136 }
        r1 = defpackage.baqv.HEAD;	 Catch:{ IOException -> 0x0136 }
        if (r0 == r1) goto L_0x010b;
    L_0x00f9:
        r0 = r8.j;	 Catch:{ IOException -> 0x0136 }
        if (r0 == 0) goto L_0x010b;
    L_0x00fd:
        r0 = new bara;	 Catch:{ IOException -> 0x0136 }
        r0.<init>(r9);	 Catch:{ IOException -> 0x0136 }
        r1 = -1;
        r8.a(r0, r1);	 Catch:{ IOException -> 0x0136 }
        r0.a();	 Catch:{ IOException -> 0x0136 }
        goto L_0x010e;
    L_0x010b:
        r8.a(r9, r3);	 Catch:{ IOException -> 0x0136 }
    L_0x010e:
        r9.flush();	 Catch:{ IOException -> 0x0136 }
        r9 = r8.g;	 Catch:{ IOException -> 0x0136 }
        defpackage.baqk.a(r9);	 Catch:{ IOException -> 0x0136 }
        return;
    L_0x0117:
        r3 = r1.next();	 Catch:{ IOException -> 0x0136 }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ IOException -> 0x0136 }
        r5 = r3.getKey();	 Catch:{ IOException -> 0x0136 }
        r5 = (java.lang.String) r5;	 Catch:{ IOException -> 0x0136 }
        r3 = r3.getValue();	 Catch:{ IOException -> 0x0136 }
        r3 = (java.lang.String) r3;	 Catch:{ IOException -> 0x0136 }
        defpackage.baqy.a(r2, r5, r3);	 Catch:{ IOException -> 0x0136 }
        goto L_0x0071;
    L_0x012e:
        r9 = new java.lang.Error;	 Catch:{ IOException -> 0x0136 }
        r0 = "sendResponse(): Status can't be null.";
        r9.<init>(r0);	 Catch:{ IOException -> 0x0136 }
        throw r9;	 Catch:{ IOException -> 0x0136 }
    L_0x0136:
        r9 = move-exception;
        r0 = defpackage.baqk.d;
        r1 = java.util.logging.Level.SEVERE;
        r2 = "Could not send response to the client";
        r0.log(r1, r2, r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baqy.a(java.io.OutputStream):void");
    }

    private static void a(PrintWriter printWriter, String str, String str2) {
        printWriter.append(str).append(": ").append(str2).append("\r\n");
    }

    private final void a(OutputStream outputStream, long j) {
        b(outputStream, j);
    }

    private final void b(OutputStream outputStream, long j) {
        byte[] bArr = new byte[16384];
        long j2 = j;
        while (true) {
            long j3 = 16384;
            if (j2 <= 0) {
                if (j != -1) {
                    return;
                }
            } else if (j != -1) {
                j3 = Math.min(j2, 16384);
            }
            int read = this.g.read(bArr, 0, (int) j3);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
                if (j != -1) {
                    j2 -= (long) read;
                }
            } else {
                return;
            }
        }
    }
}
