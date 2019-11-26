package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aeog */
public final class aeog implements aeoh {
    private final byte[] a;
    private final SecretKeySpec b;
    private final SecretKeySpec c;
    private final boolean d;

    public aeog(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length;
        amqw.b(((length & 1) ^ 1) != 0);
        length >>= 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length);
        bArr = Arrays.copyOfRange(bArr, length, 32);
        this.a = bArr2;
        this.d = z;
        this.b = new SecretKeySpec(copyOfRange, "AES");
        this.c = new SecretKeySpec(bArr, "HmacSHA256");
    }

    public final void a(atbu atbu, atbp atbp) {
        GZIPOutputStream gZIPOutputStream;
        Exception e;
        Throwable th;
        byte[] toByteArray = atbu.toByteArray();
        if (this.d) {
            atbp.a(true);
            Closeable closeable = null;
            Closeable byteArrayOutputStream;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(toByteArray.length);
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (IOException | IllegalArgumentException e2) {
                    e = e2;
                    gZIPOutputStream = null;
                    closeable = byteArrayOutputStream;
                    try {
                        throw new aeok(e);
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = closeable;
                        closeable = gZIPOutputStream;
                        aeog.a(closeable);
                        aeog.a(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aeog.a(closeable);
                    aeog.a(byteArrayOutputStream);
                    throw th;
                }
                try {
                    gZIPOutputStream.write(toByteArray);
                    gZIPOutputStream.finish();
                    toByteArray = byteArrayOutputStream.toByteArray();
                    aeog.a(gZIPOutputStream);
                    aeog.a(byteArrayOutputStream);
                } catch (IOException | IllegalArgumentException e3) {
                    e = e3;
                    closeable = byteArrayOutputStream;
                    throw new aeok(e);
                } catch (Throwable th4) {
                    th = th4;
                    closeable = gZIPOutputStream;
                    aeog.a(closeable);
                    aeog.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException | IllegalArgumentException e4) {
                e = e4;
                gZIPOutputStream = null;
                throw new aeok(e);
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                aeog.a(closeable);
                aeog.a(byteArrayOutputStream);
                throw th;
            }
        }
        atbp.a(false);
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            instance.init(1, this.b);
            Mac instance2 = Mac.getInstance("HmacSHA256");
            instance2.init(this.c);
            anvu a = anvu.a(instance.getIV());
            atbp.copyOnWrite();
            atbq atbq = (atbq) atbp.instance;
            if (a != null) {
                atbq.a |= 4;
                atbq.d = a;
                toByteArray = instance.doFinal(toByteArray);
                anvu a2 = anvu.a(toByteArray);
                atbp.copyOnWrite();
                atbq atbq2 = (atbq) atbp.instance;
                if (a2 != null) {
                    atbq2.a |= 2;
                    atbq2.c = a2;
                    instance2.update(toByteArray);
                    anvu a3 = anvu.a(instance2.doFinal(((atbq) atbp.instance).d.d()));
                    atbp.copyOnWrite();
                    atbq atbq3 = (atbq) atbp.instance;
                    if (a3 != null) {
                        atbq3.a |= 8;
                        atbq3.e = a3;
                        a3 = anvu.a(this.a);
                        atbp.copyOnWrite();
                        atbq atbq4 = (atbq) atbp.instance;
                        if (a3 != null) {
                            atbq4.a |= 16;
                            atbq4.f = a3;
                            return;
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e5) {
            throw new aeok(e5);
        }
    }

    public final atbw a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Closeable gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Closeable closeable;
        Exception exception;
        Throwable e;
        ByteArrayOutputStream byteArrayOutputStream2;
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(this.c);
            instance.update(bArr);
            byte[] doFinal = instance.doFinal(bArr3);
            if (doFinal.length == bArr2.length) {
                int i = 0;
                for (int i2 = 0; i2 < doFinal.length; i2++) {
                    i |= doFinal[i2] != bArr2[i2] ? 1 : 0;
                }
                if (i == 0) {
                    Cipher instance2 = Cipher.getInstance("AES/CTR/NoPadding");
                    instance2.init(2, this.b, new IvParameterSpec(bArr3));
                    bArr = instance2.doFinal(bArr);
                    if (this.d) {
                        Closeable closeable2 = null;
                        Closeable byteArrayInputStream;
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(bArr);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream(80000);
                                } catch (IOException | IllegalArgumentException e2) {
                                    closeable = byteArrayInputStream;
                                    byteArrayInputStream = gZIPInputStream;
                                    exception = e2;
                                    byteArrayOutputStream = null;
                                    closeable2 = closeable;
                                    try {
                                        throw new aeok(exception);
                                    } catch (Throwable th) {
                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                        e2 = th;
                                        gZIPInputStream = byteArrayInputStream;
                                        byteArrayInputStream = closeable2;
                                        closeable2 = byteArrayOutputStream2;
                                        aeog.a(closeable2);
                                        aeog.a(gZIPInputStream);
                                        aeog.a(byteArrayInputStream);
                                        throw e2;
                                    }
                                } catch (Throwable th2) {
                                    e2 = th2;
                                    aeog.a(closeable2);
                                    aeog.a(gZIPInputStream);
                                    aeog.a(byteArrayInputStream);
                                    throw e2;
                                }
                                try {
                                    bArr2 = new byte[80000];
                                    while (true) {
                                        i = gZIPInputStream.read(bArr2, 0, 80000);
                                        if (i == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i);
                                    }
                                    bArr2 = byteArrayOutputStream.toByteArray();
                                    aeog.a(byteArrayOutputStream);
                                    aeog.a(gZIPInputStream);
                                    aeog.a(byteArrayInputStream);
                                    bArr = bArr2;
                                } catch (IOException | IllegalArgumentException e3) {
                                    closeable = byteArrayInputStream;
                                    byteArrayInputStream = gZIPInputStream;
                                    exception = e3;
                                    closeable2 = closeable;
                                    throw new aeok(exception);
                                } catch (Throwable e32) {
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    e2 = e32;
                                    closeable2 = byteArrayOutputStream2;
                                    aeog.a(closeable2);
                                    aeog.a(gZIPInputStream);
                                    aeog.a(byteArrayInputStream);
                                    throw e2;
                                }
                            } catch (IOException | IllegalArgumentException e4) {
                                exception = e4;
                                byteArrayOutputStream = null;
                                closeable2 = byteArrayInputStream;
                                byteArrayInputStream = byteArrayOutputStream;
                                throw new aeok(exception);
                            } catch (Throwable th3) {
                                e2 = th3;
                                gZIPInputStream = null;
                                aeog.a(closeable2);
                                aeog.a(gZIPInputStream);
                                aeog.a(byteArrayInputStream);
                                throw e2;
                            }
                        } catch (IOException | IllegalArgumentException e5) {
                            exception = e5;
                            byteArrayInputStream = null;
                            byteArrayOutputStream = byteArrayInputStream;
                            throw new aeok(exception);
                        } catch (Throwable th32) {
                            e2 = th32;
                            gZIPInputStream = null;
                            byteArrayInputStream = gZIPInputStream;
                            aeog.a(closeable2);
                            aeog.a(gZIPInputStream);
                            aeog.a(byteArrayInputStream);
                            throw e2;
                        }
                    }
                    return (atbw) ((anxl) ((atbv) ((anvi) ((atbv) atbw.f.createBuilder()).mergeFrom(bArr, anxa.c()))).build());
                }
                throw new aeok("HMAC value mismatch");
            }
            throw new aeok("HMAC length mismatch");
        } catch (anyg | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException exception2) {
            throw new aeok(exception2);
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
