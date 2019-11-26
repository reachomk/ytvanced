package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: eyi */
public class eyi {
    public final Drawable a;

    protected eyi(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        if (mutate != null) {
            drawable = mutate;
        }
        this.a = drawable;
    }

    public boolean a(eyi eyi) {
        throw null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
        stringBuilder.append("resId 0 drawable ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
