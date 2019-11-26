package defpackage;

import android.view.View.OnClickListener;

/* renamed from: fer */
final class fer extends fey {
    private CharSequence a;
    private arwh b;
    private amqp c = ampo.a;
    private amqp d = ampo.a;
    private amqp e = ampo.a;
    private int f;
    private int g;

    fer() {
    }

    public final fey a(CharSequence charSequence) {
        if (charSequence != null) {
            this.a = charSequence;
            return this;
        }
        throw new NullPointerException("Null text");
    }

    public final fey a(arwh arwh) {
        if (arwh != null) {
            this.b = arwh;
            return this;
        }
        throw new NullPointerException("Null iconType");
    }

    public final fey a(apxu apxu) {
        this.c = amqp.c(apxu);
        return this;
    }

    public final fey a(albc albc) {
        this.d = amqp.c(albc);
        return this;
    }

    public final fey a(OnClickListener onClickListener) {
        this.e = amqp.c(onClickListener);
        return this;
    }

    public final fez a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" text");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" iconType");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" position");
        }
        if (this.g == 0) {
            str = String.valueOf(str).concat(" behavior");
        }
        if (str.isEmpty()) {
            return new feo(this.a, this.b, this.f, this.g, this.c, this.d, this.e);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    public final fey a(int i) {
        if (i != 0) {
            this.f = i;
            return this;
        }
        throw new NullPointerException("Null position");
    }

    public final fey b(int i) {
        if (i != 0) {
            this.g = i;
            return this;
        }
        throw new NullPointerException("Null behavior");
    }
}
