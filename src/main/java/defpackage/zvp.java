package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: zvp */
public final class zvp extends apa {
    private final Context c;
    private final boolean d;
    private List e = null;
    private zwh f;
    private zwj g;

    public zvp(Context context, boolean z) {
        this.c = (Context) amqw.a((Object) context);
        this.d = z;
    }

    public final long b(int i) {
        return (long) i;
    }

    public final void a(List list, zwh zwh, zwj zwj) {
        this.f = (zwh) amqw.a((Object) zwh);
        this.g = (zwj) amqw.a((Object) zwj);
        if (this.e != list) {
            this.e = (List) amqw.a((Object) list);
            aa_();
        }
    }

    public final int a() {
        List list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int a(int i) {
        return ((zud) this.e.get(i)).b.ordinal();
    }

    public final void a(aqj aqj, int i) {
        this.f.a(this.c, (zud) this.e.get(i), aqj, this.g);
    }

    public final aqj a(ViewGroup viewGroup, int i) {
        return this.f.a(this.c, viewGroup, zug.values()[i], this.d);
    }
}
