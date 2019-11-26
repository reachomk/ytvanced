package defpackage;

import android.view.View;

/* renamed from: hva */
public final class hva implements ejc, elk {
    public int a;
    public View b;
    public View c;
    public elr[] d;
    private final aizy e;
    private final elh f;
    private final aiqf g;
    private int h = -1;

    public hva(aizy aizy, aiqf aiqf, elh elh) {
        this.e = aizy;
        this.f = elh;
        this.g = aiqf;
    }

    public final void a(float f) {
        this.d[this.a].setAlpha(f);
        int i = (int) (f * 5.0f);
        if (i != this.h) {
            this.h = i;
            ((elf) this.f.get()).a(Math.max(0.0f, Math.min(1.0f, 1.0f - ((float) (Math.log((double) ((5 - i) + 1)) / Math.log(6.0d))))));
        }
    }

    public final boolean a() {
        return ((elf) this.f.get()).m();
    }

    public final void a(int i, View view) {
        this.d[i].a(view);
    }

    public final void b(int i, View view) {
        this.d[i].b(view);
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd2 != ejd.NONE) {
            a(ejd2.g());
        }
    }

    public final void a(int i) {
        if (this.a != i) {
            a(1.0f);
            if (!this.g.k) {
                this.e.b();
            }
            this.e.b(false);
            this.d[this.a].b(this.b, this.c);
            this.a = i;
            this.d[i].a(this.b, this.c);
            ((elf) this.f.get()).n();
        }
    }
}
