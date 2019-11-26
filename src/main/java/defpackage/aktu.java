package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

/* renamed from: aktu */
final class aktu extends akue {
    public final TextView a;
    public final TextView b;
    public final View c;
    public final int d;
    public final int e;
    public final ColorStateList f;
    public final int g;
    public final ColorStateList h;
    public final int i;
    public final ColorStateList j;

    /* Access modifiers changed, original: final */
    public final TextView a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final TextView b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final View c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final int e() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final ColorStateList f() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final int g() {
        return this.g;
    }

    /* Access modifiers changed, original: final */
    public final ColorStateList h() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final int i() {
        return this.i;
    }

    /* Access modifiers changed, original: final */
    public final ColorStateList j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        String valueOf4 = String.valueOf(this.f);
        int i3 = this.g;
        String valueOf5 = String.valueOf(this.h);
        int i4 = this.i;
        String valueOf6 = String.valueOf(this.j);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 258) + length2) + length3) + length4) + valueOf5.length()) + valueOf6.length());
        stringBuilder.append("BasicColorPaletteDecorator{title=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", body=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", background=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", fallbackBackgroundColor=");
        stringBuilder.append(i);
        stringBuilder.append(", fallbackTitleColor=");
        stringBuilder.append(i2);
        stringBuilder.append(", fallbackTitleColorList=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", fallbackBodyColor=");
        stringBuilder.append(i3);
        stringBuilder.append(", fallbackBodyColorList=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", fallbackLinkColor=");
        stringBuilder.append(i4);
        stringBuilder.append(", fallbackLinkColorList=");
        stringBuilder.append(valueOf6);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akue) {
            akue akue = (akue) obj;
            TextView textView = this.a;
            if (textView == null ? akue.a() != null : !textView.equals(akue.a())) {
                textView = this.b;
                if (textView == null ? akue.b() != null : !textView.equals(akue.b())) {
                    View view = this.c;
                    if (view == null ? akue.c() != null : !view.equals(akue.c())) {
                        if (this.d == akue.d() && this.e == akue.e()) {
                            ColorStateList colorStateList = this.f;
                            if (colorStateList == null ? akue.f() != null : !colorStateList.equals(akue.f())) {
                                if (this.g == akue.g()) {
                                    colorStateList = this.h;
                                    if (colorStateList == null ? akue.h() != null : !colorStateList.equals(akue.h())) {
                                        if (this.i == akue.i()) {
                                            colorStateList = this.j;
                                            if (colorStateList == null ? akue.j() == null : colorStateList.equals(akue.j())) {
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
        return false;
    }

    public final int hashCode() {
        TextView textView = this.a;
        int i = 0;
        int hashCode = ((textView != null ? textView.hashCode() : 0) ^ 1000003) * 1000003;
        TextView textView2 = this.b;
        hashCode = (hashCode ^ (textView2 != null ? textView2.hashCode() : 0)) * 1000003;
        View view = this.c;
        hashCode = (((((hashCode ^ (view != null ? view.hashCode() : 0)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003;
        ColorStateList colorStateList = this.f;
        hashCode = (((hashCode ^ (colorStateList != null ? colorStateList.hashCode() : 0)) * 1000003) ^ this.g) * 1000003;
        colorStateList = this.h;
        hashCode = (((hashCode ^ (colorStateList != null ? colorStateList.hashCode() : 0)) * 1000003) ^ this.i) * 1000003;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 != null) {
            i = colorStateList2.hashCode();
        }
        return hashCode ^ i;
    }

    public final akug k() {
        return new aktx(this);
    }

    /* synthetic */ aktu(TextView textView, TextView textView2, View view, int i, int i2, ColorStateList colorStateList, int i3, ColorStateList colorStateList2, int i4, ColorStateList colorStateList3) {
        this.a = textView;
        this.b = textView2;
        this.c = view;
        this.d = i;
        this.e = i2;
        this.f = colorStateList;
        this.g = i3;
        this.h = colorStateList2;
        this.i = i4;
        this.j = colorStateList3;
    }
}
