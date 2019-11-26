package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: aksx */
final class aksx extends ArrayAdapter implements SpinnerAdapter {
    public int a;
    private LayoutInflater b;

    public aksx(Context context, List list) {
        super(context, R.layout.report_form_suboption, list);
        for (int i = 0; i < list.size(); i++) {
            avug avug = ((avuc) list.get(i)).d;
            if (avug == null) {
                avug = avug.i;
            }
            if (avug.e) {
                this.a = i;
                return;
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final avug a(int i) {
        avug avug;
        avuc avuc = (avuc) getItem(i);
        if (avuc != null) {
            avug = avuc.d;
            if (avug == null) {
                avug = avug.i;
            }
        } else {
            avug = null;
        }
        if (avug == null || avug.e) {
            return null;
        }
        return avug;
    }

    public final boolean isEnabled(int i) {
        return a(i) != null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.report_form_suboption_selected, R.id.report_form_sub_option_selected_text);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, R.layout.report_form_suboption, R.id.report_form_sub_option_text);
    }

    private final View a(int i, View view, ViewGroup viewGroup, int i2, int i3) {
        aksw aksw;
        if (view == null) {
            if (this.b == null) {
                this.b = LayoutInflater.from(getContext());
            }
            view = this.b.inflate(i2, viewGroup, false);
        }
        avuc avuc = (avuc) getItem(i);
        if (view.getTag() instanceof aksw) {
            aksw = (aksw) view.getTag();
        } else {
            aksw = new aksw(view, i3);
            view.setTag(aksw);
        }
        if (avuc != null) {
            avug avug = avuc.d;
            if (avug == null) {
                avug = avug.i;
            }
            boolean isEnabled = isEnabled(i);
            if (avug != null) {
                TextView textView = aksw.a;
                if (textView != null) {
                    arml arml;
                    if ((avug.a & 1) != 0) {
                        arml = avug.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    textView.setText(ajqy.a(arml));
                    aksw.a.setEnabled(isEnabled);
                }
            }
        }
        return view;
    }
}
