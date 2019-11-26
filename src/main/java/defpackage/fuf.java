package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fuf */
public final class fuf implements aaap {
    public final Activity a;
    public final xci b;
    private final xoi c;
    private final Executor d;
    private final abju e;
    private AlertDialog f;

    public fuf(Activity activity, xci xci, abju abju, xoi xoi, Executor executor) {
        this.a = (Activity) amqw.a((Object) activity);
        this.b = (xci) amqw.a((Object) xci);
        this.e = (abju) amqw.a((Object) abju);
        this.c = (xoi) amqw.a((Object) xoi);
        this.d = executor;
    }

    public final void a(apxu apxu, Map map) {
        if (this.f == null) {
            this.f = new Builder(this.a).setMessage(R.string.delete_upload_confirmation).setNegativeButton(17039360, null).create();
        }
        this.f.setButton(-1, this.a.getString(17039370), new fui(this, apxu, map));
        this.f.show();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void b(apxu apxu, Map map) {
        Object obj;
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        aaml a = this.e.a();
        a.a(aabc.a(apxu));
        anxr access$000 = anxl.checkIsLite(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        a.a = ((DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) obj).b;
        anjv a2 = this.e.a(a);
        Executor executor = this.d;
        xoi xoi = this.c;
        xoi.getClass();
        xan.a(a2, executor, new fuh(xoi), new fuk(this, apxu, c), ankh.a);
    }
}
