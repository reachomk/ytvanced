package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: bkv */
public final class bkv implements blc, ble, blm {
    private final Path a = new Path();
    private final String b;
    private final bju c;
    private final blj d;
    private final blj e;
    private final bmz f;
    private final bkr g = new bkr();
    private boolean h;

    public bkv(bju bju, bnr bnr, bmz bmz) {
        this.b = bmz.a;
        this.c = bju;
        this.d = bmz.c.a();
        this.e = bmz.b.a();
        this.f = bmz;
        bnr.a(this.d);
        bnr.a(this.e);
        this.d.a((blm) this);
        this.e.a((blm) this);
    }

    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            bku bku = (bku) list.get(i);
            if (bku instanceof blk) {
                blk blk = (blk) bku;
                if (blk.e == 1) {
                    this.g.a(blk);
                    blk.a(this);
                }
            }
        }
    }

    public final String b() {
        return this.b;
    }

    public final Path e() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.h = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        float f5;
        float f6;
        float f7;
        if (this.f.d) {
            f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f8 = -f3;
            float f9 = -f;
            float f10 = -f4;
            this.a.cubicTo(f8, f5, f9, f10, f9, 0.0f);
            f4 += 0.0f;
            f6 = f10;
            f7 = f5;
            this.a.cubicTo(f9, f4, f8, f2, 0.0f, f2);
            f3 += 0.0f;
            this.a.cubicTo(f3, f2, f, f4, f, 0.0f);
            this.a.cubicTo(f, f6, f3, f7, 0.0f, f7);
        } else {
            f7 = -f2;
            this.a.moveTo(0.0f, f7);
            f6 = f3 + 0.0f;
            f5 = -f4;
            float f11 = f5;
            this.a.cubicTo(f6, f7, f, f5, f, 0.0f);
            f4 += 0.0f;
            this.a.cubicTo(f, f4, f6, f2, 0.0f, f2);
            f3 = -f3;
            f = -f;
            this.a.cubicTo(f3, f2, f, f4, f, 0.0f);
            this.a.cubicTo(f, f11, f3, f7, 0.0f, f7);
        }
        pointF = (PointF) this.e.f();
        this.a.offset(pointF.x, pointF.y);
        this.a.close();
        this.g.a(this.a);
        this.h = true;
        return this.a;
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        bpd.a(bmi, i, list, bmi2, this);
    }

    public final void a(Object obj, bph bph) {
        if (obj == bkg.g) {
            this.d.d = bph;
        } else if (obj == bkg.j) {
            this.e.d = bph;
        }
    }
}
