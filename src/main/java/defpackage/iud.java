package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: iud */
public final class iud implements akot {
    public final aaas a;
    private final Context b;
    private final akou c;
    private final Resources d;
    private final ViewGroup e;
    private final TextView f = ((TextView) this.e.findViewById(R.id.title));
    private final OnClickListener g = new iuc(this);
    private final ViewGroup h = ((ViewGroup) this.e.findViewById(R.id.refinements_columns));
    private final ViewGroup i = a(0);
    private ViewGroup j;

    public iud(Context context, flu flu, aaas aaas) {
        this.b = context;
        this.c = (akou) amqw.a((Object) flu);
        this.a = aaas;
        this.e = (ViewGroup) View.inflate(context, R.layout.query_refinements_item, null);
        this.d = context.getResources();
        flu.a(this.e);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.a();
    }

    private final ViewGroup a(int i) {
        if (i >= this.h.getChildCount()) {
            View.inflate(this.b, R.layout.query_refinements_column, this.h);
        }
        return (ViewGroup) this.h.getChildAt(i);
    }

    private final void a(ViewGroup viewGroup, Iterator it, int i) {
        int childCount = viewGroup.getChildCount();
        while (childCount < i) {
            View.inflate(this.b, R.layout.query_refinements_link, viewGroup);
            childCount++;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            TextView textView = (TextView) viewGroup.getChildAt(i2);
            if (i2 >= i || !it.hasNext()) {
                textView.setVisibility(8);
            } else {
                arml arml;
                awtw awtw = (awtw) it.next();
                if ((awtw.a & 1) != 0) {
                    arml = awtw.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                textView.setText(ajqy.a(arml));
                Object obj = awtw.c;
                if (obj == null) {
                    obj = apxu.d;
                }
                textView.setTag(R.id.tag_endpoint, obj);
                textView.setOnClickListener(this.g);
                textView.setVisibility(0);
            }
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        List arrayList;
        awty awty = (awty) obj;
        arml arml = null;
        akor.a.a(awty.d.d(), null);
        boolean z = this.d.getBoolean(R.bool.query_refinements_two_columns);
        if (awty.c.size() != 0) {
            arrayList = new ArrayList();
            for (awua awua : awty.c) {
                awtw awtw = awua.b;
                if (awtw == null) {
                    awtw = awtw.d;
                }
                int i = awtw.a;
                if (!((i & 1) == 0 || (i & 2) == 0)) {
                    arrayList.add(awtw);
                }
            }
        } else {
            arrayList = Collections.emptyList();
        }
        Iterator it = arrayList.iterator();
        TextView textView = this.f;
        if ((awty.a & 1) != 0) {
            arml = awty.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
        int size = arrayList.size();
        if (z) {
            double d = (double) size;
            Double.isNaN(d);
            size = (int) Math.ceil(d / 2.0d);
        }
        a(this.i, it, size);
        if (z) {
            if (this.j == null) {
                this.j = a(1);
            }
            a(this.j, it, size);
            this.j.setVisibility(0);
        } else {
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        this.c.a(akor);
    }
}
