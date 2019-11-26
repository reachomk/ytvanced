package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amg */
public class amg extends arn {
    private static TimeInterpolator m;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();
    private final ArrayList p = new ArrayList();
    private final ArrayList q = new ArrayList();

    public final void a() {
        int isEmpty = this.n.isEmpty() ^ 1;
        int isEmpty2 = this.p.isEmpty() ^ 1;
        int isEmpty3 = this.q.isEmpty() ^ 1;
        int isEmpty4 = this.o.isEmpty() ^ 1;
        if (isEmpty != 0 || isEmpty2 != 0 || isEmpty4 != 0 || isEmpty3 != 0) {
            Runnable amj;
            ArrayList arrayList = this.n;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aqj aqj = (aqj) arrayList.get(i);
                View view = aqj.a;
                ViewPropertyAnimator animate = view.animate();
                this.f.add(aqj);
                animate.setDuration(this.j).alpha(0.0f).setListener(new amk(this, aqj, animate, view)).start();
            }
            this.n.clear();
            if (isEmpty2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.p);
                this.b.add(arrayList);
                this.p.clear();
                amj = new amj(this, arrayList);
                if (isEmpty != 0) {
                    abe.a(((amq) arrayList.get(0)).a.a, amj, this.j);
                } else {
                    amj.run();
                }
            }
            if (isEmpty3 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.q);
                this.c.add(arrayList);
                this.q.clear();
                amj = new ami(this, arrayList);
                if (isEmpty != 0) {
                    abe.a(((amr) arrayList.get(0)).a.a, amj, this.j);
                } else {
                    amj.run();
                }
            }
            if (isEmpty4 != 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.o);
                this.a.add(arrayList2);
                this.o.clear();
                Runnable aml = new aml(this, arrayList2);
                if (isEmpty == 0 && isEmpty2 == 0 && isEmpty3 == 0) {
                    aml.run();
                    return;
                }
                long j = 0;
                long j2 = isEmpty != 0 ? this.j : 0;
                long j3 = isEmpty2 != 0 ? this.k : 0;
                if (isEmpty3 != 0) {
                    j = this.l;
                }
                abe.a(((aqj) arrayList2.get(0)).a, aml, j2 + Math.max(j3, j));
            }
        }
    }

    public boolean a(aqj aqj) {
        i(aqj);
        this.n.add(aqj);
        return true;
    }

    public final boolean b(aqj aqj) {
        i(aqj);
        aqj.a.setAlpha(0.0f);
        this.o.add(aqj);
        return true;
    }

    public final boolean a(aqj aqj, int i, int i2, int i3, int i4) {
        View view = aqj.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) aqj.a.getTranslationY());
        i(aqj);
        i = i3 - translationX;
        i2 = i4 - translationY;
        if (i == 0 && i2 == 0) {
            f(aqj);
            return false;
        }
        if (i != 0) {
            view.setTranslationX((float) (-i));
        }
        if (i2 != 0) {
            view.setTranslationY((float) (-i2));
        }
        this.p.add(new amq(aqj, translationX, translationY, i3, i4));
        return true;
    }

    public boolean a(aqj aqj, aqj aqj2, int i, int i2, int i3, int i4) {
        if (aqj == aqj2) {
            return a(aqj, i, i2, i3, i4);
        }
        float translationX = aqj.a.getTranslationX();
        float translationY = aqj.a.getTranslationY();
        float alpha = aqj.a.getAlpha();
        i(aqj);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        aqj.a.setTranslationX(translationX);
        aqj.a.setTranslationY(translationY);
        aqj.a.setAlpha(alpha);
        if (aqj2 != null) {
            i(aqj2);
            aqj2.a.setTranslationX((float) (-i5));
            aqj2.a.setTranslationY((float) (-i6));
            aqj2.a.setAlpha(0.0f);
        }
        this.q.add(new amr(aqj, aqj2, i, i2, i3, i4));
        return true;
    }

    private final void a(List list, aqj aqj) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                amr amr = (amr) list.get(size);
                if (a(amr, aqj)) {
                    if (amr.a == null && amr.b == null) {
                        list.remove(amr);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void a(amr amr) {
        aqj aqj = amr.a;
        if (aqj != null) {
            a(amr, aqj);
        }
        aqj = amr.b;
        if (aqj != null) {
            a(amr, aqj);
        }
    }

    private final boolean a(amr amr, aqj aqj) {
        if (amr.b == aqj) {
            amr.b = null;
        } else if (amr.a != aqj) {
            return false;
        } else {
            amr.a = null;
        }
        aqj.a.setAlpha(1.0f);
        aqj.a.setTranslationX(0.0f);
        aqj.a.setTranslationY(0.0f);
        f(aqj);
        return true;
    }

    public final void c(aqj aqj) {
        View view = aqj.a;
        view.animate().cancel();
        int size = this.p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((amq) this.p.get(size)).a == aqj) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                f(aqj);
                this.p.remove(size);
            }
        }
        a(this.q, aqj);
        if (this.n.remove(aqj)) {
            view.setAlpha(1.0f);
            f(aqj);
        }
        if (this.o.remove(aqj)) {
            view.setAlpha(1.0f);
            f(aqj);
        }
        size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            List list = (ArrayList) this.c.get(size);
            a(list, aqj);
            if (list.isEmpty()) {
                this.c.remove(size);
            }
        }
        size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.b.get(size);
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (((amq) arrayList.get(size2)).a == aqj) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    f(aqj);
                    arrayList.remove(size2);
                    if (arrayList.isEmpty()) {
                        this.b.remove(size);
                    }
                }
            }
        }
        size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ArrayList arrayList2 = (ArrayList) this.a.get(size);
                if (arrayList2.remove(aqj)) {
                    view.setAlpha(1.0f);
                    f(aqj);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(size);
                    }
                }
            } else {
                this.f.remove(aqj);
                this.d.remove(aqj);
                this.g.remove(aqj);
                this.e.remove(aqj);
                c();
                return;
            }
        }
    }

    private final void i(aqj aqj) {
        if (m == null) {
            m = new ValueAnimator().getInterpolator();
        }
        aqj.a.animate().setInterpolator(m);
        c(aqj);
    }

    public final boolean b() {
        return (this.o.isEmpty() && this.q.isEmpty() && this.p.isEmpty() && this.n.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (!b()) {
            e();
        }
    }

    public final void d() {
        int size = this.p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            amq amq = (amq) this.p.get(size);
            View view = amq.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            f(amq.a);
            this.p.remove(size);
        }
        size = this.n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            f((aqj) this.n.get(size));
            this.n.remove(size);
        }
        size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            aqj aqj = (aqj) this.o.get(size);
            aqj.a.setAlpha(1.0f);
            f(aqj);
            this.o.remove(size);
        }
        size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            a((amr) this.q.get(size));
        }
        this.q.clear();
        if (b()) {
            ArrayList arrayList;
            size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ArrayList arrayList2 = (ArrayList) this.b.get(size);
                int size2 = arrayList2.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    amq amq2 = (amq) arrayList2.get(size2);
                    View view2 = amq2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    f(amq2.a);
                    arrayList2.remove(size2);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(arrayList2);
                    }
                }
            }
            size = this.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList = (ArrayList) this.a.get(size);
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    aqj aqj2 = (aqj) arrayList.get(size3);
                    aqj2.a.setAlpha(1.0f);
                    f(aqj2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.a.remove(arrayList);
                    }
                }
            }
            size = this.c.size();
            while (true) {
                size--;
                if (size >= 0) {
                    arrayList = (ArrayList) this.c.get(size);
                    int size4 = arrayList.size();
                    while (true) {
                        size4--;
                        if (size4 < 0) {
                            break;
                        }
                        a((amr) arrayList.get(size4));
                        if (arrayList.isEmpty()) {
                            this.c.remove(arrayList);
                        }
                    }
                } else {
                    amg.a(this.f);
                    amg.a(this.e);
                    amg.a(this.d);
                    amg.a(this.g);
                    e();
                    return;
                }
            }
        }
    }

    private static void a(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((aqj) list.get(size)).a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public final boolean a(aqj aqj, List list) {
        return !list.isEmpty() || h(aqj);
    }
}
