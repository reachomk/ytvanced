package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.protos.youtube.api.innertube.EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
import java.util.Map;

/* renamed from: dye */
public final class dye implements aaap {
    public final xci a;
    private final Context b;
    private final wxd c;

    public dye(Context context, wxd wxd, xci xci) {
        this.b = context;
        this.c = wxd;
        this.a = xci;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        Context context = this.b;
        anxr access$000 = anxl.checkIsLite(EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.editVideoMetadataEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        obj = ((EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint) obj).b;
        anvu anvu = apxu.b;
        amqw.a(obj);
        Intent intent = new Intent(context, EditVideoActivity.class);
        intent.setAction("android.intent.action.EDIT");
        intent.putExtra("video_id", obj);
        if (!anvu.c()) {
            intent.putExtra("click_tracking_params", anvu.d());
        }
        this.c.a(intent, 0, new dyd(this));
    }
}
