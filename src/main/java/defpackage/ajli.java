package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: ajli */
final /* synthetic */ class ajli implements bcaa {
    private final Context a;
    private final Class b;

    ajli(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    public final Object get() {
        Context context = this.a;
        return new wq(context, "YouTube playerlib", new ComponentName(context.getPackageName(), this.b.getName()), null);
    }
}
