package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: wfa */
public final class wfa implements OnClickListener {
    public final aoa a;
    public wfb b;
    public Map c;
    private final Context d;
    private final View e;
    private final akvz f;
    private final akpk g;
    private final akoe h;
    private boolean i;

    public wfa(Context context, akvz akvz, akoe akoe, View view) {
        Context context2 = (Context) amqw.a((Object) context);
        akvz = (akvz) amqw.a((Object) akvz);
        akoe = (akoe) amqw.a((Object) akoe);
        view = (View) amqw.a((Object) view);
        akpk akpk = new akpk();
        aoa aoa = new aoa(context);
        this.d = context2;
        this.f = akvz;
        this.e = view;
        this.h = akoe;
        this.g = akpk;
        this.a = aoa;
        view.setVisibility(8);
    }

    public final void a(axqn axqn) {
        this.a.d();
        this.g.clear();
        this.e.setTag(R.id.sort_menu_anchor_model, axqn);
        if (axqn != null && axqn.b.size() > 0) {
            CharSequence charSequence;
            if (!this.i) {
                this.i = true;
                this.a.f = (int) this.d.getResources().getDimension(R.dimen.sort_menu_width);
                aoa aoa = this.a;
                aoa.l = 1;
                aoa.h();
                this.e.setOnClickListener(this);
            }
            ListAdapter a = this.h.a((akpb) this.f.get());
            a.a(this.g);
            a.a(new wfc(this, axqn));
            this.a.a(a);
            this.e.setVisibility(0);
            View view = this.e;
            if ((axqn.a & 4) != 0) {
                aodx aodx = axqn.e;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                charSequence = aodv.b;
            } else {
                charSequence = null;
            }
            view.setContentDescription(charSequence);
            return;
        }
        this.e.setVisibility(8);
    }

    public final void onClick(View view) {
        this.g.clear();
        axqn axqn = (axqn) this.e.getTag(R.id.sort_menu_anchor_model);
        int i = -1;
        for (int i2 = 0; i2 < axqn.b.size(); i2++) {
            axql axql = (axql) axqn.b.get(i2);
            this.g.add(axql);
            if (axql.f) {
                i = i2;
            }
        }
        aoa aoa = this.a;
        aoa.j = 8388661;
        aoa.m = this.e;
        aoa.f_();
        if (i > 0) {
            this.a.e(i);
        }
    }
}
