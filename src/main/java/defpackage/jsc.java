package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: jsc */
public final class jsc {
    private final akvo a;
    private final xoe b;

    public jsc(akvo akvo, Context context) {
        this.a = akvo;
        this.b = new xoe(context);
    }

    public final void a(View view, ImageView imageView, auvn auvn, aqlj aqlj, Object obj, acvx acvx) {
        Context context = imageView.getContext();
        if (aqlj == null) {
            imageView.setImageDrawable(ra.a(context, (int) R.drawable.contextual_menu_anchor));
        } else {
            Drawable a = ra.a(context, (int) R.drawable.contextual_menu_anchor_normal);
            Drawable a2 = ra.a(context, (int) R.drawable.contextual_menu_anchor_pressed);
            a = xoe.a(a, aqlj.b);
            Drawable a3 = xoe.a(a2, aqlj.c);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842910, 16842919}, a3);
            stateListDrawable.addState(new int[]{16842910, 16842908}, a3);
            stateListDrawable.addState(new int[]{16842910, 16842913}, a3);
            stateListDrawable.addState(new int[]{16842910}, a);
            imageView.setImageDrawable(stateListDrawable);
        }
        this.a.a(view, imageView, auvn, obj, acvx);
    }
}
