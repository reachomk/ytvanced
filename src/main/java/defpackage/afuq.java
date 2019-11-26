package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.protos.youtube.api.innertube.ShowSystemToastActionOuterClass$ShowSystemToastAction;
import java.util.Map;

/* renamed from: afuq */
public final class afuq implements aaap {
    private final Context a;

    public afuq(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowSystemToastActionOuterClass$ShowSystemToastAction.showSystemToastAction);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            arml arml;
            access$000 = anxl.checkIsLite(ShowSystemToastActionOuterClass$ShowSystemToastAction.showSystemToastAction);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ShowSystemToastActionOuterClass$ShowSystemToastAction showSystemToastActionOuterClass$ShowSystemToastAction = (ShowSystemToastActionOuterClass$ShowSystemToastAction) b;
            if ((showSystemToastActionOuterClass$ShowSystemToastAction.a & 1) != 0) {
                arml = showSystemToastActionOuterClass$ShowSystemToastAction.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            Spanned a = ajqy.a(arml);
            if (!TextUtils.isEmpty(a)) {
                Toast.makeText(this.a, a, 1).show();
                this.a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }
}
