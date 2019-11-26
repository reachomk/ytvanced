package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;

/* renamed from: usg */
final class usg extends ArrayAdapter {
    public static final Object a = new Object();

    usg(Context context) {
        super(context, R.layout.channel_creation_gender_picker_item);
        add(a);
    }

    private static boolean a(View view) {
        return view != null && view.getClass().equals(View.class);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (getItem(i) != a) {
            if (usg.a(view)) {
                view = null;
            }
            return super.getDropDownView(i, view, viewGroup);
        } else if (usg.a(view)) {
            return view;
        } else {
            View view2 = new View(getContext());
            view2.setLayoutParams(new LayoutParams(-1, 0));
            view2.setVisibility(8);
            return view2;
        }
    }
}
