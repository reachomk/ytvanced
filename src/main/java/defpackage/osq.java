package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: osq */
public final class osq extends ori {
    private final oza a = new oza();
    private final oza b = new oza();
    private final osp c = new osp();
    private Inflater d;

    public osq() {
        super("PgsDecoder");
    }

    /* Access modifiers changed, original: protected|final */
    public final ork a(byte[] bArr, int i, boolean z) {
        oza oza;
        osq osq = this;
        osq.a.a(bArr, i);
        oza oza2 = osq.a;
        if (oza2.b() > 0 && (oza2.a[oza2.b] & 255) == 120) {
            if (osq.d == null) {
                osq.d = new Inflater();
            }
            if (ozp.a(oza2, osq.b, osq.d)) {
                oza = osq.b;
                oza2.a(oza.a, oza.c);
            }
        }
        osq.c.a();
        ArrayList arrayList = new ArrayList();
        while (osq.a.b() >= 3) {
            Object obj;
            oza = osq.a;
            osp osp = osq.c;
            int i2 = oza.c;
            int d = oza.d();
            int e = oza.e();
            int i3 = oza.b + e;
            if (i3 > i2) {
                oza.c(i2);
                obj = null;
            } else {
                int i4;
                if (d != 128) {
                    switch (d) {
                        case 20:
                            if (e % 5 == 2) {
                                oza.d(2);
                                Arrays.fill(osp.b, 0);
                                e /= 5;
                                i4 = 0;
                                while (i4 < e) {
                                    i2 = oza.d();
                                    d = oza.d();
                                    int d2 = oza.d();
                                    int d3 = oza.d();
                                    int d4 = oza.d();
                                    i = i4;
                                    double d5 = (double) d;
                                    double d6 = (double) (d2 - 128);
                                    double d7 = (double) (d3 - 128);
                                    int[] iArr = osp.b;
                                    d4 <<= 24;
                                    Double.isNaN(d6);
                                    double d8 = 1.402d * d6;
                                    Double.isNaN(d5);
                                    int i5 = e;
                                    int a = (ozp.a((int) (d5 + d8), 0, 255) << 16) | d4;
                                    Double.isNaN(d7);
                                    d8 = 0.34414d * d7;
                                    Double.isNaN(d5);
                                    d8 = d5 - d8;
                                    Double.isNaN(d6);
                                    a |= ozp.a((int) (d8 - (d6 * 0.71414d)), 0, 255) << 8;
                                    Double.isNaN(d7);
                                    d7 *= 1.772d;
                                    Double.isNaN(d5);
                                    iArr[i2] = a | ozp.a((int) (d5 + d7), 0, 255);
                                    i4 = i + 1;
                                    e = i5;
                                }
                                osp.c = true;
                            }
                            obj = null;
                            break;
                        case 21:
                            if (e >= 4) {
                                oza.d(3);
                                e -= 4;
                                if ((oza.d() & 128) != 0) {
                                    if (e >= 7) {
                                        i4 = oza.h();
                                        if (i4 >= 4) {
                                            osp.h = oza.e();
                                            osp.i = oza.e();
                                            osp.a.a(i4 - 4);
                                            e -= 7;
                                        }
                                    }
                                }
                                oza oza3 = osp.a;
                                i2 = oza3.b;
                                i4 = oza3.c;
                                if (i2 < i4 && e > 0) {
                                    i4 = Math.min(e, i4 - i2);
                                    oza.a(osp.a.a, i2, i4);
                                    osp.a.c(i2 + i4);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (e >= 19) {
                                osp.d = oza.e();
                                osp.e = oza.e();
                                oza.d(11);
                                osp.f = oza.e();
                                osp.g = oza.e();
                                break;
                            }
                            break;
                    }
                    obj = null;
                } else {
                    if (!(osp.d == 0 || osp.e == 0 || osp.h == 0 || osp.i == 0)) {
                        oza oza4 = osp.a;
                        int i6 = oza4.c;
                        if (i6 != 0 && oza4.b == i6 && osp.c) {
                            oza4.c(0);
                            int[] iArr2 = new int[(osp.h * osp.i)];
                            int i7 = 0;
                            while (i7 < iArr2.length) {
                                i6 = osp.a.d();
                                if (i6 != 0) {
                                    i4 = i7 + 1;
                                    iArr2[i7] = osp.b[i6];
                                } else {
                                    i6 = osp.a.d();
                                    if (i6 != 0) {
                                        i4 = ((i6 & 64) != 0 ? ((i6 & 63) << 8) | osp.a.d() : i6 & 63) + i7;
                                        Arrays.fill(iArr2, i7, i4, (i6 & 128) != 0 ? osp.b[osp.a.d()] : 0);
                                    }
                                }
                                i7 = i4;
                            }
                            Bitmap.createBitmap(iArr2, osp.h, osp.i, Config.ARGB_8888);
                            obj = new orf(((float) osp.f) / ((float) osp.d), 0, ((float) osp.g) / ((float) osp.e));
                            osp.a();
                        }
                    }
                    obj = null;
                    osp.a();
                }
                oza.c(i3);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            osq = this;
        }
        return new oss(Collections.unmodifiableList(arrayList));
    }
}
