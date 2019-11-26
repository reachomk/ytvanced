package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;

/* renamed from: uff */
public abstract class uff extends ArrayAdapter {
    public uff(Context context) {
        super(context, R.layout.bottom_sheet_list_item);
    }

    public abstract Object a(int i, View view);

    public abstract void a(int i, Object obj);

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ufg ufg = (ufg) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(ufg.c(), viewGroup, false);
            view.setTag(a(i, view));
        }
        a(i, view.getTag());
        return view;
    }

    public final boolean isEnabled(int i) {
        return ((ufg) getItem(i)).b();
    }
}
