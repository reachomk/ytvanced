package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

/* renamed from: aktx */
final class aktx extends akug {
    private TextView a;
    private TextView b;
    private View c;
    private Integer d;
    private Integer e;
    private ColorStateList f;
    private Integer g;
    private ColorStateList h;
    private Integer i;
    private ColorStateList j;

    aktx() {
    }

    public final akug a(TextView textView) {
        this.a = textView;
        return this;
    }

    public final akug b(TextView textView) {
        this.b = textView;
        return this;
    }

    public final akug a(View view) {
        this.c = view;
        return this;
    }

    public final akug a() {
        this.d = Integer.valueOf(0);
        return this;
    }

    public final akug a(int i) {
        this.e = Integer.valueOf(i);
        return this;
    }

    public final akug a(ColorStateList colorStateList) {
        this.f = colorStateList;
        return this;
    }

    public final akug b(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public final akug b(ColorStateList colorStateList) {
        this.h = colorStateList;
        return this;
    }

    public final akug c(int i) {
        this.i = Integer.valueOf(i);
        return this;
    }

    public final akug c(ColorStateList colorStateList) {
        this.j = colorStateList;
        return this;
    }

    public final akue b() {
        String str = "";
        if (this.d == null) {
            str = str.concat(" fallbackBackgroundColor");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" fallbackTitleColor");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" fallbackBodyColor");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" fallbackLinkColor");
        }
        if (str.isEmpty()) {
            return new aktu(this.a, this.b, this.c, this.d.intValue(), this.e.intValue(), this.f, this.g.intValue(), this.h, this.i.intValue(), this.j);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ aktx(akue akue) {
        aktu aktu = (aktu) akue;
        this.a = aktu.a;
        this.b = aktu.b;
        this.c = aktu.c;
        this.d = Integer.valueOf(aktu.d);
        this.e = Integer.valueOf(aktu.e);
        this.f = aktu.f;
        this.g = Integer.valueOf(aktu.g);
        this.h = aktu.h;
        this.i = Integer.valueOf(aktu.i);
        this.j = aktu.j;
    }
}
