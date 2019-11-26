package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: acpc */
final class acpc extends apa {
    private final Context c;
    private final List d;

    acpc(Context context, List list) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (List) amqw.a((Object) list);
    }

    public final int a() {
        return this.d.size();
    }
}
