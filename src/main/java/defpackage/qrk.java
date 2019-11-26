package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: qrk */
final class qrk {
    public static MessageDigest a = null;
    public static CountDownLatch b = new CountDownLatch(1);
    private static boolean c = false;
    private static final Object d = new Object();
    private static final Object e = new Object();

    static void a() {
        synchronized (e) {
            if (!c) {
                c = true;
                new Thread(new qrj()).start();
            }
        }
    }

    static String a(qpa qpa, String str) {
        byte[] a = riu.a((riu) qpa);
        if (((Boolean) rlj.d().a(roe.l)).booleanValue()) {
            Vector b = qrk.b(a);
            if (b == null || b.size() == 0) {
                a = qrk.a(riu.a(qrk.b()), str, true);
            } else {
                riu qpp = new qpp();
                qpp.a = new byte[b.size()][];
                Iterator it = b.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    qpp.a[i] = qrk.a((byte[]) it.next(), str, false);
                    i = i2;
                }
                qpp.b = qrk.a(a);
                a = riu.a(qpp);
            }
        } else if (qvj.a != null) {
            byte[] bArr;
            if (str == null) {
                bArr = new byte[0];
            } else {
                bArr = str.getBytes();
            }
            a = qvj.a.a(a, bArr);
            riu qpp2 = new qpp();
            qpp2.a = new byte[][]{a};
            qpp2.c = Integer.valueOf(2);
            a = riu.a(qpp2);
        } else {
            throw new GeneralSecurityException();
        }
        return qri.a(a, true);
    }

    private static Vector b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length > 0) {
                length = (length + 254) / 255;
                Vector vector = new Vector();
                int i = 0;
                while (i < length) {
                    int i2 = i * 255;
                    try {
                        int length2 = bArr.length;
                        if (length2 - i2 > 255) {
                            length2 = i2 + 255;
                        }
                        vector.add(Arrays.copyOfRange(bArr, i2, length2));
                        i++;
                    } catch (IndexOutOfBoundsException unused) {
                        return null;
                    }
                }
                return vector;
            }
        }
        return null;
    }

    private static qpa b() {
        qpa qpa = new qpa();
        qpa.k = Long.valueOf(4096);
        return qpa;
    }

    private static byte[] a(byte[] bArr, String str, boolean z) {
        byte[] bArr2;
        int i = !z ? 255 : 239;
        if (bArr.length > i) {
            bArr = riu.a(qrk.b());
        }
        int length = bArr.length;
        if (length < i) {
            bArr2 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr2);
            bArr = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            bArr = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArr = ByteBuffer.allocate(256).put(qrk.a(bArr)).put(bArr).array();
        }
        byte[] bArr3 = new byte[256];
        int i2 = 0;
        for (qrl a : new qrm().cN) {
            a.a(bArr, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            rcq rcq = new rcq(str.getBytes("UTF-8"));
            int i3 = rcq.b;
            length = rcq.c;
            while (i2 < 256) {
                i3 = (i3 + 1) & 255;
                bArr2 = rcq.a;
                byte b = bArr2[i3];
                length = (length + b) & 255;
                bArr2[i3] = bArr2[length];
                bArr2[length] = b;
                bArr3[i2] = (byte) (bArr2[(bArr2[i3] + b) & 255] ^ bArr3[i2]);
                i2++;
            }
            rcq.b = i3;
            rcq.c = length;
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr) {
        synchronized (d) {
            qrk.a();
            MessageDigest messageDigest = null;
            try {
                if (b.await(2, TimeUnit.SECONDS)) {
                    if (a != null) {
                        messageDigest = a;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                bArr = a.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return bArr;
    }

    public static byte[] a(String str, String str2) {
        riu qpl = new qpl();
        try {
            byte[] bytes;
            String str3 = "ISO-8859-1";
            if (str.length() < 3) {
                bytes = str.getBytes(str3);
            } else {
                bytes = qri.a(str, true);
            }
            qpl.a = bytes;
            if (str2.length() < 3) {
                bytes = str2.getBytes(str3);
            } else {
                bytes = qri.a(str2, true);
            }
            qpl.b = bytes;
            return riu.a(qpl);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }
}
