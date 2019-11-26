package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;

/* renamed from: ammp */
public final class ammp implements Closeable {
    public RandomAccessFile a;
    private final String b;
    private final LinkedHashMap c = new LinkedHashMap();

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014d  */
    public ammp(java.io.File r25) {
        /*
        r24 = this;
        r0 = r24;
        r24.<init>();
        r1 = new java.util.LinkedHashMap;
        r1.<init>();
        r0.c = r1;
        r1 = r25.getPath();
        r0.b = r1;
        r1 = new java.io.RandomAccessFile;
        r2 = r0.b;
        r3 = "r";
        r1.<init>(r2, r3);
        r0.a = r1;
        r1 = r0.a;
        r1 = r1.length();
        r3 = -22;
        r1 = r1 + r3;
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x01bf;
    L_0x002c:
        r5 = r0.a;
        r5.seek(r3);
        r5 = r0.a;
        r5 = r5.readInt();
        r5 = java.lang.Integer.reverseBytes(r5);
        r5 = (long) r5;
        r7 = 101010256; // 0x6054b50 float:2.506985E-35 double:4.99056974E-316;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x01b7;
    L_0x0043:
        r9 = 67324752; // 0x4034b50 float:1.5433558E-36 double:3.3262847E-316;
        r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x01af;
    L_0x004a:
        r5 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r5 = r5 + r1;
        r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r9 < 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0054;
    L_0x0053:
        r5 = r3;
    L_0x0054:
        r9 = r0.a;
        r9.seek(r1);
        r9 = r0.a;
        r9 = r9.readInt();
        r9 = java.lang.Integer.reverseBytes(r9);
        r9 = (long) r9;
        r11 = -1;
        r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r13 != 0) goto L_0x019e;
    L_0x006a:
        r5 = r0.a;
        r6 = 20;
        r8 = "Spanned archives not supported";
        r9 = 1;
        r10 = 16;
        r13 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r13 <= 0) goto L_0x00b0;
    L_0x0077:
        r6 = -20;
        r6 = r6 + r1;
        r5.seek(r6);
        r6 = r5.readInt();
        r6 = java.lang.Integer.reverseBytes(r6);
        r7 = 117853008; // 0x7064b50 float:1.0103172E-34 double:5.82271225E-316;
        if (r6 != r7) goto L_0x00b0;
    L_0x008a:
        r6 = new byte[r10];
        r5.readFully(r6);
        r5 = java.nio.ByteBuffer.wrap(r6);
        r6 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r5 = r5.order(r6);
        r6 = r5.getInt();
        r13 = r5.getLong();
        r5 = r5.getInt();
        if (r5 != r9) goto L_0x00aa;
    L_0x00a7:
        if (r6 != 0) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00b1;
    L_0x00aa:
        r1 = new java.util.zip.ZipException;
        r1.<init>(r8);
        throw r1;
    L_0x00b0:
        r13 = r11;
    L_0x00b1:
        r5 = r0.a;
        r6 = 4;
        r1 = r1 + r6;
        r5.seek(r1);
        r1 = 18;
        r1 = new byte[r1];
        r5.readFully(r1);
        r2 = new ammo;
        r2.<init>(r1);
        r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1));
        if (r1 == 0) goto L_0x00d1;
    L_0x00c9:
        r2.a(r10);
        r19 = r11;
        r21 = r19;
        goto L_0x0103;
    L_0x00d1:
        r1 = r2.b();
        r1 = (char) r1;
        r5 = r2.b();
        r5 = (char) r5;
        r6 = r2.b();
        r6 = (char) r6;
        r6 = (long) r6;
        r10 = r2.b();
        r15 = 4;
        r2.a(r15);
        r15 = r2.a();
        r3 = (long) r15;
        r18 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r3 = r3 & r18;
        r10 = (char) r10;
        r9 = (long) r10;
        r15 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r15 != 0) goto L_0x0198;
    L_0x00fb:
        if (r1 != 0) goto L_0x0198;
    L_0x00fd:
        if (r5 != 0) goto L_0x0198;
    L_0x00ff:
        r21 = r3;
        r19 = r6;
    L_0x0103:
        r1 = r2.b();
        r2 = new amms;
        r1 = (char) r1;
        r18 = r2;
        r23 = r1;
        r18.<init>(r19, r21, r23);
        r1 = r2.c;
        r9 = 0;
        if (r1 <= 0) goto L_0x0125;
    L_0x0116:
        r1 = new byte[r1];
        r3 = r0.a;
        r3.readFully(r1);
        r3 = new java.lang.String;
        r4 = r1.length;
        r5 = java.nio.charset.StandardCharsets.UTF_8;
        r3.<init>(r1, r9, r4, r5);
    L_0x0125:
        r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1));
        if (r1 == 0) goto L_0x0131;
    L_0x0129:
        r1 = r0.a;
        r2 = r2.c;
        r2 = defpackage.ammn.a(r1, r13, r2);
    L_0x0131:
        r1 = new ammr;
        r3 = r0.a;
        r4 = r2.b;
        r1.<init>(r3, r4);
        r3 = new java.io.BufferedInputStream;
        r4 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r3.<init>(r1, r4);
        r1 = 46;
        r1 = new byte[r1];
        r16 = 0;
    L_0x0147:
        r4 = r2.a;
        r6 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x0197;
    L_0x014d:
        r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1));
        if (r4 == 0) goto L_0x0153;
    L_0x0151:
        r4 = 1;
        goto L_0x0154;
    L_0x0153:
        r4 = 0;
    L_0x0154:
        r5 = new ammq;
        r6 = java.nio.charset.StandardCharsets.UTF_8;
        r5.<init>(r1, r3, r6, r4);
        r6 = r5.f;
        r9 = r2.b;
        r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r8 >= 0) goto L_0x018f;
    L_0x0163:
        r6 = r5.a;
        r7 = r0.c;
        r5 = r7.put(r6, r5);
        if (r5 == 0) goto L_0x0189;
    L_0x016d:
        r1 = new java.util.zip.ZipException;
        r2 = java.lang.String.valueOf(r6);
        r3 = "Duplicate entry name: ";
        r4 = r2.length();
        if (r4 != 0) goto L_0x0181;
    L_0x017b:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0185;
    L_0x0181:
        r2 = r3.concat(r2);
    L_0x0185:
        r1.<init>(r2);
        throw r1;
    L_0x0189:
        r5 = 1;
        r16 = r16 + r5;
        r9 = 0;
        goto L_0x0147;
    L_0x018f:
        r1 = new java.util.zip.ZipException;
        r2 = "Local file header offset is after central directory";
        r1.<init>(r2);
        throw r1;
    L_0x0197:
        return;
    L_0x0198:
        r1 = new java.util.zip.ZipException;
        r1.<init>(r8);
        throw r1;
    L_0x019e:
        r1 = r1 + r11;
        r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r3 < 0) goto L_0x01a7;
    L_0x01a3:
        r3 = 0;
        goto L_0x0054;
    L_0x01a7:
        r1 = new java.util.zip.ZipException;
        r2 = "End Of Central Directory signature not found";
        r1.<init>(r2);
        throw r1;
    L_0x01af:
        r1 = new java.util.zip.ZipException;
        r2 = "Not a zip archive";
        r1.<init>(r2);
        throw r1;
    L_0x01b7:
        r1 = new java.util.zip.ZipException;
        r2 = "Empty zip archive not supported";
        r1.<init>(r2);
        throw r1;
    L_0x01bf:
        r1 = new java.util.zip.ZipException;
        r2 = r0.a;
        r2 = r2.length();
        r4 = new java.lang.StringBuilder;
        r5 = 53;
        r4.<init>(r5);
        r5 = "File too short to be a zip file: ";
        r4.append(r5);
        r4.append(r2);
        r2 = r4.toString();
        r1.<init>(r2);
        goto L_0x01df;
    L_0x01de:
        throw r1;
    L_0x01df:
        goto L_0x01de;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ammp.<init>(java.io.File):void");
    }

    public final void close() {
        RandomAccessFile randomAccessFile = this.a;
        if (randomAccessFile != null) {
            synchronized (randomAccessFile) {
                this.a = null;
                randomAccessFile.close();
            }
        }
    }

    public final ammq a(String str) {
        if (this.a == null) {
            throw new IllegalStateException("Zip file closed");
        } else if (str != null) {
            ammq ammq = (ammq) this.c.get(str);
            return ammq == null ? (ammq) this.c.get(str.concat("/")) : ammq;
        } else {
            throw new NullPointerException("entryName == null");
        }
    }

    public static void a(String str, int i) {
        String format = String.format("%08x", new Object[]{Integer.valueOf(i)});
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 26) + String.valueOf(format).length());
        stringBuilder.append(str);
        stringBuilder.append(" signature not found; was ");
        stringBuilder.append(format);
        throw new ZipException(stringBuilder.toString());
    }
}
