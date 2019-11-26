package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;

/* renamed from: adut */
final class adut extends ArrayAdapter {
    private final LayoutInflater a;
    private final OnClickListener b;
    private final acvx c;

    adut(Context context, OnClickListener onClickListener, acvx acvx) {
        super(context, 0);
        this.a = LayoutInflater.from(context);
        this.b = onClickListener;
        this.c = acvx;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        aduw aduw;
        if (view == null) {
            view = this.a.inflate(R.layout.mdx_delete_tv_codes_row, viewGroup, false);
            aduw = new aduw(view, this.b);
            view.setTag(aduw);
        } else {
            aduw = (aduw) view.getTag();
        }
        adio adio = (adio) getItem(i);
        acvx acvx = this.c;
        aduw.a.setText(adio.bq_());
        acvx.b(acwc.MDX_SMART_PAIRING_DELETE_TV_CODES_DELETE_BUTTON, null);
        aduw.b.setTag(adio);
        return view;
    }
}
