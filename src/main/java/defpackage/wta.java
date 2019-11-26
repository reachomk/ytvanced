package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: wta */
final /* synthetic */ class wta implements OnClickListener {
    private final wsy a;

    wta(wsy wsy) {
        this.a = wsy;
    }

    public final void onClick(View view) {
        CharSequence string;
        wsy wsy = this.a;
        if (wsy.b.isSelected()) {
            wsy.d();
            wsy.b.setSelected(false);
        } else {
            wsy.a(wsy.c);
            wsy.b.setSelected(true);
        }
        ImageView imageView = wsy.b;
        if (imageView.isSelected()) {
            string = wsy.a.getString(R.string.load_less_label);
        } else {
            string = wsy.a.getString(R.string.load_more_label);
        }
        imageView.setContentDescription(string);
    }
}
