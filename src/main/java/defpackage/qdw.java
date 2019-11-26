package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: qdw */
public final class qdw {
    public static final Status a = new Status(13);
    public static final pso b = new pso("Feedback.API", d, c);
    private static final psv c = new psv();
    private static final psq d = new qeh();

    public static qdy a(Context context) {
        return new qdy(context);
    }

    @Deprecated
    public static ptg a(ptd ptd, qdx qdx) {
        return ptd.a(new qek(ptd, qdx, ptd.a(), System.nanoTime()));
    }

    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    @Deprecated
    public static ptg b(ptd ptd, qdx qdx) {
        return ptd.a(new qej(ptd, qdx));
    }

    public static ptg a(ptd ptd, Bundle bundle, long j) {
        return ptd.a(new qem(ptd, bundle, j));
    }

    public static ptg a(ptd ptd, qdx qdx, Bundle bundle, long j) {
        return ptd.a(new qel(ptd, qdx, bundle, j));
    }
}
