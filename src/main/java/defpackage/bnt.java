package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bnt */
public final class bnt extends bnr {
    private blj g;
    private final List h = new ArrayList();
    private final RectF i = new RectF();
    private final RectF j = new RectF();

    public bnt(bju bju, bnv bnv, List list, bjj bjj) {
        super(bju, bnv);
        bmo bmo = bnv.r;
        if (bmo == null) {
            this.g = null;
        } else {
            this.g = bmo.a();
            a(this.g);
            this.g.a((blm) this);
        }
        zr zrVar = new zr(bjj.g.size());
        int size = list.size() - 1;
        bnr bnr = null;
        while (true) {
            int i = 0;
            if (size < 0) {
                while (i < zrVar.b()) {
                    bnr bnr2 = (bnr) zrVar.a(zrVar.b(i));
                    if (bnr2 != null) {
                        bnr bnr3 = (bnr) zrVar.a(bnr2.c.e);
                        if (bnr3 != null) {
                            bnr2.e = bnr3;
                        }
                    }
                    i++;
                }
                return;
            }
            bnv bnv2 = (bnv) list.get(size);
            int i2 = bnv2.u;
            int i3 = i2 - 1;
            if (i2 != 0) {
                bnr bnt;
                if (i3 == 0) {
                    bnt = new bnt(bju, bnv2, (List) bjj.b.get(bnv2.f), bjj);
                } else if (i3 == 1) {
                    bnt = new boa(bju, bnv2);
                } else if (i3 == 2) {
                    bnt = new bnw(bju, bnv2);
                } else if (i3 == 3) {
                    bnt = new bny(bju, bnv2);
                } else if (i3 == 4) {
                    bnt = new bnx(bju, bnv2);
                } else if (i3 != 5) {
                    Object obj;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown layer type ");
                    switch (bnv2.u) {
                        case 1:
                            obj = "PRE_COMP";
                            break;
                        case 2:
                            obj = "SOLID";
                            break;
                        case 3:
                            obj = "IMAGE";
                            break;
                        case 4:
                            obj = "NULL";
                            break;
                        case 5:
                            obj = "SHAPE";
                            break;
                        case 6:
                            obj = "TEXT";
                            break;
                        case 7:
                            obj = "UNKNOWN";
                            break;
                        default:
                            obj = "null";
                            break;
                    }
                    stringBuilder.append(obj);
                    bpb.a(stringBuilder.toString());
                    bnt = null;
                } else {
                    bnt = new bnz(bju, bnv2);
                }
                if (bnt != null) {
                    zrVar.b(bnt.c.d, bnt);
                    if (bnr == null) {
                        this.h.add(0, bnt);
                        i = bnv2.v;
                        int i4 = i - 1;
                        if (i == 0) {
                            throw null;
                        } else if (i4 == 1 || i4 == 2) {
                            bnr = bnt;
                        }
                    } else {
                        bnr.d = bnt;
                        bnr = null;
                    }
                }
                size--;
            } else {
                throw null;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        RectF rectF = this.j;
        bnv bnv = this.c;
        rectF.set(0.0f, 0.0f, (float) bnv.n, (float) bnv.o);
        matrix.mapRect(this.j);
        int size = this.h.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                bjd.a();
                return;
            } else if (this.j.isEmpty() || canvas.clipRect(this.j)) {
                ((bnr) this.h.get(size)).a(canvas, matrix, i);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        int size = this.h.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
                ((bnr) this.h.get(size)).a(this.i, this.a, true);
                rectF.union(this.i);
            } else {
                return;
            }
        }
    }

    public final void a(float f) {
        super.a(f);
        if (this.g != null) {
            f = ((float) ((long) (((Float) this.g.f()).floatValue() * 1000.0f))) / this.b.a.b();
        }
        bnv bnv = this.c;
        float f2 = bnv.l;
        if (f2 != 0.0f) {
            f /= f2;
        }
        f -= bnv.m / bnv.b.c();
        int size = this.h.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((bnr) this.h.get(size)).a(f);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bmi bmi, int i, List list, bmi bmi2) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            ((bnr) this.h.get(i2)).a(bmi, i, list, bmi2);
        }
    }

    public final void a(Object obj, bph bph) {
        super.a(obj, bph);
        if (obj != bkg.A) {
            return;
        }
        if (bph != null) {
            this.g = new blz(bph);
            a(this.g);
            return;
        }
        this.g = null;
    }
}
