package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: vuf */
public final class vuf implements aitl {
    private final bcaa a;
    private final Context b;

    public vuf(bcaa bcaa, Context context) {
        this.a = bcaa;
        this.b = context;
    }

    public final aitj a() {
        if (((vtx) this.a.get()).c != 1) {
            return null;
        }
        return aitj.f().a(false).a(0).b(0).a(PendingIntent.getBroadcast(this.b, 0, new Intent(null), 0)).a().b();
    }
}
