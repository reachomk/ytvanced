package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: yyl */
public final class yyl {
    public Runnable a = yyk.a;
    private final Context b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private CharSequence f;

    public yyl(Context context) {
        this.b = (Context) amqw.a((Object) context);
    }

    public final yyl a(int i) {
        this.c = this.b.getString(i);
        return this;
    }

    public final yyl b(int i) {
        this.d = this.b.getString(i);
        return this;
    }

    public final yyl a(int i, Runnable runnable) {
        this.e = this.b.getString(i);
        this.a = runnable;
        return this;
    }

    public final yyl c(int i) {
        this.f = this.b.getString(i);
        return this;
    }

    public final void a() {
        Builder builder = new Builder(this.b);
        if (!TextUtils.isEmpty(this.c)) {
            builder.setTitle(this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            builder.setMessage(this.d);
        }
        if (!TextUtils.isEmpty(this.e)) {
            builder.setPositiveButton(this.e, new yyn(this));
        }
        if (!TextUtils.isEmpty(this.f)) {
            builder.setNegativeButton(this.f, yym.a);
        }
        builder.show();
    }
}
