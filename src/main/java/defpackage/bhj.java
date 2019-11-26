package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: bhj */
public class bhj extends bgx {
    public int a;
    public boolean t = false;
    private ArrayList u = new ArrayList();
    private boolean v = true;
    private int w = 0;

    public final bhj b(int i) {
        if (i != 0) {
            this.v = false;
        } else {
            this.v = true;
        }
        return this;
    }

    public final bhj a(bgx bgx) {
        b(bgx);
        long j = this.c;
        if (j >= 0) {
            bgx.a(j);
        }
        if ((this.w & 1) != 0) {
            bgx.a(this.d);
        }
        if ((this.w & 2) != 0) {
            bgx.a(this.q);
        }
        if ((this.w & 4) != 0) {
            bgx.a(this.s);
        }
        if ((this.w & 8) != 0) {
            bgx.a(this.r);
        }
        return this;
    }

    private final void b(bgx bgx) {
        this.u.add(bgx);
        bgx.k = this;
    }

    public final int h() {
        return this.u.size();
    }

    public final bgx c(int i) {
        return (i < 0 || i >= this.u.size()) ? null : (bgx) this.u.get(i);
    }

    /* renamed from: b */
    public final bhj a(TimeInterpolator timeInterpolator) {
        this.w |= 1;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bgx) this.u.get(i)).a(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public final bhj c(View view) {
        for (int i = 0; i < this.u.size(); i++) {
            ((bgx) this.u.get(i)).c(view);
        }
        return (bhj) super.c(view);
    }

    /* renamed from: d */
    public final bhj a(int i) {
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            ((bgx) this.u.get(i2)).a(i);
        }
        return (bhj) super.a(i);
    }

    public final void a(bgt bgt) {
        super.a(bgt);
        this.w |= 4;
        if (this.u != null) {
            for (int i = 0; i < this.u.size(); i++) {
                ((bgx) this.u.get(i)).a(bgt);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ViewGroup viewGroup, bhm bhm, bhm bhm2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.u.size();
        int i = 0;
        while (i < size) {
            bgx bgx = (bgx) this.u.get(i);
            if (j > 0 && (this.v || i == 0)) {
                long j2 = bgx.b;
                if (j2 > 0) {
                    bgx.b(j2 + j);
                } else {
                    bgx.b(j);
                }
            }
            bgx.a(viewGroup, bhm, bhm2, arrayList, arrayList2);
            i++;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        if (this.u.isEmpty()) {
            e();
            f();
            return;
        }
        bhd bhl = new bhl(this);
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ((bgx) arrayList.get(i2)).a(bhl);
        }
        this.a = this.u.size();
        if (this.v) {
            ArrayList arrayList2 = this.u;
            int size2 = arrayList2.size();
            while (i < size2) {
                ((bgx) arrayList2.get(i)).c();
                i++;
            }
        } else {
            for (int i3 = 1; i3 < this.u.size(); i3++) {
                ((bgx) this.u.get(i3 - 1)).a(new bhi((bgx) this.u.get(i3)));
            }
            bgx bgx = (bgx) this.u.get(0);
            if (bgx != null) {
                bgx.c();
            }
        }
    }

    public final void a(bhn bhn) {
        if (b(bhn.b)) {
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bgx bgx = (bgx) arrayList.get(i);
                if (bgx.b(bhn.b)) {
                    bgx.a(bhn);
                    bhn.c.add(bgx);
                }
            }
        }
    }

    public final void b(bhn bhn) {
        if (b(bhn.b)) {
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bgx bgx = (bgx) arrayList.get(i);
                if (bgx.b(bhn.b)) {
                    bgx.b(bhn);
                    bhn.c.add(bgx);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(bhn bhn) {
        super.c(bhn);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bgx) this.u.get(i)).c(bhn);
        }
    }

    public final void e(View view) {
        super.e(view);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bgx) this.u.get(i)).e(view);
        }
    }

    public final void f(View view) {
        super.f(view);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bgx) this.u.get(i)).f(view);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bgx) this.u.get(i)).a(viewGroup);
        }
    }

    public final void a(bhg bhg) {
        this.q = bhg;
        this.w |= 2;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bgx) this.u.get(i)).a(bhg);
        }
    }

    public final void a(bha bha) {
        this.r = bha;
        this.w |= 8;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            ((bgx) this.u.get(i)).a(bha);
        }
    }

    /* Access modifiers changed, original: final */
    public final String a(String str) {
        String a = super.a(str);
        for (int i = 0; i < this.u.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("\n");
            bgx bgx = (bgx) this.u.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(bgx.a(stringBuilder2.toString()));
            a = stringBuilder.toString();
        }
        return a;
    }

    public final bgx g() {
        bhj bhj = (bhj) super.clone();
        bhj.u = new ArrayList();
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            bhj.b((bgx) ((bgx) this.u.get(i)).clone());
        }
        return bhj;
    }

    public final /* synthetic */ Object clone() {
        return clone();
    }
}
