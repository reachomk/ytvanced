package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View.OnLayoutChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: taa */
public class taa {
    public final HashMap a = new HashMap();
    public apa b = null;
    public tac c = null;
    public RecyclerView d = null;
    public boolean e = true;
    public final tag f = new tag(this);
    public final OnLayoutChangeListener g = new tae(this);
    public final tab h = new tab(this);
    public int i = -1;
    public int j = -1;
    public final ArrayList k = new ArrayList();
    public int l = -1;
    public int m = -1;
    public int n = 1;
    public int o = -1;
    public int p = -1;
    private final int q;
    private final float r;
    private boolean s = false;
    private final tad t = new tad(0, null, null);

    private static boolean a(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    public final void a() {
        if ((this.e && this.d.getWidth() != this.i) || (!this.e && this.d.getHeight() != this.j)) {
            this.i = this.d.getWidth();
            this.j = this.d.getHeight();
            c();
            d();
        }
    }

    public void b() {
        throw null;
    }

    public taa(int i, float f) {
        this.q = i;
        this.r = f;
    }

    public final int a(int i) {
        tad tad = this.t;
        tad.a = i;
        i = Collections.binarySearch(this.k, tad, szz.a);
        return i < 0 ? -(i + 1) : i;
    }

    public final void c() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tad tad = (tad) arrayList.get(i);
            if (tad.c) {
                tad.b.a();
                tad.c = false;
            }
        }
        this.l = -1;
        this.m = -1;
        this.o = -1;
        this.p = -1;
        this.n = 1;
    }

    public final void d() {
        if (!(this.k.isEmpty() || this.j == 0 || this.i == 0)) {
            apn apn = this.d.n;
            int p = apn instanceof ans ? ((ans) apn).p() : apn instanceof anm ? ((anm) apn).p() : 0;
            this.l = p;
            apn = this.d.n;
            p = apn instanceof ans ? ((ans) apn).r() : apn instanceof anm ? ((anm) apn).r() : -1;
            this.m = p;
            p = Math.max(this.n, (p - this.l) + 1);
            this.n = p;
            p = Math.max(0, this.l - Math.round(((float) p) * this.r));
            int round = this.m + Math.round(((float) this.n) * this.r);
            int i = this.q;
            if ((round - p) + 1 < i) {
                round = (i + p) - 1;
            }
            if (round >= this.b.a()) {
                round = this.b.a() - 1;
            }
            int i2 = this.o;
            if (p != i2 || round != this.p || this.s) {
                this.s = false;
                i2 = i2 >= 0 ? Math.min(i2, p) : p;
                i = this.p;
                i = i >= 0 ? Math.max(i, round) : round;
                tah tah = null;
                for (i2 = a(i2); i2 < this.k.size(); i2++) {
                    tad tad = (tad) this.k.get(i2);
                    int i3 = tad.a;
                    if (i3 > i) {
                        break;
                    }
                    if (taa.a(i3, p, round) && !tad.c) {
                        if (tah == null) {
                            tah = new tah(this.d.getWidth(), this.d.getHeight(), this.e);
                        }
                        tad.c = true;
                        tad.b.a(tah);
                    } else if ((taa.a(tad.a, p, round) ^ 1) != 0 && tad.c) {
                        tad.c = false;
                        tad.b.a();
                    }
                }
                this.o = p;
                this.p = round;
            }
        }
    }
}
