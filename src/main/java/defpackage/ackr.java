package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;

/* renamed from: ackr */
public final class ackr implements xcp {
    private final /* synthetic */ LiveCreationActivity a;

    public ackr(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{uyw.class, zye.class};
        } else if (i == 0) {
            int ordinal = ((uyw) obj).a.ordinal();
            if (ordinal != 1 && ordinal != 2) {
                return null;
            }
            if (this.a.o.a()) {
                this.a.o();
                return null;
            }
            xpr.a(this.a, (int) R.string.lc_not_signed_in, 0);
            this.a.finish();
            return null;
        } else if (i == 1) {
            avls avls = ((zye) obj).a;
            if (avls == null || (avls.a & 1) == 0) {
                return null;
            }
            Context context = this.a;
            arml arml = avls.b;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(context, ajqy.a(arml), 0);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
