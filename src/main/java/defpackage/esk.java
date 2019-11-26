package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: esk */
public final class esk extends BaseAdapter implements SpinnerAdapter {
    public final Set a;
    public CharSequence b;
    public int c;
    private final ViewGroup d;
    private final Spinner e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final List j;
    private int k = -1;

    public esk(ViewGroup viewGroup, Spinner spinner, int i, int i2, int i3) {
        this.d = viewGroup;
        this.e = spinner;
        this.f = i;
        this.g = i2;
        this.h = R.layout.sort_filter_item;
        this.i = i3;
        this.j = new ArrayList();
        this.a = new HashSet();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Boolean valueOf = Boolean.valueOf(true);
        int i2 = 0;
        if (!esk.a(view, R.id.spinner_dropdown_item_view, valueOf)) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.h, viewGroup, false);
            view.setTag(R.id.spinner_dropdown_item_view, valueOf);
        }
        esm esm = (esm) this.j.get(i);
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (esm.b()) {
            textView.setBackground(new ColorDrawable(xwe.a(this.d.getContext(), R.attr.yt10PercentLayer, 0)));
        } else {
            textView.setBackground(null);
        }
        textView.setText(esm.a());
        view.setPadding(view.getPaddingLeft(), i == 0 ? this.i : 0, view.getPaddingRight(), i == this.j.size() + -1 ? this.i : 0);
        i = this.k;
        if (i == -1) {
            View a = a(this.e);
            if (a.getLayoutParams() == null) {
                a.setLayoutParams(new LayoutParams(-2, -2));
            }
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.d.getMeasuredWidth(), 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(this.d.getMeasuredHeight(), 0);
            esk.a(a.findViewById(R.id.icon), this.c);
            TextView a2 = esk.a(a);
            int i3 = 0;
            while (i2 < Math.min(this.j.size(), 10)) {
                a(a2, i2);
                a.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, a.getMeasuredWidth());
                i2++;
            }
            Drawable background = this.d.getBackground();
            if (background != null) {
                Rect rect = new Rect();
                background.getPadding(rect);
                i3 += rect.left + rect.right;
            }
            i = Math.max(i3, this.e.getWidth());
            this.k = i;
        }
        view.setMinimumWidth(i);
        for (esj a3 : this.a) {
            a3.a(esm);
        }
        return view;
    }

    public final int getCount() {
        return this.j.size();
    }

    public final Object getItem(int i) {
        return ((esm) this.j.get(i)).c();
    }

    public final void a(int i, Object obj) {
        ((esm) this.j.get(i)).a(obj);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (viewGroup instanceof AdapterView) {
            i = ((AdapterView) viewGroup).getSelectedItemPosition();
        }
        if (!esk.a(view, R.id.spinner_contents_view, Boolean.valueOf(true))) {
            view = a(viewGroup);
        }
        TextView a = esk.a(view);
        if (TextUtils.isEmpty(this.b)) {
            a(a, i);
        } else {
            a.setText(this.b);
        }
        esk.a(view.findViewById(R.id.icon), this.c);
        return view;
    }

    public final void notifyDataSetChanged() {
        this.k = -1;
        super.notifyDataSetChanged();
    }

    public final void a(List list) {
        this.j.clear();
        this.j.addAll(list);
        notifyDataSetChanged();
    }

    private final View a(ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        View inflate = from.inflate(this.f, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.spinner_header_item_container);
        viewGroup2.addView(from.inflate(this.g, viewGroup2, false));
        inflate.setTag(R.id.spinner_contents_view, Boolean.valueOf(true));
        return inflate;
    }

    private static TextView a(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.spinner_header_item_container);
        View findViewById = viewGroup.findViewById(R.id.title);
        if (findViewById instanceof TextView) {
            return (TextView) findViewById;
        }
        return (TextView) viewGroup.getChildAt(0);
    }

    private final void a(TextView textView, int i) {
        textView.setText(((esm) this.j.get(i)).a());
    }

    private static boolean a(View view, int i, Object obj) {
        Object tag = view != null ? view.getTag(i) : null;
        return tag != null && tag.equals(obj);
    }

    private static void a(View view, int i) {
        if (view instanceof ImageView) {
            if (i != 0) {
                ((ImageView) view).setImageResource(i);
            }
            xpr.a(view, i != 0);
        }
    }
}
