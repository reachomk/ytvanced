package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: cdn */
public final class cdn implements bsp {
    private static final cdq a = new cdq();
    private static final cdp b = new cdp();
    private final Context c;
    private final List d;
    private final cdp e;
    private final cds f;

    public cdn(Context context, List list, bwd bwd, bwb bwb) {
        cdp cdp = b;
        this.c = context.getApplicationContext();
        this.d = list;
        this.f = new cds(bwd, bwb);
        this.e = cdp;
    }

    public final /* synthetic */ bvw a(Object obj, int i, int i2, bsq bsq) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        bsd a = this.e.a(byteBuffer);
        try {
            chs.a();
            if (a.b != null) {
                bse bse;
                StringBuilder stringBuilder;
                bvw bvw = null;
                int i3 = 0;
                if (a.e()) {
                    bse = a.c;
                } else {
                    bse bse2;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    for (int i4 = 0; i4 < 6; i4++) {
                        stringBuilder2.append((char) a.c());
                    }
                    if (stringBuilder2.toString().startsWith("GIF")) {
                        a.c.f = a.d();
                        a.c.g = a.d();
                        int c = a.c();
                        bse2 = a.c;
                        bse2.h = (c & 128) != 0;
                        bse2.i = (int) Math.pow(2.0d, (double) ((c & 7) + 1));
                        a.c.j = a.c();
                        a.c.k = a.c();
                        if (a.c.h && !a.e()) {
                            bse = a.c;
                            bse.a = a.a(bse.i);
                            bse = a.c;
                            bse.l = bse.a[bse.j];
                        }
                    } else {
                        a.c.b = 1;
                    }
                    if (!a.e()) {
                        Object obj2 = null;
                        while (obj2 == null) {
                            if (a.e() || a.c.c > Integer.MAX_VALUE) {
                                break;
                            }
                            int c2 = a.c();
                            if (c2 == 33) {
                                c2 = a.c();
                                int i5;
                                if (c2 == 1) {
                                    a.a();
                                } else if (c2 == 249) {
                                    a.c.d = new bsb();
                                    a.c();
                                    c2 = a.c();
                                    bsb bsb = a.c.d;
                                    i5 = (c2 & 28) >> 2;
                                    bsb.g = i5;
                                    if (i5 == 0) {
                                        bsb.g = 1;
                                    }
                                    bsb.f = (c2 & 1) != 0;
                                    c2 = a.d();
                                    if (c2 < 2) {
                                        c2 = 10;
                                    }
                                    bsb bsb2 = a.c.d;
                                    bsb2.i = c2 * 10;
                                    bsb2.h = a.c();
                                    a.c();
                                } else if (c2 == 254) {
                                    a.a();
                                } else if (c2 != 255) {
                                    a.a();
                                } else {
                                    a.b();
                                    stringBuilder = new StringBuilder();
                                    for (i5 = 0; i5 < 11; i5++) {
                                        stringBuilder.append((char) a.a[i5]);
                                    }
                                    if (stringBuilder.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            a.b();
                                            byte[] bArr = a.a;
                                            if (bArr[0] == (byte) 1) {
                                                a.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                            }
                                            if (a.d <= 0) {
                                                break;
                                            }
                                        } while (!a.e());
                                    } else {
                                        a.a();
                                    }
                                }
                            } else if (c2 == 44) {
                                bse2 = a.c;
                                if (bse2.d == null) {
                                    bse2.d = new bsb();
                                }
                                a.c.d.a = a.d();
                                a.c.d.b = a.d();
                                a.c.d.c = a.d();
                                a.c.d.d = a.d();
                                c2 = a.c();
                                int i6 = c2 & 128;
                                int pow = (int) Math.pow(2.0d, (double) ((c2 & 7) + 1));
                                bsb bsb3 = a.c.d;
                                bsb3.e = (c2 & 64) != 0;
                                if (i6 != 0) {
                                    bsb3.k = a.a(pow);
                                } else {
                                    bsb3.k = null;
                                }
                                a.c.d.j = a.b.position();
                                a.c();
                                a.a();
                                if (!a.e()) {
                                    bse2 = a.c;
                                    bse2.c++;
                                    bse2.e.add(bse2.d);
                                }
                            } else if (c2 != 59) {
                                a.c.b = 1;
                            } else {
                                obj2 = 1;
                            }
                        }
                        bse = a.c;
                        if (bse.c < 0) {
                            bse.b = 1;
                        }
                    }
                    bse = a.c;
                }
                if (bse.c > 0 && bse.b == 0) {
                    Config config;
                    if (bsq.a(ceb.a) != bsi.PREFER_RGB_565) {
                        config = Config.ARGB_8888;
                    } else {
                        config = Config.RGB_565;
                    }
                    int min = Math.min(bse.g / i2, bse.f / i);
                    if (min != 0) {
                        i3 = Integer.highestOneBit(min);
                    }
                    bsg bsg = new bsg(this.f, bse, byteBuffer, Math.max(1, i3));
                    if (config != Config.ARGB_8888) {
                        if (config != Config.RGB_565) {
                            String valueOf = String.valueOf(config);
                            String valueOf2 = String.valueOf(Config.ARGB_8888);
                            String valueOf3 = String.valueOf(Config.RGB_565);
                            stringBuilder = new StringBuilder(((valueOf.length() + 41) + valueOf2.length()) + valueOf3.length());
                            stringBuilder.append("Unsupported format: ");
                            stringBuilder.append(valueOf);
                            stringBuilder.append(", must be one of ");
                            stringBuilder.append(valueOf2);
                            stringBuilder.append(" or ");
                            stringBuilder.append(valueOf3);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    bsg.a = config;
                    bsg.b();
                    Bitmap g = bsg.g();
                    if (g != null) {
                        bvw = new cdw(new cdr(this.c, bsg, cbf.a(), i, i2, g));
                    }
                }
                this.e.a(a);
                return bvw;
            }
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } catch (Throwable th) {
            this.e.a(a);
        }
    }

    public final /* synthetic */ boolean a(Object obj, bsq bsq) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) bsq.a(ceb.b)).booleanValue()) {
            return false;
        }
        ImageType a;
        List list = this.d;
        if (byteBuffer != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a = ((ImageHeaderParser) list.get(i)).a(byteBuffer);
                if (a != ImageType.UNKNOWN) {
                    break;
                }
            }
            a = ImageType.UNKNOWN;
        } else {
            a = ImageType.UNKNOWN;
        }
        if (a == ImageType.GIF) {
            return true;
        }
        return false;
    }
}
