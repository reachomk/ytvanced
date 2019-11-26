package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: absa */
public final class absa extends BaseAdapter {
    public final List a = new ArrayList();
    private final Context b;
    private final abru c;
    private final LayoutInflater d;
    private final int e;
    private final int f;
    private int g = -1;

    public absa(Context context, abru abru, List list) {
        this.b = context;
        this.c = abru;
        this.d = LayoutInflater.from(context);
        this.e = R.layout.live_chat_view_selector_item;
        this.f = R.layout.live_chat_view_selector_dropdown_item;
        for (axql axql : (List) amqw.a((Object) list)) {
            if (axql.f) {
                this.a.add(0, axql);
            } else {
                this.a.add(axql);
            }
        }
        if (list.size() > 0) {
            this.g = 0;
        }
    }

    public final int getCount() {
        return this.a.size();
    }

    /* renamed from: a */
    public final axql getItem(int i) {
        return (axql) this.a.get(i);
    }

    public final long getItemId(int i) {
        axql axql = (axql) getItem(i);
        if (axql != null && (axql.a & 1) != 0) {
            i = axql.d.hashCode();
        } else if (axql == null) {
            return (long) i;
        } else {
            arwf arwf = axql.g;
            if (arwf == null) {
                arwf = arwf.c;
            }
            if ((arwf.a & 1) != 0) {
                arwf = axql.g;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                i = a.el;
            } else {
                i = axql.hashCode();
            }
        }
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(this.d, i, view, viewGroup, this.e);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(this.d, i, view, viewGroup, this.f);
    }

    private final View a(LayoutInflater layoutInflater, int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = layoutInflater.inflate(i2, viewGroup, false);
        }
        axql axql = (axql) getItem(i);
        ((TextView) view.findViewById(R.id.label)).setText(axql.d);
        if (i2 == this.f) {
            view.setBackgroundColor(ra.c(this.b, this.c.a(this.g == i ? 15 : 17)));
            TextView textView = (TextView) view.findViewById(R.id.subtitle);
            if (textView != null) {
                if (axql.e.isEmpty()) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(axql.e);
                    textView.setVisibility(0);
                }
            }
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.dropdown_arrow);
        if (imageView != null) {
            imageView.setImageResource(this.c.a(14));
        }
        return view;
    }
}
