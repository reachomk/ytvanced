package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: bld */
public final class bld implements blc, ble, blm {
    private final Path a = new Path();
    private final String b;
    private final bju c;
    private final boolean d;
    private final blj e;
    private final blj f;
    private final blj g;
    private final blj h;
    private final blj i;
    private final blj j;
    private final blj k;
    private final bkr l = new bkr();
    private boolean m;
    private final int n;

    public bld(bju bju, bnr bnr, bni bni) {
        this.c = bju;
        this.b = bni.a;
        this.n = bni.j;
        this.d = bni.i;
        this.e = bni.b.a();
        this.f = bni.c.a();
        this.g = bni.d.a();
        this.i = bni.f.a();
        this.k = bni.h.a();
        if (this.n != 1) {
            this.h = null;
            this.j = null;
        } else {
            this.h = bni.e.a();
            this.j = bni.g.a();
        }
        bnr.a(this.e);
        bnr.a(this.f);
        bnr.a(this.g);
        bnr.a(this.i);
        bnr.a(this.k);
        if (this.n == 1) {
            bnr.a(this.h);
            bnr.a(this.j);
        }
        this.e.a((blm) this);
        this.f.a((blm) this);
        this.g.a((blm) this);
        this.i.a((blm) this);
        this.k.a((blm) this);
        if (this.n == 1) {
            this.h.a((blm) this);
            this.j.a((blm) this);
        }
    }

