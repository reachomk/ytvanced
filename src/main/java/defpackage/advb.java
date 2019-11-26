package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: advb */
public final class advb {
    private ConnectivityManager A;
    private bbs B;
    private final Runnable C = new advd(this);
    private final Handler D;
    public final advm a;
    public final bbb b;
    public final baz c;
    public final adgw d;
    public final boolean e;
    public final adfy f;
    public final acvx g;
    public final Context h;
    public BroadcastReceiver i;
    public boolean j;
    public final bbe k = new advk(this);
    private final adfq l;
    private final adqc m;
    private final xsc n;
    private long o;
    private final ScrollView p;
    private final TextView q;
    private final LinearLayout r;
    private final List s;
    private final OnClickListener t;
    private final View u;
    private final TextView v;
    private final TextView w;
    private final View x;
    private final View y;
    private final View z;

    public advb(bbb bbb, baz baz, adgw adgw, adfq adfq, adqc adqc, xsc xsc, advm advm, View view, acvx acvx, boolean z, adfy adfy) {
        this.b = bbb;
        this.c = baz;
        this.d = adgw;
        this.l = adfq;
        this.m = adqc;
        this.n = xsc;
        this.a = advm;
        this.e = z;
        this.f = adfy;
        this.h = view.getContext();
        this.D = new Handler(Looper.getMainLooper());
        this.g = acvx;
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(MdxPairingEndpointOuterClass.mdxPairingEndpoint, autr.a);
        this.g.a(acwl.A, (apxu) ((anxl) apxx.build()), null);
        this.p = (ScrollView) view;
        this.q = (TextView) view.findViewById(R.id.header);
        this.r = (LinearLayout) view.findViewById(R.id.available_tv_container);
        this.s = new ArrayList(10);
        this.t = new advc(this, adfy, adgw);
        this.u = view.findViewById(R.id.no_tvs_found_title);
        this.v = (TextView) view.findViewById(R.id.no_tvs_found_summary);
        this.w = (TextView) view.findViewById(R.id.no_tvs_found_button);
        this.w.setOnClickListener(new advf(this, advm));
        this.x = view.findViewById(R.id.tv_code);
        this.x.setOnClickListener(new adve(this, advm));
        this.y = view.findViewById(R.id.delete_tv_codes_separator);
        this.z = view.findViewById(R.id.delete_tv_codes_title);
        this.z.setOnClickListener(new advh(this, advm));
        view.findViewById(R.id.not_finding_tv_title).setOnClickListener(new advg(this, advm));
        this.g.b(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_GET_HELP_BUTTON, null);
    }

    public final void a(bbs bbs) {
        adgw adgw = this.d;
        amqw.a((Object) bbs);
        adgw.b(bbs, null);
        this.p.fullScroll(33);
    }

