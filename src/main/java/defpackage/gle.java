package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* renamed from: gle */
public final class gle implements aaap {
    private final Context a;

    public gle(Context context) {
        this.a = context;
    }

    public final void a(apxu apxu, Map map) {
        Intent intent = new Intent();
        intent.setClassName(this.a, "com.google.android.apps.youtube.app.extensions.reel.edit.activity.ReelCameraActivity");
        intent.putExtra("navigation_endpoint", apxu.toByteArray());
        this.a.startActivity(intent);
    }
}
