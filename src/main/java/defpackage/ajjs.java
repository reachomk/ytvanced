package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: ajjs */
final /* synthetic */ class ajjs implements ajjt {
    private final String a;

    ajjs(String str) {
        this.a = str;
    }

    public final Typeface a(Context context) {
        return Typeface.createFromAsset(context.getAssets(), this.a);
    }
}
