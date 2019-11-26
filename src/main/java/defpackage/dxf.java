package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import java.util.Map;

/* renamed from: dxf */
public final class dxf implements aaap {
    private final Context a;

    public dxf(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final void a(apxu apxu, Map map) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        anxr access$000 = anxl.checkIsLite(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint) b;
        for (atwo atwo : androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.b) {
            intent.putExtra(atwo.d, atwo.b == 2 ? (String) atwo.c : "");
        }
        intent.setType(androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.c);
        this.a.startActivity(Intent.createChooser(intent, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.d));
    }
}
