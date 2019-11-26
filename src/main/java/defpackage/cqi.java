package defpackage;

import android.util.SparseArray;
import android.view.ViewOutlineProvider;

/* renamed from: cqi */
public final class cqi {
    public int A = 0;
    public int B = 0;
    public int C;
    public CharSequence a;
    public Object b;
    public SparseArray c;
    public float d;
    public ViewOutlineProvider e;
    public boolean f;
    public boolean g = true;
    public float h = 1.0f;
    public float i = 1.0f;
    public float j = 0.0f;
    public coj k;
    public coj l;
    public coj m;
    public coj n;
    public coj o;
    public String p;
    public CharSequence q;
    public coj r;
    public coj s;
    public coj t;
    public coj u;
    public coj v;
    public coj w;
    public coj x;
    public coj y;
    public int z = 0;

    cqi() {
    }

    /* Access modifiers changed, original: final */
    public final void a(CharSequence charSequence) {
        this.C |= 1;
        this.a = charSequence;
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj) {
        this.C |= 2;
        this.b = obj;
    }

    public final void a(boolean z) {
        this.C |= 8388608;
        this.g = z;
    }

    public final boolean a() {
        return (this.C & 8388608) != 0;
    }

    /* Access modifiers changed, original: final */
    public final void a(coj coj) {
        this.C |= 8;
        this.k = coj;
    }

    public final void b(coj coj) {
        this.C |= 16;
        this.m = coj;
    }

    /* Access modifiers changed, original: final */
    public final void c(coj coj) {
        this.C |= 131072;
        this.l = coj;
    }

    /* Access modifiers changed, original: final */
    public final void d(coj coj) {
        this.C |= 32;
        this.n = coj;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return (this.k == null && this.m == null && this.n == null && this.o == null) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return (this.s == null && this.u == null && this.t == null && this.v == null && this.w == null && this.r == null && this.x == null && this.y == null && this.p == null && this.q == null) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        if (z) {
            this.z = 1;
        } else {
            this.z = 2;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(float f) {
        this.h = f;
        this.C |= 524288;
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        return (this.C & 524288) != 0;
    }

    /* Access modifiers changed, original: final */
    public final void b(float f) {
        this.i = f;
        this.C |= 1048576;
    }

    /* Access modifiers changed, original: final */
    public final boolean e() {
        return (this.C & 1048576) != 0;
    }

    /* Access modifiers changed, original: final */
    public final void c(float f) {
        this.j = f;
        this.C |= 2097152;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return (this.C & 2097152) != 0;
    }
}
