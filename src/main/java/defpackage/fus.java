package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint;

/* renamed from: fus */
public final class fus extends fvk {
    public fus(adqf adqf, airv airv, xoi xoi, Context context, aiuu aiuu) {
        super(adqf, airv, xoi, context, aiuu);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(apxu apxu) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint) obj;
        anxr access$0002 = anxl.checkIsLite(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d)) {
            return insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.c;
        }
        throw new aabf("InsertInRemoteQueueEndpoint not present in the given Command.");
    }

    /* Access modifiers changed, original: protected|final */
    public final String b(apxu apxu) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint) obj;
        anxr access$0002 = anxl.checkIsLite(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d)) {
            return insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.b;
        }
        throw new aabf("InsertInRemoteQueueEndpoint not present in the given Command.");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str) {
        adqe a = a();
        if (a != null && a.d() == 1) {
            a.e(str);
            xpr.a(this.b, (int) R.string.videos_added_to_tv_queue, 0);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(String str) {
        adqe a = a();
        if (a != null && a.d() == 1) {
            a().d(str);
            xpr.a(this.b, (int) R.string.video_added_to_tv_queue, 0);
        }
    }
}
