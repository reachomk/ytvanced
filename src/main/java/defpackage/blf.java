package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: blf */
public final class blf implements bkw, bkz, blc, ble, blm {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final bju c;
    private final bnr d;
    private final String e;
    private final boolean f;
    private final blj g;
    private final blj h;
    private final bma i;
    private bkt j;

    public blf(bju bju, bnr bnr, bnk bnk) {
        this.c = bju;
        this.d = bnr;
        this.e = bnk.a;
        this.f = bnk.e;
        this.g = bnk.b.a();
        bnr.a(this.g);
        this.g.a((blm) this);
        this.h = bnk.c.a();
        bnr.a(this.h);
        this.h.a((blm) this);
        this.i = bnk.d.a();
        this.i.a(bnr);
        this.i.a((blm) this);
    }

    public final void a(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() == this) {
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new bkt(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    public final String b() {
        return this.e;
    }

    public final void a(List list, List list2) {
        this.j.a(list, list2);
    }

    public final Path e() {
        Path e = this.j.e();
        this.b.reset();
        float floatValue = ((Float) this.g.f()).floatValue();
        float floatValue2 = ((Float) this.h.f()).floatValue();
        int i = (int) floatValue;
        while (true) {
            i--;
            if (i < 0) {
                return this.b;
            }
            this.a.set(this.i.a(((float) i) + floatValue2));
            this.b.addPath(e, this.a);
        }
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.f()).floatValue();
        float floatValue2 = ((Float) this.h.f()).floatValue();
        float floatValue3 = ((Float) this.i.h.f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.i.f()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(matrix);
                float f = (float) i2;
                this.a.preConcat(this.i.a(f + floatValue2));
                this.j.a(canvas, this.a, (int) (((float) i) * bpd.a(floatValue3, floatValue4, f / floatValue)));
            } else {
                return;
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.j.a(rectF, matrix, z);
    }

    public final void a() {
        this.c.invalidateSelf();
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        bpd.a(bmi, i, list, bmi2, this);
    }

    public final void a(Object obj, bph bph) {
        if (!this.i.a(obj, bph)) {
            if (obj == bkg.q) {
                this.g.d = bph;
            } else if (obj == bkg.r) {
                this.h.d = bph;
            }
        }
    }
}
