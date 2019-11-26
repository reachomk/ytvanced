package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: acrb */
public final class acrb extends BaseAdapter {
    public int a = -1;
    private final Context b;
    private final LayoutInflater c;
    private final akvp d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final List j;

    public acrb(Context context, akvp akvp, atqy atqy) {
        this.b = (Context) amqw.a((Object) context);
        this.c = LayoutInflater.from(context);
        this.d = akvp;
        this.e = R.layout.lc_input_select_spinner_item;
        this.f = R.layout.lc_input_select_spinner_dropdown_item;
        this.g = R.id.icon;
        this.h = R.id.title;
        this.i = R.id.subtitle;
        this.j = ((atqy) amqw.a((Object) atqy)).c;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.j.size();
    }

    /* renamed from: a */
    public final atra getItem(int i) {
        return (atra) this.j.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(this.c, i, view, viewGroup, this.e, false);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(this.c, i, view, viewGroup, this.f, true);
    }

    private final View a(LayoutInflater layoutInflater, int i, View view, ViewGroup viewGroup, int i2, boolean z) {
        if (view == null) {
            view = layoutInflater.inflate(i2, viewGroup, false);
        }
        atra atra = (atra) getItem(i);
        if (atra != null) {
            ImageView imageView = (ImageView) view.findViewById(this.g);
            if (imageView != null) {
                int i3 = 8;
                if (!(this.g == 0 || (atra.a & 16) == 0)) {
                    akvp akvp = this.d;
                    if (akvp != null) {
                        arwf arwf = atra.f;
                        if (arwf == null) {
                            arwf = arwf.c;
                        }
                        arwh a = arwh.a(arwf.b);
                        if (a == null) {
                            a = arwh.UNKNOWN;
                        }
                        i2 = akvp.a(a);
                        if (i2 != 0) {
                            imageView.setImageResource(i2);
                            i3 = 0;
                        }
                    }
                }
                imageView.setVisibility(i3);
            }
            int i4 = this.h;
            arml arml = null;
            if (!(i4 == 0 || (atra.a & 1) == 0)) {
                TextView textView = (TextView) view.findViewById(i4);
                if (textView != null) {
                    arml arml2;
                    if ((atra.a & 1) != 0) {
                        arml2 = atra.d;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    textView.setText(ajqy.a(arml2));
                }
            }
            if (z) {
                if (this.a == i) {
                    view.setBackgroundColor(ra.c(this.b, R.color.quantum_grey700));
                }
                i = this.i;
                if (!(i == 0 || (atra.a & 2) == 0)) {
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        if ((atra.a & 2) != 0) {
                            arml = atra.e;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        }
                        textView2.setText(ajqy.a(arml));
                        textView2.setVisibility(0);
                    }
                }
            }
        }
        return view;
    }
}
