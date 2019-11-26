package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kfs */
final class kfs implements akot {
    public final View a;
    private final epv b;
    private final TextView c;
    private final TextView d;
    private final LinearLayout e;
    private Map f = new HashMap();

    public kfs(View view, epv epv) {
        this.a = view;
        this.b = epv;
        this.c = (TextView) view.findViewById(R.id.response_text);
        this.d = (TextView) view.findViewById(R.id.subtext);
        this.e = (LinearLayout) view.findViewById(R.id.buttons_view);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, avkv avkv) {
        arml arml;
        this.f = new HashMap();
        this.f.put("com.google.android.libraries.youtube.innertube.endpoint.tag", avkv);
        TextView textView = this.c;
        if ((avkv.a & 1) != 0) {
            arml = avkv.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.c;
        if ((avkv.a & 1) != 0) {
            arml = avkv.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setContentDescription(ajqy.b(arml));
        textView = this.d;
        if ((avkv.a & 2) != 0) {
            arml = avkv.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        if ((avkv.a & 2) != 0) {
            arml = avkv.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setContentDescription(ajqy.b(arml));
        anyd<aphj> anyd = avkv.d;
        this.e.removeAllViews();
        xpr.a(this.e, anyd.isEmpty() ^ 1);
        for (aphj aphj : anyd) {
            if (!(aphj == null || (aphj.a & 1) == 0)) {
                eps a = this.b.a(null, this.f);
                Object obj = aphj.b;
                if (obj == null) {
                    obj = aphg.s;
                }
                a.a_(akor, obj);
                this.e.addView(a.b);
            }
        }
    }
}
