package defpackage;

import android.content.Context;

/* renamed from: amnn */
public final class amnn {
    public static Object a(Context context, Class cls) {
        context = context.getApplicationContext();
        if (context instanceof uhf) {
            try {
                return cls.cast(((uhf) context).b());
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        }
        String valueOf = String.valueOf(context.getClass());
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 63);
        stringBuilder.append("Given application context does not implement ComponentManager: ");
        stringBuilder.append(valueOf);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
