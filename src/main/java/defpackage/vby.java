package defpackage;

import android.content.Context;

/* renamed from: vby */
final /* synthetic */ class vby implements amro {
    private final tax a;
    private final Context b;

    vby(tax tax, Context context) {
        this.a = tax;
        this.b = context;
    }

    public final Object get() {
        try {
            return Boolean.valueOf(this.a.a(this.b).b());
        } catch (Exception unused) {
            return Boolean.valueOf(true);
        }
    }
}
