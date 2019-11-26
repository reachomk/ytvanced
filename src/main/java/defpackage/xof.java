package defpackage;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

/* renamed from: xof */
public final class xof {
    public final Rect a;
    public final List b;

    static xof a() {
        return new xof(new Rect(), Collections.emptyList());
    }

    xof(Rect rect, List list) {
        this.a = (Rect) amqw.a((Object) rect);
        this.b = (List) amqw.a((Object) list);
    }

    public final int b() {
        return this.a.top;
    }
}
