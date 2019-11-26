package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aqj */
public class aqj {
    private static final List p = Collections.emptyList();
    public final View a;
    public WeakReference b;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public aqj h = null;
    public aqj i = null;
    public int j;
    public apw k = null;
    public boolean l = false;
    public int m = 0;
    public int n = -1;
    public RecyclerView o;
    private List q = null;
    private List r = null;
    private int s = 0;

    public aqj(View view) {
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        if (this.a.getLayoutParams() != null) {
            ((apr) this.a.getLayoutParams()).e = true;
        }
    }

    public final void a() {
        this.d = -1;
        this.g = -1;
    }

    public final boolean b() {
        return (this.j & 128) != 0;
    }

    public final int c() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final int d() {
        RecyclerView recyclerView = this.o;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.c(this);
    }

    /* Access modifiers changed, original: final */
    public final boolean e() {
        return this.k != null;
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        this.k.b(this);
    }

    /* Access modifiers changed, original: final */
    public final boolean g() {
        return (this.j & 32) != 0;
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        this.j &= -33;
    }

    public final void i() {
        this.j &= -257;
    }

    /* Access modifiers changed, original: final */
    public final void a(apw apw, boolean z) {
        this.k = apw;
        this.l = z;
    }

    public final boolean j() {
        return (this.j & 4) != 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean k() {
        return (this.j & 2) != 0;
    }

    public final boolean l() {
        return (this.j & 1) != 0;
    }

    public final boolean m() {
        return (this.j & 8) != 0;
    }

    public final boolean a(int i) {
        return (i & this.j) != 0;
    }

    public final boolean n() {
        return (this.j & 256) != 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean o() {
        return (this.a.getParent() == null || this.a.getParent() == this.o) ? false : true;
    }

    public final void a(int i, int i2) {
        this.j = (i & i2) | (this.j & (i2 ^ -1));
    }

    public final void b(int i) {
        this.j = i | this.j;
    }

    public final void a(Object obj) {
        if (obj != null) {
            if ((1024 & this.j) == 0) {
                if (this.q == null) {
                    this.q = new ArrayList();
                    this.r = Collections.unmodifiableList(this.q);
                }
                this.q.add(obj);
            }
            return;
        }
        b(1024);
    }

    /* Access modifiers changed, original: final */
    public final void p() {
        List list = this.q;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    public final List q() {
        if ((this.j & 1024) != 0) {
            return p;
        }
        List list = this.q;
        if (list == null || list.size() == 0) {
            return p;
        }
        return this.r;
    }

    /* Access modifiers changed, original: final */
    public final void r() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = -1;
        this.s = 0;
        this.h = null;
        this.i = null;
        p();
        this.m = 0;
        this.n = -1;
        RecyclerView.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ViewHolder{");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(" position=");
        stringBuilder.append(this.c);
        stringBuilder.append(" id=");
        stringBuilder.append(this.e);
        stringBuilder.append(", oldPos=");
        stringBuilder.append(this.d);
        stringBuilder.append(", pLpos:");
        stringBuilder.append(this.g);
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        if (e()) {
            stringBuilder2.append(" scrap ");
            stringBuilder2.append(this.l ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            stringBuilder2.append(" invalid");
        }
        if (!l()) {
            stringBuilder2.append(" unbound");
        }
        if (k()) {
            stringBuilder2.append(" update");
        }
        if (m()) {
            stringBuilder2.append(" removed");
        }
        if (b()) {
            stringBuilder2.append(" ignored");
        }
        if (n()) {
            stringBuilder2.append(" tmpDetached");
        }
        if (!s()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(" not recyclable(");
            stringBuilder.append(this.s);
            stringBuilder.append(")");
            stringBuilder2.append(stringBuilder.toString());
        }
        if ((this.j & 512) != 0 || j()) {
            stringBuilder2.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            stringBuilder2.append(" no parent");
        }
        stringBuilder2.append("}");
        return stringBuilder2.toString();
    }

    public final void a(boolean z) {
        int i = z ? this.s - 1 : this.s + 1;
        this.s = i;
        if (i < 0) {
            this.s = 0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            stringBuilder.append(this);
            Log.e("View", stringBuilder.toString());
        } else if (!z && i == 1) {
            this.j |= 16;
        } else if (z && i == 0) {
            this.j &= -17;
        }
    }

    public final boolean s() {
        return (this.j & 16) == 0 && !abe.d(this.a);
    }

    public final boolean t() {
        return (this.j & 2) != 0;
    }
}
