package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: afxt */
public final class afxt implements wxx {
    private final Context a;

    public afxt(Context context) {
        this.a = context;
    }

    public final int a(Bundle bundle) {
        afxv.a(this.a, bundle.getString("notification_tag"), bundle.getInt("notification_id", 0));
        return 0;
    }
}
