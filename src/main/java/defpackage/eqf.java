package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.google.android.youtube.R;
import java.util.WeakHashMap;

@Deprecated
/* renamed from: eqf */
public final class eqf implements OnClickListener, OnItemClickListener {
    public static final WeakHashMap a = new WeakHashMap();
    public final LayoutInflater b;
    public final eqh c;
    public eqn d;
    public final boolean e = true;
    private final Activity f;
    private final Resources g;
    private final aoa h;
    private View i;

    public eqf(Activity activity) {
        this.f = (Activity) amqw.a((Object) activity);
        this.b = activity.getLayoutInflater();
        this.g = activity.getResources();
        this.c = new eqh(this);
        this.h = new aoa(activity);
        this.h.f = (int) activity.getResources().getDimension(R.dimen.innertube_menu_width);
        aoa aoa = this.h;
        aoa.l = 1;
        aoa.h();
        this.h.a(this.c);
        this.h.n = this;
        a.put(this, null);
    }

    public final void onClick(View view) {
        if (this.e) {
            eqn eqn = this.d;
            if (eqn != null) {
                eqn.a(view.getTag());
            }
            this.c.notifyDataSetChanged();
            this.i = view;
            int a = xpr.a(this.f, this.c, null);
            float dimension = this.f.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp);
            this.h.f = (int) xpr.a(this.f, (float) a, dimension);
            aoa aoa = this.h;
            aoa.j = 8388661;
            aoa.m = view;
            aoa.f_();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        eqk c = ((eqg) this.c.c.get(i)).b.c();
        if (c != null) {
            view = this.i;
            if (view != null) {
                c.a(view.getTag());
                a();
            }
        }
    }

    public final int a(int i, eqk eqk) {
        return a(this.g.getString(i), eqk);
    }

    public final int a(String str, eqk eqk) {
        eqh eqh = this.c;
        int size = eqh.a.size();
        int i = eqh.d;
        eqh.d = i + 1;
        eqg eqg = new eqg(Integer.valueOf(i), str, eqk);
        eqh.a.add(size, eqg);
        eqh.b.put(eqg.a.intValue(), eqg);
        eqh.notifyDataSetChanged();
        return eqg.a.intValue();
    }

    public final void a() {
        if (this.i != null) {
            this.i = null;
            this.h.d();
        }
    }
}
