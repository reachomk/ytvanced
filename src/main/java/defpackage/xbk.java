package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;

/* renamed from: xbk */
public class xbk extends xbw {
    private amul b;

    public xbk(Context context, String str, List list, int i) {
        super((Context) amqw.a((Object) context), str, ((List) amqw.a((Object) list)).size());
        this.b = amul.a((Collection) list);
        if (i > 0) {
            xbv.a(this, (long) i);
        }
    }

    public xbk(Context context, String str, List list) {
        this(context, str, list, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final xbt a(int i) {
        return (xbt) this.b.get(i);
    }
}
