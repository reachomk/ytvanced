package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bdo */
public final class bdo {
    private final Bitmap a;
    private final List b = new ArrayList();
    private int c = 16;
    private final int d = 12544;
    private final int e = -1;
    private final List f = new ArrayList();

    public bdo(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        this.f.add(bdm.f);
        this.a = bitmap;
        this.b.add(bdr.a);
        this.b.add(bdr.b);
        this.b.add(bdr.c);
        this.b.add(bdr.d);
        this.b.add(bdr.e);
        this.b.add(bdr.f);
    }

    public final bdo a() {
        this.c = 1;
        return this;
    }

    public final bdm b() {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            int width;
            int i;
            double d;
            bdq[] bdqArr;
            double d2 = -1.0d;
            if (this.d > 0) {
                width = bitmap.getWidth() * bitmap.getHeight();
                i = this.d;
                if (width > i) {
                    d2 = (double) i;
                    d = (double) width;
                    Double.isNaN(d2);
                    Double.isNaN(d);
                    d2 = Math.sqrt(d2 / d);
                }
            } else if (this.e > 0) {
                width = Math.max(bitmap.getWidth(), bitmap.getHeight());
                i = this.e;
                if (width > i) {
                    d2 = (double) i;
                    d = (double) width;
                    Double.isNaN(d2);
                    Double.isNaN(d);
                    d2 /= d;
                }
            }
            width = 0;
            if (d2 > 0.0d) {
                d = (double) bitmap.getWidth();
                Double.isNaN(d);
                i = (int) Math.ceil(d * d2);
                double height = (double) bitmap.getHeight();
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, i, (int) Math.ceil(height * d2), false);
            }
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            int[] iArr = new int[(width2 * height2)];
            bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            int i2 = this.c;
            if (this.f.isEmpty()) {
                bdqArr = null;
            } else {
                List list = this.f;
                bdqArr = (bdq[]) list.toArray(new bdq[list.size()]);
            }
            bdh bdh = new bdh(iArr, i2, bdqArr);
            if (bitmap != this.a) {
                bitmap.recycle();
            }
            bdm bdm = new bdm(bdh.c, this.b);
            int size = bdm.b.size();
            int i3 = 0;
            while (i3 < size) {
                int length;
                float f;
                bdr bdr = (bdr) bdm.b.get(i3);
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (float f4 : bdr.i) {
                    if (f4 > 0.0f) {
                        f3 += f4;
                    }
                }
                if (f3 != 0.0f) {
                    length = bdr.i.length;
                    for (width2 = 0; width2 < length; width2++) {
                        float[] fArr = bdr.i;
                        f = fArr[width2];
                        if (f > 0.0f) {
                            fArr[width2] = f / f3;
                        }
                    }
                }
                Map map = bdm.c;
                width2 = bdm.a.size();
                height2 = 0;
                bds bds = null;
                f = 0.0f;
                while (height2 < width2) {
                    bds bds2 = (bds) bdm.a.get(height2);
                    float[] a = bds2.a();
                    float f5 = a[1];
                    float[] fArr2 = bdr.g;
                    if (f5 >= fArr2[width] && f5 <= fArr2[2]) {
                        float f6 = a[2];
                        a = bdr.h;
                        if (f6 >= a[width] && f6 <= a[2] && !bdm.d.get(bds2.a)) {
                            fArr2 = bds2.a();
                            bds bds3 = bdm.e;
                            float abs = ((bdr.a() > f2 ? (1.0f - Math.abs(fArr2[1] - bdr.g[1])) * bdr.a() : 0.0f) + (bdr.b() > f2 ? bdr.b() * (1.0f - Math.abs(fArr2[2] - bdr.h[1])) : 0.0f)) + (bdr.c() > 0.0f ? bdr.c() * (((float) bds2.b) / ((float) (bds3 != null ? bds3.b : 1))) : 0.0f);
                            if (bds != null && abs <= r12) {
                                height2++;
                                width = 0;
                                f2 = 0.0f;
                            } else {
                                f = abs;
                                bds = bds2;
                                height2++;
                                width = 0;
                                f2 = 0.0f;
                            }
                        }
                    }
                    height2++;
                    width = 0;
                    f2 = 0.0f;
                }
                if (bds != null && bdr.j) {
                    bdm.d.append(bds.a, true);
                }
                map.put(bdr, bds);
                i3++;
                width = 0;
            }
            bdm.d.clear();
            return bdm;
        }
        throw new AssertionError();
    }

    public final AsyncTask a(bdp bdp) {
        return new bdn(this, bdp).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.a});
    }
}
