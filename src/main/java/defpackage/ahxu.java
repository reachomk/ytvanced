package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import com.google.vr.sdk.base.HeadsetSelector.HeadsetInfo;
import java.util.List;

/* renamed from: ahxu */
public final class ahxu extends akyg implements OnItemClickListener {
    public static final String Z = ahxu.class.getSimpleName();
    public ahxs aa;
    private SharedPreferences ab;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final OnItemClickListener Y() {
        return this;
    }

    public final void a(View view, Bundle bundle) {
        this.ab = ((wwz) p().getApplication()).i().ox();
    }

    public final void W_() {
        super.W_();
        Context M_ = M_();
        List<HeadsetInfo> a = ahxp.a(M_, this.ab);
        amqw.a(a.size() >= 2);
        HeadsetInfo b = ahxp.b(M_, this.ab);
        akyj akyj = (akyj) this.aq;
        akyj.clear();
        for (HeadsetInfo headsetInfo : a) {
            ahxa ahxa = new ahxa(M_, headsetInfo);
            ahxa.a(headsetInfo.equals(b));
            akyj.add(ahxa);
        }
        akyj.notifyDataSetChanged();
    }

    /* Access modifiers changed, original: protected|final */
    public final String X() {
        return a((int) R.string.vr_pick_different_viewer_title);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ahxp.a(M_(), this.ab, ((ahxa) ((akyj) this.aq).getItem(i)).a);
        ahxs ahxs = this.aa;
        if (ahxs != null) {
            ahxs.a();
        }
        dismiss();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        return new akyj(p(), X() == null);
    }
}
