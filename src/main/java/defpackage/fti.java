package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint;

/* renamed from: fti */
public final class fti extends fvk {
    public fti(adqf adqf, airv airv, xoi xoi, Context context, aiuu aiuu) {
        super(adqf, airv, xoi, context, aiuu);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(apxu apxu) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint) obj;
        anxr access$0002 = anxl.checkIsLite(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d)) {
            return addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.c;
        }
        throw new aabf("AddToRemoteQueueEndpoint not present in the given Command.");
    }

    /* Access modifiers changed, original: protected|final */
    public final String b(apxu apxu) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint) obj;
        anxr access$0002 = anxl.checkIsLite(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d)) {
            return addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.b;
        }
        throw new aabf("AddToRemoteQueueEndpoint not present in the given Command.");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str) {
        adqe a = a();
        if (a != null && a.d() == 1) {
            a.c(str);
            xpr.a(this.b, (int) R.string.videos_added_to_tv_queue, 0);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(String str) {
        adqe a = a();
        if (a != null && a.d() == 1) {
            a().b(str);
            xpr.a(this.b, (int) R.string.video_added_to_tv_queue, 0);
        }
    }
}
