package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkt */
public final class bkt implements bkw, ble, blm, bmh {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final boolean e;
    private final List f;
    private final bju g;
    private List h;
    private bma i;

    public bkt(bju bju, bnr bnr, bnl bnl) {
        bmy bmy;
        String str = bnl.a;
        boolean z = bnl.c;
        List list = bnl.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            bku a = ((bnc) list.get(i)).a(bju, bnr);
            if (a != null) {
                arrayList.add(a);
            }
        }
        List list2 = bnl.b;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            bnc bnc = (bnc) list2.get(i2);
            if (bnc instanceof bmy) {
                bmy = (bmy) bnc;
                break;
            }
        }
        bmy = null;
        this(bju, bnr, str, z, arrayList, bmy);
    }

    public final String b() {
        throw null;
    }

    bkt(bju bju, bnr bnr, String str, boolean z, List list, bmy bmy) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.g = bju;
        this.e = z;
        this.f = list;
        if (bmy != null) {
            this.i = bmy.a();
            this.i.a(bnr);
            this.i.a((blm) this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            bku bku = (bku) list.get(size);
            if (bku instanceof bkz) {
                arrayList.add((bkz) bku);
            }
        }
        size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((bkz) arrayList.get(size)).a(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }

    public final void a() {
        this.g.invalidateSelf();
    }

    public final void a(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f.size());
        arrayList.addAll(list);
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                bku bku = (bku) this.f.get(size);
                bku.a(arrayList, this.f.subList(0, size));
                arrayList.add(bku);
            } else {
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final List c() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.f.size(); i++) {
                bku bku = (bku) this.f.get(i);
                if (bku instanceof ble) {
                    this.h.add((ble) bku);
                }
            }
        }
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final Matrix d() {
        bma bma = this.i;
        if (bma != null) {
            return bma.a();
        }
        this.a.reset();
        return this.a;
    }

    public final Path e() {
        this.a.reset();
        bma bma = this.i;
        if (bma != null) {
            this.a.set(bma.a());
        }
        this.b.reset();
        if (this.e) {
            return this.b;
        }
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.b;
            }
            bku bku = (bku) this.f.get(size);
            if (bku instanceof ble) {
                this.b.addPath(((ble) bku).e(), this.a);
            }
        }
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.e) {
            this.a.set(matrix);
            bma bma = this.i;
            if (bma != null) {
                this.a.preConcat(bma.a());
                blj blj = this.i.e;
                i = (int) ((((((float) (blj != null ? ((Integer) blj.f()).intValue() : 100)) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            int size = this.f.size();
            while (true) {
                size--;
                if (size >= 0) {
                    Object obj = this.f.get(size);
                    if (obj instanceof bkw) {
                        ((bkw) obj).a(canvas, this.a, i);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.a.set(matrix);
        bma bma = this.i;
        if (bma != null) {
            this.a.preConcat(bma.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                bku bku = (bku) this.f.get(size);
                if (bku instanceof bkw) {
                    ((bkw) bku).a(this.c, this.a, z);
                    rectF.union(this.c);
                }
            } else {
                return;
            }
        }
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        if (bmi.a(this.d, i)) {
            if (!"__container".equals(this.d)) {
                bmi2 = bmi2.a(this.d);
                if (bmi.c(this.d, i)) {
                    list.add(bmi2.a((bmh) this));
                }
            }
            if (bmi.d(this.d, i)) {
                i += bmi.b(this.d, i);
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    bku bku = (bku) this.f.get(i2);
                    if (bku instanceof bmh) {
                        ((bmh) bku).a(bmi, i, list, bmi2);
                    }
                }
            }
        }
    }

    public final void a(Object obj, bph bph) {
        bma bma = this.i;
        if (bma != null) {
            bma.a(obj, bph);
        }
    }
}
