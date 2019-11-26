package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: zgb */
public final class zgb extends BaseAdapter {
    private final Context a;
    private final List b;
    private final zfi c;
    private final boolean d;
    private final akkl e;

    public zgb(Context context, List list, zfi zfi, akkl akkl, boolean z) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (List) amqw.a((Object) list);
        this.c = (zfi) amqw.a((Object) zfi);
        this.e = (akkl) amqw.a((Object) akkl);
        this.d = z;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        return this.b.size();
    }

    public final Object getItem(int i) {
        return this.b.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        zga zga;
        if (view != null) {
            zga = (zga) view;
        } else if (this.d) {
            zga = new zge(this.a, this.c, this.e);
        } else {
            zga = new zgc(this.a, this.c, this.e);
        }
        Object obj = (zet) getItem(i);
        if (!((zet) amqw.a(obj)).equals(zga.h)) {
            zga.h = obj;
            zga.b.setText(obj.a);
            zga.c.setText(obj.b);
            zga.d.setText(uix.a(zga.getContext(), (long) obj.c, false));
            TextView textView = zga.e;
            if (textView != null) {
                textView.setText(obj.f);
            }
            if (zga.a != null) {
                zga.f.a(obj.e, zga.g);
            }
            zga.a();
        }
        return zga;
    }
}