    public final void a() {
        long a = this.n.a();
        long j = a - this.o;
        if (j < 300) {
            this.D.removeCallbacks(this.C);
            this.D.postDelayed(this.C, 300 - j);
            return;
        }
        Object obj;
        this.o = a;
        List a2 = this.l.a();
        int size = a2.size();
        do {
            size--;
            if (size < 0) {
                obj = null;
                break;
            }
        } while (!((bbs) a2.get(size)).a());
        obj = (bbs) a2.remove(size);
        Collections.sort(a2, advi.a);
        int i = 0;
        if (obj != null) {
            a2.add(0, obj);
        }
        Resources resources = this.q.getResources();
        if (!a2.isEmpty()) {
            a(true);
            if (obj != null) {
                this.q.setText(Html.fromHtml(resources.getString(R.string.mdx_pref_pair_with_tv_header_connected, new Object[]{obj.d})));
                if (!amqq.a(this.B, obj)) {
                    xrn.a(this.h, this.q, resources.getString(R.string.mdx_pref_pair_with_tv_header_connected_content_description, new Object[]{obj.d}));
                }
            } else {
                this.q.setText(R.string.mdx_pref_pair_with_tv_header_normal);
                if (this.B != null) {
                    xrn.a(this.h, this.q, resources.getString(R.string.mdx_pref_pair_with_tv_header_disconnected_content_description, new Object[]{this.B.d}));
                }
            }
        } else if (this.j) {
            a(false);
            this.q.setText(R.string.mdx_pref_pair_with_tv_header_with_wifi);
            this.v.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_summary);
            this.w.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_button);
            this.g.b(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_GET_HELP_BUTTON, null);
        } else {
            a(false);
            this.q.setText(R.string.mdx_pref_pair_with_tv_header_no_wifi);
            this.v.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_no_wifi_summary);
            this.w.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_no_wifi_button);
            this.g.b(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_WI_FI_SETTINGS_BUTTON, null);
        }
        boolean isEmpty = this.m.c().isEmpty();
        int i2 = isEmpty ^ 1;
        int i3 = !isEmpty ? 0 : 8;
        this.y.setVisibility(i3);
        this.z.setVisibility(i3);
        if (i2 != 0) {
            this.g.b(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_DELETE_TV_CODES_BUTTON, null);
        }
        this.x.setVisibility(obj != null ? 8 : 0);
        if (obj == null) {
            this.g.b(acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_ENTER_TV_CODE_BUTTON, null);
        }
        this.B = obj;
        size = this.r.getChildCount();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            this.s.add(this.r.getChildAt(size));
        }
        this.r.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.h);
        i3 = 0;
        while (i3 < a2.size()) {
            View inflate;
            advp advp;
            acwc acwc;
            if (this.s.isEmpty()) {
                inflate = from.inflate(R.layout.mdx_pair_with_tv_row, this.r, i);
                advp = new advp(inflate, this.t);
                inflate.setTag(advp);
            } else {
                inflate = (View) this.s.remove(i);
                advp = (advp) inflate.getTag();
            }
            bbs bbs = (bbs) a2.get(i3);
            acvx acvx = this.g;
            bbs bbs2 = this.B;
            advp.b.setText(bbs.d);
            boolean a3 = bbs.a();
            int i4 = bbs.h;
            LayoutParams layoutParams = advp.a.getLayoutParams();
            Resources resources2 = advp.a.getResources();
            layoutParams.height = resources2.getDimensionPixelSize(!a3 ? R.dimen.mdx_pair_with_tv_row_height_unselected : R.dimen.mdx_pair_with_tv_row_height_selected);
            advp.a.setLayoutParams(layoutParams);
            advp.c.setVisibility(!a3 ? 8 : 0);
            if (a3) {
                acwc = acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_UNLINK_BUTTON;
            } else {
                acwc = acwc.MDX_SMART_PAIRING_PAIR_WITH_TV_LINK_BUTTON;
            }
            acvx.b(acwc, null);
            advp.d.setContentDescription(resources2.getString(!a3 ? R.string.mdx_pref_pair_with_tv_link_button_content_description : R.string.mdx_pref_pair_with_tv_unlink_button_content_description));
            advp.d.setTag(bbs);
            if (a3) {
                advp.d.setText(R.string.mdx_pref_pair_with_tv_unlink_button);
            } else {
                advp.d.setText(R.string.mdx_pref_pair_with_tv_link_button);
            }
            Object obj2 = ((a3 || bbs2 == null) && i4 != 1) ? null : 1;
            advp.d.setVisibility(obj2 == null ? 0 : 8);
            advp.e.setVisibility(i4 != 1 ? 8 : 0);
            this.r.addView(inflate);
            i3++;
            i = 0;
        }
    }

    private final void a(boolean z) {
        int a;
        int i = 0;
        if (z) {
            a = xwe.a(this.h, R.attr.ytThemedBlue, 0);
        } else {
            a = xwe.a(this.h, R.attr.ytStaticBrandRed, 0);
        }
        this.q.setBackgroundColor(a);
        this.r.setVisibility(!z ? 8 : 0);
        View view = this.u;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
        this.v.setVisibility(i);
        this.w.setVisibility(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        if (this.A == null) {
            this.A = (ConnectivityManager) this.h.getSystemService("connectivity");
        }
        NetworkInfo activeNetworkInfo = this.A.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            z = true;
        }
        this.j = z;
    }
}
