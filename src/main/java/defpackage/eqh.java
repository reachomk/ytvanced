package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: eqh */
public final class eqh extends BaseAdapter {
    public final ArrayList a = new ArrayList();
    public final SparseArray b = new SparseArray();
    public final ArrayList c = new ArrayList();
    public int d = 1;
    private final /* synthetic */ eqf e;

    public eqh(eqf eqf) {
        this.e = eqf;
    }

    public final void notifyDataSetChanged() {
        this.c.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eqg eqg = (eqg) arrayList.get(i);
            if (eqg.b.a()) {
                this.c.add(eqg);
            }
        }
        super.notifyDataSetChanged();
    }

    public final int getCount() {
        return this.c.size();
    }

    public final Object getItem(int i) {
        return this.c.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((eqg) this.c.get(i)).a.intValue();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        eqg eqg = (eqg) this.c.get(i);
        if (eqg == null) {
            return null;
        }
        eqi eqi;
        if (view == null) {
            view = this.e.b.inflate(R.layout.contextual_menu_item_layout, viewGroup, false);
            eqi = new eqi(view);
            view.setTag(eqi);
        } else {
            eqi = (eqi) view.getTag();
        }
        if (eqi.a != null) {
            String b = eqg.b.b();
            if (TextUtils.isEmpty(b)) {
                eqi.a.setText(null);
                eqi.a.setVisibility(8);
            } else {
                eqi.a.setText(b);
                eqi.a.setVisibility(0);
            }
        }
        if (eqi.b != null) {
            eqi.b.setImageBitmap(null);
            eqi.b.setVisibility(8);
        }
        return view;
    }
}
