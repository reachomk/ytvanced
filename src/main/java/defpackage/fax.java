package defpackage;

import android.view.View.OnClickListener;

/* renamed from: fax */
final class fax extends fch {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final CharSequence e;
    private final CharSequence f;
    private final CharSequence g;
    private final OnClickListener h;
    private final CharSequence i;
    private final OnClickListener j;
    private final aygk k;
    private final int l;
    private final acwc m;
    private final albc n;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
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

    public final CharSequence i() {
        return this.i;
    }

    public final OnClickListener j() {
        return this.j;
    }

    public final aygk k() {
        return this.k;
    }

    public final int l() {
        return this.l;
    }

    public final acwc m() {
        return this.m;
    }

    public final albc n() {
        return this.n;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        String valueOf7 = String.valueOf(this.k);
        int i2 = this.l;
        String valueOf8 = String.valueOf(this.m);
        String valueOf9 = String.valueOf(this.n);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        int length6 = valueOf6.length();
        int length7 = valueOf7.length();
        StringBuilder stringBuilder = new StringBuilder(((((((((length + 262) + length2) + length3) + length4) + length5) + length6) + length7) + valueOf8.length()) + valueOf9.length());
        stringBuilder.append("MealbarBottomUiModel{rateLimited=");
        stringBuilder.append(z);
        stringBuilder.append(", shownOnFullscreen=");
        stringBuilder.append(z2);
        stringBuilder.append(", counterfactual=");
        stringBuilder.append(z3);
        stringBuilder.append(", duration=");
        stringBuilder.append(i);
        stringBuilder.append(", titleText=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", detailText=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", actionText=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", actionListener=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", dismissText=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", dismissListener=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", thumbnail=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", icon=");
        stringBuilder.append(i2);
        stringBuilder.append(", clientVeType=");
        stringBuilder.append(valueOf8);
        stringBuilder.append(", transientUiCallback=");
        stringBuilder.append(valueOf9);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fch) {
            fch fch = (fch) obj;
            if (this.a == fch.a() && this.b == fch.b() && this.c == fch.c() && this.d == fch.d()) {
                CharSequence charSequence = this.e;
                if (charSequence == null ? fch.e() != null : !charSequence.equals(fch.e())) {
                    charSequence = this.f;
                    if (charSequence == null ? fch.f() != null : !charSequence.equals(fch.f())) {
                        charSequence = this.g;
                        if (charSequence == null ? fch.g() != null : !charSequence.equals(fch.g())) {
                            OnClickListener onClickListener = this.h;
                            if (onClickListener == null ? fch.h() != null : !onClickListener.equals(fch.h())) {
                                charSequence = this.i;
                                if (charSequence == null ? fch.i() != null : !charSequence.equals(fch.i())) {
                                    onClickListener = this.j;
                                    if (onClickListener == null ? fch.j() != null : !onClickListener.equals(fch.j())) {
                                        aygk aygk = this.k;
                                        if (aygk == null ? fch.k() != null : !aygk.equals(fch.k())) {
                                            if (this.l == fch.l()) {
                                                acwc acwc = this.m;
                                                if (acwc == null ? fch.m() != null : !acwc.equals(fch.m())) {
                                                    albc albc = this.n;
                                                    if (albc == null ? fch.n() == null : albc.equals(fch.n())) {
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
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003;
        if (this.c) {
            i = 1231;
        }
        i2 = (((i2 ^ i) * 1000003) ^ this.d) * 1000003;
        CharSequence charSequence = this.e;
        int i3 = 0;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        charSequence = this.f;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        charSequence = this.g;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        OnClickListener onClickListener = this.h;
        i2 = (i2 ^ (onClickListener != null ? onClickListener.hashCode() : 0)) * 1000003;
        charSequence = this.i;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        onClickListener = this.j;
        i2 = (i2 ^ (onClickListener != null ? onClickListener.hashCode() : 0)) * 1000003;
        aygk aygk = this.k;
        i2 = (((i2 ^ (aygk != null ? aygk.hashCode() : 0)) * 1000003) ^ this.l) * 1000003;
        acwc acwc = this.m;
        i2 = (i2 ^ (acwc != null ? acwc.hashCode() : 0)) * 1000003;
        albc albc = this.n;
        if (albc != null) {
            i3 = albc.hashCode();
        }
        return i2 ^ i3;
    }

    /* synthetic */ fax(boolean z, boolean z2, boolean z3, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, OnClickListener onClickListener, CharSequence charSequence4, OnClickListener onClickListener2, aygk aygk, int i2, acwc acwc, albc albc) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = charSequence3;
        this.h = onClickListener;
        this.i = charSequence4;
        this.j = onClickListener2;
        this.k = aygk;
        this.l = i2;
        this.m = acwc;
        this.n = albc;
    }
}
