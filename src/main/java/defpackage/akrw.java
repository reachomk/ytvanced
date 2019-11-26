package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: akrw */
final class akrw extends ArrayAdapter {
    private final LayoutInflater a;

    public akrw(Context context, aqyh aqyh) {
        super(context, R.layout.legal_report_form_option_selected);
        this.a = LayoutInflater.from(context);
        setDropDownViewResource(R.layout.legal_report_form_option);
        aqye aqye = (aqye) aqyf.k.createBuilder();
        arml a = ajqy.a((aqyh.a & 1) != 0 ? aqyh.c : null);
        aqye.copyOnWrite();
        aqyf aqyf = (aqyf) aqye.instance;
        if (a != null) {
            aqyf.d = a;
            aqyf.a |= 1;
            insert((aqyf) ((anxl) aqye.build()), 0);
            for (aqyb aqyb : aqyh.b) {
                Object obj;
                if ((aqyb.a & 8) != 0) {
                    obj = aqyb.e;
                    if (obj == null) {
                        obj = aqyf.k;
                    }
                } else {
                    obj = null;
                }
                add(obj);
            }
            return;
        }
        throw new NullPointerException();
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return i != 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.legal_report_form_option_selected);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.legal_report_form_option);
    }

    private final TextView a(int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = this.a.inflate(i2, viewGroup, false);
        }
        aqyf aqyf = (aqyf) super.getItem(i);
        TextView textView = (TextView) view;
        arml arml;
        if (isEnabled(i)) {
            if ((aqyf.a & 1) != 0) {
                arml = aqyf.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            textView.setHint(null);
        } else {
            if ((aqyf.a & 1) != 0) {
                arml = aqyf.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setHint(ajqy.a(arml));
            textView.setText(null);
        }
        return textView;
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return i != 0 ? (aqyf) super.getItem(i) : null;
    }
}
