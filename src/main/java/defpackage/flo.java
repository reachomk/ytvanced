package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: flo */
class flo {
    public final FrameLayout a;
    public final RelativeLayout b;
    public fpa c;
    private final ImageView d;
    private final TextView e;
    private final /* synthetic */ fln f;

    public flo(fln fln, View view) {
        this.f = fln;
        this.a = (FrameLayout) view.findViewById(R.id.item_container);
        this.b = (RelativeLayout) view.findViewById(R.id.inner_item_container);
        this.d = (ImageView) view.findViewById(R.id.icon);
        this.e = (TextView) view.findViewById(R.id.label);
    }

    public fpa a(int i) {
        this.c = (fpa) this.f.a.get(i);
        if (this.d != null) {
            i = this.c.ordinal();
            if (i == 0) {
                this.d.setImageResource(R.drawable.quantum_ic_public_white_24);
            } else if (i == 1) {
                this.d.setImageResource(R.drawable.quantum_ic_link_white_24);
            } else if (i == 2) {
                this.d.setImageResource(R.drawable.quantum_ic_lock_white_24);
            }
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(this.f.b.getContext().getResources().getText(this.c.d));
        }
        return this.c;
    }
}
