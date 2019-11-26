package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkp */
public abstract class bkp implements bkw, blc, blm {
    public final bnr a;
    public final Paint b = new bkq(1);
    private final PathMeasure c = new PathMeasure();
    private final Path d = new Path();
    private final Path e = new Path();
    private final RectF f = new RectF();
    private final bju g;
    private final List h = new ArrayList();
    private final float[] i;
    private final blj j;
    private final blj k;
    private final List l;
    private final blj m;
    private blj n;

    bkp(bju bju, bnr bnr, Cap cap, Join join, float f, bmq bmq, bmo bmo, List list, bmo bmo2) {
        int i;
        this.g = bju;
        this.a = bnr;
        this.b.setStyle(Style.STROKE);
        this.b.setStrokeCap(cap);
        this.b.setStrokeJoin(join);
        this.b.setStrokeMiter(f);
        this.k = bmq.a();
        this.j = bmo.a();
        if (bmo2 == null) {
            this.m = null;
        } else {
            this.m = bmo2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (i = 0; i < list.size(); i++) {
            this.l.add(((bmo) list.get(i)).a());
        }
        bnr.a(this.k);
        bnr.a(this.j);
        for (i = 0; i < this.l.size(); i++) {
            bnr.a((blj) this.l.get(i));
        }
        blj blj = this.m;
        if (blj != null) {
            bnr.a(blj);
        }
        this.k.a((blm) this);
        this.j.a((blm) this);
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((blj) this.l.get(i2)).a((blm) this);
        }
        blj blj2 = this.m;
        if (blj2 != null) {
            blj2.a((blm) this);
        }
    }

    public final void a() {
        this.g.invalidateSelf();
    }

