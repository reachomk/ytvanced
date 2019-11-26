package defpackage;

import android.view.View.OnClickListener;

/* renamed from: fay */
final class fay extends fde {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final CharSequence e;
    private final CharSequence f;
    private final OnClickListener g;
    private final albc h;

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

    public final OnClickListener g() {
        return this.g;
    }

    public final albc n() {
        return this.h;
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
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 168) + length2) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("SnackbarBottomUiModel{rateLimited=");
        stringBuilder.append(z);
        stringBuilder.append(", shownOnFullscreen=");
        stringBuilder.append(z2);
        stringBuilder.append(", counterfactual=");
        stringBuilder.append(z3);
        stringBuilder.append(", duration=");
        stringBuilder.append(i);
        stringBuilder.append(", text=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", actionText=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", actionListener=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", transientUiCallback=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fde) {
            fde fde = (fde) obj;
            if (this.a == fde.a() && this.b == fde.b() && this.c == fde.c() && this.d == fde.d() && this.e.equals(fde.e())) {
                CharSequence charSequence = this.f;
                if (charSequence == null ? fde.f() != null : !charSequence.equals(fde.f())) {
                    OnClickListener onClickListener = this.g;
                    if (onClickListener == null ? fde.g() != null : !onClickListener.equals(fde.g())) {
                        albc albc = this.h;
                        if (albc == null ? fde.n() == null : albc.equals(fde.n())) {
                            return true;
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
        i2 = (((((i2 ^ i) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        CharSequence charSequence = this.f;
        int i3 = 0;
        i2 = (i2 ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        OnClickListener onClickListener = this.g;
        i2 = (i2 ^ (onClickListener != null ? onClickListener.hashCode() : 0)) * 1000003;
        albc albc = this.h;
        if (albc != null) {
            i3 = albc.hashCode();
        }
        return i2 ^ i3;
    }

    /* synthetic */ fay(boolean z, boolean z2, boolean z3, int i, CharSequence charSequence, CharSequence charSequence2, OnClickListener onClickListener, albc albc) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = onClickListener;
        this.h = albc;
    }
}
