package defpackage;

import android.app.ActivityOptions;
import android.os.Bundle;

/* renamed from: ms */
final class ms extends mt {
    private final ActivityOptions a;

    ms(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    public final Bundle a() {
        return this.a.toBundle();
    }
}
