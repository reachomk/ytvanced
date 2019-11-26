package defpackage;

import android.content.Context;

/* renamed from: sum */
public final class sum implements syg {
    public final stw a = new stw(sul.a);
    public final Context b;
    public final boolean c;

    public sum(Context context, amqp amqp) {
        this.b = context;
        this.c = ((Boolean) amqp.a(Boolean.valueOf(false))).booleanValue();
    }

    public final syf a(bdhv bdhv, bdho bdho) {
        return new suo(this, aocf.toByteArray(bdhv), bdho != null ? aocf.toByteArray(bdho) : null);
    }
}
