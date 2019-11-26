package defpackage;

import android.view.View.OnClickListener;

/* renamed from: akwl */
public final class akwl {
    public final akux a;
    public final Object b;
    public final CharSequence c;
    public final OnClickListener d;
    public final akwm e;

    private akwl(akux akux, Object obj, CharSequence charSequence, OnClickListener onClickListener, akwm akwm) {
        this.a = akux;
        this.b = obj;
        this.c = charSequence;
        this.d = onClickListener;
        this.e = akwm;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("event", this.a);
        a.a("eventId", this.b);
        a.a("onRetry", this.e);
        a.a("onMore", this.d);
        a.a("moreLabel", this.c);
        return a.toString();
    }

    public static akwk a() {
        return new akwk();
    }

    public final akwl a(akux akux) {
        return new akwl(akux, this.b, this.c, this.d, this.e);
    }

    /* synthetic */ akwl(akux akux, Object obj, CharSequence charSequence, OnClickListener onClickListener, akwm akwm, byte b) {
        this(akux, obj, charSequence, onClickListener, akwm);
    }
}
