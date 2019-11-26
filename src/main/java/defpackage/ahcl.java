package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: ahcl */
public class ahcl extends ArrayAdapter {
    private final ListView a;

    public ahcl(Context context, ListView listView) {
        super(context, 0);
        this.a = listView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        agqa agqa = (agqa) getItem(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = from.inflate(R.layout.offline_stream_quality_option, viewGroup, false);
        }
        ahco ahco = (ahco) view.getTag();
        if (ahco == null) {
            ahco = new ahco(view);
            view.setTag(ahco);
        }
        ahco.a.setText(agqa.f);
        Spanned spanned = agqa.g;
        if (spanned != null) {
            ahco.b.setText(spanned);
            ahco.b.setVisibility(0);
        } else {
            ahco.b.setVisibility(8);
        }
        return view;
    }

    public void a(List list) {
        setNotifyOnChange(false);
        clear();
        addAll(list);
        notifyDataSetChanged();
        this.a.clearChoices();
    }

    public avsi a() {
        int checkedItemPosition = this.a.getCheckedItemPosition();
        if (checkedItemPosition != -1) {
            return ((agqa) getItem(checkedItemPosition)).e;
        }
        return avsi.UNKNOWN_FORMAT_TYPE;
    }

    public boolean a(avsi avsi) {
        int count = getCount();
        int i = 0;
        while (i < count) {
            if (((agqa) getItem(i)).e != avsi) {
                i++;
            } else {
                this.a.setItemChecked(i, true);
                return true;
            }
        }
        return false;
    }
}
