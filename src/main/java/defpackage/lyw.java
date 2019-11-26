package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.WatchWhileActivity;

/* renamed from: lyw */
public final class lyw implements fpt {
    private final Context a;

    public lyw(Context context) {
        this.a = context;
    }

    public final Class b() {
        return WatchWhileActivity.class;
    }

    public final Intent a() {
        return new Intent(this.a, WatchWhileActivity.class);
    }
}
