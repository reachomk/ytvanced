package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: aldj */
public final class aldj implements aldp {
    public final Context a;
    public final aaas b;
    public final DialogInterface c;
    public final akoq d = new aldi(this);
    public final aldt e;
    public final aldx f;
    public final akpe g;
    public aldm h;
    public View i;
    public akpd j;
    public akpk k;
    public akpk l;
    public View m;
    public RecyclerView n;

    public aldj(Context context, aaas aaas, aldt aldt, aldx aldx, akpe akpe, DialogInterface dialogInterface, aldm aldm) {
        this.a = context;
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (DialogInterface) amqw.a((Object) dialogInterface);
        this.h = (aldm) amqw.a((Object) aldm);
        this.e = (aldt) amqw.a((Object) aldt);
        this.f = (aldx) amqw.a((Object) aldx);
        this.g = (akpe) amqw.a((Object) akpe);
    }

    public final void a() {
        View view = this.i;
        view.setMinimumWidth(view.getResources().getDimensionPixelSize(R.dimen.subscription_notification_dialog_min_width));
    }

    public final void a(axxt axxt, boolean z) {
        if (z) {
            aldm aldm = this.h;
            aldm.d = axxt;
            akpd akpd = this.j;
            axxl axxl = aldm.a;
            akpd.a(0, axxl != null ? axxl.b.size() : 0);
            this.l.a();
        }
    }

    public final boolean b() {
        axxt axxt = this.h.d;
        if (axxt == null) {
            return false;
        }
        return axxt.f;
    }

    public final boolean a(String str) {
        return this.h.e.contains(str);
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.h.e.add(str);
        } else {
            this.h.e.remove(str);
        }
    }

    public final boolean a(axxt axxt) {
        axxt axxt2 = this.h.d;
        if (axxt2 == null) {
            return false;
        }
        return axxt2.equals(axxt);
    }
}
