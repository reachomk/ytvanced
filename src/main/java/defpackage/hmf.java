package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;

/* renamed from: hmf */
public final class hmf implements akot, xcp {
    public final PlaylistThumbnailView a;
    public agqi b;
    private final Resources c;
    private final akkl d;
    private final agvx e;
    private final xhv f;
    private final agvs g;
    private final eqf h;
    private final akou i;
    private final OnClickListener j;
    private final View k;
    private final TextView l = ((TextView) amqw.a((TextView) this.k.findViewById(R.id.title)));
    private final TextView m;
    private final TextView n;
    private final OfflineArrowView o;
    private final hmh p;
    private final View q;

    public hmf(Context context, akou akou, akkl akkl, agvx agvx, xhv xhv, agvs agvs, eqf eqf, aaas aaas) {
        amqw.a((Object) context);
        this.i = (akou) amqw.a((Object) akou);
        this.c = context.getResources();
        this.d = (akkl) amqw.a((Object) akkl);
        this.e = (agvx) amqw.a((Object) agvx);
        this.f = (xhv) amqw.a((Object) xhv);
        this.g = (agvs) amqw.a((Object) agvs);
        this.h = (eqf) amqw.a((Object) eqf);
        this.k = LayoutInflater.from(context).inflate(R.layout.offline_playlist_item, null);
        this.l.setMaxLines(2);
        this.m = (TextView) amqw.a((TextView) this.k.findViewById(R.id.owner));
        this.n = (TextView) amqw.a((TextView) this.k.findViewById(R.id.details));
        this.a = (PlaylistThumbnailView) amqw.a((PlaylistThumbnailView) this.k.findViewById(R.id.playlist_thumbnail));
        this.p = new hmh(this);
        this.o = (OfflineArrowView) this.k.findViewById(R.id.offline_arrow);
        this.q = this.k.findViewById(R.id.contextual_menu_anchor);
        akou.a(this.k);
        this.j = new hme(this, aaas);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.i.a();
    }

    private final void a(agqh agqh) {
        Object obj;
        int i = R.attr.ytTextSecondary;
        int i2 = 1;
        if (agqh == null || agqh.e()) {
            this.n.setText(this.c.getQuantityString(R.plurals.playlist_size, this.b.e, new Object[]{Integer.valueOf(this.b.e)}));
            this.a.a(true);
            this.o.b();
            this.o.setVisibility(8);
            obj = 1;
        } else {
            float f;
            String.valueOf(this.b.a).length();
            if (agqh.b()) {
                this.n.setText(R.string.offline_playlist_processing);
                obj = null;
                i2 = 0;
                f = 0.0f;
            } else {
                f = ((float) agqh.d()) / ((float) agqh.c());
                this.n.setText(this.c.getQuantityString(R.plurals.playlist_size, agqh.a.e, new Object[]{Integer.valueOf(agqh.a.e)}));
                boolean c = this.f.c();
                int i3 = c ^ 1;
                Object obj2 = (this.f.e() || !this.g.j()) ? null : 1;
                if (i3 == 0 && obj2 == null) {
                    obj = 1;
                } else {
                    this.n.setText(!c ? R.string.offline_waiting_for_network : R.string.offline_waiting_for_wifi);
                    obj = 1;
                    i = R.attr.ytTextPrimary;
                    i2 = 0;
                }
            }
            if (i2 != 0) {
                this.o.a();
            } else {
                this.o.b();
            }
            this.a.a(false);
            this.o.setVisibility(0);
            this.o.c((int) (Math.min(f, 1.0f) * 100.0f));
        }
        TextView textView = this.n;
        textView.setTextColor(xwe.a(textView.getContext(), i, 0));
        this.i.a(obj != null ? this.j : null);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        agqi agqi = (agqi) obj;
        this.b = agqi;
        this.l.setText(agqi.b);
        TextView textView = this.m;
        agpy agpy = agqi.c;
        xpr.a(textView, agpy != null ? agpy.b : null);
        this.a.b.setText(Integer.toString(agqi.e));
        if (agqi.a() != null) {
            xnb.a(this.d, agqi.a(), this.a.a, this.p);
        } else {
            this.a.a.setImageDrawable(null);
        }
        eqm.a(this.h, this.q, agqi);
        agqh f = this.e.f(agqi.a);
        if (f != null) {
            a(f);
        }
        this.i.a(akor);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{agla.class, aglb.class};
        } else if (i == 0) {
            if (this.b.a.equals(((agla) obj).a)) {
                a(null);
                return null;
            }
        } else if (i == 1) {
            agqh agqh = ((aglb) obj).a;
            if (this.b.a.equals(agqh.a.a)) {
                a(agqh);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
