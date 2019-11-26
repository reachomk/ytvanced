package defpackage;

import android.content.Context;

/* renamed from: bog */
public final class bog {
    public final String a;
    public final bod b;
    private final Context c;

    public bog(Context context, String str) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = new bod(this.c, str);
    }
}
