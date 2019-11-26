package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zfu */
public final class zfu extends RelativeLayout implements OnClickListener {
    public final ImageView a;
    public final TextView b;
    public final akle c;
    public final zft d = new zft(this);
    public aoym e;

    public zfu(Context context, akkl akkl) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.audio_swap_category, this, true);
        inflate.setWillNotDraw(false);
        this.a = (ImageView) inflate.findViewById(R.id.audio_swap_category_cover);
        this.b = (TextView) inflate.findViewById(R.id.audio_swap_category_name);
        this.a.setOnClickListener(this);
        this.c = new akle(akkl, this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(i, i);
    }

    public final void onClick(View view) {
        ((zfr) getContext()).a(this.e);
    }
}
