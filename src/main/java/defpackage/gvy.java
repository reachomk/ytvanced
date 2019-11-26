package defpackage;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: gvy */
final class gvy extends ArrayAdapter {
    public final aaas a;
    public final aldg b;
    private final Context c;

    public gvy(Context context, aaas aaas, List list, aldg aldg) {
        super(context, 0);
        this.c = context;
        this.a = aaas;
        this.b = aldg;
        for (apnl apnl : list) {
            if ((apnl.a & 1) != 0) {
                Object obj = apnl.b;
                if (obj == null) {
                    obj = axgk.p;
                }
                add(obj);
            }
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        arml arml;
        if (view == null) {
            view = LayoutInflater.from(this.c).inflate(R.layout.channel_profile_editor_boolean_setting_field, viewGroup, false);
        }
        axgk axgk = (axgk) getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.title);
        if ((axgk.a & 8) != 0) {
            arml = axgk.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.toggle);
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(this.b.a(axgk));
        switchCompat.setOnCheckedChangeListener(new gwb(this, axgk));
        return view;
    }
}