    public final void a() {
        this.m = false;
        this.c.invalidateSelf();
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            bku bku = (bku) list.get(i);
            if (bku instanceof blk) {
                blk blk = (blk) bku;
                if (blk.e == 1) {
                    this.l.a(blk);
                    blk.a(this);
                }
            }
        }
    }

    public final Path e() {
        if (this.m) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.m = true;
            return this.a;
        }
        int i = this.n;
        if (i != 0) {
            double d = 0.0d;
            float f = 0.0f;
            float floatValue;
            double toRadians;
            float f2;
            float floatValue2;
            float floatValue3;
            float floatValue4;
            double d2;
            double cos;
            float f3;
            float f4;
            double d3;
            int i2;
            double d4;
            double cos2;
            double d5;
            double atan2;
            PointF pointF;
            if (i == 1) {
                double d6;
                float f5;
                float f6;
                floatValue = ((Float) this.e.f()).floatValue();
                blj blj = this.g;
                if (blj != null) {
                    d = (double) ((Float) blj.f()).floatValue();
                }
                toRadians = Math.toRadians(d - 0.0498046875d);
                d = (double) floatValue;
                Double.isNaN(d);
                f2 = (float) (6.283185307179586d / d);
                float f7 = f2 / 2.0f;
                floatValue -= (float) ((int) floatValue);
                if (floatValue != 0.0f) {
                    d6 = (double) ((1.0f - floatValue) * f7);
                    Double.isNaN(d6);
                    toRadians += d6;
                }
                floatValue2 = ((Float) this.i.f()).floatValue();
                floatValue3 = ((Float) this.h.f()).floatValue();
                blj blj2 = this.j;
                f = blj2 != null ? ((Float) blj2.f()).floatValue() / 100.0f : 0.0f;
                blj2 = this.k;
                floatValue4 = blj2 != null ? ((Float) blj2.f()).floatValue() / 100.0f : 0.0f;
                if (floatValue != 0.0f) {
                    f5 = ((floatValue2 - floatValue3) * floatValue) + floatValue3;
                    d2 = (double) f5;
                    cos = Math.cos(toRadians);
                    Double.isNaN(d2);
                    f3 = f7;
                    f4 = (float) (d2 * cos);
                    cos = Math.sin(toRadians);
                    Double.isNaN(d2);
                    f7 = (float) (d2 * cos);
                    this.a.moveTo(f4, f7);
                    d2 = (double) ((f2 * floatValue) / 2.0f);
                    Double.isNaN(d2);
                    toRadians += d2;
                    f6 = f5;
                    f5 = f4;
                    f4 = f3;
                } else {
                    f3 = f7;
                    d3 = (double) floatValue2;
                    d2 = Math.cos(toRadians);
                    Double.isNaN(d3);
                    f5 = (float) (d2 * d3);
                    d2 = Math.sin(toRadians);
                    Double.isNaN(d3);
                    f7 = (float) (d3 * d2);
                    this.a.moveTo(f5, f7);
                    f4 = f3;
                    d2 = (double) f4;
                    Double.isNaN(d2);
                    toRadians += d2;
                    f6 = 0.0f;
                }
                d = Math.ceil(d);
                d += d;
                float f8 = f7;
                float f9 = floatValue3;
                float f10 = f5;
                int i3 = 0;
                i2 = 0;
                while (true) {
                    d6 = (double) i3;
                    if (d6 >= d) {
                        break;
                    }
                    float f11;
                    float f12;
                    float f13;
                    double d7;
                    float f14;
                    float f15;
                    f3 = i2 == 0 ? f9 : floatValue2;
                    if (f6 == 0.0f || d6 != d - 2.0d) {
                        f11 = f2;
                        f2 = f4;
                    } else {
                        f11 = f2;
                        f2 = (f2 * floatValue) / 2.0f;
                    }
                    if (f6 == 0.0f || d6 != d - 4.0d) {
                        f12 = f2;
                        f13 = f4;
                        f4 = f3;
                    } else {
                        f12 = f2;
                        f13 = f4;
                        f4 = f6;
                    }
                    d4 = (double) f4;
                    cos2 = Math.cos(toRadians);
                    Double.isNaN(d4);
                    d5 = d6;
                    floatValue3 = (float) (d4 * cos2);
                    cos2 = Math.sin(toRadians);
                    Double.isNaN(d4);
                    f2 = (float) (d4 * cos2);
                    if (f == 0.0f && floatValue4 == 0.0f) {
                        this.a.lineTo(floatValue3, f2);
                        d7 = toRadians;
                        f14 = floatValue2;
                        f15 = floatValue4;
                        f10 = f;
                        floatValue4 = f6;
                        f4 = f12;
                    } else {
                        f14 = floatValue2;
                        f15 = floatValue4;
                        f4 = f10;
                        f10 = f;
                        atan2 = (double) ((float) (Math.atan2((double) f8, (double) f4) - 2.858407346410207d));
                        f5 = (float) Math.cos(atan2);
                        floatValue4 = f6;
                        d7 = toRadians;
                        toRadians = (double) ((float) (Math.atan2((double) f2, (double) floatValue3) - 2.858407346410207d));
                        f = (float) Math.cos(toRadians);
                        float f16 = ((i2 == 0 ? f14 : f9) * (i2 == 0 ? f15 : f10)) * 0.47829f;
                        f5 *= f16;
                        f16 *= (float) Math.sin(atan2);
                        f3 = (f3 * (i2 == 0 ? f10 : f15)) * 0.47829f;
                        f *= f3;
                        f3 *= (float) Math.sin(toRadians);
                        if (floatValue != 0.0f) {
                            if (i3 == 0) {
                                f5 *= floatValue;
                                f16 *= floatValue;
                            } else if (d5 == d - 4.0d) {
                                f *= floatValue;
                                f3 *= floatValue;
                            }
                        }
                        this.a.cubicTo(f4 - f5, f8 - f16, floatValue3 + f, f2 + f3, floatValue3, f2);
                        f4 = f12;
                    }
                    double d8 = (double) f4;
                    Double.isNaN(d8);
                    i2 ^= 1;
                    i3++;
                    f8 = f2;
                    f6 = floatValue4;
                    toRadians = d7 + d8;
                    f = f10;
                    f2 = f11;
                    f4 = f13;
                    floatValue2 = f14;
                    floatValue4 = f15;
                    f10 = floatValue3;
                }
                pointF = (PointF) this.f.f();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
            } else if (i == 2) {
                i = (int) Math.floor((double) ((Float) this.e.f()).floatValue());
                blj blj3 = this.g;
                if (blj3 != null) {
                    d = (double) ((Float) blj3.f()).floatValue();
                }
                toRadians = Math.toRadians(d - 0.0498046875d);
                d = (double) i;
                floatValue = ((Float) this.k.f()).floatValue() / 100.0f;
                floatValue4 = ((Float) this.i.f()).floatValue();
                d2 = (double) floatValue4;
                cos = Math.cos(toRadians);
                Double.isNaN(d2);
                float f17 = floatValue4;
                floatValue2 = (float) (d2 * cos);
                cos = Math.sin(toRadians);
                Double.isNaN(d2);
                floatValue4 = (float) (d2 * cos);
                this.a.moveTo(floatValue2, floatValue4);
                Double.isNaN(d);
                d3 = (double) ((float) (6.283185307179586d / d));
                Double.isNaN(d3);
                toRadians += d3;
                d = Math.ceil(d);
                cos = d3;
                floatValue3 = floatValue2;
                float f18 = floatValue4;
                atan2 = toRadians;
                int i4 = 0;
                while (((double) i4) < d) {
                    float f19;
                    d4 = Math.cos(atan2);
                    Double.isNaN(d2);
                    f2 = (float) (d4 * d2);
                    d3 = Math.sin(atan2);
                    Double.isNaN(d2);
                    f4 = (float) (d3 * d2);
                    if (floatValue != f) {
                        cos2 = d;
                        d = (double) ((float) (Math.atan2((double) f18, (double) floatValue3) - 2.858407346410207d));
                        d5 = d2;
                        i2 = i4;
                        double atan22 = (double) ((float) (Math.atan2((double) f4, (double) f2) - 2.858407346410207d));
                        f3 = (f17 * floatValue) * 0.25f;
                        f19 = floatValue;
                        this.a.cubicTo(floatValue3 - (((float) Math.cos(d)) * f3), f18 - (((float) Math.sin(d)) * f3), f2 + (((float) Math.cos(atan22)) * f3), f4 + (f3 * ((float) Math.sin(atan22))), f2, f4);
                    } else {
                        f19 = floatValue;
                        i2 = i4;
                        cos2 = d;
                        d5 = d2;
                        this.a.lineTo(f2, f4);
                    }
                    Double.isNaN(cos);
                    atan2 += cos;
                    i4 = i2 + 1;
                    floatValue3 = f2;
                    f18 = f4;
                    d = cos2;
                    d2 = d5;
                    floatValue = f19;
                    f = 0.0f;
                }
                pointF = (PointF) this.f.f();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
            }
            this.a.close();
            this.l.a(this.a);
            this.m = true;
            return this.a;
        }
        throw null;
    }

    public final String b() {
        return this.b;
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        bpd.a(bmi, i, list, bmi2, this);
    }

    public final void a(Object obj, bph bph) {
        if (obj == bkg.s) {
            this.e.d = bph;
        } else if (obj == bkg.t) {
            this.g.d = bph;
        } else if (obj == bkg.j) {
            this.f.d = bph;
        } else {
            blj blj;
            if (obj == bkg.u) {
                blj = this.h;
                if (blj != null) {
                    blj.d = bph;
                    return;
                }
            }
            if (obj == bkg.v) {
                this.i.d = bph;
                return;
            }
            if (obj == bkg.w) {
                blj = this.j;
                if (blj != null) {
                    blj.d = bph;
                    return;
                }
            }
            if (obj == bkg.x) {
                this.k.d = bph;
            }
        }
    }
}