    public final void a(List list, List list2) {
        blk blk;
        Object obj = null;
        blk blk2 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            bku bku = (bku) list.get(size);
            if (bku instanceof blk) {
                blk = (blk) bku;
                if (blk.e == 2) {
                    blk2 = blk;
                }
            }
        }
        if (blk2 != null) {
            blk2.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            bku bku2 = (bku) list2.get(size2);
            if (bku2 instanceof blk) {
                blk = (blk) bku2;
                if (blk.e == 2) {
                    if (obj != null) {
                        this.h.add(obj);
                    }
                    bks bks = new bks(blk);
                    blk.a(this);
                    obj = bks;
                }
            }
            if (bku2 instanceof ble) {
                if (obj == null) {
                    obj = new bks(blk2);
                }
                obj.a.add((ble) bku2);
            }
        }
        if (obj != null) {
            this.h.add(obj);
        }
    }

    public void a(Canvas canvas, Matrix matrix, int i) {
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        boolean z = false;
        bpg.a[0] = 0.0f;
        bpg.a[1] = 0.0f;
        bpg.a[2] = 37394.73f;
        bpg.a[3] = 39575.234f;
        matrix2.mapPoints(bpg.a);
        if (bpg.a[0] == bpg.a[2] || bpg.a[1] == bpg.a[3]) {
            bjd.a();
            return;
        }
        blq blq = (blq) this.k;
        float b = (((float) i) / 255.0f) * ((float) blq.b(blq.b(), blq.d()));
        float f = 100.0f;
        this.b.setAlpha(bpd.a((int) ((b / 100.0f) * 255.0f)));
        this.b.setStrokeWidth(((blo) this.j).g() * bpg.a(matrix));
        if (this.b.getStrokeWidth() > 0.0f) {
            blj blj;
            if (this.l.isEmpty()) {
                bjd.a();
            } else {
                float a = bpg.a(matrix);
                for (int i2 = 0; i2 < this.l.size(); i2++) {
                    float[] fArr;
                    this.i[i2] = ((Float) ((blj) this.l.get(i2)).f()).floatValue();
                    if (i2 % 2 == 0) {
                        fArr = this.i;
                        if (fArr[i2] < 1.0f) {
                            fArr[i2] = 1.0f;
                        }
                    } else {
                        fArr = this.i;
                        if (fArr[i2] < 0.1f) {
                            fArr[i2] = 0.1f;
                        }
                    }
                    fArr = this.i;
                    fArr[i2] = fArr[i2] * a;
                }
                blj = this.m;
                this.b.setPathEffect(new DashPathEffect(this.i, blj != null ? ((Float) blj.f()).floatValue() : 0.0f));
                bjd.a();
            }
            blj = this.n;
            if (blj != null) {
                this.b.setColorFilter((ColorFilter) blj.f());
            }
            int i3 = 0;
            while (i3 < this.h.size()) {
                bks bks = (bks) this.h.get(i3);
                if (bks.b == null) {
                    this.d.reset();
                    int size = bks.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        this.d.addPath(((ble) bks.a.get(size)).e(), matrix2);
                    }
                    bjd.a();
                    canvas2.drawPath(this.d, this.b);
                    bjd.a();
                } else if (bks.b != null) {
                    this.d.reset();
                    int size2 = bks.a.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        this.d.addPath(((ble) bks.a.get(size2)).e(), matrix2);
                    }
                    this.c.setPath(this.d, z);
                    float length = this.c.getLength();
                    while (this.c.nextContour()) {
                        length += this.c.getLength();
                    }
                    float floatValue = (((Float) bks.b.d.f()).floatValue() * length) / 360.0f;
                    float floatValue2 = ((((Float) bks.b.b.f()).floatValue() * length) / f) + floatValue;
                    float floatValue3 = ((((Float) bks.b.c.f()).floatValue() * length) / f) + floatValue;
                    int size3 = bks.a.size() - 1;
                    float f2 = 0.0f;
                    while (size3 >= 0) {
                        this.e.set(((ble) bks.a.get(size3)).e());
                        this.e.transform(matrix2);
                        this.c.setPath(this.e, z);
                        float length2 = this.c.getLength();
                        if (floatValue3 > length) {
                            float f3 = floatValue3 - length;
                            if (f3 < f2 + length2 && f2 < f3) {
                                bpg.a(this.e, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                                canvas2.drawPath(this.e, this.b);
                                f2 += length2;
                                size3--;
                                z = false;
                            }
                        }
                        f = f2 + length2;
                        if (f >= floatValue2 && f2 <= floatValue3) {
                            if (f > floatValue3 || floatValue2 >= f2) {
                                bpg.a(this.e, floatValue2 >= f2 ? (floatValue2 - f2) / length2 : 0.0f, floatValue3 <= f ? (floatValue3 - f2) / length2 : 1.0f, 0.0f);
                                canvas2.drawPath(this.e, this.b);
                            } else {
                                canvas2.drawPath(this.e, this.b);
                            }
                        }
                        f2 += length2;
                        size3--;
                        z = false;
                    }
                    bjd.a();
                } else {
                    bjd.a();
                }
                i3++;
                f = 100.0f;
                z = false;
            }
            bjd.a();
            return;
        }
        bjd.a();
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.d.reset();
        for (int i = 0; i < this.h.size(); i++) {
            bks bks = (bks) this.h.get(i);
            for (int i2 = 0; i2 < bks.a.size(); i2++) {
                this.d.addPath(((ble) bks.a.get(i2)).e(), matrix);
            }
        }
        this.d.computeBounds(this.f, false);
        float g = ((blo) this.j).g();
        RectF rectF2 = this.f;
        g /= 2.0f;
        rectF2.set(rectF2.left - g, this.f.top - g, this.f.right + g, this.f.bottom + g);
        rectF.set(this.f);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        bjd.a();
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        bpd.a(bmi, i, list, bmi2, this);
    }

    public void a(Object obj, bph bph) {
        if (obj == bkg.d) {
            this.k.d = bph;
        } else if (obj == bkg.o) {
            this.j.d = bph;
        } else if (obj == bkg.B) {
            if (bph == null) {
                this.n = null;
                return;
            }
            this.n = new blz(bph);
            this.n.a((blm) this);
            this.a.a(this.n);
        }
    }
}
