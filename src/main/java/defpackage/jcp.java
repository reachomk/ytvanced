package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: jcp */
public final class jcp extends ArrayAdapter {
    public String a;

    public jcp(Context context, List list) {
        super(context, R.layout.debug_force_innertube_capabilities_single_feature, list);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        jcs jcs;
        Object[] objArr = null;
        if (view == null) {
            view = View.inflate(getContext(), R.layout.debug_force_innertube_capabilities_single_feature, null);
            jcs = new jcs(view);
            view.setTag(jcs);
        } else {
            jcs = (jcs) view.getTag();
        }
        jcq jcq = (jcq) getItem(i);
        String str = this.a;
        if (jdm.a) {
            jdl jdl = (jdl) jdm.b.get(str);
            if (jdl != null) {
                String[] strArr = jdl.b;
                if (strArr == null || strArr.length != jdl.a.keySet().size()) {
                    jdl.b = (String[]) jdl.a.keySet().toArray(new String[jdl.a.keySet().size()]);
                }
                objArr = jdl.b;
            }
        }
        jcs.e = jcq;
        jcs.a.clear();
        jcs.c.setEnabled(true);
        jcs.c.setFocusable(true);
        jcs.c.setFocusableInTouchMode(true);
        jcs.d.setEnabled(true);
        jcs.d.setVisibility(0);
        jcs.b.setText(jcq.b ? "Feature (Forced Supported)" : "Feature (Forced Disabled)");
        jcs.c.setText(jcs.e.c);
        jcs.a.addAll(objArr);
        if (jcs.e.d) {
            jcs.a();
        }
        return view;
    }
}
