package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: albn */
final class albn extends alcp {
    private final boolean a;
    private final int b;
    private final boolean c;
    private final View d;
    private final CharSequence e;
    private final CharSequence f;
    private final CharSequence g;
    private final OnClickListener h;
    private final aphg i;
    private final CharSequence j;
    private final OnClickListener k;
    private final aphg l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final float q;
    private final albc r;
    private final OnClickListener s;
    private final alcj t;

    public final boolean c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final boolean a() {
        return this.c;
    }

    public final View b() {
        return this.d;
    }

    public final CharSequence e() {
        return this.e;
    }

    public final CharSequence f() {
        return this.f;
    }

    public final CharSequence g() {
        return this.g;
    }

    public final OnClickListener h() {
        return this.h;
    }

    public final aphg i() {
        return this.i;
    }

    public final CharSequence j() {
        return this.j;
    }

    public final OnClickListener k() {
        return this.k;
    }

    public final aphg l() {
        return this.l;
    }

    public final int m() {
        return this.m;
    }

    public final int o() {
        return this.n;
    }

    public final int p() {
        return this.o;
    }

    public final int q() {
        return this.p;
    }

    public final float r() {
        return this.q;
    }

    public final albc n() {
        return this.r;
    }

    public final OnClickListener s() {
        return this.s;
    }

    public final alcj t() {
        return this.t;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        boolean z2 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.k);
        String valueOf9 = String.valueOf(this.l);
        int i2 = this.m;
        int i3 = this.n;
        int i4 = this.o;
        int i5 = this.p;
        float f = this.q;
        String valueOf10 = String.valueOf(this.r);
        int i6 = i3;
        String valueOf11 = String.valueOf(this.s);
        int i7 = i2;
        String valueOf12 = String.valueOf(this.t);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        int length6 = valueOf6.length();
        int length7 = valueOf7.length();
        int length8 = valueOf8.length();
        int length9 = valueOf9.length();
        int length10 = valueOf10.length();
        String str = valueOf12;
        StringBuilder stringBuilder = new StringBuilder((((((((((((length + 438) + length2) + length3) + length4) + length5) + length6) + length7) + length8) + length9) + length10) + valueOf11.length()) + valueOf12.length());
        stringBuilder.append("YouTubeTooltipModel{counterfactual=");
        stringBuilder.append(z);
        stringBuilder.append(", duration=");
        stringBuilder.append(i);
        stringBuilder.append(", rateLimited=");
        stringBuilder.append(z2);
        stringBuilder.append(", targetView=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", titleText=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", detailText=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", actionText=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", actionListener=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", actionButtonRenderer=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", dismissText=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", dismissListener=");
        stringBuilder.append(valueOf8);
        stringBuilder.append(", dismissButtonRenderer=");
        stringBuilder.append(valueOf9);
        stringBuilder.append(", tapDismissalType=");
        stringBuilder.append(i7);
        stringBuilder.append(", targetEffectType=");
        stringBuilder.append(i6);
        stringBuilder.append(", placement=");
        stringBuilder.append(i4);
        stringBuilder.append(", alignment=");
        stringBuilder.append(i5);
        stringBuilder.append(", maxWidthPercentage=");
        stringBuilder.append(f);
        stringBuilder.append(", transientUiCallback=");
        stringBuilder.append(valueOf10);
        stringBuilder.append(", onClickListener=");
        stringBuilder.append(valueOf11);
        stringBuilder.append(", onTooltipDismissListener=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alcp) {
            alcp alcp = (alcp) obj;
            if (this.a == alcp.c() && this.b == alcp.d() && this.c == alcp.a()) {
                View view = this.d;
                if (view == null ? alcp.b() != null : !view.equals(alcp.b())) {
                    CharSequence charSequence = this.e;
                    if (charSequence == null ? alcp.e() != null : !charSequence.equals(alcp.e())) {
                        charSequence = this.f;
                        if (charSequence == null ? alcp.f() != null : !charSequence.equals(alcp.f())) {
                            charSequence = this.g;
                            if (charSequence == null ? alcp.g() != null : !charSequence.equals(alcp.g())) {
                                OnClickListener onClickListener = this.h;
                                if (onClickListener == null ? alcp.h() != null : !onClickListener.equals(alcp.h())) {
                                    aphg aphg = this.i;
                                    if (aphg == null ? alcp.i() != null : !aphg.equals(alcp.i())) {
                                        charSequence = this.j;
                                        if (charSequence == null ? alcp.j() != null : !charSequence.equals(alcp.j())) {
                                            onClickListener = this.k;
                                            if (onClickListener == null ? alcp.k() != null : !onClickListener.equals(alcp.k())) {
                                                aphg = this.l;
                                                if (aphg == null ? alcp.l() != null : !aphg.equals(alcp.l())) {
                                                    if (this.m == alcp.m() && this.n == alcp.o() && this.o == alcp.p() && this.p == alcp.q() && Float.floatToIntBits(this.q) == Float.floatToIntBits(alcp.r())) {
                                                        albc albc = this.r;
                                                        if (albc == null ? alcp.n() != null : !albc.equals(alcp.n())) {
                                                            onClickListener = this.s;
                                                            if (onClickListener == null ? alcp.s() != null : !onClickListener.equals(alcp.s())) {
                                                                alcj alcj = this.t;
                                                                if (alcj == null ? alcp.t() == null : alcj.equals(alcp.t())) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (this.c) {
            i = 1231;
        }
        i2 = (i2 ^ i) * 1000003;
        View view = this.d;
        int i3 = 0;
        i2 = (i2 ^ (view != null ? view.hashCode() : 0)) * 1000003;
        CharSequence charSequence = this.e;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        charSequence = this.f;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        charSequence = this.g;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        OnClickListener onClickListener = this.h;
        i2 = (i2 ^ (onClickListener != null ? onClickListener.hashCode() : 0)) * 1000003;
        aphg aphg = this.i;
        i2 = (i2 ^ (aphg != null ? aphg.hashCode() : 0)) * 1000003;
        charSequence = this.j;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        onClickListener = this.k;
        i2 = (i2 ^ (onClickListener != null ? onClickListener.hashCode() : 0)) * 1000003;
        aphg = this.l;
        i2 = (((((((((((i2 ^ (aphg != null ? aphg.hashCode() : 0)) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003) ^ this.p) * 1000003) ^ Float.floatToIntBits(this.q)) * 1000003;
        albc albc = this.r;
        i2 = (i2 ^ (albc != null ? albc.hashCode() : 0)) * 1000003;
        onClickListener = this.s;
        i2 = (i2 ^ (onClickListener != null ? onClickListener.hashCode() : 0)) * 1000003;
        alcj alcj = this.t;
        if (alcj != null) {
            i3 = alcj.hashCode();
        }
        return i2 ^ i3;
    }

    /* synthetic */ albn(boolean z, int i, boolean z2, View view, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, OnClickListener onClickListener, aphg aphg, CharSequence charSequence4, OnClickListener onClickListener2, aphg aphg2, int i2, int i3, int i4, int i5, float f, albc albc, OnClickListener onClickListener3, alcj alcj) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = view;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = charSequence3;
        this.h = onClickListener;
        this.i = aphg;
        this.j = charSequence4;
        this.k = onClickListener2;
        this.l = aphg2;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = f;
        this.r = albc;
        this.s = onClickListener3;
        this.t = alcj;
    }
}
