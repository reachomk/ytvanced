package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: baqk */
public class baqk {
    private static final Pattern a = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    private static final Pattern b = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    private static final Pattern c = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    public static final Logger d = Logger.getLogger(baqk.class.getName());
    public final String e;
    public final int f;
    public volatile ServerSocket g;
    public final bard h = new baqp();
    public Thread i;
    public final baqj j;
    public final bari k;

    public static final void a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                d.log(Level.SEVERE, "Could not close", e);
            }
        }
    }

    public void a() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public boolean c() {
        throw null;
    }

    public baqk(String str) {
        this.e = str;
        this.f = 0;
        this.k = new baqu();
        this.j = new baqq();
    }

    public final synchronized void b() {
        a();
    }

    protected static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            d.log(Level.WARNING, "Encoding not supported, ignored", e);
            return null;
        }
    }

    public final boolean d() {
        return (this.g == null || this.i == null || this.g.isClosed() || !this.i.isAlive()) ? false : true;
    }

    private static baqy a(baqz baqz, String str, InputStream inputStream, long j) {
        return new baqy(baqz, str, inputStream, j);
    }

    public static baqy a(baqz baqz, String str, String str2) {
        baql baql = new baql(str);
        if (str2 == null) {
            return baqk.a(baqz, str, new ByteArrayInputStream(new byte[0]), 0);
        }
        byte[] bytes;
        try {
            if (!Charset.forName(baql.a()).newEncoder().canEncode(str2)) {
                if (baql.c == null) {
                    baql = new baql(String.valueOf(baql.a).concat("; charset=UTF-8"));
                }
            }
            bytes = str2.getBytes(baql.a());
        } catch (UnsupportedEncodingException e) {
            d.log(Level.SEVERE, "encoding problem, responding nothing", e);
            bytes = new byte[0];
        }
        return baqk.a(baqz, baql.a, new ByteArrayInputStream(bytes), (long) bytes.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:209:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x044c  */
    public defpackage.baqy a(defpackage.baqw r26) {
        /*
        r25 = this;
        r0 = "content-length";
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = r26;
        r2 = (defpackage.baqt) r2;
        r3 = r2.f;
        r4 = defpackage.baqv.PUT;
        r4 = r4.equals(r3);
        r5 = "text/plain";
        if (r4 != 0) goto L_0x0024;
    L_0x0017:
        r4 = defpackage.baqv.POST;
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x0024;
    L_0x001f:
        r0 = r2;
        r20 = r5;
        goto L_0x03f4;
    L_0x0024:
        r4 = r26;
        r4 = (defpackage.baqt) r4;	 Catch:{ all -> 0x0425 }
        r4 = r4.h;	 Catch:{ all -> 0x0425 }
        r4 = r4.containsKey(r0);	 Catch:{ all -> 0x0425 }
        r6 = 0;
        if (r4 != 0) goto L_0x0045;
    L_0x0032:
        r0 = r26;
        r0 = (defpackage.baqt) r0;	 Catch:{ all -> 0x0425 }
        r0 = r0.c;	 Catch:{ all -> 0x0425 }
        r4 = r26;
        r4 = (defpackage.baqt) r4;	 Catch:{ all -> 0x0425 }
        r4 = r4.d;	 Catch:{ all -> 0x0425 }
        if (r0 >= r4) goto L_0x0043;
    L_0x0040:
        r4 = r4 - r0;
        r8 = (long) r4;	 Catch:{ all -> 0x0425 }
        goto L_0x0055;
    L_0x0043:
        r8 = r6;
        goto L_0x0055;
    L_0x0045:
        r4 = r26;
        r4 = (defpackage.baqt) r4;	 Catch:{ all -> 0x0425 }
        r4 = r4.h;	 Catch:{ all -> 0x0425 }
        r0 = r4.get(r0);	 Catch:{ all -> 0x0425 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0425 }
        r8 = java.lang.Long.parseLong(r0);	 Catch:{ all -> 0x0425 }
    L_0x0055:
        r10 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x0068;
    L_0x005b:
        r0 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x0425 }
        r0.<init>();	 Catch:{ all -> 0x0425 }
        r4 = new java.io.DataOutputStream;	 Catch:{ all -> 0x0425 }
        r4.<init>(r0);	 Catch:{ all -> 0x0425 }
        r10 = r4;
        r4 = 0;
        goto L_0x007f;
    L_0x0068:
        r0 = r26;
        r0 = (defpackage.baqt) r0;	 Catch:{ Exception -> 0x041b }
        r0 = r0.a;	 Catch:{ Exception -> 0x041b }
        r0 = r0.b();	 Catch:{ Exception -> 0x041b }
        r4 = new java.io.RandomAccessFile;	 Catch:{ Exception -> 0x041b }
        r0 = r0.b();	 Catch:{ Exception -> 0x041b }
        r10 = "rw";
        r4.<init>(r0, r10);	 Catch:{ Exception -> 0x041b }
        r10 = r4;
        r0 = 0;
    L_0x007f:
        r11 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r11 = new byte[r11];	 Catch:{ all -> 0x0414 }
    L_0x0083:
        r12 = r26;
        r12 = (defpackage.baqt) r12;	 Catch:{ all -> 0x0414 }
        r12 = r12.d;	 Catch:{ all -> 0x0414 }
        r13 = 0;
        if (r12 < 0) goto L_0x00b1;
    L_0x008c:
        r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r12 > 0) goto L_0x0091;
    L_0x0090:
        goto L_0x00b1;
    L_0x0091:
        r12 = r26;
        r12 = (defpackage.baqt) r12;	 Catch:{ all -> 0x0414 }
        r12 = r12.b;	 Catch:{ all -> 0x0414 }
        r14 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r14 = java.lang.Math.min(r8, r14);	 Catch:{ all -> 0x0414 }
        r15 = (int) r14;	 Catch:{ all -> 0x0414 }
        r12 = r12.read(r11, r13, r15);	 Catch:{ all -> 0x0414 }
        r14 = r26;
        r14 = (defpackage.baqt) r14;	 Catch:{ all -> 0x0414 }
        r14.d = r12;	 Catch:{ all -> 0x0414 }
        r14 = (long) r12;	 Catch:{ all -> 0x0414 }
        r8 = r8 - r14;
        if (r12 > 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x0083;
    L_0x00ad:
        r10.write(r11, r13, r12);	 Catch:{ all -> 0x0414 }
        goto L_0x0083;
    L_0x00b1:
        if (r0 == 0) goto L_0x00c0;
    L_0x00b3:
        r6 = r0.toByteArray();	 Catch:{ all -> 0x0414 }
        r0 = r0.size();	 Catch:{ all -> 0x0414 }
        r0 = java.nio.ByteBuffer.wrap(r6, r13, r0);	 Catch:{ all -> 0x0414 }
        goto L_0x00d3;
    L_0x00c0:
        r14 = r4.getChannel();	 Catch:{ all -> 0x0414 }
        r15 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ all -> 0x0414 }
        r18 = r4.length();	 Catch:{ all -> 0x0414 }
        r16 = 0;
        r0 = r14.map(r15, r16, r18);	 Catch:{ all -> 0x0414 }
        r4.seek(r6);	 Catch:{ all -> 0x0414 }
    L_0x00d3:
        r6 = defpackage.baqv.POST;	 Catch:{ all -> 0x0414 }
        r7 = r26;
        r7 = (defpackage.baqt) r7;	 Catch:{ all -> 0x0414 }
        r7 = r7.f;	 Catch:{ all -> 0x0414 }
        r6 = r6.equals(r7);	 Catch:{ all -> 0x0414 }
        if (r6 == 0) goto L_0x03c9;
    L_0x00e1:
        r6 = new baql;	 Catch:{ all -> 0x0414 }
        r7 = r26;
        r7 = (defpackage.baqt) r7;	 Catch:{ all -> 0x0414 }
        r7 = r7.h;	 Catch:{ all -> 0x0414 }
        r8 = "content-type";
        r7 = r7.get(r8);	 Catch:{ all -> 0x0414 }
        r7 = (java.lang.String) r7;	 Catch:{ all -> 0x0414 }
        r6.<init>(r7);	 Catch:{ all -> 0x0414 }
        r7 = "multipart/form-data";
        r8 = r6.b;	 Catch:{ all -> 0x0414 }
        r7 = r7.equalsIgnoreCase(r8);	 Catch:{ all -> 0x0414 }
        if (r7 == 0) goto L_0x0389;
    L_0x00fe:
        r7 = r6.d;	 Catch:{ all -> 0x0414 }
        if (r7 == 0) goto L_0x037b;
    L_0x0102:
        r8 = r26;
        r8 = (defpackage.baqt) r8;	 Catch:{ all -> 0x0414 }
        r8 = r8.g;	 Catch:{ all -> 0x0414 }
        r7 = r7.getBytes();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r9 = new int[r13];	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r10 = r0.remaining();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r11 = r7.length;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r10 < r11) goto L_0x017a;
    L_0x0115:
        r10 = r11 + 4096;
        r10 = new byte[r10];	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r12 = r0.remaining();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r14 = r10.length;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r12 >= r14) goto L_0x0124;
    L_0x0120:
        r14 = r0.remaining();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
    L_0x0124:
        r0.get(r10, r13, r14);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r14 = r14 - r11;
        r11 = r9;
        r9 = 0;
    L_0x012a:
        r12 = r11;
        r11 = 0;
    L_0x012c:
        if (r11 < r14) goto L_0x0149;
    L_0x012e:
        r9 = r9 + r14;
        r11 = r10.length;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r14 = r7.length;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r11 = r11 - r14;
        java.lang.System.arraycopy(r10, r11, r10, r13, r14);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r15 = r0.remaining();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r15 >= r11) goto L_0x013f;
    L_0x013b:
        r11 = r0.remaining();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
    L_0x013f:
        r0.get(r10, r14, r11);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r11 > 0) goto L_0x0146;
    L_0x0144:
        r9 = r12;
        goto L_0x017a;
    L_0x0146:
        r14 = r11;
        r11 = r12;
        goto L_0x012a;
    L_0x0149:
        r15 = r12;
        r12 = 0;
    L_0x014b:
        r3 = r7.length;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r12 < r3) goto L_0x0151;
    L_0x014e:
        r17 = r10;
        goto L_0x0173;
    L_0x0151:
        r17 = r11 + r12;
        r13 = r10[r17];	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r17 = r10;
        r10 = r7[r12];	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r13 != r10) goto L_0x0173;
    L_0x015b:
        r3 = r3 + -1;
        if (r12 != r3) goto L_0x016d;
    L_0x015f:
        r3 = r15.length;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r10 = r3 + 1;
        r10 = new int[r10];	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r13 = 0;
        java.lang.System.arraycopy(r15, r13, r10, r13, r3);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r13 = r9 + r11;
        r10[r3] = r13;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r15 = r10;
    L_0x016d:
        r12 = r12 + 1;
        r10 = r17;
        r13 = 0;
        goto L_0x014b;
    L_0x0173:
        r11 = r11 + 1;
        r12 = r15;
        r10 = r17;
        r13 = 0;
        goto L_0x012c;
    L_0x017a:
        r3 = r9.length;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r7 = 2;
        if (r3 < r7) goto L_0x0352;
    L_0x017e:
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r10 = new byte[r3];	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r11 = 0;
        r12 = 0;
    L_0x0184:
        r13 = r9.length;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r13 = r13 + -1;
        if (r11 >= r13) goto L_0x034a;
    L_0x0189:
        r13 = r9[r11];	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r0.position(r13);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r13 = r0.remaining();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r13 >= r3) goto L_0x0199;
    L_0x0194:
        r13 = r0.remaining();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        goto L_0x019b;
    L_0x0199:
        r13 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
    L_0x019b:
        r14 = 0;
        r0.get(r10, r14, r13);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r15 = new java.io.BufferedReader;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r3 = new java.io.InputStreamReader;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r7 = new java.io.ByteArrayInputStream;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r7.<init>(r10, r14, r13);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r14 = r6.a();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r14 = java.nio.charset.Charset.forName(r14);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r3.<init>(r7, r14);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r15.<init>(r3, r13);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r3 = r15.readLine();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r3 == 0) goto L_0x033c;
    L_0x01bc:
        r7 = r6.d;	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r3 = r3.contains(r7);	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        if (r3 == 0) goto L_0x033c;
    L_0x01c4:
        r3 = r15.readLine();	 Catch:{ barb -> 0x0375, Exception -> 0x0364 }
        r20 = r5;
        r21 = r12;
        r5 = 0;
        r7 = 2;
        r12 = 0;
        r14 = 0;
    L_0x01d0:
        if (r3 == 0) goto L_0x0293;
    L_0x01d2:
        r22 = r3.trim();	 Catch:{ barb -> 0x028e, Exception -> 0x0289, all -> 0x0284 }
        r22 = r22.length();	 Catch:{ barb -> 0x028e, Exception -> 0x0289, all -> 0x0284 }
        if (r22 > 0) goto L_0x01e4;
    L_0x01dc:
        r22 = r2;
        r23 = r4;
        r2 = 0;
        r4 = 2;
        goto L_0x0299;
    L_0x01e4:
        r22 = r2;
        r2 = a;	 Catch:{ barb -> 0x028e, Exception -> 0x0289, all -> 0x0284 }
        r2 = r2.matcher(r3);	 Catch:{ barb -> 0x028e, Exception -> 0x0289, all -> 0x0284 }
        r23 = r2.matches();	 Catch:{ barb -> 0x028e, Exception -> 0x0289, all -> 0x0284 }
        if (r23 == 0) goto L_0x025e;
    L_0x01f2:
        r23 = r4;
        r4 = 2;
        r2 = r2.group(r4);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r4 = c;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r2 = r4.matcher(r2);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
    L_0x01ff:
        r4 = r2.find();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r4 == 0) goto L_0x025b;
    L_0x0205:
        r4 = 1;
        r4 = r2.group(r4);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r24 = r5;
        r5 = "name";
        r5 = r5.equalsIgnoreCase(r4);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r5 != 0) goto L_0x0252;
    L_0x0214:
        r5 = "filename";
        r4 = r5.equalsIgnoreCase(r4);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r4 == 0) goto L_0x0258;
    L_0x021c:
        r4 = 2;
        r5 = r2.group(r4);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r4 = r5.isEmpty();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r4 != 0) goto L_0x024f;
    L_0x0227:
        if (r21 > 0) goto L_0x022c;
    L_0x0229:
        r21 = r21 + 1;
        goto L_0x01ff;
    L_0x022c:
        r4 = java.lang.String.valueOf(r14);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r14 = r21 + 1;
        r21 = java.lang.String.valueOf(r21);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r24 = r5;
        r5 = java.lang.String.valueOf(r21);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r21 = r5.length();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r21 != 0) goto L_0x0248;
    L_0x0242:
        r5 = new java.lang.String;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r5.<init>(r4);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        goto L_0x024c;
    L_0x0248:
        r5 = r4.concat(r5);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
    L_0x024c:
        r21 = r14;
        goto L_0x0257;
    L_0x024f:
        r24 = r5;
        goto L_0x01ff;
    L_0x0252:
        r4 = 2;
        r5 = r2.group(r4);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
    L_0x0257:
        r14 = r5;
    L_0x0258:
        r5 = r24;
        goto L_0x01ff;
    L_0x025b:
        r24 = r5;
        goto L_0x0260;
    L_0x025e:
        r23 = r4;
    L_0x0260:
        r2 = b;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r2 = r2.matcher(r3);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r3 = r2.matches();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r3 == 0) goto L_0x0277;
    L_0x026c:
        r4 = 2;
        r2 = r2.group(r4);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r2 = r2.trim();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r12 = r2;
        goto L_0x0278;
    L_0x0277:
        r4 = 2;
    L_0x0278:
        r3 = r15.readLine();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r7 = r7 + 1;
        r2 = r22;
        r4 = r23;
        goto L_0x01d0;
    L_0x0284:
        r0 = move-exception;
        r23 = r4;
        goto L_0x0411;
    L_0x0289:
        r0 = move-exception;
        r23 = r4;
        goto L_0x0369;
    L_0x028e:
        r0 = move-exception;
        r23 = r4;
        goto L_0x037a;
    L_0x0293:
        r22 = r2;
        r23 = r4;
        r4 = 2;
        r2 = 0;
    L_0x0299:
        r3 = r7 + -1;
        if (r7 > 0) goto L_0x032e;
    L_0x029d:
        r13 = r13 + -4;
        if (r2 >= r13) goto L_0x0324;
    L_0x02a1:
        r3 = r9[r11];	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r3 = r3 + r2;
        r11 = r11 + 1;
        r2 = r9[r11];	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r2 = r2 + -4;
        r0.position(r3);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r12 != 0) goto L_0x02c2;
    L_0x02af:
        r2 = r2 - r3;
        r2 = new byte[r2];	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r0.get(r2);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r3 = new java.lang.String;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r5 = r6.a();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r3.<init>(r2, r5);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r8.put(r14, r3);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        goto L_0x0317;
    L_0x02c2:
        r2 = r2 - r3;
        r7 = r26;
        r7 = (defpackage.baqt) r7;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r2 = r7.a(r0, r3, r2);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r3 = r1.containsKey(r14);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r3 != 0) goto L_0x02d5;
    L_0x02d1:
        r1.put(r14, r2);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        goto L_0x0314;
    L_0x02d5:
        r3 = 2;
    L_0x02d6:
        r7 = new java.lang.StringBuilder;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r12 = java.lang.String.valueOf(r14);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r12 = r12.length();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r12 = r12 + 11;
        r7.<init>(r12);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r7.append(r14);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r7.append(r3);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r7 = r7.toString();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r7 = r1.containsKey(r7);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        if (r7 == 0) goto L_0x02f8;
    L_0x02f5:
        r3 = r3 + 1;
        goto L_0x02d6;
    L_0x02f8:
        r7 = new java.lang.StringBuilder;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r12 = java.lang.String.valueOf(r14);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r12 = r12.length();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r12 = r12 + 11;
        r7.<init>(r12);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r7.append(r14);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r7.append(r3);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r3 = r7.toString();	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r1.put(r3, r2);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
    L_0x0314:
        r8.put(r14, r5);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
    L_0x0317:
        r5 = r20;
        r12 = r21;
        r2 = r22;
        r4 = r23;
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r7 = 2;
        goto L_0x0184;
    L_0x0324:
        r0 = new barb;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r1 = defpackage.barc.INTERNAL_ERROR;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r2 = "Multipart header size exceeds MAX_HEADER_SIZE.";
        r0.<init>(r1, r2);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        throw r0;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
    L_0x032e:
        r7 = r10[r2];	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r15 = 10;
        if (r7 != r15) goto L_0x0339;
    L_0x0334:
        r2 = r2 + 1;
        r7 = r3;
        goto L_0x0299;
    L_0x0339:
        r2 = r2 + 1;
        goto L_0x032e;
    L_0x033c:
        r23 = r4;
        r20 = r5;
        r0 = new barb;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r1 = defpackage.barc.BAD_REQUEST;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r2 = "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.";
        r0.<init>(r1, r2);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        throw r0;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
    L_0x034a:
        r22 = r2;
        r23 = r4;
        r20 = r5;
        goto L_0x03ef;
    L_0x0352:
        r23 = r4;
        r20 = r5;
        r0 = new barb;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r1 = defpackage.barc.BAD_REQUEST;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        r2 = "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.";
        r0.<init>(r1, r2);	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
        throw r0;	 Catch:{ barb -> 0x0362, Exception -> 0x0360 }
    L_0x0360:
        r0 = move-exception;
        goto L_0x0369;
    L_0x0362:
        r0 = move-exception;
        goto L_0x037a;
    L_0x0364:
        r0 = move-exception;
        r23 = r4;
        r20 = r5;
    L_0x0369:
        r1 = new barb;	 Catch:{ all -> 0x0410 }
        r2 = defpackage.barc.INTERNAL_ERROR;	 Catch:{ all -> 0x0410 }
        r0 = r0.toString();	 Catch:{ all -> 0x0410 }
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0410 }
        throw r1;	 Catch:{ all -> 0x0410 }
    L_0x0375:
        r0 = move-exception;
        r23 = r4;
        r20 = r5;
    L_0x037a:
        throw r0;	 Catch:{ all -> 0x0410 }
    L_0x037b:
        r23 = r4;
        r20 = r5;
        r0 = new barb;	 Catch:{ all -> 0x0410 }
        r1 = defpackage.barc.BAD_REQUEST;	 Catch:{ all -> 0x0410 }
        r2 = "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html";
        r0.<init>(r1, r2);	 Catch:{ all -> 0x0410 }
        throw r0;	 Catch:{ all -> 0x0410 }
    L_0x0389:
        r22 = r2;
        r23 = r4;
        r20 = r5;
        r2 = r0.remaining();	 Catch:{ all -> 0x0410 }
        r2 = new byte[r2];	 Catch:{ all -> 0x0410 }
        r0.get(r2);	 Catch:{ all -> 0x0410 }
        r0 = new java.lang.String;	 Catch:{ all -> 0x0410 }
        r3 = r6.a();	 Catch:{ all -> 0x0410 }
        r0.<init>(r2, r3);	 Catch:{ all -> 0x0410 }
        r0 = r0.trim();	 Catch:{ all -> 0x0410 }
        r2 = "application/x-www-form-urlencoded";
        r3 = r6.b;	 Catch:{ all -> 0x0410 }
        r2 = r2.equalsIgnoreCase(r3);	 Catch:{ all -> 0x0410 }
        if (r2 != 0) goto L_0x03bb;
    L_0x03af:
        r2 = r0.length();	 Catch:{ all -> 0x0410 }
        if (r2 == 0) goto L_0x03ef;
    L_0x03b5:
        r2 = "postData";
        r1.put(r2, r0);	 Catch:{ all -> 0x0410 }
        goto L_0x03ef;
    L_0x03bb:
        r1 = r26;
        r1 = (defpackage.baqt) r1;	 Catch:{ all -> 0x0410 }
        r1 = r1.g;	 Catch:{ all -> 0x0410 }
        r2 = r26;
        r2 = (defpackage.baqt) r2;	 Catch:{ all -> 0x0410 }
        r2.a(r0, r1);	 Catch:{ all -> 0x0410 }
        goto L_0x03ef;
    L_0x03c9:
        r22 = r2;
        r23 = r4;
        r20 = r5;
        r2 = defpackage.baqv.PUT;	 Catch:{ all -> 0x0410 }
        r3 = r26;
        r3 = (defpackage.baqt) r3;	 Catch:{ all -> 0x0410 }
        r3 = r3.f;	 Catch:{ all -> 0x0410 }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0410 }
        if (r2 == 0) goto L_0x03ef;
    L_0x03dd:
        r2 = "content";
        r3 = r0.limit();	 Catch:{ all -> 0x0410 }
        r4 = r26;
        r4 = (defpackage.baqt) r4;	 Catch:{ all -> 0x0410 }
        r5 = 0;
        r0 = r4.a(r0, r5, r3);	 Catch:{ all -> 0x0410 }
        r1.put(r2, r0);	 Catch:{ all -> 0x0410 }
    L_0x03ef:
        defpackage.baqk.a(r23);	 Catch:{ IOException -> 0x040c, barb -> 0x0408 }
        r0 = r22;
    L_0x03f4:
        r1 = r0.g;
        r0 = r0.i;
        r2 = "NanoHttpd.QUERY_STRING";
        r1.put(r2, r0);
        r0 = defpackage.barc.NOT_FOUND;
        r1 = "Not Found";
        r2 = r20;
        r0 = defpackage.baqk.a(r0, r2, r1);
        return r0;
    L_0x0408:
        r0 = move-exception;
        r2 = r20;
        goto L_0x042e;
    L_0x040c:
        r0 = move-exception;
        r2 = r20;
        goto L_0x043a;
    L_0x0410:
        r0 = move-exception;
    L_0x0411:
        r2 = r20;
        goto L_0x0418;
    L_0x0414:
        r0 = move-exception;
        r23 = r4;
        r2 = r5;
    L_0x0418:
        r16 = r23;
        goto L_0x0429;
    L_0x041b:
        r0 = move-exception;
        r2 = r5;
        r1 = new java.lang.Error;	 Catch:{ all -> 0x0423 }
        r1.<init>(r0);	 Catch:{ all -> 0x0423 }
        throw r1;	 Catch:{ all -> 0x0423 }
    L_0x0423:
        r0 = move-exception;
        goto L_0x0427;
    L_0x0425:
        r0 = move-exception;
        r2 = r5;
    L_0x0427:
        r16 = 0;
    L_0x0429:
        defpackage.baqk.a(r16);	 Catch:{ IOException -> 0x0439, barb -> 0x042d }
        throw r0;	 Catch:{ IOException -> 0x0439, barb -> 0x042d }
    L_0x042d:
        r0 = move-exception;
    L_0x042e:
        r1 = r0.a;
        r0 = r0.getMessage();
        r0 = defpackage.baqk.a(r1, r2, r0);
        return r0;
    L_0x0439:
        r0 = move-exception;
    L_0x043a:
        r1 = defpackage.barc.INTERNAL_ERROR;
        r0 = r0.getMessage();
        r0 = java.lang.String.valueOf(r0);
        r3 = "SERVER INTERNAL ERROR: IOException: ";
        r4 = r0.length();
        if (r4 != 0) goto L_0x0452;
    L_0x044c:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x0456;
    L_0x0452:
        r0 = r3.concat(r0);
    L_0x0456:
        r0 = defpackage.baqk.a(r1, r2, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baqk.a(baqw):baqy");
    }
}
