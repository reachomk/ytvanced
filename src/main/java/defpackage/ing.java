package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: ing */
final class ing extends aqj {
    public final ImageView p;
    public final xom q;

    ing(View view, xom xom) {
        ImageView imageView;
        super(view);
        if (view instanceof ImageView) {
            imageView = (ImageView) view;
        } else {
            imageView = (ImageView) view.findViewById(R.id.image);
        }
        this.p = imageView;
        this.q = xom;
    }
}
