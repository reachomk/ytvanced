package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint;
import java.util.concurrent.Executor;

/* renamed from: hkn */
public final class hkn extends fja {
    public xhv ae;
    public aiuu af;
    public agwc ag;
    public hjx ah;
    public hsw ai;
    public xsc aj;
    public SharedPreferences ak;
    private String al;
    private acwp am;
    private Bundle an;
    private agvz ao;
    private hjv ap;

    public static fiw a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.autoOfflineVideosEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint = (AutoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint) b;
        int i = autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.a;
        Bundle bundle = null;
        if (!((i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0)) {
            bundle = new Bundle();
            anvf anvf = autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.c;
            if (anvf == null) {
                anvf = arml.f;
            }
            bundle.putByteArray("enabled_pref_empty_message", anvf.toByteArray());
            anvf = autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.d;
            if (anvf == null) {
                anvf = arml.f;
            }
            bundle.putByteArray("disabled_pref_empty_message", anvf.toByteArray());
            anvf = autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.e;
            if (anvf == null) {
                anvf = armr.d;
            }
            bundle.putByteArray("not_enough_space_empty_message_template", anvf.toByteArray());
        }
        String str = autoOfflineVideosEndpointOuterClass$AutoOfflineVideosEndpoint.b;
        Bundle b2 = fiw.b();
        b2.putString("video_list_id", str);
        b2.putInt("network_connectivity_requirement", 1);
        if (bundle != null) {
            b2.putBundle("offline_video_list_empty_messages_bundle", bundle);
        }
        return new fiw(hkn.class, b2);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        this.al = bundle.getString("video_list_id");
        this.am = (acwp) bundle.getParcelable("notification_logging_data");
        this.an = bundle.getBundle("offline_video_list_empty_messages_bundle");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.offline_video_list_fragment, viewGroup, false);
        ((hkm) xse.a(p())).a(this);
        acwp acwp = this.am;
        if (acwp != null) {
            hsw hsw = this.ai;
            acwp c = hsw.a.c();
            hsw.a.a(acwp);
            hsw.a.a(3, new acvs(acwc.MAIN_AUTO_OFFLINE_DOWNLOAD_COMPLETE_NOTIFICATION), null);
            hsw.a.a(c);
        }
        this.af.c = new aiuq(this.a, null);
        this.ao = this.ag.b();
        hjx hjx = this.ah;
        String str = this.al;
        Bundle bundle2 = this.an;
        Activity activity = (Activity) hjx.a((Activity) hjx.a.get(), 1);
        xci xci = (xci) hjx.a((xci) hjx.b.get(), 2);
        ahcn ahcn = (ahcn) hjx.a((ahcn) hjx.c.get(), 3);
        ahcd ahcd = (ahcd) hjx.a((ahcd) hjx.d.get(), 4);
        agwc agwc = (agwc) hjx.a((agwc) hjx.e.get(), 5);
        akkq akkq = (akkq) hjx.a((akkq) hjx.f.get(), 6);
        hjy hjy = (hjy) hjx.a((hjy) hjx.g.get(), 7);
        hjv hjv = r7;
        Executor executor = (Executor) hjx.a((Executor) hjx.h.get(), 8);
        hsy hsy = (hsy) hjx.a((hsy) hjx.i.get(), 9);
        hmc hmc = (hmc) hjx.a((hmc) hjx.j.get(), 10);
        hjx.a((hgy) hjx.k.get(), 11);
        hjx.a((xta) hjx.l.get(), 12);
        hjx.a((SharedPreferences) hjx.m.get(), 13);
        hjx.a((zzf) hjx.n.get(), 14);
        hjv hjv2 = new hjv(activity, xci, ahcn, ahcd, agwc, akkq, hjy, executor, hsy, hmc, (hmj) hjx.a((hmj) hjx.o.get(), 15), (akoe) hjx.a((akoe) hjx.p.get(), 16), (aaas) hjx.a((aaas) hjx.q.get(), 17), (zyw) hjx.a((zyw) hjx.r.get(), 18), (hqp) hjx.a((hqp) hjx.s.get(), 19), (hng) hjx.a((hng) hjx.t.get(), 20), (String) hjx.a(str, 21), bundle2);
        this.ap = hjv;
        hjv hjv3 = this.ap;
        hjv3.s = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
        hjv3.t = (ListView) inflate.findViewById(R.id.videos);
        hjv3.u = (TextView) inflate.findViewById(R.id.empty_message_text);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.playlist_header, hjv3.t, false);
        hjv3.t.addHeaderView(viewGroup2);
        hjy hjy2 = hjv3.f;
        str = hjv3.o;
        Activity activity2 = (Activity) hjy.a((Activity) hjy2.a.get(), 1);
        agwc agwc2 = (agwc) hjy.a((agwc) hjy2.b.get(), 2);
        aaas aaas = (aaas) hjy.a((aaas) hjy2.c.get(), 3);
        hjy.a((ffo) hjy2.d.get(), 4);
        hjv3.w = new hjw(activity2, agwc2, aaas, (hsy) hjy.a((hsy) hjy2.e.get(), 5), (fll) hjy.a((fll) hjy2.f.get(), 6), (ViewGroup) hjy.a(viewGroup2, 7), (String) hjy.a(str, 8));
        aknw aknw = new aknw();
        Context context = hjv3.a;
        View view = inflate;
        akox akox = r5;
        hmm hmm = new hmm(context, hjv3.b, hjv3.c, hjv3.d, hjv3.q, hjv3.e, null, hjv3.o, new eqe(context), hjv3.g, hjv3.h, hjv3.i, hjv3.k, hjv3.l, hjv3.m, hjv3.n);
        aknw.a(agqp.class, akox);
        akoc a = hjv3.j.a(aknw);
        hjv3.v = new akpk();
        a.a(hjv3.v);
        hjv3.t.setAdapter(a);
        return view;
    }

    public final void W_() {
        super.W_();
        Object obj = this.ap;
        obj.a();
        obj.b.a(obj);
        this.ak.edit().putLong(ebn.AUTO_OFFLINE_VIDEOS_PAGE_LAST_VISITED, this.aj.a()).apply();
    }

    public final void B() {
        super.B();
        if (this.ae.c()) {
            this.ao.l().a();
        }
    }

    public final void N_() {
        super.N_();
        hjv hjv = this.ap;
        hjv.b();
        hjv.b.b(hjv);
        hjv.w.b();
    }

    public final CharSequence Y() {
        return p().getString(R.string.auto_offline_videos_title);
    }
}
