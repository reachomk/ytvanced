package defpackage;

import android.content.res.TypedArray;
import android.text.TextUtils.TruncateAt;
import java.util.BitSet;

/* renamed from: dcn */
public final class dcn extends clz {
    public dco a;
    private final String[] d = new String[]{"text"};
    private final BitSet e = new BitSet(1);

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final dcn a() {
        this.a.b = 1;
        return this;
    }

    public final dcn b(CharSequence charSequence) {
        this.a.c = charSequence;
        return this;
    }

    public final dcn a(TruncateAt truncateAt) {
        this.a.d = truncateAt;
        return this;
    }

    public final dcn u(float f) {
        this.a.e = (float) this.c.b(f);
        return this;
    }

    public final dcn b() {
        dco dco = this.a;
        cqw cqw = this.c;
        int i = cqw.b;
        i[0] = 16842907;
        TypedArray obtainStyledAttributes = cqw.a.obtainStyledAttributes(i);
        try {
            i = obtainStyledAttributes.getColor(0, 0);
            dco.f = i;
            return this;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final dcn c(int i) {
        this.a.g = i;
        return this;
    }

    public final dcn b(boolean z) {
        this.a.u = z;
        return this;
    }

    public final dcn c(CharSequence charSequence) {
        this.a.v = charSequence;
        this.e.set(0);
        return this;
    }

    /* renamed from: g */
    public final dco c() {
        clz.a(1, this.e, this.d);
        dco dco = this.a;
        super.e();
        this.a = null;
        return dco;
    }

    static /* synthetic */ void a(dcn dcn, cmg cmg, dco dco) {
        super.a(cmg, (cma) dco);
        dcn.a = dco;
        dcn.e.clear();
    }

    public final dcn d(int i) {
        this.a.w = i;
        return this;
    }
}
