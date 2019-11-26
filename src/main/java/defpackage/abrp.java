package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: abrp */
public final class abrp extends aqj {
    public final ImageView p;
    public final abrm q;
    public final akti r;

    public abrp(OnClickListener onClickListener, View view, akti akti) {
        super(view);
        this.q = (abrm) onClickListener;
        this.r = akti;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setOnClickListener(onClickListener);
        this.p = (ImageView) view.findViewById(R.id.emoji);
    }
}
