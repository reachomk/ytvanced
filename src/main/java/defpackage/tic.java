package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: tic */
public final class tic implements thq {
    private static final Status a = new Status(0);
    private final qdy b;

    public final String a() {
        return "anonymous";
    }

    public final tev a(thu thu) {
        qdy qdy = this.b;
        qdx c = tic.c(thu);
        try {
            if (((Boolean) qeg.a.a()).booleanValue()) {
                qdy.b(new qeo(c));
                return new tfv(pti.a(a), tfw.a);
            }
        } catch (SecurityException e) {
            Log.e("fb_FeedbackClient", e.getMessage());
        }
        pzl.a(qdw.b(qdy.f, c));
        return new tfv(pti.a(a), tfw.a);
    }

    public final tev b(thu thu) {
        qdy qdy = this.b;
        pzl.a(qdw.a(qdy.f, tic.c(thu)));
        return new tfv(pti.a(a), tfw.a);
    }

    private static qdx c(thu thu) {
        return ((tie) thu).a;
    }

    /* synthetic */ tic(Context context) {
        this.b = new qdy(context);
    }
}
