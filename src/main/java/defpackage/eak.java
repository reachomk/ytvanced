package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
import java.util.Map;

/* renamed from: eak */
public final class eak implements aaap {
    private final Activity a;

    public eak(Activity activity) {
        this.a = activity;
    }

    public final void a(apxu apxu, Map map) {
        Intent intent = new Intent();
        anxr access$000 = anxl.checkIsLite(VideoSelectedActionOuterClass$VideoSelectedAction.videoSelectedAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        intent.putExtra("videoSelectedAction", new ajrb((anze) b));
        this.a.setResult(-1, intent);
        this.a.finish();
    }
}
