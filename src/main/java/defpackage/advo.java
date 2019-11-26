package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.smartpairing.PairWithTvActivity;
import com.google.android.youtube.R;

/* renamed from: advo */
public final class advo extends nf {
    public advb a;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_pair_with_tv_fragment, viewGroup, false);
        advq a = ((advt) xse.a(M_())).a(new advs(inflate, new advr(this), null, null));
        a.a(this);
        ((PairWithTvActivity) p()).a(a);
        return inflate;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        x();
    }

    public final void W_() {
        super.W_();
        advb advb = this.a;
        nv nvVar = this.v;
        advb.d.d();
        if (advb.i == null) {
            advb.i = new advn(advb);
        }
        advb.h.registerReceiver(advb.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        advb.b();
        advb.b.a(advb.c, advb.k, 1);
        advb.f.a = nvVar;
        advb.a();
    }

    public final void N_() {
        super.N_();
        advb advb = this.a;
        advb.h.unregisterReceiver(advb.i);
        advb.b.a(advb.k);
        advb.d.e();
        advb.f.a = null;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        advb advb = this.a;
        menuInflater.inflate(R.menu.pair_with_tv_fragment, menu);
        if (advb.e) {
            MenuItem findItem = menu.findItem(R.id.voice);
            findItem.setVisible(true);
            findItem.setOnMenuItemClickListener(new advj(advb));
        }
    }
}
