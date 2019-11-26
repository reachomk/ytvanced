package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: jco */
public final class jco extends ArrayAdapter {
    public String[] a;

    public jco(Context context, List list) {
        super(context, R.layout.debug_force_innertube_capabilities_single_capability, list);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        jcn jcn;
        if (view == null) {
            view = View.inflate(getContext(), R.layout.debug_force_innertube_capabilities_single_capability, null);
            jcn = new jcn(view, this.a);
            view.setTag(jcn);
        } else {
            jcn = (jcn) view.getTag();
        }
        jcm jcm = (jcm) getItem(i);
        jcn.h = jcm;
        jcn.a(true);
        jcn.b.setEnabled(true);
        jcn.b.setFocusable(true);
        jcn.b.setFocusableInTouchMode(true);
        jcn.c.setEnabled(true);
        jcn.c.setVisibility(0);
        jcn.d.setVisibility(8);
        jcn.e.setVisibility(8);
        jcn.f.setVisibility(8);
        jcn.g.setVisibility(8);
        jcn.b.setText(jcn.h.d);
        jcn.a.a(jcm.c);
        if (jcn.h.e) {
            jcn.a();
        }
        return view;
    }
}
