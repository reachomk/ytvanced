package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: iqv */
final class iqv extends ArrayAdapter {
    private final /* synthetic */ Context a;

    iqv(Context context, Context context2) {
        this.a = context2;
        super(context, 17367048);
    }

    public final boolean isEnabled(int i) {
        return true;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setTextColor(xwe.a(this.a, R.attr.ytTextPrimary, 0));
        return textView;
    }
}
