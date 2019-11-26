package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aksz */
final class aksz extends ArrayAdapter implements ListAdapter {
    private LayoutInflater a;
    private avug b;
    private final Map c = new HashMap();

    public aksz(Context context) {
        super(context, R.layout.report_form_item);
    }

    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final avug a() {
        avug avug = this.b;
        if (avug != null) {
            aksx aksx = (aksx) this.c.get(avug);
            if (aksx != null) {
                return aksx.a(aksx.a);
            }
        }
        return this.b;
    }

    public final void a(avug avug) {
        if ((avug == null && this.b != null) || (avug != null && !avug.equals(this.b))) {
            this.b = avug;
            notifyDataSetChanged();
        }
    }

    public final void clear() {
        super.clear();
        this.b = null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        aksy aksy;
        int i2 = 0;
        if (view == null) {
            if (this.a == null) {
                this.a = LayoutInflater.from(getContext());
            }
            view = this.a.inflate(R.layout.report_form_item, viewGroup, false);
        }
        avuc avuc = (avuc) getItem(i);
        if (view.getTag() instanceof aksy) {
            aksy = (aksy) view.getTag();
        } else {
            aksy = new aksy(this, view);
            view.setTag(aksy);
            view.setOnClickListener(aksy);
        }
        if (avuc != null) {
            Object obj = avuc.d;
            if (obj == null) {
                obj = avug.i;
            }
            SpinnerAdapter spinnerAdapter = (aksx) this.c.get(obj);
            arml arml = null;
            if (spinnerAdapter == null && !this.c.containsKey(obj)) {
                if (obj.c.size() > 0) {
                    Spinner spinner = aksy.b;
                    spinnerAdapter = new aksx(spinner != null ? spinner.getContext() : null, obj.c);
                }
                this.c.put(obj, spinnerAdapter);
            }
            boolean equals = obj.equals(this.b);
            TextView textView = aksy.a;
            if (!(textView == null || aksy.c == null || aksy.b == null)) {
                int i3 = 1;
                if ((obj.a & 1) != 0) {
                    arml = obj.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                textView.setText(ajqy.a(arml));
                aksy.c.setTag(obj);
                aksy.c.setChecked(equals);
                if (!equals || spinnerAdapter == null) {
                    i3 = 0;
                }
                aksy.b.setAdapter(spinnerAdapter);
                Spinner spinner2 = aksy.b;
                if (i3 == 0) {
                    i2 = 8;
                }
                spinner2.setVisibility(i2);
                aksy.d.setVisibility(i2);
                if (i3 != 0) {
                    aksy.b.setSelection(spinnerAdapter.a);
                    aksy.b.setOnItemSelectedListener(new aktb(aksy, spinnerAdapter));
                }
            }
        }
        return view;
    }
}
