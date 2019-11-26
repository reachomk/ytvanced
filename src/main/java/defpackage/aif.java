package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: aif */
public final class aif {
    public final ArrayList a = new ArrayList();
    public abs b;
    public boolean c;
    private long d = -1;
    private Interpolator e;
    private final abv f = new aie(this);

    public final aif a(abr abr) {
        if (!this.c) {
            this.a.add(abr);
        }
        return this;
    }

    public final void a() {
        if (!this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                abr abr = (abr) arrayList.get(i);
                long j = this.d;
                if (j >= 0) {
                    abr.a(j);
                }
                Interpolator interpolator = this.e;
                if (interpolator != null) {
                    abr.a(interpolator);
                }
                if (this.b != null) {
                    abr.a(this.f);
                }
                abr.b();
            }
            this.c = true;
        }
    }

    public final void b() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((abr) arrayList.get(i)).a();
            }
            this.c = false;
        }
    }

    public final aif c() {
        if (!this.c) {
            this.d = 250;
        }
        return this;
    }

    public final aif a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final aif a(abs abs) {
        if (!this.c) {
            this.b = abs;
        }
        return this;
    }
}
