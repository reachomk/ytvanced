package defpackage;

import android.content.Context;

/* renamed from: qph */
public final class qph {
    private static qph b = new qph();
    private qpi a = null;

    private final synchronized qpi b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new qpi(context);
        }
        return this.a;
    }

    public static qpi a(Context context) {
        return b.b(context);
    }
}
