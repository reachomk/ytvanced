package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;

/* renamed from: hir */
public final class hir implements xcp {
    private final TextView A;
    private final FrameLayout B;
    private final OfflineArrowView C;
    public final iml a;
    public final ahcd b;
    public final ffp c;
    public final agvx d;
    public final String e;
    public final flj f;
    public final View g;
    public agqi h;
    public Boolean i;
    public boolean j;
    public boolean k;
    private final Activity l;
    private final akkq m;
    private final hnb n;
    private final ImageView o;
    private final TextView p;
    private final TextView q;
    private final TextView r;
    private final TextView s;
    private final ImageView t;
    private final ImageView u;
    private final ImageView v;
    private final TextView w;
    private final LinearLayout x;
    private final PlaylistHeaderActionBarView y;
    private final TextView z;

    public hir(Activity activity, akkq akkq, iml iml, ahcd ahcd, fll fll, hna hna, ekg ekg, agvx agvx, acvx acvx, auac auac, ViewGroup viewGroup, String str, boolean z) {
        agvx agvx2 = agvx;
        ViewGroup viewGroup2 = viewGroup;
        String str2 = str;
        this.l = activity;
        this.m = akkq;
        this.a = iml;
        this.b = ahcd;
        this.c = ffo.a(str2, activity.getString(R.string.accessibility_playlist_play_all));
        this.d = agvx2;
        this.e = xvd.a(str);
        this.f = fll.a((FloatingActionButton) viewGroup2.findViewById(R.id.playlist_fab));
        amqw.a((Object) viewGroup);
        this.g = viewGroup2.findViewById(R.id.thumbnail_layout);
        View view = this.g;
        this.o = view != null ? (ImageView) view.findViewById(R.id.thumbnail) : null;
        this.p = (TextView) viewGroup2.findViewById(R.id.playlist_title);
        this.q = (TextView) viewGroup2.findViewById(R.id.playlist_channel);
        this.r = (TextView) viewGroup2.findViewById(R.id.playlist_description);
        this.s = (TextView) viewGroup2.findViewById(R.id.playlist_size);
        this.t = (ImageView) viewGroup2.findViewById(R.id.private_playlist_indicator);
        this.u = (ImageView) viewGroup2.findViewById(R.id.like_button);
        this.v = (ImageView) viewGroup2.findViewById(R.id.share_button);
        this.w = (TextView) viewGroup2.findViewById(R.id.offline_sync_button);
        this.x = (LinearLayout) viewGroup2.findViewById(R.id.playlist_data);
        this.y = (PlaylistHeaderActionBarView) viewGroup2.findViewById(R.id.actions_bar);
        this.z = (TextView) viewGroup2.findViewById(R.id.playlist_tvshow_metadata);
        this.A = (TextView) viewGroup2.findViewById(R.id.action_button);
        this.B = (FrameLayout) viewGroup2.findViewById(R.id.footer);
        this.C = (OfflineArrowView) viewGroup2.findViewById(R.id.offline_button);
        boolean z2 = true;
        this.n = hna.a(str2, this.C, true, ekg.a(str, null, new hiq(this), new hit(this), acvx));
        if (z) {
            this.x.setPaddingRelative(this.l.getResources().getDimensionPixelSize(R.dimen.start_end_padding), this.x.getPaddingTop(), this.x.getPaddingEnd(), this.x.getPaddingBottom());
            a(this.y, R.dimen.playlist_header_action_bar_start_padding_compact);
            a(this.z, R.dimen.start_end_padding);
            a(this.r, R.dimen.start_end_padding);
            a(this.A, R.dimen.start_end_padding);
            a(this.B, R.dimen.start_end_padding);
        }
        viewGroup2.findViewById(R.id.edit_button).setVisibility(8);
        viewGroup2.findViewById(R.id.shuffle_button).setVisibility(8);
        if (auac != auac.LIKE) {
            z2 = false;
        }
        a(z2);
        this.u.setEnabled(false);
        xpr.a(this.v, false);
        this.u.setOnClickListener(new his(this));
        this.v.setOnClickListener(new hiv(this));
        this.w.setOnClickListener(new hiu(this));
        agqh f = agvx2.f(str2);
        if (f != null) {
            a(f.a);
            b();
        }
        this.t.setImageResource(R.drawable.quantum_ic_lock_grey600_24);
    }

    private final void a(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).setMarginStart(this.l.getResources().getDimensionPixelSize(i));
        }
    }

    public final void a() {
        this.f.a(null);
    }

    public final void a(agqi agqi) {
        this.k = true;
        this.h = agqi;
        this.p.setText(agqi.b);
        TextView textView = this.q;
        agpy agpy = agqi.c;
        xpr.a(textView, agpy != null ? agpy.b : null);
        xpr.a(this.r, null);
        textView = this.s;
        Resources resources = this.l.getResources();
        int i = agqi.e;
        Object[] objArr = new Object[1];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        textView.setText(resources.getQuantityString(R.plurals.playlist_size, i, objArr));
        if (!(this.o == null || agqi.a() == null)) {
            this.m.b(agqi.a(), wxc.a(this.l, new hix(this, this.o)));
        }
        this.u.setEnabled(true);
        View view = this.u;
        agpy = agqi.c;
        if (!(agpy == null || agpy.e)) {
            z = true;
        }
        xpr.a(view, z);
        xpr.a(this.v, 1 ^ agqi.g);
        xpr.a(this.t, agqi.g);
    }

    public final void b() {
        this.n.a();
        int i = this.d.i(this.e);
        if (this.w != null) {
            CharSequence quantityString;
            if (i > 0) {
                quantityString = this.l.getResources().getQuantityString(R.plurals.download_new_videos_button_text, i, new Object[]{Integer.valueOf(i)});
            } else {
                quantityString = null;
            }
            xpr.a(this.w, quantityString);
        }
    }

    private final void a(boolean z) {
        this.j = z;
        this.u.setSelected(z);
    }

    public final void a(Boolean bool) {
        this.i = bool;
        hnb hnb = this.n;
        hnb.b = bool;
        hnb.a();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        boolean z = true;
        Class[] clsArr = null;
        switch (i) {
            case -1:
                clsArr = new Class[]{fie.class, agkx.class, agla.class, agkz.class, aglb.class, agle.class, agld.class};
                break;
            case 0:
                fie fie = (fie) obj;
                agqi agqi = this.h;
                if (agqi != null && agqi.a.equals(fie.a)) {
                    if (fie.b != auac.LIKE) {
                        z = false;
                    }
                    a(z);
                    return null;
                }
            case 1:
                if (((agkx) obj).a.equals(this.e)) {
                    b();
                    return null;
                }
                break;
            case 2:
                if (((agla) obj).a.equals(this.e)) {
                    b();
                    return null;
                }
                break;
            case 3:
                if (((agkz) obj).a.equals(this.e)) {
                    b();
                    return null;
                }
                break;
            case 4:
                if (((aglb) obj).a.a().equals(this.e)) {
                    b();
                    return null;
                }
                break;
            case 5:
                if (((agle) obj).a.equals(this.e)) {
                    b();
                    return null;
                }
                break;
            case 6:
                agld agld = (agld) obj;
                a(null);
                agqh agqh = agld.a;
                if (agqh.a().equals(this.e)) {
                    a(agqh.a);
                    b();
                    return null;
                }
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
