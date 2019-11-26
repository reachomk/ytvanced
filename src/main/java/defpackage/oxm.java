package defpackage;

import android.util.SparseArray;
import java.io.Closeable;
import java.io.DataOutputStream;
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

/* renamed from: oxm */
final class oxm implements oxl {
    private final boolean a;
    private final Cipher b;
    private final SecretKeySpec c;
    private final Random d;
    private final oyc e;
    private boolean f;
    private ozd g;

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:2|(1:4)(1:5)|6|7|8|9|(2:11|12)|13|14|15) */
    public oxm(java.io.File r5, byte[] r6, boolean r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxm.<init>(java.io.File, byte[], boolean):void");
    }

    public final boolean a() {
        return this.e.a();
    }

    public final void a(HashMap hashMap, SparseArray sparseArray) {
        oxz.b(this.f ^ 1);
        if (!b(hashMap, sparseArray)) {
            hashMap.clear();
            sparseArray.clear();
            this.e.b();
        }
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

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013b  */
    private final boolean b(java.util.HashMap r20, android.util.SparseArray r21) {
        /*
        r19 = this;
        r1 = r19;
        r0 = r1.e;
        r0 = r0.a();
        r2 = 1;
        if (r0 == 0) goto L_0x0147;
    L_0x000b:
        r3 = 0;
        r4 = 0;
        r0 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x013f, all -> 0x0137 }
        r5 = r1.e;	 Catch:{ IOException -> 0x013f, all -> 0x0137 }
        r5 = r5.d();	 Catch:{ IOException -> 0x013f, all -> 0x0137 }
        r0.<init>(r5);	 Catch:{ IOException -> 0x013f, all -> 0x0137 }
        r5 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x013f, all -> 0x0137 }
        r5.<init>(r0);	 Catch:{ IOException -> 0x013f, all -> 0x0137 }
        r3 = r5.readInt();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        if (r3 < 0) goto L_0x0132;
    L_0x0023:
        r6 = 2;
        if (r3 > r6) goto L_0x0132;
    L_0x0026:
        r7 = r5.readInt();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r7 = r7 & r2;
        if (r7 == 0) goto L_0x005f;
    L_0x002d:
        r7 = r1.b;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        if (r7 == 0) goto L_0x005b;
    L_0x0031:
        r7 = 16;
        r7 = new byte[r7];	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r5.readFully(r7);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r8 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r8.<init>(r7);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r7 = r1.b;	 Catch:{ InvalidKeyException -> 0x0054, InvalidAlgorithmParameterException -> 0x0052 }
        r9 = r1.c;	 Catch:{ InvalidKeyException -> 0x0054, InvalidAlgorithmParameterException -> 0x0052 }
        r7.init(r6, r9, r8);	 Catch:{ InvalidKeyException -> 0x0054, InvalidAlgorithmParameterException -> 0x0052 }
        r7 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r8 = new javax.crypto.CipherInputStream;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r9 = r1.b;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r8.<init>(r0, r9);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r7.<init>(r8);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r5 = r7;
        goto L_0x0065;
    L_0x0052:
        r0 = move-exception;
        goto L_0x0055;
    L_0x0054:
        r0 = move-exception;
    L_0x0055:
        r2 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        throw r2;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
    L_0x005b:
        defpackage.ozp.a(r5);
        return r4;
    L_0x005f:
        r0 = r1.a;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        if (r0 == 0) goto L_0x0065;
    L_0x0063:
        r1.f = r2;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
    L_0x0065:
        r0 = r5.readInt();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r7 = 0;
        r8 = 0;
    L_0x006b:
        if (r7 < r0) goto L_0x0082;
    L_0x006d:
        r0 = r5.readInt();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r3 = r5.read();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        if (r0 != r8) goto L_0x007e;
    L_0x0077:
        r0 = -1;
        if (r3 != r0) goto L_0x007e;
    L_0x007a:
        defpackage.ozp.a(r5);
        return r2;
    L_0x007e:
        defpackage.ozp.a(r5);
        return r4;
    L_0x0082:
        r9 = r5.readInt();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r10 = r5.readUTF();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        if (r3 >= r6) goto L_0x00a1;
    L_0x008c:
        r11 = r5.readLong();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r13 = new oxq;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r13.<init>();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        defpackage.oxq.a(r13, r11);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r11 = defpackage.oxp.a;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r11 = r11.a(r13);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r18 = r0;
        goto L_0x010b;
    L_0x00a1:
        r11 = r5.readInt();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r12 = new java.util.HashMap;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r12.<init>();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r13 = 0;
    L_0x00ab:
        if (r13 >= r11) goto L_0x0104;
    L_0x00ad:
        r14 = r5.readUTF();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r15 = r5.readInt();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        if (r15 < 0) goto L_0x00eb;
    L_0x00b7:
        r6 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r16 = java.lang.Math.min(r15, r6);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r17 = defpackage.ozp.f;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r6 = r16;
        r4 = r17;
        r2 = 0;
    L_0x00c4:
        if (r2 == r15) goto L_0x00de;
    L_0x00c6:
        r18 = r0;
        r0 = r2 + r6;
        r4 = java.util.Arrays.copyOf(r4, r0);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r5.readFully(r4, r2, r6);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r2 = r15 - r0;
        r6 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r2 = java.lang.Math.min(r2, r6);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r6 = r2;
        r2 = r0;
        r0 = r18;
        goto L_0x00c4;
    L_0x00de:
        r18 = r0;
        r12.put(r14, r4);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r13 = r13 + 1;
        r0 = r18;
        r2 = 1;
        r4 = 0;
        r6 = 2;
        goto L_0x00ab;
    L_0x00eb:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r3 = 31;
        r2.<init>(r3);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r3 = "Invalid value size: ";
        r2.append(r3);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r2.append(r15);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        throw r0;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
    L_0x0104:
        r18 = r0;
        r11 = new oxp;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r11.<init>(r12);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
    L_0x010b:
        r0 = new oxk;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r0.<init>(r9, r10, r11);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r2 = r0.b;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r4 = r20;
        r4.put(r2, r0);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r2 = r0.a;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r6 = r0.b;	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r9 = r21;
        r9.put(r2, r6);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r0 = defpackage.oxm.a(r0, r3);	 Catch:{ IOException -> 0x0130, all -> 0x012e }
        r8 = r8 + r0;
        r7 = r7 + 1;
        r0 = r18;
        r2 = 1;
        r4 = 0;
        r6 = 2;
        goto L_0x006b;
    L_0x012e:
        r0 = move-exception;
        goto L_0x0139;
        goto L_0x0140;
    L_0x0132:
        defpackage.ozp.a(r5);
        r2 = 0;
        return r2;
    L_0x0137:
        r0 = move-exception;
        r5 = r3;
    L_0x0139:
        if (r5 == 0) goto L_0x013e;
    L_0x013b:
        defpackage.ozp.a(r5);
    L_0x013e:
        throw r0;
    L_0x013f:
        r5 = r3;
    L_0x0140:
        if (r5 == 0) goto L_0x0145;
    L_0x0142:
        defpackage.ozp.a(r5);
    L_0x0145:
        r2 = 0;
        return r2;
    L_0x0147:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxm.b(java.util.HashMap, android.util.SparseArray):boolean");
    }

    private final void b(HashMap hashMap) {
        Throwable e;
        Closeable dataOutputStream;
        try {
            OutputStream c = this.e.c();
            ozd ozd = this.g;
            if (ozd == null) {
                this.g = new ozd(c);
            } else {
                ozd.a(c);
            }
            dataOutputStream = new DataOutputStream(this.g);
            try {
                DataOutputStream dataOutputStream2;
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.a);
                if (this.a) {
                    byte[] bArr = new byte[16];
                    this.d.nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    this.b.init(1, this.c, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.g, this.b));
                }
                dataOutputStream2.writeInt(hashMap.size());
                int i = 0;
                for (oxk oxk : hashMap.values()) {
                    dataOutputStream2.writeInt(oxk.a);
                    dataOutputStream2.writeUTF(oxk.b);
                    Set<Entry> a = oxk.d.a();
                    dataOutputStream2.writeInt(a.size());
                    for (Entry entry : a) {
                        dataOutputStream2.writeUTF((String) entry.getKey());
                        byte[] bArr2 = (byte[]) entry.getValue();
                        dataOutputStream2.writeInt(bArr2.length);
                        dataOutputStream2.write(bArr2);
                    }
                    i += oxm.a(oxk, 2);
                }
                dataOutputStream2.writeInt(i);
                this.e.a(dataOutputStream2);
                ozp.a(null);
            } catch (InvalidKeyException e2) {
                e = e2;
                throw new IllegalStateException(e);
            } catch (InvalidAlgorithmParameterException e3) {
                e = e3;
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                e = th;
                ozp.a(dataOutputStream);
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
            dataOutputStream = null;
            ozp.a(dataOutputStream);
            throw e;
        }
    }

    private static int a(oxk oxk, int i) {
        int hashCode = (oxk.a * 31) + oxk.b.hashCode();
        if (i >= 2) {
            return (hashCode * 31) + oxk.d.hashCode();
        }
        long a = oxn.a(oxk.d);
        return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
    }
}
