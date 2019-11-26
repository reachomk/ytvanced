package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bbem */
public final class bbem implements bazz, Closeable {
    public bbel a;
    public int b;
    public volatile boolean c = false;
    private final bbho d;
    private final bbht e;
    private basz f;
    private bbcd g;
    private byte[] h;
    private int i;
    private int j = 5;
    private boolean k;
    private bazr l;
    private bazr m = new bazr();
    private long n;
    private boolean o = false;
    private int p = -1;
    private int q;
    private boolean r = false;
    private int s = 1;

    public bbem(bbel bbel, basz basz, int i, bbho bbho, bbht bbht) {
        this.a = (bbel) amqw.a((Object) bbel, (Object) "sink");
        this.f = (basz) amqw.a((Object) basz, (Object) "decompressor");
        this.b = i;
        this.d = (bbho) amqw.a((Object) bbho, (Object) "statsTraceCtx");
        this.e = (bbht) amqw.a((Object) bbht, (Object) "transportTracer");
    }

    public final void b(int i) {
        this.b = i;
    }

    public final void a(basz basz) {
        amqw.b(this.g == null, (Object) "Already set full stream decompressor");
        this.f = (basz) amqw.a((Object) basz, (Object) "Can't pass an empty decompressor");
    }

    public final void a(bbcd bbcd) {
        boolean z = true;
        amqw.b(this.f == baso.a, (Object) "per-message decompressor already set");
        if (this.g != null) {
            z = false;
        }
        amqw.b(z, (Object) "full stream decompressor already set");
        this.g = (bbcd) amqw.a((Object) bbcd, (Object) "Can't pass a null full stream decompressor");
        this.m = null;
    }

