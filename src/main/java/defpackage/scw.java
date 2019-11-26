package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: scw */
public final class scw extends ArrayAdapter implements OnClickListener {
    private final List a;
    private final Context b;
    private int c = -1;

    public scw(Context context, List list, int i) {
        super(context, R.layout.tracks_row_layout);
        this.b = context;
        this.a = new ArrayList();
        this.a.addAll(list);
        this.c = i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        scz scz;
        boolean z = false;
        if (view != null) {
            scz = (scz) view.getTag();
        } else {
            view = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.tracks_row_layout, viewGroup, false);
            scz = new scz((TextView) view.findViewById(R.id.text), (RadioButton) view.findViewById(R.id.radio));
            view.setTag(scz);
        }
        scz.b.setTag(Integer.valueOf(i));
        RadioButton radioButton = scz.b;
        if (this.c == i) {
            z = true;
        }
        radioButton.setChecked(z);
        view.setOnClickListener(this);
        scz.a.setText(((MediaTrack) this.a.get(i)).e);
        return view;
    }

    public final int getCount() {
        List list = this.a;
        return list != null ? list.size() : 0;
    }

    public final void onClick(View view) {
        this.c = ((Integer) ((scz) view.getTag()).b.getTag()).intValue();
        notifyDataSetChanged();
    }

    public final MediaTrack a() {
        int i = this.c;
        return i >= 0 ? (MediaTrack) this.a.get(i) : null;
    }
}
