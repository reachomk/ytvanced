package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: blg */
public final class blg implements blc, ble, blm {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final boolean d;
    private final bju e;
    private final blj f;
    private final blj g;
    private final blj h;
    private final bkr i = new bkr();
    private boolean j;

    public blg(bju bju, bnr bnr, bnh bnh) {
        this.c = bnh.a;
        this.d = bnh.e;
        this.e = bju;
        this.f = bnh.b.a();
        this.g = bnh.c.a();
        this.h = bnh.d.a();
        bnr.a(this.f);
        bnr.a(this.g);
        bnr.a(this.h);
        this.f.a((blm) this);
        this.g.a((blm) this);
        this.h.a((blm) this);
    }

    public final String b() {
        return this.c;
    }

    public final void a() {
        this.j = false;
        this.e.invalidateSelf();
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            bku bku = (bku) list.get(i);
            if (bku instanceof blk) {
                blk blk = (blk) bku;
                if (blk.e == 1) {
                    this.i.a(blk);
                    blk.a(this);
                }
            }
        }
    }

    public final Path e() {
        if (this.j) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.j = true;
            return this.a;
        }
        float f;
        PointF pointF = (PointF) this.g.f();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        blj blj = this.h;
        float g = blj != null ? ((blo) blj).g() : 0.0f;
        float min = Math.min(f2, f3);
        if (g > min) {
            g = min;
        }
        PointF pointF2 = (PointF) this.f.f();
        this.a.moveTo(pointF2.x + f2, (pointF2.y - f3) + g);
        this.a.lineTo(pointF2.x + f2, (pointF2.y + f3) - g);
        if (g > 0.0f) {
            f = g + g;
            this.b.set((pointF2.x + f2) - f, (pointF2.y + f3) - f, pointF2.x + f2, pointF2.y + f3);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f2) + g, pointF2.y + f3);
        if (g > 0.0f) {
            f = g + g;
            this.b.set(pointF2.x - f2, (pointF2.y + f3) - f, (pointF2.x - f2) + f, pointF2.y + f3);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f2, (pointF2.y - f3) + g);
        if (g > 0.0f) {
            f = g + g;
            this.b.set(pointF2.x - f2, pointF2.y - f3, (pointF2.x - f2) + f, (pointF2.y - f3) + f);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f2) - g, pointF2.y - f3);
        if (g > 0.0f) {
            g += g;
            this.b.set((pointF2.x + f2) - g, pointF2.y - f3, pointF2.x + f2, (pointF2.y - f3) + g);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.a(this.a);
        this.j = true;
        return this.a;
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        bpd.a(bmi, i, list, bmi2, this);
    }

    public final void a(Object obj, bph bph) {
        if (obj == bkg.h) {
            this.g.d = bph;
        } else if (obj == bkg.j) {
            this.f.d = bph;
        } else if (obj == bkg.i) {
            this.h.d = bph;
        }
    }
}
