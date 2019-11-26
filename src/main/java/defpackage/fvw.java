package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fvw */
public final class fvw implements aaap {
    public final Context a;
    public final xci b;
    private final abju c;
    private final Executor d;
    private final alyf e;
    private AlertDialog f;

    public fvw(Context context, abju abju, xci xci, Executor executor, alyf alyf) {
        this.a = context;
        this.c = abju;
        this.b = xci;
        this.d = executor;
        this.e = alyf;
    }

    public final void a(apxu apxu, Map map) {
        if (this.f == null) {
            this.f = new Builder(this.a).setMessage(R.string.delete_upload_dialog_confirmation).setNegativeButton(R.string.delete_upload_dialog_negative, null).create();
        }
        this.f.setButton(-1, this.a.getString(R.string.delete_upload_dialog_positive), new fvv(this, apxu, map));
        this.f.show();
    }

    public final void b(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
        apxu.a(access$000);
        amqw.b(apxu.h.a(access$000.d));
        access$000 = anxl.checkIsLite(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        if (((DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) obj).c.isEmpty()) {
            a();
            return;
        }
        access$000 = anxl.checkIsLite(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
        apxu.a(access$000);
        b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) obj;
        amqw.b(deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.c.isEmpty() ^ 1);
        alyf alyf = this.e;
        anjv a = anjf.a(new alyi(alyf, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.c), alyf.b);
        anjf.a(a, new alyr(alyf), aniv.a);
        xan.a(a, aniv.a, new fvy(this), new fvx(this, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint, apxu, map));
    }

    public final void c(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) obj;
        amqw.b(deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.b.isEmpty() ^ 1);
        aaml a = this.c.a();
        a.a = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.b;
        if (apxu.b.c()) {
            a.g();
        } else {
            a.a(apxu.b);
        }
        xan.a(this.c.a(a), this.d, new fwa(this), new fvz(this, apxu, map));
    }

    public final void a() {
        xpr.a(this.a, (int) R.string.delete_inprogress_upload_failed, 1);
    }
}