    public final void c(int i) {
        amqw.a(i > 0, (Object) "numMessages must be > 0");
        if (!b()) {
            this.n += (long) i;
            d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    public final void a(defpackage.bbff r6) {
        /*
        r5 = this;
        r0 = "data";
        defpackage.amqw.a(r6, r0);
        r0 = 0;
        r1 = 1;
        r2 = r5.b();	 Catch:{ all -> 0x0035 }
        if (r2 != 0) goto L_0x0031;
    L_0x000d:
        r2 = r5.r;	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0031;
    L_0x0012:
        r2 = r5.g;	 Catch:{ all -> 0x0035 }
        if (r2 != 0) goto L_0x001c;
    L_0x0016:
        r2 = r5.m;	 Catch:{ all -> 0x0035 }
        r2.a(r6);	 Catch:{ all -> 0x0035 }
        goto L_0x002b;
    L_0x001c:
        r3 = r2.h;	 Catch:{ all -> 0x0035 }
        r3 = r3 ^ r1;
        r4 = "GzipInflatingBuffer is closed";
        defpackage.amqw.b(r3, r4);	 Catch:{ all -> 0x0035 }
        r3 = r2.a;	 Catch:{ all -> 0x0035 }
        r3.a(r6);	 Catch:{ all -> 0x0035 }
        r2.m = r0;	 Catch:{ all -> 0x0035 }
    L_0x002b:
        r5.d();	 Catch:{ all -> 0x002f }
        return;
    L_0x002f:
        r1 = move-exception;
        goto L_0x0038;
    L_0x0031:
        r6.close();
        return;
    L_0x0035:
        r0 = move-exception;
        r1 = r0;
        r0 = 1;
    L_0x0038:
        if (r0 == 0) goto L_0x003d;
    L_0x003a:
        r6.close();
    L_0x003d:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbem.a(bbff):void");
    }

    public final void a() {
        if (!b()) {
            if (c()) {
                close();
                return;
            }
            this.r = true;
        }
    }

    public final void close() {
        if (!b()) {
            bazr bazr = this.l;
            boolean z = bazr != null && bazr.a > 0;
            try {
                bbcd bbcd = this.g;
                if (bbcd != null) {
                    if (!z) {
                        amqw.b(bbcd.h ^ 1, (Object) "GzipInflatingBuffer is closed");
                        if (bbcd.c.b() == 0) {
                            if (bbcd.n == 1) {
                                z = false;
                                this.g.close();
                            }
                        }
                    }
                    z = true;
                    this.g.close();
                }
                bazr bazr2 = this.m;
                if (bazr2 != null) {
                    bazr2.close();
                }
                bazr2 = this.l;
                if (bazr2 != null) {
                    bazr2.close();
                }
                this.g = null;
                this.m = null;
                this.l = null;
                this.a.a(z);
            } catch (Throwable th) {
                this.g = null;
                this.m = null;
                this.l = null;
            }
        }
    }

    public final boolean b() {
        return this.m == null && this.g == null;
    }

    private final boolean c() {
        bbcd bbcd = this.g;
        if (bbcd != null) {
            amqw.b(1 ^ bbcd.h, (Object) "GzipInflatingBuffer is closed");
            return bbcd.m;
        } else if (this.m.a == 0) {
            return true;
        } else {
            return false;
        }
    }

    private final void d() {
        if (!this.o) {
            this.o = true;
            while (!this.c && this.n > 0 && e()) {
                try {
                    int i = this.s;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    } else if (i2 == 0) {
                        i = this.l.b();
                        if ((i & 254) == 0) {
                            this.k = (i & 1) != 0;
                            bazr bazr = this.l;
                            bazr.a(4);
                            i = bazr.b() | (((bazr.b() << 24) | (bazr.b() << 16)) | (bazr.b() << 8));
                            this.j = i;
                            if (i < 0 || i > this.b) {
                                throw bavx.g.a(String.format("gRPC message exceeds maximum size %d: %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.j)})).b();
                            }
                            this.p++;
                            for (bawd c : this.d.a) {
                                c.c();
                            }
                            bbht bbht = this.e;
                            bbht.e.a();
                            bbht.f = bbht.b.a();
                            this.s = 2;
                        } else {
                            throw bavx.i.a("gRPC frame header malformed: reserved bits not zero").b();
                        }
                    } else if (i2 != 1) {
                        String str = i != 1 ? i != 2 ? "null" : "BODY" : "HEADER";
                        StringBuilder stringBuilder = new StringBuilder(str.length() + 15);
                        stringBuilder.append("Invalid state: ");
                        stringBuilder.append(str);
                        throw new AssertionError(stringBuilder.toString());
                    } else {
                        InputStream a;
                        bbho bbho = this.d;
                        i2 = this.p;
                        long j = (long) this.q;
                        for (bawd a2 : bbho.a) {
                            a2.a(i2, j);
                        }
                        this.q = 0;
                        if (!this.k) {
                            this.d.c((long) this.l.a);
                            a = bbfi.a(this.l);
                        } else if (this.f != baso.a) {
                            a = new bben(this.f.a(bbfi.a(this.l)), this.b, this.d);
                        } else {
                            throw bavx.i.a("Can't decode compressed gRPC message as compression not configured").b();
                        }
                        this.l = null;
                        this.a.a(new bbeo(a));
                        this.s = 1;
                        this.j = 5;
                        this.n--;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.o = false;
                }
            }
            if (this.c) {
                close();
                this.o = false;
                return;
            }
            if (this.r && c()) {
                close();
            }
            this.o = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x022a A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0213 A:{Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251, all -> 0x0261 }} */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d2  */
    /* JADX WARNING: Missing block: B:15:0x0028, code skipped:
            if (r8 == r7.length) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:96:0x01b2, code skipped:
            r10 = false;
     */
    private final boolean e() {
        /*
        r16 = this;
        r1 = r16;
        r2 = 2;
        r3 = 0;
        r0 = r1.l;	 Catch:{ all -> 0x02cd }
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        r4 = 0;
        r5 = 0;
        goto L_0x0013;
    L_0x000b:
        r0 = new bazr;	 Catch:{ all -> 0x02cd }
        r0.<init>();	 Catch:{ all -> 0x02cd }
        r1.l = r0;	 Catch:{ all -> 0x02cd }
        goto L_0x0008;
    L_0x0013:
        r0 = r1.j;	 Catch:{ all -> 0x0227 }
        r6 = r1.l;	 Catch:{ all -> 0x0227 }
        r6 = r6.a;	 Catch:{ all -> 0x0227 }
        r0 = r0 - r6;
        r6 = 1;
        if (r0 <= 0) goto L_0x02a5;
    L_0x001d:
        r7 = r1.g;	 Catch:{ all -> 0x0227 }
        if (r7 == 0) goto L_0x0264;
    L_0x0021:
        r7 = r1.h;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r7 == 0) goto L_0x002a;
    L_0x0025:
        r8 = r1.i;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7 = r7.length;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r8 != r7) goto L_0x0037;
    L_0x002a:
        r7 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r7 = java.lang.Math.min(r0, r7);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7 = new byte[r7];	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r1.h = r7;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r1.i = r3;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r8 = 0;
    L_0x0037:
        r7 = r1.h;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7 = r7.length;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7 = r7 - r8;
        r0 = java.lang.Math.min(r0, r7);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7 = r1.g;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r8 = r1.h;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r9 = r1.i;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r7.h;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10 ^ r6;
        r11 = "GzipInflatingBuffer is closed";
        defpackage.amqw.b(r10, r11);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = 1;
        r11 = 0;
    L_0x004f:
        if (r10 == 0) goto L_0x0203;
    L_0x0051:
        r10 = r0 - r11;
        r12 = 10;
        if (r10 <= 0) goto L_0x01f5;
    L_0x0057:
        r13 = r7.n;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r14 = r13 + -1;
        if (r13 == 0) goto L_0x01f3;
    L_0x005d:
        r15 = 8;
        switch(r14) {
            case 0: goto L_0x0176;
            case 1: goto L_0x0157;
            case 2: goto L_0x0143;
            case 3: goto L_0x012d;
            case 4: goto L_0x0114;
            case 5: goto L_0x00e5;
            case 6: goto L_0x00b9;
            case 7: goto L_0x00a9;
            case 8: goto L_0x006b;
            case 9: goto L_0x0066;
            default: goto L_0x0062;
        };	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x0062:
        r0 = new java.lang.AssertionError;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x01b5;
    L_0x0066:
        r10 = r7.a();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x004f;
    L_0x006b:
        r10 = r7.g;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 == 0) goto L_0x0071;
    L_0x006f:
        r10 = 1;
        goto L_0x0072;
    L_0x0071:
        r10 = 0;
    L_0x0072:
        r12 = "inflater is null";
        defpackage.amqw.b(r10, r12);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r7.e;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = r7.f;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 != r12) goto L_0x007f;
    L_0x007d:
        r10 = 1;
        goto L_0x0080;
    L_0x007f:
        r10 = 0;
    L_0x0080:
        r12 = "inflaterInput has unconsumed bytes";
        defpackage.amqw.b(r10, r12);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r7.a;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.a;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r10 = java.lang.Math.min(r10, r12);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 == 0) goto L_0x01b2;
    L_0x0091:
        r7.e = r3;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7.f = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = r7.a;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r13 = r7.d;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12.a(r13, r3, r10);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = r7.g;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r13 = r7.d;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r14 = r7.e;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12.setInput(r13, r14, r10);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7.n = r15;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x00a9:
        r13 = r9 + r11;
        r10 = r7.a(r8, r13, r10);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r11 = r11 + r10;
        r10 = r7.n;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 != r12) goto L_0x015f;
    L_0x00b4:
        r10 = r7.a();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x004f;
    L_0x00b9:
        r10 = r7.g;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 != 0) goto L_0x00c5;
    L_0x00bd:
        r10 = new java.util.zip.Inflater;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10.<init>(r6);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7.g = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x00c8;
    L_0x00c5:
        r10.reset();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x00c8:
        r10 = r7.b;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10.reset();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r7.f;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = r7.e;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10 - r12;
        if (r10 <= 0) goto L_0x00df;
    L_0x00d4:
        r13 = r7.g;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r14 = r7.d;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r13.setInput(r14, r12, r10);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7.n = r15;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x00df:
        r10 = 9;
        r7.n = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x00e5:
        r10 = r7.i;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10 & r2;
        r12 = 7;
        if (r10 == r2) goto L_0x00ef;
    L_0x00eb:
        r7.n = r12;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x00ef:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.b();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 >= r2) goto L_0x00f9;
    L_0x00f7:
        goto L_0x01b2;
    L_0x00f9:
        r10 = r7.b;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r13 = r10.getValue();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = (int) r13;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = (char) r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r13 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r13 = r13.d();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 != r13) goto L_0x010c;
    L_0x0109:
        r7.n = r12;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x010c:
        r0 = new java.util.zip.ZipException;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r3 = "Corrupt GZIP header";
        r0.<init>(r3);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        throw r0;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x0114:
        r10 = r7.i;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = 16;
        r10 = r10 & r12;
        if (r10 == r12) goto L_0x011f;
    L_0x011b:
        r10 = 6;
        r7.n = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x011f:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.c();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 != 0) goto L_0x0129;
    L_0x0127:
        goto L_0x01b2;
    L_0x0129:
        r10 = 6;
        r7.n = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x012d:
        r10 = r7.i;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10 & r15;
        r12 = 5;
        if (r10 == r15) goto L_0x0136;
    L_0x0133:
        r7.n = r12;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x0136:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.c();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 != 0) goto L_0x0140;
    L_0x013e:
        goto L_0x01b2;
    L_0x0140:
        r7.n = r12;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x0143:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.b();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = r7.j;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 >= r12) goto L_0x014e;
    L_0x014d:
        goto L_0x01b2;
    L_0x014e:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10.a(r12);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = 4;
        r7.n = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x0157:
        r10 = r7.i;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = 4;
        r10 = r10 & r12;
        if (r10 == r12) goto L_0x0162;
    L_0x015d:
        r7.n = r12;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x015f:
        r10 = 1;
        goto L_0x004f;
    L_0x0162:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.b();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 < r2) goto L_0x01b2;
    L_0x016a:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.d();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7.j = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = 3;
        r7.n = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x0176:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.b();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 < r12) goto L_0x01b2;
    L_0x017e:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.d();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = 35615; // 0x8b1f float:4.9907E-41 double:1.7596E-319;
        if (r10 != r12) goto L_0x01aa;
    L_0x0189:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.a();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r10 != r15) goto L_0x01a2;
    L_0x0191:
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r10.a();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7.i = r10;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r10 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r12 = 6;
        r10.a(r12);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7.n = r2;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x015f;
    L_0x01a2:
        r0 = new java.util.zip.ZipException;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r3 = "Unsupported compression method";
        r0.<init>(r3);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        throw r0;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x01aa:
        r0 = new java.util.zip.ZipException;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r3 = "Not in GZIP format";
        r0.<init>(r3);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        throw r0;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x01b2:
        r10 = 0;
        goto L_0x004f;
    L_0x01b5:
        switch(r13) {
            case 1: goto L_0x01d6;
            case 2: goto L_0x01d3;
            case 3: goto L_0x01d0;
            case 4: goto L_0x01cd;
            case 5: goto L_0x01ca;
            case 6: goto L_0x01c7;
            case 7: goto L_0x01c4;
            case 8: goto L_0x01c1;
            case 9: goto L_0x01be;
            case 10: goto L_0x01bb;
            default: goto L_0x01b8;
        };	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x01b8:
        r3 = "null";
        goto L_0x01d8;
    L_0x01bb:
        r3 = "TRAILER";
        goto L_0x01d8;
    L_0x01be:
        r3 = "INFLATER_NEEDS_INPUT";
        goto L_0x01d8;
    L_0x01c1:
        r3 = "INFLATING";
        goto L_0x01d8;
    L_0x01c4:
        r3 = "INITIALIZE_INFLATER";
        goto L_0x01d8;
    L_0x01c7:
        r3 = "HEADER_CRC";
        goto L_0x01d8;
    L_0x01ca:
        r3 = "HEADER_COMMENT";
        goto L_0x01d8;
    L_0x01cd:
        r3 = "HEADER_NAME";
        goto L_0x01d8;
    L_0x01d0:
        r3 = "HEADER_EXTRA";
        goto L_0x01d8;
    L_0x01d3:
        r3 = "HEADER_EXTRA_LEN";
        goto L_0x01d8;
    L_0x01d6:
        r3 = "HEADER";
    L_0x01d8:
        r6 = r3.length();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r6 = r6 + 15;
        r7.<init>(r6);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r6 = "Invalid state: ";
        r7.append(r6);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7.append(r3);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r3 = r7.toString();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        throw r0;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x01f3:
        r0 = 0;
        throw r0;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
    L_0x01f5:
        r0 = r7.n;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r0 != r6) goto L_0x0202;
    L_0x01f9:
        r0 = r7.c;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r0 = r0.b();	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        if (r0 >= r12) goto L_0x0202;
    L_0x0201:
        goto L_0x0203;
    L_0x0202:
        r6 = 0;
    L_0x0203:
        r7.m = r6;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r0 = r1.g;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r6 = r0.k;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r0.k = r3;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r4 = r4 + r6;
        r6 = r0.l;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r0.l = r3;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r5 = r5 + r6;
        if (r11 == 0) goto L_0x022a;
    L_0x0213:
        r0 = r1.l;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r6 = r1.h;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r7 = r1.i;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r6 = defpackage.bbfi.a(r6, r7, r11);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r0.a(r6);	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r0 = r1.i;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        r0 = r0 + r11;
        r1.i = r0;	 Catch:{ IOException -> 0x0259, DataFormatException -> 0x0251 }
        goto L_0x0013;
    L_0x0227:
        r0 = move-exception;
        goto L_0x02d0;
    L_0x022a:
        if (r4 <= 0) goto L_0x0250;
    L_0x022c:
        r0 = r1.a;
        r0.a(r4);
        r0 = r1.s;
        if (r0 != r2) goto L_0x0250;
    L_0x0235:
        r0 = r1.g;
        if (r0 == 0) goto L_0x0245;
    L_0x0239:
        r0 = r1.d;
        r6 = (long) r5;
        r0.d(r6);
        r0 = r1.q;
        r0 = r0 + r5;
        r1.q = r0;
        goto L_0x0250;
    L_0x0245:
        r0 = r1.d;
        r5 = (long) r4;
        r0.d(r5);
        r0 = r1.q;
        r0 = r0 + r4;
        r1.q = r0;
    L_0x0250:
        return r3;
    L_0x0251:
        r0 = move-exception;
        r3 = r4;
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0261 }
        r4.<init>(r0);	 Catch:{ all -> 0x0261 }
        throw r4;	 Catch:{ all -> 0x0261 }
    L_0x0259:
        r0 = move-exception;
        r3 = r4;
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0261 }
        r4.<init>(r0);	 Catch:{ all -> 0x0261 }
        throw r4;	 Catch:{ all -> 0x0261 }
    L_0x0261:
        r0 = move-exception;
        r4 = r3;
        goto L_0x02d0;
    L_0x0264:
        r6 = r1.m;	 Catch:{ all -> 0x0227 }
        r6 = r6.a;	 Catch:{ all -> 0x0227 }
        if (r6 == 0) goto L_0x027e;
    L_0x026a:
        r0 = java.lang.Math.min(r0, r6);	 Catch:{ all -> 0x0227 }
        r4 = r4 + r0;
        r6 = r1.l;	 Catch:{ all -> 0x0227 }
        r7 = r1.m;	 Catch:{ all -> 0x0227 }
        r0 = r7.c(r0);	 Catch:{ all -> 0x0227 }
        r0 = (defpackage.bazr) r0;	 Catch:{ all -> 0x0227 }
        r6.a(r0);	 Catch:{ all -> 0x0227 }
        goto L_0x0013;
    L_0x027e:
        if (r4 <= 0) goto L_0x02a4;
    L_0x0280:
        r0 = r1.a;
        r0.a(r4);
        r0 = r1.s;
        if (r0 != r2) goto L_0x02a4;
    L_0x0289:
        r0 = r1.g;
        if (r0 == 0) goto L_0x0299;
    L_0x028d:
        r0 = r1.d;
        r6 = (long) r5;
        r0.d(r6);
        r0 = r1.q;
        r0 = r0 + r5;
        r1.q = r0;
        goto L_0x02a4;
    L_0x0299:
        r0 = r1.d;
        r5 = (long) r4;
        r0.d(r5);
        r0 = r1.q;
        r0 = r0 + r4;
        r1.q = r0;
    L_0x02a4:
        return r3;
    L_0x02a5:
        if (r4 > 0) goto L_0x02a8;
    L_0x02a7:
        goto L_0x02cc;
    L_0x02a8:
        r0 = r1.a;
        r0.a(r4);
        r0 = r1.s;
        if (r0 != r2) goto L_0x02cc;
    L_0x02b1:
        r0 = r1.g;
        if (r0 == 0) goto L_0x02c1;
    L_0x02b5:
        r0 = r1.d;
        r2 = (long) r5;
        r0.d(r2);
        r0 = r1.q;
        r0 = r0 + r5;
        r1.q = r0;
        goto L_0x02cc;
    L_0x02c1:
        r0 = r1.d;
        r2 = (long) r4;
        r0.d(r2);
        r0 = r1.q;
        r0 = r0 + r4;
        r1.q = r0;
    L_0x02cc:
        return r6;
    L_0x02cd:
        r0 = move-exception;
        r4 = 0;
        r5 = 0;
    L_0x02d0:
        if (r4 <= 0) goto L_0x02f6;
    L_0x02d2:
        r3 = r1.a;
        r3.a(r4);
        r3 = r1.s;
        if (r3 != r2) goto L_0x02f6;
    L_0x02db:
        r2 = r1.g;
        if (r2 == 0) goto L_0x02eb;
    L_0x02df:
        r2 = r1.d;
        r3 = (long) r5;
        r2.d(r3);
        r2 = r1.q;
        r2 = r2 + r5;
        r1.q = r2;
        goto L_0x02f6;
    L_0x02eb:
        r2 = r1.d;
        r5 = (long) r4;
        r2.d(r5);
        r2 = r1.q;
        r2 = r2 + r4;
        r1.q = r2;
    L_0x02f6:
        goto L_0x02f8;
    L_0x02f7:
        throw r0;
    L_0x02f8:
        goto L_0x02f7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbem.e():boolean");
    }
}
