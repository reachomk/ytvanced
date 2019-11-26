package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: fln */
public final class fln extends BaseAdapter {
    public final List a = Arrays.asList(fpa.values());
    public final /* synthetic */ PrivacySpinner b;
    private final flp c = new flp(this);

    public fln(PrivacySpinner privacySpinner) {
        this.b = privacySpinner;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.a.size();
    }

    public final Object getItem(int i) {
        return this.a.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        flo flo;
        if (view != null) {
            flo = (flo) view.getTag();
        } else {
            view = this.b.a.inflate(R.layout.privacy_item, null);
            flo = new flo(this, view);
            view.setTag(flo);
        }
        flo.a(i);
        return view;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        flo flm;
        if (view == null) {
            view = this.b.a.inflate(R.layout.privacy_dropdown, null);
            flm = new flm(this, view);
            view.setTag(flm);
        } else {
            flm = (flm) view.getTag();
        }
        abe.a(view, this.c);
        flm.a(i);
        return view;
    }
}
