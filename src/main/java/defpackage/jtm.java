package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: jtm */
public final class jtm {
    public static int a(Context context, zzl zzl) {
        if (xss.b(context) && foh.p(zzl)) {
            amqp a = foh.r(zzl).a(jtp.a);
            Object valueOf = Boolean.valueOf(false);
            if (((Boolean) a.a(valueOf)).booleanValue()) {
                return context.getResources().getInteger(R.integer.horizontal_shelf_num_columns_linear_grid_feed_tablet_default);
            }
            if (((Boolean) foh.r(zzl).a(jto.a).a(valueOf)).booleanValue()) {
                return context.getResources().getInteger(R.integer.horizontal_shelf_num_columns_linear_grid_feed_tablet_prominent);
            }
        }
        return context.getResources().getInteger(R.integer.horizontal_shelf_num_columns);
    }
}
