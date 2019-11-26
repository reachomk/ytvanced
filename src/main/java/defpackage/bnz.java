package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bnz */
public final class bnz extends bnr {
    private final StringBuilder g = new StringBuilder(2);
    private final RectF h = new RectF();
    private final Matrix i = new Matrix();
    private final Paint j = new boc();
    private final Paint k = new bob();
    private final Map l = new HashMap();
    private final zr m = new zr();
    private final blx n;
    private final bju o;
    private final bjj p;
    private blj q;
    private blj r;
    private blj s;
    private blj t;

    bnz(bju bju, bnv bnv) {
        bml bml;
        super(bju, bnv);
        this.o = bju;
        this.p = bnv.b;
        this.n = (blx) bnv.p.a();
        this.n.a((blm) this);
        a(this.n);
        bmv bmv = bnv.q;
        if (bmv != null) {
            bml = bmv.a;
            if (bml != null) {
                this.q = bml.a();
                this.q.a((blm) this);
                a(this.q);
            }
        }
        if (bmv != null) {
            bml = bmv.b;
            if (bml != null) {
                this.r = bml.a();
                this.r.a((blm) this);
                a(this.r);
            }
        }
        if (bmv != null) {
            bmo bmo = bmv.c;
            if (bmo != null) {
                this.s = bmo.a();
                this.s.a((blm) this);
                a(this.s);
            }
        }
        if (bmv != null) {
            bmo bmo2 = bmv.d;
            if (bmo2 != null) {
                this.t = bmo2.a();
                this.t.a((blm) this);
                a(this.t);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.p.h.width(), (float) this.p.h.height());
    }

    /* Access modifiers changed, original: final */
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Canvas canvas2 = canvas;
        canvas.save();
        if (!this.o.g()) {
            canvas.setMatrix(matrix);
        }
        bmd bmd = (bmd) this.n.f();
        bmg bmg = (bmg) this.p.d.get(bmd.b);
        if (bmg == null) {
            canvas.restore();
            return;
        }
        float a;
        Paint paint;
        double a2;
        blj blj = this.q;
        if (blj != null) {
            this.j.setColor(((Integer) blj.f()).intValue());
        } else {
            this.j.setColor(bmd.g);
        }
        blj = this.r;
        if (blj != null) {
            this.k.setColor(((Integer) blj.f()).intValue());
        } else {
            this.k.setColor(bmd.h);
        }
        blj = this.f.e;
        int intValue = ((blj != null ? ((Integer) blj.f()).intValue() : 100) * 255) / 100;
        this.j.setAlpha(intValue);
        this.k.setAlpha(intValue);
        blj = this.s;
        if (blj != null) {
            this.k.setStrokeWidth(((Float) blj.f()).floatValue());
        } else {
            a = bpg.a(matrix);
            paint = this.k;
            double d = bmd.i;
            a2 = (double) bpg.a();
            Double.isNaN(a2);
            d *= a2;
            a2 = (double) a;
            Double.isNaN(a2);
            paint.setStrokeWidth((float) (d * a2));
        }
        float a3;
        int i2;
        float f;
        int i3;
        double d2;
        int size;
        int i4;
        float f2;
        if (this.o.g()) {
            a = ((float) bmd.c) / 100.0f;
            float a4 = bpg.a(matrix);
            a3 = ((float) bmd.e) * bpg.a();
            List a5 = bnz.a(bmd.a);
            int size2 = a5.size();
            i2 = 0;
            while (i2 < size2) {
                bmf bmf;
                List list;
                float f3;
                String str = (String) a5.get(i2);
                f = 0.0f;
                i3 = 0;
                while (i3 < str.length()) {
                    bmf = (bmf) this.p.e.a(bmf.a(str.charAt(i3), bmg.a, bmg.c));
                    if (bmf != null) {
                        double d3 = (double) f;
                        double d4 = bmf.b;
                        list = a5;
                        f3 = a3;
                        d2 = (double) a;
                        Double.isNaN(d2);
                        d4 *= d2;
                        d2 = (double) bpg.a();
                        Double.isNaN(d2);
                        d4 *= d2;
                        d2 = (double) a4;
                        Double.isNaN(d2);
                        d4 *= d2;
                        Double.isNaN(d3);
                        f = (float) (d3 + d4);
                    } else {
                        list = a5;
                        f3 = a3;
                    }
                    i3++;
                    a3 = f3;
                    a5 = list;
                }
                list = a5;
                f3 = a3;
                canvas.save();
                bnz.a(bmd.k, canvas2, f);
                canvas2.translate(0.0f, (((float) i2) * f3) - ((((float) (size2 - 1)) * f3) / 2.0f));
                int i5 = 0;
                while (i5 < str.length()) {
                    String str2;
                    bmf = (bmf) this.p.e.a(bmf.a(str.charAt(i5), bmg.a, bmg.c));
                    if (bmf == null) {
                        str2 = str;
                    } else {
                        List list2;
                        if (this.l.containsKey(bmf)) {
                            list2 = (List) this.l.get(bmf);
                        } else {
                            list2 = bmf.a;
                            size = list2.size();
                            ArrayList arrayList = new ArrayList(size);
                            i4 = 0;
                            while (i4 < size) {
                                List list3 = list2;
                                int i6 = size;
                                arrayList.add(new bkt(this.o, this, (bnl) list2.get(i4)));
                                i4++;
                                list2 = list3;
                                size = i6;
                            }
                            this.l.put(bmf, arrayList);
                            list2 = arrayList;
                        }
                        size = 0;
                        while (size < list2.size()) {
                            Path e = ((bkt) list2.get(size)).e();
                            e.computeBounds(this.h, false);
                            this.i.set(matrix);
                            str2 = str;
                            this.i.preTranslate(0.0f, ((float) (-bmd.f)) * bpg.a());
                            this.i.preScale(a, a);
                            e.transform(this.i);
                            if (bmd.j) {
                                bnz.a(e, this.j, canvas2);
                                bnz.a(e, this.k, canvas2);
                            } else {
                                bnz.a(e, this.k, canvas2);
                                bnz.a(e, this.j, canvas2);
                            }
                            size++;
                            str = str2;
                        }
                        str2 = str;
                        float a6 = ((((float) bmf.b) * a) * bpg.a()) * a4;
                        f2 = ((float) bmd.d) / 10.0f;
                        blj blj2 = this.t;
                        if (blj2 != null) {
                            f2 += ((Float) blj2.f()).floatValue();
                        }
                        canvas2.translate(a6 + (f2 * a4), 0.0f);
                    }
                    i5++;
                    str = str2;
                }
                canvas.restore();
                i2++;
                a3 = f3;
                a5 = list;
            }
        } else {
            bmc bmc;
            a = bpg.a(matrix);
            bju bju = this.o;
            String str3 = bmg.a;
            String str4 = bmg.c;
            Typeface typeface = null;
            if (bju.getCallback() != null) {
                if (bju.h == null) {
                    Callback callback = bju.getCallback();
                    bjb bjb = bju.i;
                    bju.h = new bmc(callback);
                }
                bmc = bju.h;
            } else {
                bmc = null;
            }
            if (bmc != null) {
                bmm bmm = bmc.a;
                bmm.a = str3;
                bmm.b = str4;
                typeface = (Typeface) bmc.b.get(bmm);
                if (typeface == null) {
                    typeface = (Typeface) bmc.c.get(str3);
                    if (typeface == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("fonts/");
                        stringBuilder.append(str3);
                        stringBuilder.append(bmc.e);
                        typeface = Typeface.createFromAsset(bmc.d, stringBuilder.toString());
                        bmc.c.put(str3, typeface);
                    }
                    boolean contains = str4.contains("Italic");
                    boolean contains2 = str4.contains("Bold");
                    int i7 = (contains && contains2) ? 3 : contains ? 2 : !contains2 ? 0 : 1;
                    if (typeface.getStyle() != i7) {
                        typeface = Typeface.create(typeface, i7);
                    }
                    bmc.b.put(bmc.a, typeface);
                }
            }
            if (typeface != null) {
                str4 = bmd.a;
                bkn bkn = this.o.j;
                this.j.setTypeface(typeface);
                paint = this.j;
                a2 = bmd.c;
                d2 = (double) bpg.a();
                Double.isNaN(d2);
                paint.setTextSize((float) (a2 * d2));
                this.k.setTypeface(this.j.getTypeface());
                this.k.setTextSize(this.j.getTextSize());
                f = ((float) bmd.e) * bpg.a();
                List a7 = bnz.a(str4);
                int size3 = a7.size();
                for (size = 0; size < size3; size++) {
                    String str5 = (String) a7.get(size);
                    bnz.a(bmd.k, canvas2, this.k.measureText(str5));
                    canvas2.translate(0.0f, (((float) size) * f) - ((((float) (size3 - 1)) * f) / 2.0f));
                    int i8 = 0;
                    while (i8 < str5.length()) {
                        int codePointAt;
                        String stringBuilder2;
                        i4 = str5.codePointAt(i8);
                        i2 = Character.charCount(i4) + i8;
                        while (i2 < str5.length()) {
                            codePointAt = str5.codePointAt(i2);
                            if (Character.getType(codePointAt) != 16 && Character.getType(codePointAt) != 27 && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 28 && Character.getType(codePointAt) != 19) {
                                break;
                            }
                            i2 += Character.charCount(codePointAt);
                            i4 = (i4 * 31) + codePointAt;
                        }
                        long j = (long) i4;
                        if (this.m.c(j) < 0) {
                            this.g.setLength(0);
                            codePointAt = i8;
                            while (codePointAt < i2) {
                                i3 = str5.codePointAt(codePointAt);
                                this.g.appendCodePoint(i3);
                                codePointAt += Character.charCount(i3);
                            }
                            stringBuilder2 = this.g.toString();
                            this.m.b(j, stringBuilder2);
                        } else {
                            stringBuilder2 = (String) this.m.a(j);
                        }
                        i8 += stringBuilder2.length();
                        if (bmd.j) {
                            bnz.a(stringBuilder2, this.j, canvas2);
                            bnz.a(stringBuilder2, this.k, canvas2);
                        } else {
                            bnz.a(stringBuilder2, this.k, canvas2);
                            bnz.a(stringBuilder2, this.j, canvas2);
                        }
                        f2 = this.j.measureText(stringBuilder2, 0, 1);
                        a3 = ((float) bmd.d) / 10.0f;
                        blj blj3 = this.t;
                        if (blj3 != null) {
                            a3 += ((Float) blj3.f()).floatValue();
                        }
                        canvas2.translate(f2 + (a3 * a), 0.0f);
                    }
                    canvas.setMatrix(matrix);
                }
            }
        }
        canvas.restore();
    }

    private static List a(String str) {
        String str2 = "\r";
        return Arrays.asList(str.replaceAll("\r\n", str2).replaceAll("\n", str2).split(str2));
    }

    private static void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0 && (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f)) {
            canvas.drawPath(path, paint);
        }
    }

    private static void a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0 && (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f)) {
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    public final void a(Object obj, bph bph) {
        blj blj;
        super.a(obj, bph);
        if (obj == bkg.a) {
            blj = this.q;
            if (blj != null) {
                blj.d = bph;
                return;
            }
        }
        if (obj == bkg.b) {
            blj = this.r;
            if (blj != null) {
                blj.d = bph;
                return;
            }
        }
        if (obj == bkg.o) {
            blj = this.s;
            if (blj != null) {
                blj.d = bph;
                return;
            }
        }
        if (obj == bkg.p) {
            blj blj2 = this.t;
            if (blj2 != null) {
                blj2.d = bph;
            }
        }
    }

    private static void a(int i, Canvas canvas, float f) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 1) {
            if (i2 == 2) {
                canvas.translate((-f) / 2.0f, 0.0f);
            }
        } else {
            canvas.translate(-f, 0.0f);
        }
    }
}
