package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: vrk */
public final class vrk {
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;

    public final synchronized void a(aokb aokb) {
        if (aokb != null) {
            if (!TextUtils.isEmpty(aokb.d)) {
                Pattern.compile(aokb.d);
            }
            boolean z = aokb.f;
            this.a = aokb.l;
            this.b = aokb.e;
            z = aokb.g;
            z = aokb.h;
            z = aokb.i;
            z = aokb.j;
            this.c = aokb.k;
            z = aokb.m;
            this.d = aokb.n;
            int i = aokb.o;
            z = aokb.p;
            this.e = aokb.q;
            this.f = aokb.r;
            this.g = aokb.s;
            i = aokp.a(aokb.t);
            if (i == 0) {
                i = 1;
            }
            this.n = i;
            this.h = aokb.v;
            this.i = aokb.w;
            this.j = aokb.x;
            this.k = aokb.u;
            this.l = aokb.y;
            z = aokb.z;
            this.m = aokb.A;
        }
    }
}
