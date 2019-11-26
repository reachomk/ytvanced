package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: flm */
final class flm extends flo {
    private final TextView d;
    private final /* synthetic */ fln e;

    flm(fln fln, View view) {
        this.e = fln;
        super(fln, view);
        this.d = (TextView) view.findViewById(R.id.description);
    }

    public final fpa a(int i) {
        super.a(i);
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(((Integer) this.e.b.b.get(this.c)).intValue());
        }
        if (this.a != null) {
            if (this.e.b.a() == this.c) {
                this.b.setBackgroundColor(xwe.a(this.e.b.getContext(), R.attr.yt10PercentLayer));
            }
            int dimension = (int) this.e.b.getResources().getDimension(R.dimen.upload_activity_privacy_popup_vertical_padding);
            int i2 = i == 0 ? dimension : 0;
            if (i != this.e.getCount() - 1) {
                dimension = 0;
            }
            this.a.setPadding(0, i2, 0, dimension);
        }
        return this.c;
    }
}
