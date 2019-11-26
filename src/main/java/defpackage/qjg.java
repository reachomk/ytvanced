package defpackage;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qjg */
public final class qjg {
    public static X509Certificate[][] a(FileChannel fileChannel, rcj rcj) {
        rcj rcj2 = rcj;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a = qjg.a(rcj2.a);
                int i = 0;
                int i2 = 0;
                while (a.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(qjg.a(qjg.a(a), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder stringBuilder = new StringBuilder(48);
                        stringBuilder.append("Failed to parse/verify signer #");
                        stringBuilder.append(i2);
                        stringBuilder.append(" block");
                        throw new SecurityException(stringBuilder.toString(), e);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                } else if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                } else {
                    long j = rcj2.b;
                    long j2 = rcj2.c;
                    long j3 = rcj2.d;
                    ByteBuffer byteBuffer = rcj2.e;
                    if (hashMap.isEmpty()) {
                        throw new SecurityException("No digests provided");
                    }
                    FileChannel fileChannel2 = fileChannel;
                    qtu qtu = new qtu(fileChannel2, 0, j);
                    qtu = new qtu(fileChannel2, j2, j3 - j2);
                    byteBuffer = byteBuffer.duplicate();
                    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    rko.a(byteBuffer);
                    i2 = byteBuffer.position() + 16;
                    if (j < 0 || j > 4294967295L) {
                        StringBuilder stringBuilder2 = new StringBuilder(47);
                        stringBuilder2.append("uint32 value of out range: ");
                        stringBuilder2.append(j);
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                    byteBuffer.putInt(byteBuffer.position() + i2, (int) j);
                    qrg qrg = new qrg(byteBuffer);
                    int[] iArr = new int[hashMap.size()];
                    i2 = 0;
                    for (Integer intValue : hashMap.keySet()) {
                        iArr[i2] = intValue.intValue();
                        i2++;
                    }
                    try {
                        byte[][] a2 = qjg.a(iArr, new qsg[]{qtu, qtu, qrg});
                        while (i < iArr.length) {
                            int i3 = iArr[i];
                            if (MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i3)), a2[i])) {
                                i++;
                            } else {
                                throw new SecurityException(String.valueOf(qjg.b(i3)).concat(" digest of contents did not verify"));
                            }
                        }
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                    } catch (DigestException e2) {
                        throw new SecurityException("Failed to compute digest(s) of contents", e2);
                    }
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    private static X509Certificate[] a(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        int i;
        StringBuilder stringBuilder;
        ByteBuffer a = qjg.a(byteBuffer);
        ByteBuffer a2 = qjg.a(byteBuffer);
        byte[] b = qjg.b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        int i3 = 0;
        byte[] bArr = null;
        while (a2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer a3 = qjg.a(a2);
                if (a3.remaining() >= 8) {
                    i = a3.getInt();
                    arrayList.add(Integer.valueOf(i));
                    if (!(i == 513 || i == 514 || i == 769)) {
                        switch (i) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i2 != -1) {
                        int a4 = qjg.a(i);
                        int a5 = qjg.a(i2);
                        String str = "Unknown digestAlgorithm2: ";
                        StringBuilder stringBuilder2;
                        if (a4 != 1) {
                            if (a4 != 2) {
                                stringBuilder2 = new StringBuilder(37);
                                stringBuilder2.append("Unknown digestAlgorithm1: ");
                                stringBuilder2.append(a4);
                                throw new IllegalArgumentException(stringBuilder2.toString());
                            } else if (a5 != 1) {
                                if (a5 != 2) {
                                    stringBuilder2 = new StringBuilder(37);
                                    stringBuilder2.append(str);
                                    stringBuilder2.append(a5);
                                    throw new IllegalArgumentException(stringBuilder2.toString());
                                }
                            }
                        } else if (a5 == 1) {
                            continue;
                        } else if (a5 != 2) {
                            stringBuilder2 = new StringBuilder(37);
                            stringBuilder2.append(str);
                            stringBuilder2.append(a5);
                            throw new IllegalArgumentException(stringBuilder2.toString());
                        }
                    }
                    i2 = i;
                    bArr = qjg.b(a3);
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                stringBuilder = new StringBuilder(45);
                stringBuilder.append("Failed to parse signature record #");
                stringBuilder.append(i3);
                throw new SecurityException(stringBuilder.toString(), e);
            }
        }
        if (i2 != -1) {
            String str2;
            String valueOf;
            Object obj;
            Pair create;
            String str3 = "Unknown signature algorithm: 0x";
            if (i2 == 513 || i2 == 514) {
                str2 = "EC";
            } else if (i2 != 769) {
                switch (i2) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str2 = "RSA";
                        break;
                    default:
                        valueOf = String.valueOf(Long.toHexString((long) i2));
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
                }
            } else {
                str2 = "DSA";
            }
            if (i2 == 513) {
                obj = null;
                create = Pair.create("SHA256withECDSA", null);
            } else if (i2 == 514) {
                obj = null;
                create = Pair.create("SHA512withECDSA", null);
            } else if (i2 != 769) {
                switch (i2) {
                    case 257:
                        create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        obj = null;
                        create = Pair.create("SHA256withRSA", null);
                        break;
                    case 260:
                        obj = null;
                        create = Pair.create("SHA512withRSA", null);
                        break;
                    default:
                        valueOf = String.valueOf(Long.toHexString((long) i2));
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
                }
                obj = null;
            } else {
                obj = null;
                create = Pair.create("SHA256withDSA", null);
            }
            String str4 = (String) create.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str2).generatePublic(new X509EncodedKeySpec(b));
                Signature instance = Signature.getInstance(str4);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(a);
                if (instance.verify(bArr)) {
                    a.clear();
                    a2 = qjg.a(a);
                    ArrayList arrayList2 = new ArrayList();
                    Object obj2 = obj;
                    i = 0;
                    while (a2.hasRemaining()) {
                        i++;
                        try {
                            ByteBuffer a6 = qjg.a(a2);
                            if (a6.remaining() >= 8) {
                                int i4 = a6.getInt();
                                arrayList2.add(Integer.valueOf(i4));
                                if (i4 == i2) {
                                    obj2 = qjg.b(a6);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e2) {
                            stringBuilder = new StringBuilder(42);
                            stringBuilder.append("Failed to parse digest record #");
                            stringBuilder.append(i);
                            throw new IOException(stringBuilder.toString(), e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int a7 = qjg.a(i2);
                        byte[] bArr2 = (byte[]) map.put(Integer.valueOf(a7), obj2);
                        if (bArr2 == null || MessageDigest.isEqual(bArr2, obj2)) {
                            a = qjg.a(a);
                            ArrayList arrayList3 = new ArrayList();
                            int i5 = 0;
                            while (a.hasRemaining()) {
                                i5++;
                                byte[] b2 = qjg.b(a);
                                try {
                                    arrayList3.add(new rkm((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b2)), b2));
                                } catch (CertificateException e3) {
                                    stringBuilder = new StringBuilder(41);
                                    stringBuilder.append("Failed to decode certificate #");
                                    stringBuilder.append(i5);
                                    throw new SecurityException(stringBuilder.toString(), e3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(b, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        }
                        throw new SecurityException(String.valueOf(qjg.b(a7)).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                }
                throw new SecurityException(String.valueOf(str4).concat(" signature did not verify"));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e22) {
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str4).length() + 27);
                stringBuilder3.append("Failed to verify ");
                stringBuilder3.append(str4);
                stringBuilder3.append(" signature");
                throw new SecurityException(stringBuilder3.toString(), e22);
            }
        } else if (i3 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    private static byte[][] a(int[] iArr, qsg[] qsgArr) {
        long j;
        int i;
        String str;
        int[] iArr2 = iArr;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            i = 3;
            if (i2 >= 3) {
                break;
            }
            j3 += (qsgArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            int length;
            int i3;
            int min;
            i2 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i4 = 0;
            while (true) {
                length = iArr2.length;
                if (i4 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((qjg.c(iArr2[i4]) * i2) + 5)];
                bArr2[0] = (byte) 90;
                qjg.a(i2, bArr2);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = (byte) -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            length = 0;
            while (true) {
                str = " digest not supported";
                if (length >= iArr2.length) {
                    break;
                }
                String b = qjg.b(iArr2[length]);
                try {
                    messageDigestArr[length] = MessageDigest.getInstance(b);
                    length++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(String.valueOf(b).concat(str), e);
                }
            }
            length = 0;
            int i5 = 0;
            int i6 = 0;
            while (length < i) {
                qsg qsg = qsgArr[length];
                long j4 = j2;
                i3 = i5;
                long a = qsg.a();
                while (a > j2) {
                    int i7;
                    min = (int) Math.min(a, j);
                    qjg.a(min, bArr3);
                    for (MessageDigest update : messageDigestArr) {
                        update.update(bArr3);
                    }
                    j = j4;
                    try {
                        byte[] bArr4;
                        int i8;
                        MessageDigest[] messageDigestArr2;
                        qsg.a(messageDigestArr, j, min);
                        i7 = 0;
                        while (i7 < iArr2.length) {
                            i = iArr2[i7];
                            bArr4 = bArr3;
                            bArr3 = bArr[i7];
                            i = qjg.c(i);
                            i8 = length;
                            MessageDigest messageDigest = messageDigestArr[i7];
                            messageDigestArr2 = messageDigestArr;
                            i2 = messageDigest.digest(bArr3, (i3 * i) + 5, i);
                            if (i2 == i) {
                                i7++;
                                bArr3 = bArr4;
                                length = i8;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder stringBuilder = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                stringBuilder.append("Unexpected output size of ");
                                stringBuilder.append(algorithm);
                                stringBuilder.append(" digest: ");
                                stringBuilder.append(i2);
                                throw new RuntimeException(stringBuilder.toString());
                            }
                        }
                        bArr4 = bArr3;
                        messageDigestArr2 = messageDigestArr;
                        i8 = length;
                        j2 = (long) min;
                        j += j2;
                        a -= j2;
                        i3++;
                        j2 = 0;
                        i = 3;
                        j4 = j;
                        j = 1048576;
                    } catch (IOException e2) {
                        Throwable th = e2;
                        StringBuilder stringBuilder2 = new StringBuilder(59);
                        stringBuilder2.append("Failed to digest chunk #");
                        stringBuilder2.append(i3);
                        stringBuilder2.append(" of section #");
                        stringBuilder2.append(i6);
                        throw new DigestException(stringBuilder2.toString(), th);
                    }
                }
                i6++;
                length++;
                i5 = i3;
            }
            byte[][] bArr5 = new byte[iArr2.length][];
            min = 0;
            while (min < iArr2.length) {
                i3 = iArr2[min];
                bArr3 = bArr[min];
                Object b2 = qjg.b(i3);
                try {
                    b2 = MessageDigest.getInstance(b2);
                    bArr5[min] = b2.digest(bArr3);
                    min++;
                } catch (NoSuchAlgorithmException e22) {
                    throw new RuntimeException(String.valueOf(b2).concat(str), e22);
                }
            }
            return bArr5;
        }
        StringBuilder stringBuilder3 = new StringBuilder(37);
        stringBuilder3.append("Too many chunks: ");
        stringBuilder3.append(j3);
        throw new DigestException(stringBuilder3.toString());
    }

    private static int a(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            break;
                        case 258:
                        case 260:
                            break;
                        default:
                            String valueOf = String.valueOf(Long.toHexString((long) i));
                            String str = "Unknown signature algorithm: 0x";
                            throw new IllegalArgumentException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    private static String b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("Unknown content digest algorthm: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static int c(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("Unknown content digest algorthm: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            ByteBuffer position = byteBuffer.position();
            i += position;
            if (i < position || i > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i);
            try {
                position = byteBuffer.slice();
                position.order(byteBuffer.order());
                byteBuffer.position(i);
                return position;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(17);
            stringBuilder.append("size: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer) {
        int remaining;
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return qjg.a(byteBuffer, i);
            } else {
                remaining = byteBuffer.remaining();
                StringBuilder stringBuilder = new StringBuilder(101);
                stringBuilder.append("Length-prefixed field longer than remaining buffer. Field length: ");
                stringBuilder.append(i);
                stringBuilder.append(", remaining: ");
                stringBuilder.append(remaining);
                throw new IOException(stringBuilder.toString());
            }
        }
        remaining = byteBuffer.remaining();
        StringBuilder stringBuilder2 = new StringBuilder(93);
        stringBuilder2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
        stringBuilder2.append(remaining);
        throw new IOException(stringBuilder2.toString());
    }

    private static byte[] b(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder stringBuilder = new StringBuilder(90);
            stringBuilder.append("Underflow while reading length-prefixed value. Length: ");
            stringBuilder.append(i);
            stringBuilder.append(", available: ");
            stringBuilder.append(remaining);
            throw new IOException(stringBuilder.toString());
        }
    }

    private static void a(int i, byte[] bArr) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >> 24);
    }
}
