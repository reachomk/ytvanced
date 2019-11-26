package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: cbp */
public final class cbp implements ImageHeaderParser {
    private static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public final ImageType a(InputStream inputStream) {
        return cbp.a(new cbt((InputStream) chw.a((Object) inputStream)));
    }

    public final ImageType a(ByteBuffer byteBuffer) {
        return cbp.a(new cbs((ByteBuffer) chw.a((Object) byteBuffer)));
    }

    public final int a(InputStream inputStream, bwb bwb) {
        cbt cbt = new cbt((InputStream) chw.a((Object) inputStream));
        bwb bwb2 = (bwb) chw.a((Object) bwb);
        int a = cbt.a();
        int i = -1;
        if ((a & 65496) == 65496 || a == 19789 || a == 18761) {
            int a2;
            while (cbt.b() == (short) 255) {
                short b = cbt.b();
                if (b != (short) 218 && b != (short) 217) {
                    a2 = cbt.a() - 2;
                    if (b == (short) 225) {
                        break;
                    }
                    long j = (long) a2;
                    if (cbt.a(j) != j) {
                        break;
                    }
                }
                break;
            }
            a2 = -1;
            if (a2 != -1) {
                byte[] bArr = (byte[]) bwb2.a(a2, byte[].class);
                int i2 = a2;
                while (i2 > 0) {
                    try {
                        int read = cbt.a.read(bArr, a2 - i2, i2);
                        if (read == -1) {
                            break;
                        }
                        i2 -= read;
                    } catch (Throwable th) {
                        bwb2.b(bArr);
                    }
                }
                if (a2 - i2 == a2) {
                    if (bArr != null && a2 > a.length) {
                        ByteOrder byteOrder;
                        for (i2 = 0; i2 < a.length; i2++) {
                            if (bArr[i2] != a[i2]) {
                                break;
                            }
                        }
                        cbr cbr = new cbr(bArr, a2);
                        short b2 = cbr.b(6);
                        if (b2 == (short) 18761) {
                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                        } else if (b2 != (short) 19789) {
                            byteOrder = ByteOrder.BIG_ENDIAN;
                        } else {
                            byteOrder = ByteOrder.BIG_ENDIAN;
                        }
                        cbr.a.order(byteOrder);
                        int a3 = cbr.a(10) + 6;
                        short b3 = cbr.b(a3);
                        for (short s = (short) 0; s < b3; s++) {
                            int i3 = (a3 + 2) + (s * 12);
                            if (cbr.b(i3) == (short) 274) {
                                b2 = cbr.b(i3 + 2);
                                if (b2 > (short) 0) {
                                    if (b2 <= (short) 12) {
                                        int a4 = cbr.a(i3 + 4);
                                        if (a4 >= 0) {
                                            a4 += b[b2];
                                            if (a4 <= 4) {
                                                i3 += 8;
                                                if (i3 >= 0 && i3 <= cbr.a() && a4 >= 0 && a4 + i3 <= cbr.a()) {
                                                    i = cbr.b(i3);
                                                    break;
                                                }
                                            }
                                            continue;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                bwb2.b(bArr);
            }
        }
        return i;
    }

    private static ImageType a(cbu cbu) {
        int a = cbu.a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        a = ((a << 16) & -65536) | ((char) cbu.a());
        if (a == -1991225785) {
            cbu.a(21);
            return cbu.c() < 3 ? ImageType.PNG : ImageType.PNG_A;
        } else if ((a >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            if (a != 1380533830) {
                return ImageType.UNKNOWN;
            }
            cbu.a(4);
            if ((((cbu.a() << 16) & -65536) | ((char) cbu.a())) != 1464156752) {
                return ImageType.UNKNOWN;
            }
            a = ((cbu.a() << 16) & -65536) | ((char) cbu.a());
            if ((a & -256) != 1448097792) {
                return ImageType.UNKNOWN;
            }
            a &= 255;
            if (a == 88) {
                cbu.a(4);
                return (cbu.c() & 16) == 0 ? ImageType.WEBP : ImageType.WEBP_A;
            } else if (a != 76) {
                return ImageType.WEBP;
            } else {
                cbu.a(4);
                return (cbu.c() & 8) == 0 ? ImageType.WEBP : ImageType.WEBP_A;
            }
        }
    }
}
