package defpackage;

import android.util.SparseArray;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: nxn */
final class nxn implements nxq {
    private final boolean a;
    private final Cipher b;
    private final SecretKeySpec c;
    private final Random d;
    private final oyc e;
    private boolean f;
    private ozd g;

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:2|(1:4)(1:5)|6|7|8|9|(2:11|12)|13|14|15) */
    public nxn(java.io.File r5, byte[] r6, boolean r7) {
        /*
        r4 = this;
        r4.<init>();
        r0 = 0;
        if (r6 == 0) goto L_0x0035;
    L_0x0006:
        r1 = r6.length;
        r2 = 16;
        if (r1 != r2) goto L_0x000d;
    L_0x000b:
        r1 = 1;
        goto L_0x000e;
    L_0x000d:
        r1 = 0;
    L_0x000e:
        defpackage.oxz.a(r1);
        r1 = defpackage.ozp.a;	 Catch:{ NoSuchAlgorithmException -> 0x002e, NoSuchAlgorithmException | NoSuchPaddingException -> 0x002c }
        r2 = 18;
        r3 = "AES/CBC/PKCS5PADDING";
        if (r1 != r2) goto L_0x0020;
    L_0x0019:
        r1 = "BC";
        r1 = javax.crypto.Cipher.getInstance(r3, r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0024;
    L_0x0020:
        r1 = javax.crypto.Cipher.getInstance(r3);	 Catch:{ NoSuchAlgorithmException -> 0x002e, NoSuchAlgorithmException | NoSuchPaddingException -> 0x002c }
    L_0x0024:
        r2 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ NoSuchAlgorithmException -> 0x002e, NoSuchAlgorithmException | NoSuchPaddingException -> 0x002c }
        r3 = "AES";
        r2.<init>(r6, r3);	 Catch:{ NoSuchAlgorithmException -> 0x002e, NoSuchAlgorithmException | NoSuchPaddingException -> 0x002c }
        goto L_0x003c;
    L_0x002c:
        r5 = move-exception;
        goto L_0x002f;
    L_0x002e:
        r5 = move-exception;
    L_0x002f:
        r6 = new java.lang.IllegalStateException;
        r6.<init>(r5);
        throw r6;
    L_0x0035:
        r6 = r7 ^ 1;
        defpackage.oxz.a(r6);
        r1 = r0;
        r2 = r1;
    L_0x003c:
        r4.a = r7;
        r4.b = r1;
        r4.c = r2;
        if (r7 == 0) goto L_0x0049;
    L_0x0044:
        r0 = new java.util.Random;
        r0.<init>();
    L_0x0049:
        r4.d = r0;
        r6 = new oyc;
        r6.<init>(r5);
        r4.e = r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxn.<init>(java.io.File, byte[], boolean):void");
    }

    public final boolean a() {
        return this.e.a();
    }

    public final boolean a(HashMap hashMap, SparseArray sparseArray) {
        oxz.b(this.f ^ 1);
        if (b(hashMap, sparseArray)) {
            return true;
        }
        this.e.b();
        return false;
    }

    public final void a(HashMap hashMap) {
        if (this.f) {
            b(hashMap);
            this.f = false;
        }
    }

    public final void b() {
        this.f = true;
    }

    public final void c() {
        this.f = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0132  */
    private final boolean b(java.util.HashMap r20, android.util.SparseArray r21) {
        /*
        r19 = this;
        r1 = r19;
        r2 = 0;
        r3 = 0;
        r0 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0136, all -> 0x012e }
        r4 = r1.e;	 Catch:{ IOException -> 0x0136, all -> 0x012e }
        r4 = r4.d();	 Catch:{ IOException -> 0x0136, all -> 0x012e }
        r0.<init>(r4);	 Catch:{ IOException -> 0x0136, all -> 0x012e }
        r4 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x0136, all -> 0x012e }
        r4.<init>(r0);	 Catch:{ IOException -> 0x0136, all -> 0x012e }
        r2 = r4.readInt();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        if (r2 < 0) goto L_0x0129;
    L_0x001a:
        r5 = 2;
        if (r2 > r5) goto L_0x0129;
    L_0x001d:
        r6 = r4.readInt();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r7 = 1;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0057;
    L_0x0025:
        r6 = r1.b;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        if (r6 == 0) goto L_0x0053;
    L_0x0029:
        r6 = 16;
        r6 = new byte[r6];	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r4.readFully(r6);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r8 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r8.<init>(r6);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r6 = r1.b;	 Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x004a }
        r9 = r1.c;	 Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x004a }
        r6.init(r5, r9, r8);	 Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x004a }
        r6 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r8 = new javax.crypto.CipherInputStream;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r9 = r1.b;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r8.<init>(r0, r9);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r6.<init>(r8);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r4 = r6;
        goto L_0x005d;
    L_0x004a:
        r0 = move-exception;
        goto L_0x004d;
    L_0x004c:
        r0 = move-exception;
    L_0x004d:
        r2 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        throw r2;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
    L_0x0053:
        defpackage.ozp.a(r4);
        return r3;
    L_0x0057:
        r0 = r1.a;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        if (r0 == 0) goto L_0x005d;
    L_0x005b:
        r1.f = r7;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
    L_0x005d:
        r0 = r4.readInt();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r6 = 0;
        r8 = 0;
    L_0x0063:
        if (r6 < r0) goto L_0x007a;
    L_0x0065:
        r0 = r4.readInt();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r2 = r4.read();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        if (r0 != r8) goto L_0x0076;
    L_0x006f:
        r0 = -1;
        if (r2 != r0) goto L_0x0076;
    L_0x0072:
        defpackage.ozp.a(r4);
        return r7;
    L_0x0076:
        defpackage.ozp.a(r4);
        return r3;
    L_0x007a:
        r9 = r4.readInt();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r10 = r4.readUTF();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        if (r2 >= r5) goto L_0x0099;
    L_0x0084:
        r11 = r4.readLong();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r13 = new oxq;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r13.<init>();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        defpackage.oxq.a(r13, r11);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r11 = defpackage.oxp.a;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r11 = r11.a(r13);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r18 = r0;
        goto L_0x0102;
    L_0x0099:
        r11 = r4.readInt();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r12 = new java.util.HashMap;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r12.<init>();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r13 = 0;
    L_0x00a3:
        if (r13 >= r11) goto L_0x00fb;
    L_0x00a5:
        r14 = r4.readUTF();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r15 = r4.readInt();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        if (r15 < 0) goto L_0x00e2;
    L_0x00af:
        r5 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r16 = java.lang.Math.min(r15, r5);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r17 = defpackage.ozp.f;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r5 = r16;
        r3 = r17;
        r7 = 0;
    L_0x00bc:
        if (r7 == r15) goto L_0x00d5;
    L_0x00be:
        r18 = r0;
        r0 = r7 + r5;
        r3 = java.util.Arrays.copyOf(r3, r0);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r4.readFully(r3, r7, r5);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r5 = r15 - r0;
        r7 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r5 = java.lang.Math.min(r5, r7);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r7 = r0;
        r0 = r18;
        goto L_0x00bc;
    L_0x00d5:
        r18 = r0;
        r12.put(r14, r3);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r13 = r13 + 1;
        r0 = r18;
        r3 = 0;
        r5 = 2;
        r7 = 1;
        goto L_0x00a3;
    L_0x00e2:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r3 = 31;
        r2.<init>(r3);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r3 = "Invalid value size: ";
        r2.append(r3);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r2.append(r15);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        throw r0;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
    L_0x00fb:
        r18 = r0;
        r11 = new oxp;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r11.<init>(r12);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
    L_0x0102:
        r0 = new nxl;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r0.<init>(r9, r10, r11);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r3 = r0.b;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r5 = r20;
        r5.put(r3, r0);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r3 = r0.a;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r7 = r0.b;	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r9 = r21;
        r9.put(r3, r7);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r0 = defpackage.nxn.a(r0, r2);	 Catch:{ IOException -> 0x0127, all -> 0x0125 }
        r8 = r8 + r0;
        r6 = r6 + 1;
        r0 = r18;
        r3 = 0;
        r5 = 2;
        r7 = 1;
        goto L_0x0063;
    L_0x0125:
        r0 = move-exception;
        goto L_0x0130;
        goto L_0x0137;
    L_0x0129:
        defpackage.ozp.a(r4);
        r2 = 0;
        return r2;
    L_0x012e:
        r0 = move-exception;
        r4 = r2;
    L_0x0130:
        if (r4 == 0) goto L_0x0135;
    L_0x0132:
        defpackage.ozp.a(r4);
    L_0x0135:
        throw r0;
    L_0x0136:
        r4 = r2;
    L_0x0137:
        if (r4 == 0) goto L_0x013c;
    L_0x0139:
        defpackage.ozp.a(r4);
    L_0x013c:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxn.b(java.util.HashMap, android.util.SparseArray):boolean");
    }

    private final void b(HashMap hashMap) {
        Throwable e;
        Closeable closeable = null;
        try {
            OutputStream c = this.e.c();
            ozd ozd = this.g;
            if (ozd == null) {
                this.g = new ozd(c);
            } else {
                ozd.a(c);
            }
            DataOutputStream dataOutputStream = new DataOutputStream(this.g);
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.a);
                if (this.a) {
                    byte[] bArr = new byte[16];
                    this.d.nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.b.init(1, this.c, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.g, this.b));
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    } catch (InvalidAlgorithmParameterException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(hashMap.size());
                int i = 0;
                for (nxl nxl : hashMap.values()) {
                    dataOutputStream.writeInt(nxl.a);
                    dataOutputStream.writeUTF(nxl.b);
                    Set<Entry> a = nxl.d.a();
                    dataOutputStream.writeInt(a.size());
                    for (Entry entry : a) {
                        dataOutputStream.writeUTF((String) entry.getKey());
                        byte[] bArr2 = (byte[]) entry.getValue();
                        dataOutputStream.writeInt(bArr2.length);
                        dataOutputStream.write(bArr2);
                    }
                    i += nxn.a(nxl, 2);
                }
                dataOutputStream.writeInt(i);
                this.e.a(dataOutputStream);
                ozp.a(null);
            } catch (IOException e4) {
                e = e4;
                closeable = dataOutputStream;
                try {
                    throw new owv(e);
                } catch (Throwable th) {
                    e = th;
                    ozp.a(closeable);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                closeable = dataOutputStream;
                ozp.a(closeable);
                throw e;
            }
        } catch (IOException e5) {
            e = e5;
            throw new owv(e);
        }
    }

    private static int a(nxl nxl, int i) {
        int hashCode = (nxl.a * 31) + nxl.b.hashCode();
        if (i >= 2) {
            return (hashCode * 31) + nxl.d.hashCode();
        }
        long a = oxn.a(nxl.d);
        return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
    }
}
