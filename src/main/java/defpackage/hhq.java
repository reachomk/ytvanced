package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hhq */
final class hhq extends ArrayAdapter {
    private final /* synthetic */ hib[] a;
    private final /* synthetic */ hhk b;

    hhq(hhk hhk, Context context, hib[] hibArr, hib[] hibArr2) {
        this.b = hhk;
        this.a = hibArr2;
        super(context, R.layout.dialog_chooser_item, R.id.title, hibArr);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        view = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(this.b.a.getString(this.a[i].a));
        textView.setTextColor(xwe.a(this.b.a, R.attr.ytTextSecondary, 0));
        adl.a(textView, this.a[i].b, 0);
        textView.setCompoundDrawablePadding(xss.a(this.b.a.getResources().getDisplayMetrics(), 16));
        return view;
    }
}
